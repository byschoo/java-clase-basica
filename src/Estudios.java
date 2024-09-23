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
    public String getInstitucion() {
        return institucion;
    }

    public String getCurso() {
        return curso;
    }

    public String getSeccion() {
        return seccion;
    }

    public int getAnio() {
        return anio;
    }

    // SETTERS
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // IMPRIME
    public String imprime() {
        return institucion + ", " + curso + ", " + anio + ", " + seccion;
    }
}

