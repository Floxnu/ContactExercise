import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;
    static InputCollector input;
    private Contact currentContact;


    public ContactList() {

        this.contacts = new ArrayList<Contact>();

        contacts.add(new Contact("Juan Valencia", "juanjvalenciagd@gmail.com"));
        contacts.add(new Contact("Derrik Park", "someemail@email.com"));
        contacts.add(new Contact("Petri Kauritsalo", "gd48petri@vfs.com"));
        contacts.add(new Contact("Pedro D'Andrea", "gd48pedro@vfs.com"));

        input = new InputCollector();

    }

    public  void addContact(Contact con){

        for (Contact c: contacts) {
            if(c.getEmail().equalsIgnoreCase(con.getEmail()))
            {
                System.out.println("Contact already exists.");
                return;
            }
        }
        contacts.add(con);

    }

    public void find(String search){
        for(int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFullName().toLowerCase().contains(search.toLowerCase()) || contacts.get(i).getEmail().toLowerCase().contains(search.toLowerCase())) {
                showInfo(i);
            }
        }
    }


    public void list(){
        Contact current;
        for (int i = 0; i < contacts.size(); i++) {
            current = contacts.get(i);
            System.out.printf("%d: %s%n",i+1, current.getFullName());

        }
    }


    public void showInfo(int index)
    {
        boolean inRange = true;
        boolean validIndex = true;
        do {
            if (index <= contacts.size() && index >= 0) {
                currentContact = contacts.get(index);

                System.out.printf("Name: %s %nEmail: %s%n", currentContact.getFullName(), currentContact.getEmail());
                currentContact.outputNumbers();
                return;
            } else if (index < 0){
                System.out.println("Index starts at 1");
                validIndex = true;
            } else {
                System.out.println("NOT registered");
                validIndex = true;
            }
        while(validIndex){
            try {
                index = Integer.parseInt(input.inputForPrompt("Contact index:")) - 1;
                validIndex = false;
            } catch (Exception e)
            {
                System.out.println("Not a valid index.");
            }
        }
        }while (inRange);
    }

    public Contact getContactAtIndex(int index)
    {
        return contacts.get(index);
    }

}
