package program;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String name;
    private String surname;
    private String address;
    private String number;
    private String email;
    
    public Customer() {
        id = 0;
        name = "Empty";
        surname = "Empty";
        address = "Empty";
        number = "Empty";
        email = "Empty";
    }
    
    public Customer(String name, String surname, String address, String number, String email) {
        id = 0;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.number = number;
        this.email = email;
    }
    
    public Customer(String[] data) {
        id = Integer.parseInt(data[0]);
        name = data[1];
        surname = data[2];
        address = data[3];
        number = data[4];
        email = data[5];
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String[] toObject() {
        String[] object = { Integer.toString(id), name, surname, address, number, email };
        
        return object;
    }
    
    public void update(Customer object) {
        this.id = object.id;
        this.name = object.name;
        this.surname = object.surname;
        this.address = object.address;
        this.number = object.number;
        this.email = object.email;
    }
}
