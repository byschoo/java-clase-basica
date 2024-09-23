public class Persona {

    // ATRIBUTOS
    private String nombre,
            segundoNombre,
            apellido,
            segundoApellido;

    private char sexo;
    private int edad;
    Estudios estudios;
    // La clase Persona encapsula la información sobre los estudios de una persona,
    // lo que mejora la modularidad y la mantenibilidad del código.

    // CONSTRUCTORES
    public Persona() {
        nombre = "Desconocido";
        segundoNombre = "Desconocido";
        apellido = "Desconocido";
        segundoApellido = "Desconocido";
        sexo = ' ';
        edad = 0;
    }

    public Persona(String nombre, String apellido, String segundoApellido) {
        this.nombre = nombre;
        this.segundoNombre = "";
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        sexo = ' ';
        edad = 0;
    }

    public Persona(String nombre, String segundoNombre, String apellido, String segundoApellido) {
        this.nombre = nombre;
        this.segundoNombre = segundoApellido;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        sexo = ' ';
        edad = 0;
    }

    public Persona(String nombre, String segundoNombre, String apellido, String segundoApellido, char sexo) {
        this.nombre = nombre;
        this.segundoNombre = segundoApellido;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        edad = 0;
    }

    public Persona(String nombre, String segundoNombre, String apellido, String segundoApellido, char sexo, int edad) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public char getSexo() {
        return sexo;
    }

    public int edad() {
        return edad;
    }


    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // MÉTODO IMPRIME
    public void imprimeV1() {
        System.out.print("\033[H\033[2J"); // Limpia la pantalla
        System.out.println("Identificación de la Persona: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Segundo Nombre: " + this.segundoNombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Segundo Apellido: " + this.segundoApellido);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Edad: " + this.edad);

        // Thread.sleep() puede lanzar una InterruptedException si el hilo es
        // interrumpido mientras está durmiendo. Se encierra la llamada a
        // Thread.sleep() dentro de un bloque try-catch para capturar esta excepción.
        try {
            Thread.sleep(5000); // Pausa de 10 segundos
        }

        // e.printStackTrace() Este método toma la información de la pila de llamadas y
        // la imprime en la consola, mostrando una lista de los métodos que se estaban
        // ejecutando en ese momento, desde el más reciente hasta el más antiguo.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String imprimeV2() {
        return nombre + " " + segundoNombre + " " + apellido + " " + segundoApellido;
    }
}
