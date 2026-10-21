package org.example.day8.ConstructorDI;

public class Employee {
    private Address address;
    public Employee(Address address){
        this.address = address;
    }

    public void getEmpAddress(){
        address.getAddress();
    }


}