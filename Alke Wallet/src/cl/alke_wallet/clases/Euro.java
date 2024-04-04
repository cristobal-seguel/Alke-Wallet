package cl.alke_wallet.clases;

public class Euro extends Moneda{

    public Euro ()
    {
        factorConversion=1035;
    }
    @Override
    public double convertir(double cifra) {
        return cifra/factorConversion;
    }
}
