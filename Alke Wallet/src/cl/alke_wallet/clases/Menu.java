package cl.alke_wallet.clases;
import java.util.Scanner;

public class Menu {
    public static Cliente crearCliente(Scanner scanner)
    {
        String rut,nombres,apellidos;
        int telefono;
        System.out.println("Bienvenido, a continuación deberá registrar sus datos para poder crear su cuenta.");
        System.out.print("Ingrese su Rut: ");
        rut=scanner.nextLine();
        System.out.print("Ingrese sus 2 nombres: ");
        nombres=scanner.nextLine();
        System.out.print("Ingrese sus 2 apellidos: ");
        apellidos=scanner.nextLine();
        System.out.print("Ingrese su número telefonico: ");
        while (!scanner.hasNextInt())
        {
            System.out.print("Debe ingresar un valor numerico, intente nuevamente: ");
            scanner.nextLine();
        }
        telefono= Integer.parseInt(scanner.nextLine());
        return new Cliente(rut,nombres,apellidos,telefono);
    }

    public static void mostrarMenu ()
    {
        System.out.println("\n1.Consultar Saldo");
        System.out.println("2.Realizar deposito");
        System.out.println("3.Realizar retiro");
        System.out.println("4.Salir\n");
        System.out.print("Ingrece opcion: ");
    }

}
