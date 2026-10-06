package Pixel.Academy.Primul.Exercitiu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
     @GetMapping("/moldova")
    public String getMoldova(){
         return "Capitala este Chisinau";
     }
     @GetMapping("/france")
    public String getFrance(){
         return "Capitala este Paris";
     }
     @GetMapping("/germany")
    public String getGermany(){
         return "Capitala este Berlin";
     }
}
