package de.tekup.studentsabsence.services.impl;

import de.tekup.studentsabsence.entities.Student;
import de.tekup.studentsabsence.entities.Subject;
import de.tekup.studentsabsence.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service

public class EmailServiceImp implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEliminatedEmail(Student student, Subject subject) {

        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setFrom("alatork2@gmail.com");
        mailMessage.setTo(student.getEmail());
        mailMessage.setText(student.getFirstName()+" "+student.getLastName()+" "+
                "On vous informe que vous etes marquee eliminer de"+subject.getName());
        mailMessage.setSubject("Elimination");

        javaMailSender.send(mailMessage);
    }
}
