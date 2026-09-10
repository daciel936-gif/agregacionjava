// Se importan las clases necesarias para guardar varios parlantes.
import java.util.ArrayList;
import java.util.List;

// Esta clase representa una computadora que agrupa parlantes.
public class Computadora {

    // Se guarda el nombre de la computadora.
    private String nombre;

    // La computadora solo tiene referencias a parlantes ya creados.
    private List<Parlante> parlantes;

    // El constructor recibe el nombre de la computadora.
    public Computadora(String nombre) {
        // Se guarda el nombre recibido.
        this.nombre = nombre;

        // Se crea una lista vacía para guardar las referencias.
        this.parlantes = new ArrayList<>();
    }

    // Este método agrega un parlante creado fuera de la computadora.
    public void agregarParlante(Parlante parlante) {
        // Se agrega la referencia del parlante a la lista.
        parlantes.add(parlante);
    }

    // Este método muestra los parlantes conectados a la computadora.
    public void mostrarParlantes() {
        // Se muestra el nombre de la computadora.
        System.out.println("Parlantes de " + nombre + ":");

        // Se recorre cada parlante que está asociado.
        for (Parlante parlante : parlantes) {
            // Se imprime la marca de cada parlante.
            System.out.println("- " + parlante.getMarca());
        }
    }
}
