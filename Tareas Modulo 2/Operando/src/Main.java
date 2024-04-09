import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.print("Ingrese Numero 1: ");
        int numero1=scanner.nextInt();
        System.out.print("Ingrese Numero 2: ");
        int numero2=scanner.nextInt();
        System.out.println("La suma de los numeros es "+Integer.toString(numero1+numero2));
        System.out.print("Ingrese numero a elevar: ");
        int numero3=scanner.nextInt();
        System.out.println("El numero ingresado elevado a 2 es "+numero3*numero3);
        System.out.print("Ingrese palabra 1: ");
        String palabra1=scanner.next();
        System.out.print("Ingrese palabra 2: ");
        String palabra2=scanner.next();
        System.out.println("La concatenacion de las palabras ingresadas es: "+palabra1+palabra2);
        System.out.print("Ingrese numero 1 a comparar: ");
        int n1acomparar= scanner.nextInt();
        System.out.print("Ingrese numero 2 a comparar: ");
        int n2acomparar= scanner.nextInt();
        if (n1acomparar==n2acomparar)
            System.out.println("Los numeros ingresados son iguales");
        else
            System.out.println("Los numeros ingresados son diferentes");
    }
}
