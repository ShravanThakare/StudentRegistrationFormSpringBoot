package com.angularproject.registrationpage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angularproject.registrationpage.Model.registration;
import com.angularproject.registrationpage.Repository.studentrepo;

@Service
public class studentservice{

    @Autowired
    studentrepo studentr;
    public registration addStudentService(registration student){
       return this.studentr.save(student);
    }
}
