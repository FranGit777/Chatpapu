package Productos;

public class Ropa extends ProductoBase {
    private String talla;
    private String color;

    public Ropa(int id, String nombre, double precio, String talla, String color) {
        super(id, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "ID=" + id() +
                ", Nombre='" + nombre() + '\'' +
                ", Precio=" + precio() +
                ", Talla='" + talla + '\'' +
                ", Color='" + color + '\'' +
                '}';
    }
}
