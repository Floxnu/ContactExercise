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
            if (contacts.get(i).getFullName().toLowerCase().contains(search.toLowerCase()) || contacts.get(i).getEmail().toLowerCase().contains(search.toLowerCase())) {
                showInfo(i);
            }
        }
    }

    public void list(int list) {
        this.contacts = contacts.get(list);

        for (int i = 0; i < contacts.length; i++) {
            System.out.printf(i + ": " + "Name: %s", list.get(i));
        }
    }

    public void showInfo(int index)
    {
        Contact currentContact = contacts.get(index);

        System.out.printf("Name: %s %nEmail: %s%n%n", currentContact.getFullName(), currentContact.getEmail());
    }

    public Contact getContactAtIndex(int index)
    {
        return contacts.get(index);
    }

}
