package com.example.securegrade.securegrade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class GradeController {

    @GetMapping("/")
    public String home() {
        return "SecureGrade application is running";
    }

    @GetMapping("/grades")
    public List<String> grades() {
        return List.of(
                "Math: 15/20",
                "Security: 17/20",
                "DevSecOps: 18/20"
        );
    }
}
