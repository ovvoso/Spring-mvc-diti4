package sn.springmvcditi4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sn.springmvcditi4.entity.Personne;
import sn.springmvcditi4.repository.PersonneRepository;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/personnes")
public class PersonneController {

    private final PersonneRepository personneRepository;

    // 🔽 Affichage de la liste
    @GetMapping
    public String listPersonnes(
            @RequestParam(name = "search", required = false) String search,
            @RequestParam(defaultValue = "0") int page,
            Model model) {

        Pageable pageable = PageRequest.of(page, 5, Sort.by("id").ascending());
        Page<Personne> personnesPage;

        if (search != null && !search.isEmpty()) {
            personnesPage = personneRepository
                    .findByNomContainingIgnoreCaseOrPrenomContainingIgnoreCase(search, search, pageable);
        } else {
            personnesPage = personneRepository.findAll(pageable);
        }

        model.addAttribute("personnesPage", personnesPage);
        model.addAttribute("search", search);
        model.addAttribute("currentPage", page);
        return "personnes/list";
    }

    // 🔽 Formulaire d’ajout
    @GetMapping("/ajouter")
    public String showFormAjout(Model model) {
        model.addAttribute("personne", new Personne());
        return "personnes/form";
    }

    // 🔽 Enregistrement (ajout/modif)
    @PostMapping("/enregistrer")
    public String savePersonne(@ModelAttribute("personne") Personne personne) {
        personneRepository.save(personne);

        // Total après ajout
        long total = personneRepository.count();
        int pageSize = 5; // le même nombre que dans le PageRequest
        int lastPage = (int) ((total - 1) / pageSize);

        return "redirect:/personnes?page=" + lastPage;
    }

    // 🔽 Formulaire de modification
    @GetMapping("/modifier/{id}")
    public String showFormModif(@PathVariable("id") int id, Model model) {
        Personne personne = personneRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("ID invalide: " + id));
        model.addAttribute("personne", personne);
        return "personnes/form";
    }

    // 🔽 Suppression
    @GetMapping("/supprimer/{id}")
    public String deletePersonne(@PathVariable("id") int id) {
        personneRepository.deleteById(id);
        return "redirect:/personnes";
    }
}
