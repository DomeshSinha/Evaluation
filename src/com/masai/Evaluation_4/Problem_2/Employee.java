package com.masai.Evaluation_4.Problem_2;

import javax.swing.*;

public class Employee extends Address{

    String empId;
    String empName;
    Address address;
    String email;
   transient String password;

    public Employee() {
    }

    public Employee(String empId, String empName, Address address, String email, String password) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.email = email;
        this.password = password;
    }



    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
