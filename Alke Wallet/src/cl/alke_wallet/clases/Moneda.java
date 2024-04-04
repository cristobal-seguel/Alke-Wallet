package cl.alke_wallet.clases;

public abstract class Moneda {

    protected int factorConversion;
    public abstract double convertir (double cifra);
}
