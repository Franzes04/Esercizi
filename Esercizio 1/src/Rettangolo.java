public class Rettangolo {
       int base;
       int altezza;

    int set_Area(int base, int altezza) {
        int a = (base * altezza );
        return a;
    }

    int set_Perimetro(int base, int altezza)
    {
        int p= (base + altezza) * 2;
        return p;
    }
}
