public class Main {
    public static void main(String[] args) {
        Persona hombre = new Persona();
        hombre.setEdad(25);
        hombre.setNombre("Lorenzo");
        hombre.setTelefono("987456123");
        System.out.println("Nombre: " + hombre.getNombre());
        System.out.println("Edad: " + hombre.getEdad());
        System.out.println("Telefono: " + hombre.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }


}
