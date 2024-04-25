package ch.wiss.sq3a.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {
    
    @GetMapping("/public")
    public ResponseEntity<String> getPublic() {
        return ResponseEntity.ok("Public content");
    }
}
