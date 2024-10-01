public class Persona {

    // ATRIBUTOS
    private String nombre,
            apellido,
            segundoApellido;

    private char sexo;
    private int edad;

    // La clase Persona encapsula la información sobre los estudios de una persona,
    // lo que mejora la modularidad y la mantenibilidad del código.
    Estudios estudios;

    // Atributo Static indica que los valores se mantendran en memoria durante la
    // ejecución de la aplicación, pertenecen a la clase en sí, no a las instancias
    // de la clase. Son compartidos por todos los objetos de esa clase. No se puede
    // hacer método setter de un atributo Static. Si, Getter para obtnerlo.
    private static int contPersonas = 0;


    // CONSTRUCTORES
    // Se validan los argumentos recibidos al instaciar la clase a través de los métodos setters.
    public Persona(String nombre, String apellido, String segundoApellido, char sexo, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setSegundoApellido(segundoApellido);
        setSexo(sexo);
        setEdad(edad);
        Persona.contPersonas++;
    }

    // This() hace la llamada al constructor que reciba la misma cantidad de
    // parámetros dentro de su misma clase. Ahorramos duplicación de código
    // innecesario
    public Persona(String nombre, String apellido, String segundoApellido, char sexo) {
        this(nombre, apellido, segundoApellido, sexo, 0);
    }

    public Persona(String nombre, String apellido, String segundoApellido) {
        this(nombre, apellido, segundoApellido, 'N', 0);
    }

    public Persona(String nombre, String apellido) {
        this(nombre, apellido, "N/A", 'N', 0);
    }

    public Persona(String nombre) {
        this(nombre, "N/A", "N/A", 'N', 0);
    }

    public Persona() {
        this("N/A", "N/A", "N/A", 'N', 0);
    }


    // CONSTRUCTOR COPIA
    public Persona(Persona otraPersona) {
        this.nombre = otraPersona.nombre;
        this.apellido = otraPersona.apellido;
        this.segundoApellido = otraPersona.segundoApellido;
        this.sexo = otraPersona.sexo;
        this.edad = otraPersona.edad;
    }


    // GETTERS
    public String getNombre() {
        return nombre;
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

    // Los atributos estáticos pertenecen a la clase en sí, no a las instancias de
    // la clase. por lo que puede ser llamado directamente a través de la clase
    // sin necesidad de crear una instancia de la misma. Los métodos static no
    // pueden acceder a variables de instancia directamente, ya que pertenecen a
    // la clase, no a objetos específicos.
    public static int getContPersonas() {
        return contPersonas;
    }

    // SETTERS
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else
            this.nombre = "ERROR";
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        } else
            this.apellido = "ERROR";
    }

    public void setSegundoApellido(String segundoApellido) {
        if (segundoApellido != null) {
            this.segundoApellido = segundoApellido;
        } else
            this.segundoApellido = "ERROR";
    }

    public void setSexo(char sexo) {
        if (sexo != ' ') {
            this.sexo = sexo;
        } else
            this.sexo = '*';
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else
            this.edad = 0;
    }

    // MÉTODO IMPRIME
    public void imprimeV1() {
        System.out.print("\033[H\033[2J"); // Limpia la pantalla
        System.out.println("Identificación de la Persona: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Segundo Apellido: " + this.segundoApellido);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Edad: " + this.edad);

        // Thread.sleep() puede lanzar una InterruptedException si el hilo es
        // interrumpido mientras está durmiendo. Se encierra la llamada a
        // Thread.sleep() dentro de un bloque try-catch para capturar esta excepción.
        try {
            Thread.sleep(2500); // Pausa de 2.5 segundos
        }

        // e.printStackTrace() Este método toma la información de la pila de llamadas y
        // la imprime en la consola, mostrando una lista de los métodos que se estaban
        // ejecutando en ese momento, desde el más reciente hasta el más antiguo.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String imprimeV2() {
        return nombre + " " + apellido + " " + segundoApellido;
    }
}
