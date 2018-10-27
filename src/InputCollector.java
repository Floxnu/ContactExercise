import java.util.Scanner;

public class InputCollector {
    private Scanner in;

    public InputCollector() {
        this.in = new Scanner(System.in);
    }


    public String inputForPrompt(String prompt){
        //Print promt
        System.out.print(prompt);
        //return user input
        return in.nextLine();
    }

}
//add commit push