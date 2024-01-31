package com.angularproject.registrationpage.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_registration")
public class registration {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;
    @Column(name="user_name")
    private String userName;
    @Column(name="father_name")
    private String fatherName;
    @Column(name="mother_name")
    private String motherName;
    @Column(name="password")
    private String passWord;
    @Column(name="address")
    private String Address;
    @Column(name="pincode")
    private int pinCode;
    
    public registration() {
    }
    public registration(int id, String userName, String fatherName, String motherName, String passWord, String address,
            int pinCode) {
        this.id = id;
        this.userName = userName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.passWord = passWord;
        Address = address;
        this.pinCode = pinCode;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
