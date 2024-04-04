import java.util.Scanner;
import cl.alke_wallet.clases.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner (System.in);
        Cliente cliente=Menu.crearCliente(scanner);
        Cuenta cuenta=new Cuenta(cliente);
        System.out.println("\nSe ha registrado exitosamente su cuenta, a continuación podrá visualizar las operaciones " +
                "disponibles a realizar con su billetera, presione cualquier tecla para continuar.");
        scanner.nextLine();
        String opcion="";
        do
        {
            Menu.mostrarMenu();
            opcion=scanner.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Su saldo disponible en es de: $"+cuenta.getSaldo()+".");
                    System.out.println("Su saldo disponible equivale a "+cuenta.convertirSaldoADolar()+" USD.");
                    System.out.println("Su saldo disponible equivale a "+cuenta.convertirSaldoAEURO()+" Euros.");
                    break;
                case "2":
                    cuenta.depositarfondos(scanner);
                    break;
                case "3":
                    cuenta.retirarFondos(scanner);
                    break;
                case "4":
                    System.out.println("La aplicación se cerrará...");
                    break;
                default:
                    System.out.println("Opcion invalida, vuelva a intentarlo.");
            }
            System.out.println("\nPresione cualquier tecla para continuar.");
            scanner.nextLine();
        }
        while (!opcion.equals("4"));
    }
}