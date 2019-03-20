package borgersen.yvind.lab2;

import org.springframework.web.bind.annotation.*;

@RestController
public class WordRestController {

    @RequestMapping(value="/words", method = RequestMethod.POST, produces = "application/json")
    public String wordSubmit(WordGenerator wordGenerator ){
        String s = "Your words to uppercase = "+ wordGenerator.getWords().toUpperCase();
        return s;
    }

}

