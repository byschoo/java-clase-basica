public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Raúl", "De Jesús", "Jiménez", "González", 'M', 17);
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        
        Estudios estudios1 = new Estudios("Isaac Peral","Bachillerato", 2, "B");

        persona2.setNombre("Sofía");
        persona2.setSegundoNombre("Valentina");
        persona2.setApellido("Jiménez");
        persona2.setSegundoApellido("González");
        persona2.setSexo('F');
        persona2.setEdad(13);

        persona1.imprimeV1();
        persona2.imprimeV1();
        persona3.imprimeV1();

        persona1.estudios = estudios1;
        System.out.println("El estudiante " + persona1.imprimeV2() + " " + "estudia en: " + persona1.estudios.imprime());
    }
}
