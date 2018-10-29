import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;



    public ContactList() {

        this.contacts = new ArrayList<Contact>();
<<<<<<< HEAD

        contacts.add(new Contact("Juan Valencia", "juanjvalenciagd@gmail.com"));
        contacts.add(new Contact("Derrik Park", "someemail@email.com"));
        contacts.add(new Contact("Petri Kauritsalo", "gd48petri@vfs.com"));
        contacts.add(new Contact("Pedro D'Andrea", "gd48pedro@vfs.com"));
=======
>>>>>>> function1
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

<<<<<<< HEAD
    public void list() {
        Contact current;
        for (int i = 0; i < contacts.size(); i++) {
            current = contacts.get(i);
            System.out.printf("%d: %s%n",i+1, current.getFullName());
=======
>>>>>>> function1
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
        Contact currentContact = contacts.get(index);

        System.out.printf("Name: %s %nEmail: %s%n%n", currentContact.getFullName(), currentContact.getEmail());
    }

    public Contact getContactAtIndex(int index)
    {
        return contacts.get(index);
    }

}
