package borgersen.yvind.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WordGenController {


    @GetMapping("/words")
    public String words(Model model) {
        model.addAttribute("words", new WordGenerator(""));
        return "words";
    }

}
