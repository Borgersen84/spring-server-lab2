package borgersen.yvind.lab2;

import org.springframework.web.bind.annotation.*;

@RestController
public class WordRestController {

    private final String response = "Your words to uppercase = ";

    @RequestMapping(value="/words", method = RequestMethod.POST, produces = "application/json")
    public WordGenerator wordSubmit(WordGenerator wordGenerator ){
        String s = response + wordGenerator.getWords().toUpperCase();
        return new WordGenerator(s);
    }



}

