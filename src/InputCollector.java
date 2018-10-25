import java.util.Scanner;

public class InputCollector {
    private Scanner in;

    public InputCollector() {
        this.in = new Scanner(System.in);

        System.out.println("Please enter your first name.");
        String firstName = in.next();
        System.out.println("Please enter your last name.");
        String lastName = in.next();
        System.out.println("Please enter your email address.");
        String email = in.next();
        System.out.println("Please enter your phone number.");
        long phoneNum = in.nextLong();

        inputForPrompt(firstName);
        inputForPrompt(lastName);
        inputForPrompt(email);
        inputForPrompt(Long.toString(phoneNum));
    }


    public String inputForPrompt(String prompt){
        return inputForPrompt(prompt);
    }

}
//add commit push