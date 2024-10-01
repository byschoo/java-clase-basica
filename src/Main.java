public class Main {
    public static void main(String[] args) throws Exception {

        // Se crean los objetos
        Persona persona1 = new Persona("Raúl De Jesús", "Jiménez", "González", 'M', 17);
        Persona persona2 = new Persona();
        Estudios estudios1 = new Estudios("Isaac Peral", "Bachillerato", 2, "B");
        Alumno alumno1 = new Alumno("Y5944140B", persona1, 9);

        persona2.setNombre("Sofía Valentina");
        persona2.setApellido("Jiménez");
        persona2.setSegundoApellido("González");
        persona2.setSexo('F');
        persona2.setEdad(13);

        // Se imprime toda la información de los objetos personas construidos
        persona1.imprimeV1();
        persona2.imprimeV1();

        // Aquí observamos el comportamiento del Polimorfismo al realizar la llamada al
        // mismo método imprimeV2() recibimos diferentes mensajes
        persona1.estudios = estudios1;
        System.out.println("El estudiante " + persona1.imprimeV2() + " estudia en " + persona1.estudios.imprime());
        System.out.println("El estudiante " + alumno1.imprimeV2() + " estudia en " + persona1.estudios.imprime());

        // Para acceder a un método estático, se considera un atributo de la clase, por
        // ello se debe acceder con el nombre de la clase. Ver la "P" mayúscula en
        // Persona.getContPersonas().
        System.out.println("La cantidad de personas es de: " + Persona.getContPersonas());

        // Se crea el objeto procesarBecas para conocer si un Alumno de acuerdo a sus
        // notas definitiva es elegible a una Beca
        ProcesarBecas procesarBecas = new ProcesarBecas();
        procesarBecas.isElegible(alumno1.getNotaDefinitiva());
    }
}
