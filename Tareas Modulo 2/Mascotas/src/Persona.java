public class Persona {

    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private Perro perro;

    public Persona(String rut, String nombre, String apellido, int edad, Perro perro) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.perro = perro;
    }

    public void mostrarDatosPerro ()
    {
        System.out.println("Nombre Mascota  : "+perro.getNombre());
        System.out.println("Raza Mascota    : "+perro.getRaza());
        System.out.println("Edad Mascota    : "+perro.getEdad());
        System.out.println("Tamaño Mascota  : "+perro.getTamano());
    }

    public void mostrarDatosPersona ()
    {
        System.out.println("Rut Persona: "+getRut());
        System.out.println("Nombre Persona: "+getNombre());
        System.out.println("Apellido Persona: "+getApellido());
        System.out.println("Edad Persona: "+getEdad());
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
}
