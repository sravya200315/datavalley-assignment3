import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    // Constructor
    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }
}

public class Serialization {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(2, "REDDY", "1234567890", "Gandhi Nagar");

        // Serialize the Customer object
        try {
            FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(customer);
            objectOut.close();
            fileOut.close();
            System.out.println("Customer object has been serialized to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
