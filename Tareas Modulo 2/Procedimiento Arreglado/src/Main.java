public class Main {
    public static void mostrarArreglo (String[] valores)
    {
        for (int i=0;i< valores.length;i++)
            System.out.println("Dato "+Integer.toString(i+1)+" = "+valores[i]);
    }

    public static void main(String[] args) {
        String vector[]= {"uno","dos","tres","cuatro"};
        mostrarArreglo(vector);
    }
}
