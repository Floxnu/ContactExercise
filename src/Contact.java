import java.util.HashMap;
import java.util.Map;

public class Contact {
    private String fullName;
    private String email;
    private Map<String, String> phoneNumbers;

    public Contact(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumbers = new HashMap<>();

    }


    public void addPhoneNumber(String phoneType, String number){
        this.phoneNumbers.put(phoneType, number);
    }

    public void outputNumbers(){
        for (Map.Entry<String, String> num: phoneNumbers.entrySet()){
            System.out.printf("%s: %s%n",num.getKey(), num.getValue());
        }
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
