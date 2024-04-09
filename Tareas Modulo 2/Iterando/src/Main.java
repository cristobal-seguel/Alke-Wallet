public class Main {
    public static void main(String[] args) {
        int suma=0,it=1;
        for (int i=1;i<=10;i++)
            suma=suma+i;
        System.out.println("Suma ciclo for: "+suma);
        suma=0;
        while (it<11)
        {
            suma = suma+it;
            it++;
        }
        System.out.println("Suma ciclo while: "+suma);
        suma=0;
        it=1;
        do
        {
            suma=suma+it;
            it++;
        }
        while (it<11);
        System.out.println("Suma ciclo do while: "+suma);

    }
}
