# JAVA - Clase básica con encapsulamiento
Se crearon tres clases: Main, Persona y Estudios. La clase Persona encapsula la información sobre los estudios de una persona, lo que mejora la modularidad y la mantenibilidad del código.

## Herramientas Utilizadas
1. Clases con atributos privados y objetos de otra clase, constructores, métodos setters y getters, y métodos para imprimir la información contenida en la clase.

2. **System.out.print("\033[H\033[2J")** Limpia la pantalla

3. **Thread.sleep(5000)** Pausa de 10 segundos para visualizar y cambiar la información en pantalla de cada uno de las Personas.

4. Estructura de control **Try-Catch** para capturar una **InterruptedException** lanzada por Thread.sleep() si el hilo es interrumpido mientras esta en pausa.

6. **e.printStackTrace()** Este método es usado al capturar la excepción con el Try-Catch para tomar la información de la pila de llamadas e imprimirla en la consola, mostrando una lista de los métodos que se estaban ejecutando en ese momento, desde el más reciente hasta el más antiguo.

7. **Jerarquía de clases** (Herencia) Se diseña la SuperClase Persona y una SubClase Alumno.

8. **Constructor copia** Evita la duplicación de código en el constructor de Alumno. Facilita agregar nuevas subclases y modificar el comportamiento del método de impresiónV2 sin cambiar el código principal.

9. **@Override** (Polimorfismo) Indica al compilador que el método está sobreescribiendo un método de una superclase para que se comporte de una manera diferente en la subclase.

10. Atributos y Métodos **Static** Los atributos estáticos pertenecen a la clase en sí, no a las instancias de la clase. Son compartidos por todos los objetos de esa clase. No se puede hacer método setter de un atributo Static. Si, Getter para obtenerlo.

11. Se crea la **clase abstracta Beca** y la usamos para crear una **clase ProcesarBecas** que se encarga de cumplir el comportamiento exigido por la clase abstracta y establece de acuerdo a las notas definitiva si el estudiante es elegible a una beca estudiantil.