// Esta clase inicia el ejemplo de agregación.
public class Principal {

    // El programa empieza desde este método.
    public static void main(String[] args) {

        // Se crean los parlantes antes que la computadora.
        Parlante parlanteIzquierdo = new Parlante("Logitech izquierdo");

        // Este parlante también existe de manera independiente.
        Parlante parlanteDerecho = new Parlante("Logitech derecho");

        // Se crea la computadora sin crear parlantes dentro de ella.
        Computadora computador = new Computadora("PC de Daniel");

        // Se relaciona el primer parlante con la computadora.
        computador.agregarParlante(parlanteIzquierdo);

        // Se relaciona el segundo parlante con la computadora.
        computador.agregarParlante(parlanteDerecho);

        // Se muestran los parlantes que tiene la computadora.
        computador.mostrarParlantes();

        // Se elimina la referencia a la computadora del programa.
        computador = null;

        // El parlante sigue existiendo aunque ya no se use la computadora.
        System.out.println("El parlante sigue existiendo: " + parlanteIzquierdo.getMarca());
    }
}
