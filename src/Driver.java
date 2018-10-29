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
        System.out.println(" ");
        System.out.println("Main Menu:");
        System.out.println("1. new");
        System.out.println("2. list");
        System.out.println("3. show");
        System.out.println("4. find");
        System.out.println("5. add phone");
        System.out.println("6. history");
        System.out.println("7. quit");

        do {
            String in = input.inputForPrompt("command: ").toLowerCase();
            switch (in) {
                case "new":
                case "1":
                    commandHistory.add("new");
                    validCommand = false;
                    New();
                    break;
               case "list":
                case "2":
                   commandHistory.add("list");
                   validCommand = false;
                   list();
                   break;
                case "show":
                case "3":
                    commandHistory.add("show");
                    validCommand = false;
                    show();
                    break;
                case "find":
                case "4":
                    commandHistory.add("find");
                    validCommand = false;
                    find();
                    break;
                case "history":
                case "6":
                    validCommand = false;
                    history();
                    break;
                case "quit":
                case "7":
                    commandHistory.add("quit");
                    validCommand = false;
                    quit();
                    break;
                case "add phone":
                case "5":
                    commandHistory.add("add phone");
                    validCommand = false;
                    addPhone();
                    break;
                default:
                    System.out.println("Invalid command");
                    validCommand = true;
            }
        } while (validCommand);
    }

    public static void show()
    {
        int index = -1;
        boolean validIndex = true;
        do {
            try {
                index = Integer.parseInt(input.inputForPrompt("Contact index:")) - 1;
                validIndex = false;
            } catch (Exception e)
            {
                System.out.println("Not a valid index.");
            }
        } while(validIndex);
        contactsList.showInfo(index);
    }


    public static void list(){
        contactsList.list();
    }

    public static void find() {
        contactsList.find(input.inputForPrompt("Enter term to search: "));

    }

    public static void quit(){
        System.exit(0);
    }

    public static void history(){
        for(int i = commandHistory.size() -1; i > commandHistory.size() - 4; i--)
        {
            if(i>=0)
            {
                System.out.println(commandHistory.get(i));
            }
        }
        commandHistory.add("history");
    }

    public static void addPhone() {
        int index = -1;
        boolean validIndex = true;
        do {
            try {
                index = Integer.parseInt(input.inputForPrompt("Contact index:")) - 1;
                validIndex = false;
            } catch (Exception e)
            {
                System.out.println("Not a valid index.");
            }
        } while(validIndex);
        Contact currentContact;
        contactsList.showInfo(index);
        String addQuestion = input.inputForPrompt("Do you want to add number? Y/N ");
        if (addQuestion.equalsIgnoreCase("Y")){
            currentContact = contactsList.getContactAtIndex(index);
            String phoneType = input.inputForPrompt("Enter your phone Type: ");
            boolean notValidInput = true;
            Long longCheck = Long.valueOf(0);
            while (notValidInput){
                try{
                    longCheck = Long.parseLong(input.inputForPrompt("Enter your phone number: "));
                    if(longCheck.toString().contains(".") || longCheck.toString().length() > 15 || longCheck.toString().length() < 3)
                    {
                        System.out.println("Invalid number.");
                        notValidInput = true;
                    } else {
                        notValidInput = false;
                    }
                } catch (Exception e){
                    System.out.println("Invalid input.");
                    notValidInput = true;
                }
            }

            String num = longCheck.toString();
            currentContact.addPhoneNumber(phoneType, num);
            System.out.println("Number added successfully");
        }
    }
}
