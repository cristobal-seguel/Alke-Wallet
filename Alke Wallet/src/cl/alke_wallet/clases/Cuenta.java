package cl.alke_wallet.clases;

import java.util.Scanner;

/**
 * Representa una cuenta bancaria que puede realiza transacciones basicas como depositar y retirar dinero.
 */
public class Cuenta {

    /**
     * Cliente asociado a la cuenta
     */
    private Cliente cliente;

    /**
     * Saldo en pesos chilenos disponible en la cuenta
     */
    private double saldo;

    /**
     * Constructor de la clase Cuenta
     * @param cliente Objeto tipo Cliente
     */
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo=0;
    }

    /**
     * Función que aumenta el saldo de la cuenta según el monto ingresado por el usuario.
     * @param scanner Objeto de tipo Scanner utilizado para obtener los datos ingresados por el usuario.
     */
    public void depositarfondos (Scanner scanner)
    {
        System.out.print("Ingrese Monto a Depositar: ");
        while (!scanner.hasNextInt())
        {
            System.out.print("Entrada invalida, debe ingresar un valor numerico, intentelo nuevamente: ");
            scanner.nextLine();
        }
        this.saldo=this.saldo+scanner.nextInt();
        System.out.println("Operacion realizada exitosamante, su saldo actual es de $"+saldo);
        scanner.nextLine();
    }

    /**
     * Función que disminuye el saldo de la cuenta según el monto ingresado por el usuario.
     * @param scanner Objeto de tipo Scanner utilizado para obtener los datos ingresados por el usuario.
     */
    public void retirarFondos (Scanner scanner) {
        if (saldo > 0) {
            System.out.print("Ingrese monto a retirar: ");
            while (!scanner.hasNextInt())
            {
                System.out.print("Debe ingresar un valor numerico, intentelo otra vez: ");
                scanner.nextLine();
            }
            int montoRetiro=scanner.nextInt();
            scanner.nextLine();
            if (montoRetiro<=this.saldo)
            {
                this.saldo = this.saldo - montoRetiro;
                System.out.println("Retiro realizado exitosamente. Su saldo actual es de $" + saldo);
            }
            else
            {
                System.out.println("Monto a retirar excede el saldo disponible, no es posible realizar la operacion, intente nuevamente.");
            }
        } else
            System.out.println("Operacion fallida, no tiene saldo en su cuenta.");


    }

    /**
     * Función que realiza conversión del saldo de la cuenta a valor USD.
     * @return Devuelve un valor de tipo double correspondiente al valor en USD del saldo de la cuenta.
     */
    public double convertirSaldoADolar ()
    {
        return new Dolar ().convertir(saldo);
    }

    /**
     * Función que realiza conversión del saldo de la cuenta a valor en Euro.
     * @return Devuelve un valor de tipo double correspondiente al valor en EURo del saldo de la cuenta.
     */
    public double convertirSaldoAEURO ()
    {
        return new Euro().convertir(saldo);
    }

    /**
     * Función que obtiene el saldo de la cuenta.
     * @return valor de tipo double que representa el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

}
