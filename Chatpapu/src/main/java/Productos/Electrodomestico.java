package Productos;

public class Electrodomestico extends ProductoBase {
    private int garantiaEnMeses;

    public Electrodomestico(int id, String nombre, double precio, int garantiaEnMeses) {
        super(id, nombre, precio);
        this.garantiaEnMeses = garantiaEnMeses;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "ID=" + id() +
                ", Nombre='" + nombre() + '\'' +
                ", Precio=" + precio() +
                ", Garantía en Meses=" + garantiaEnMeses +
                '}';
    }
}

