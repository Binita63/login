/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.swing1.entity;

/**
 *
 * @author Bini
 */
public class StudentEntry {
    private String fname,lname,email,password,cpassword;

    public StudentEntry() {
    }

    public StudentEntry(String fname, String lname, String email, String password,String cpassword) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.cpassword=cpassword;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    
}
