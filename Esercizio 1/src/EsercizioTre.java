import java.util.Scanner;

public class EsercizioTre {

    public static void main(String[] args)
    {
        Rettangolo R1 = new Rettangolo();
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire valore base...");
        a = sc.nextInt();
        System.out.print("Inserire valore altezza...");
        b = sc.nextInt();
        int Area = R1.set_Area(a,b);
        int Perimetro = R1.set_Perimetro(a,b);
        System.out.println(Area);
        System.out.println(Perimetro);
    }
}
