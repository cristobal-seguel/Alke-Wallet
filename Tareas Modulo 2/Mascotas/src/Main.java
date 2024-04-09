public class Main {

    public static void main(String[] args) {
        Perro perro1=new Perro("Mota","Pastor Aleman",1,100);
        Perro perro2=new Perro("chico","Salchicha",2,50);
        Persona persona1=new Persona ("11111111-1","Eugenio","Gonzales",26,perro1);
        Persona persona2=new Persona ("22222222-2","Arnoldo","Sarmieno",45,perro2);
        persona1.mostrarDatosPersona();
        persona1.mostrarDatosPerro();
        persona2.mostrarDatosPersona();
        persona2.mostrarDatosPerro();

    }



}
