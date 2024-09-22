public class Estudios {

    // ATRIBUTOS
    private String 
        institucion,
        curso,
        seccion;
    
    private int anio;    

    // CONSTRUCTORES
    public Estudios() {}
    
    public Estudios(String institucion, String curso, int anio, String seccion) {
        this.institucion = institucion;
        this.curso = curso;
        this.anio = anio;
        this.seccion = seccion;
    }

    // GETTERS
    String getInstitucion() {
        return institucion;
    }

    String getCurso() {
        return curso;
    }

    String getSeccion() {
        return seccion;
    }

    int getAnio() {
        return anio;
    }

    // SETTERS
    void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    void setCurso(String curso){
        this.curso = curso;
    }

    void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    void setAnio(int anio) {
        this.anio = anio;
    }

    // IMPRIME
    public String imprime() {
        return institucion + ", " + curso + ", " + anio + ", " + seccion;
    }
}

