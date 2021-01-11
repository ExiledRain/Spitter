package exiled.spittr.web;

import exiled.spittr.Spitter;
import exiled.spittr.data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Part;
import javax.validation.Valid;

import java.io.File;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("spitter",new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register",method = POST)
    public String processRegistration(
            @RequestPart("profilePicture") Part profilePicture,
            @Valid Spitter spitter,
            Errors errors,
            RedirectAttributes model
    ) {
        if(errors.hasErrors()) {
            return "registerForm";
        }
        model.addAttribute("username",spitter.getUsername());
        model.addFlashAttribute("spitter",spitter);
        spitterRepository.save(spitter);
        return "redirect:/spitter/{username}";
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(
            @PathVariable String username,
            Model model) {
        if(!model.containsAttribute("spitter")){
            model.addAttribute(
                    spitterRepository.findByUsername(username)
            );
        }
        return "profile";
    }
}
