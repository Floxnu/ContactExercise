import java.util.Map;

public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private Map<String, Integer> phoneNumbers;

    public Contact(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void addPhoneNumber(){
        System.out.println("000000000");
    }
}
