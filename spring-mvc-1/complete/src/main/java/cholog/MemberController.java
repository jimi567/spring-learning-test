package cholog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
   /* @GetMapping("/hello")
    public String world(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }*/

    @GetMapping("/json")
    public Crew json() {
        return new Crew("위브", 22, Category.BACKEND);
    }

    @GetMapping("/json/record")
    public CrewRecord jsonRecord() {
        return new CrewRecord("위브", 22, Category.BACKEND);
    }
}
