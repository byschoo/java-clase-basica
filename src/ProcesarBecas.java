
// SUBCLASE DE BECA
public class ProcesarBecas extends Beca {

    // La variable estática final privada se considerará constante y se podrá
    // acceder a ella solo dentro de esta clase. Dado que se incluye la palabra
    // clave static, el valor será constante para todos los objetos de la clase. El
    // valor de la variable estática final privada será constante para cada objeto.
    private static final double notaMinima = 8;

    // ProcesarBecas cumple con el comportamiento obligatorio que le exige la clase
    // abstracta Beca. 
    @Override
    public void isElegible(double notaDefinitiva) {
        if (notaDefinitiva >= notaMinima) {
            System.out.println("El alumno está becado.");
        } else {
            System.out.println("El alumno no está becado.");
        }
    }
}
