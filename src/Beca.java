
// SUBCLASE DE ALUMNO Y SUPERCLASE ABSTRACTA DE PROCESARBECAS

// Las clases abstractas, como su nombre lo indica, son algo abstracto, no 
// representan algo específico y las podemos usar para crear otras clases. 
// No pueden ser instanciadas, por lo que no podemos crear nuevos objetos 
// con ellas. Obliga a las clases que hereden a usar sus comportamientos
public abstract class Beca extends Alumno {
    public abstract void isElegible(double notaDefinitiva);
}