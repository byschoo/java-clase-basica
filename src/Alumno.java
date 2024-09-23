public class Alumno extends Persona{
    
    private String id;

    public Alumno(String id, String nombre, String segundoNombre, String apellido, String segundoApellido, char sexo, int edad) {
        super(nombre, segundoNombre, apellido, segundoApellido, sexo, edad);
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // IMPRIME
    public String imprime() {
        return id;
    }

}
