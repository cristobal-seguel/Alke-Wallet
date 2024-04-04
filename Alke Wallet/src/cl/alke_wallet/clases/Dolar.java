package cl.alke_wallet.clases;

public class Dolar extends Moneda{

    public Dolar ()
    {
        factorConversion=955;
    }
    @Override
    public double convertir(double montoCl) {
        return montoCl/factorConversion;
    }
}
