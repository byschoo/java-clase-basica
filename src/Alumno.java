// SUBCLASE DE PERSONA
public class Alumno extends Persona {

    private String id;

    // CONSTRUCTOR CON COPIA DE LA CLASE PERSONA
    public Alumno(String id, Persona persona) {
        super(persona); // El constructor de Alumno llama al constructor de Persona utilizando super
        this.id = id;
    }

    // GETTER
    public String getId() {
        return id;
    }

    // SETTER
    public void setId(String id) {
        this.id = id;
    }

    // POLIMORFISMO. @Override indica al compilador que el método está
    // sobreescribiendo un método de una superclase para que se comporte de una
    // manera diferente en la subclase.
    @Override
    public String imprimeV2() {
        return id;
    }

}
