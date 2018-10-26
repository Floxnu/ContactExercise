import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;



    public ContactList() {
        this.contacts = new ArrayList<Contact>();
    }

    public  void addContact(Contact con){

        contacts.add(con);

    }

    public void find(String search){
        for(int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().contains(search) || contacts.get(i).getEmail().contains(search)) {
                showInfo(i);
            }
        }
    }

    public void list(){}

    public void showInfo(int index)
    {
        Contact currentContact = contacts.get(index);

        System.out.printf("Name: %s %nEmail: %s%n", currentContact.getFullName(), currentContact.getEmail());
    }

}
