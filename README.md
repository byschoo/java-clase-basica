# JAVA - Clase básica con encapsulamiento
Se crearon tres clases: Main, Persona y Estudios. La clase Persona encapsula la información sobre los estudios de una persona, lo que mejora la modularidad y la mantenibilidad del código.

## Herramientas Utilizadas
1. Clases con atributos privados y objetos de otra clase, constructores, métodos setters y getters, y métodos para imprimir la información contenida en la clase.

2. **System.out.print("\033[H\033[2J")** Limpia la pantalla

3. **Thread.sleep(5000)** Pausa de 10 segundos para visualizar y cambiar la información en pantalla de cada uno de las Personas.

4. Estructura de control Try-Catch para capturar una **InterruptedException** lanzada por Thread.sleep() si el hilo es interrumpido mientras esta en pausa.

6. **e.printStackTrace()** Este método es usado al capturar la excepción con el Try-Catch para tomar la información de la pila de llamadas e imprimirla en la consola, mostrando una lista de los métodos que se estaban ejecutando en ese momento, desde el más reciente hasta el más antiguo.
