package tes.project.notification.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tes.project.notification.dto.EmailDTO;
import tes.project.notification.service.EmailService;

@RestController
@RequestMapping("notification")
public class EmailController {
    private final EmailService service;

    public EmailController(EmailService service) {
        this.service = service;
    }

    @PostMapping
    public void sendEmail(@RequestBody EmailDTO email) {
        service.sendEmail(email);
    }
}
