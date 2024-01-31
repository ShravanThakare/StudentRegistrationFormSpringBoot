package com.angularproject.registrationpage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angularproject.registrationpage.Model.registration;

@Repository
public interface studentrepo extends JpaRepository<registration,Integer>{
    
}
