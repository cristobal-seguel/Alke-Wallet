import java.util.Scanner;
public class Main {
    public static double convertirEuro (double montoEuro,String monedaDestino)
    {
        double montoConvertido=0;
        if (monedaDestino.toLowerCase().equals("dolar"))
        {
            montoConvertido=montoEuro * 1.28611;
        }
        else if ((monedaDestino.toLowerCase().equals("libra")))
        {
            montoConvertido=montoEuro*0.86;
        }
        else if ((monedaDestino.toLowerCase().equals("yen")))
        {
            montoConvertido=montoEuro*129.852;
        }
        return montoConvertido;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese Monto en Euros a convertir: ");
        double montoEuro= scanner.nextDouble();
        System.out.println("El monto ingresado equivale a: "+convertirEuro(montoEuro,"dolar")+" dolares");
        System.out.println("El monto ingresado equivale a: "+convertirEuro(montoEuro,"libra")+" libras");
        System.out.println("El monto ingresado equivale a: "+convertirEuro(montoEuro,"yen")+" yenes");


    }
}
