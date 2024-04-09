import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int suma=0;
        Scanner scanner =new Scanner (System.in);
        System.out.print("ingrese tamaño del vector: ");
        int tamano=scanner.nextInt();
        int vector[]=new int [tamano];
        for (int i=0;i<tamano;i++)
        {
            System.out.print("Ingrese valor "+Integer.toString(i+1)+": ");
            suma=suma+scanner.nextInt();
        }
        System.out.println("La suma de los valores es: "+suma);
    }
}
