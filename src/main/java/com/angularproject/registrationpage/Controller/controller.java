package com.angularproject.registrationpage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularproject.registrationpage.Model.registration;
import com.angularproject.registrationpage.Service.studentservice;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
public class controller {

    @Autowired
    studentservice studentserv;

    @PostMapping("/registration")
    public registration addData(@RequestBody registration registration) {
        return this.studentserv.addStudentService(registration);
    }

}
