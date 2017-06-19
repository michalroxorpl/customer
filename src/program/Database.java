package program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Database {
    
    private Vector<Customer> data = null;
    private int keyId = 1;
    
    public Database() {
        data = new Vector<Customer> ();
    }
    
    public void insertCustomer(Customer object) {
        object.setId(keyId++);
        data.add(object);
    }
    
    public boolean updateCustomer(Customer object) {
        for(Customer customer : data)
            if(customer.getId() == object.getId()) {
                customer.update(object);
                return true;
            }
        return false;
    }
    
    public boolean removeCustomer(Customer object) {
        try {
            data.remove(object);
            return true;
        }
        catch(Exception ex) {
            return false;
        }
    }
    
    public boolean saveData(String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(fileName);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(data);
            return true;
        }
        catch(IOException ex) {
            return false;
        }
    }
    
    public boolean loadData(String fileName) {
        try {
            FileInputStream fileStream = new FileInputStream(fileName);
            ObjectInputStream objectStream = new ObjectInputStream(fileStream);
            data = (Vector<Customer>) objectStream.readObject();
            return true;
        }
        catch(IOException | ClassNotFoundException ex) {
            return false;
        }
    }
    
    public Customer getCustomer(int index) {
        return data.get(index);
    }
    
    public String[] getObject(int index) {
        return data.get(index).toObject();
    }
    
    public Customer getLastCustomer() {
        return data.lastElement();
    }
    
    public String[] getLastObject() {
        return data.lastElement().toObject();
    }
    
    public int size() {
        return data.size();
    }
    
    public boolean empty() {
        return data.isEmpty();
    }
    
    public void clear() {
        data.clear();
    }
}
