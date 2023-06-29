import java.util.Date;

class Customer {
    private String fullName;
    private Date dateOfBirth;
    private String address;
    private Date registrationDate;
    private String nationality;

    public void enterInformation(String fullName, Date dateOfBirth, String address, Date registrationDate, String nationality) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.registrationDate = registrationDate;
        this.nationality = nationality;
    }

    public void displayInformation() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Registration Date: " + registrationDate);
        System.out.println("Nationality: " + nationality);
    }

    // Getters for restricted attributes
    private String getFullName() {
        return fullName;
    }

    private Date getDateOfBirth() {
        return dateOfBirth;
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.enterInformation("John Doe", new Date(), "123 Main St", new Date(), "USA");

        Customer customer2 = new Customer();
        customer2.enterInformation("Jane Smith", new Date(), "456 Elm St", new Date(), "Canada");

        // Attempting to access restricted attributes
        System.out.println("Customer 1 Full Name: " + customer1.getFullName()); // Restricted access, will result in a compilation error
        System.out.println("Customer 2 Date of Birth: " + customer2.getDateOfBirth()); // Restricted access, will result in a compilation error

        // Displaying customer information using public method
        System.out.println("Customer 1 Information:");
        customer1.displayInformation();

        System.out.println();

        System.out.println("Customer 2 Information:");
        customer2.displayInformation();
    }
}