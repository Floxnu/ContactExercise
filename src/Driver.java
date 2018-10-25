import java.util.ArrayList;
import java.util.List;

public class Driver {

    static InputCollector input;
    static ContactList contactsList;
    static List<String> commandHistory;

    public static void main(String[] args) {

        contactsList = new ContactList();
        input = new InputCollector();
        commandHistory = new ArrayList<String>();

        while(true)
        {
            MainMenu();
        }

    }

    public static void New() {
        String fullName = input.inputForPrompt("Enter name: ");
        String email = input.inputForPrompt("Enter email: ");

        Contact person = new Contact(fullName, email);
        contactsList.addContact(person);
    }

    public static void MainMenu()
    {
        boolean validCommand = false;
        System.out.println("Main Menu:");
        System.out.println("1. new");
        System.out.println("2. list");
        System.out.println("3. show");
        System.out.println("3. find");
        System.out.println("4. history");
        System.out.println("5. quit");

        do {
            String in = input.inputForPrompt("command: ").toLowerCase();
            switch (in) {
                case "new":
                    commandHistory.add(in);
                    validCommand = false;
                    New();
                    break;
                case "list":
                    commandHistory.add(in);
                    validCommand = false;
                    list();
                    break;
                case "show":
                    commandHistory.add(in);
                    validCommand = false;
                    show();
                    break;
                case "find":
                    commandHistory.add(in);
                    validCommand = false;
                    find();
                    break;
                case "history":
                    commandHistory.add(in);
                    validCommand = false;
                    history();
                    break;
                case "quit":
                    commandHistory.add(in);
                    validCommand = false;
                    quit();
                    break;
                default:
                    System.out.println("Invalid command");
                    validCommand = true;
            }
        } while (validCommand);
    }

    public static void show()
    {
        int index = Integer.parseInt(input.inputForPrompt("Contact index:")) - 1;
        contactsList.showInfo(index);
    }


    public static void list(){
        contactsList.list();
    }

    public static void find() {

    }

    public static void quit(){

    }

    public static void history(){

    }

}
