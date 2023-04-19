import javax.print.attribute.standard.Media;
import java.awt.*;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EsercizioQuattro {

    public static double Media(ArrayList<Integer> lista)
    {
        int somma = 0;
        double media = 0;
        for (int i = 0; i < lista.size(); i++) {
            somma = somma + lista.get(i);
        }
        return media = somma / lista.size();

    }
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(50);
        lista.add(1);
        lista.add(33);
        lista.add(125);

        double m;

        System.out.println("Il massimo è " + Collections.max(lista));
        System.out.println("Il Minimo è " + Collections.min(lista));
        m = Media(lista);
        System.out.println("La Media è " + m);
    }
}
