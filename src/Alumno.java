
// SUBCLASE DE PERSONA Y SUPERCLASE DE BECA
public class Alumno extends Persona {
    private String id;
    private double notaDefinitiva;

    // CONSTRUCTORES
    public Alumno() {
    }

    // CONSTRUCTOR CON COPIA DE LA CLASE PERSONA
    public Alumno(String id, Persona persona, double notaDefinitiva) {
        super(persona); // El constructor de Alumno llama al constructor de Persona utilizando "super"
        this.id = id;
        this.notaDefinitiva = notaDefinitiva;
    }

    // GETTER
    public String getId() {
        return id;
    }

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    // SETTER
    public void setId(String id) {
        this.id = id;
    }

    public void setNotaDefinitiva(double notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }

    // POLIMORFISMO. @Override indica al compilador que el método está
    // sobreescribiendo un método de una superclase para que se comporte de una
    // manera diferente en la subclase.
    @Override
    public String imprimeV2() {
        return id + " tiene Notas Definitiva de " + notaDefinitiva;
    }
}
