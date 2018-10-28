import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;
    static InputCollector input;
    private Contact currentContact;


    public ContactList() {
        this.contacts = new ArrayList<Contact>();
        input = new InputCollector();
    }

    public  void addContact(Contact con){

        contacts.add(con);

    }

    public void find(String search){
        for(int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().toLowerCase().contains(search.toLowerCase()) || contacts.get(i).getEmail().toLowerCase().contains(search.toLowerCase())) {
                showInfo(i);
                String addQuestion = input.inputForPrompt("Do you want to add number? Y/N ");
                if (addQuestion.equalsIgnoreCase("Y")){
                    currentContact = contacts.get(i);
                    String phoneType = input.inputForPrompt("Enter your phone Type: ");
                    String num = input.inputForPrompt("Enter your phone number: ");
                    currentContact.addPhoneNumber(phoneType, num);
                }
            }

        }
    }

//    public void list(int list) {
//        this.contacts = contacts.get(list);
//
//        for (int i = 0; i < contacts.length; i++) {
//            System.out.printf(i + ": " + "Name: %s", list.get(i));
//        }
//    }

    public void showInfo(int index)
    {
        if (index <= contacts.size() && index > 0) {
            currentContact = contacts.get(index);

            System.out.printf("Name: %s %nEmail: %s%n", currentContact.getFullName(), currentContact.getEmail());
            currentContact.outputNumbers();
        } else if (index < 0){
            System.out.println("Enter type from 1");
        } else {
            System.out.println("NOT registered");
        }
    }

    public Contact getContactAtIndex(int index)
    {
        return contacts.get(index);
    }

}
