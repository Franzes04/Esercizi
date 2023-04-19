import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Come ti chiami? ");
        String nome= sc.nextLine();
        System.out.print("Inserisci il tuo cognome");
        String cognome= sc.nextLine();

        System.out.println("Bravissimo, "+nome+cognome + " Sei stato bravissimo e puntuale");
    }
}
