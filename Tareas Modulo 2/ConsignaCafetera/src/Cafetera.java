public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {}

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera (){
        capacidadActual=capacidadMaxima;
    }

    public void servirTaza (int tamanoTaza){
        if (tamanoTaza<=capacidadActual)
        {
            capacidadActual=capacidadActual-tamanoTaza;
            System.out.printf("La taza se llenó completamente");
        }
        else
        {
            System.out.println("El contenido de la vertido sobre la taza es de "+ capacidadActual);
            vaciarCafetera();
        }

    }

    public void vaciarCafetera (){
        capacidadActual=0;
    }

    public void agregarCafe (int cantidadCafe){
        if (capacidadMaxima>capacidadActual+cantidadCafe)
        {
            System.out.println("Con la cantidad de cafe a igresar se excede la capacidad maxima de la cafetera, solo se vertíra lo necesario para llenar la cafetera ");
            capacidadActual=capacidadMaxima;
        }
        else
        {
            capacidadActual=capacidadActual+cantidadCafe;
        }

    }
}