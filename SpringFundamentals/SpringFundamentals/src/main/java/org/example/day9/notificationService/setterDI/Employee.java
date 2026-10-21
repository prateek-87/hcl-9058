package org.example.day9.notificationService.setterDI;

public class Employee {
    private Address address;

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }
}