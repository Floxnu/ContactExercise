public class Driver {

    static InputCollector input;
    static ContactList contactsList;

    public static void main(String[] args) {

        contactsList = new ContactList();
        input = new InputCollector();

        String[] commandHistory;

    }

    public static void New() {
        String fullName = input.inputForPrompt("Enter name: ");
        String email = input.inputForPrompt("Enter email: ");

        Contact person = new Contact(fullName, email);
        contactsList.addContact(person);
    }

    public static void list(){

    }

    public static void find() {

    }

    public static void quit(){

    }

    public static void history(){

    }

}
