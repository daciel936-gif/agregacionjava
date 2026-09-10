// Esta clase representa un parlante que puede existir por separado.
public class Parlante {

    // Se guarda la marca para identificar el parlante.
    private String marca;

    // El constructor recibe la marca cuando se crea el parlante.
    public Parlante(String marca) {
        // Se guarda la marca recibida en el atributo de la clase.
        this.marca = marca;
    }

    // Este método permite consultar la marca del parlante.
    public String getMarca() {
        // Se devuelve la marca guardada.
        return marca;
    }
}
