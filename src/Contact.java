import java.util.Map;

public class Contact {
    private String fullName;
    private String email;
    private Map<String, Integer> phoneNumbers;

    public Contact(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public void addPhoneNumber(){
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
