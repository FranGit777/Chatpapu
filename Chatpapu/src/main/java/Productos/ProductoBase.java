package Productos;

public abstract class ProductoBase {
    private int id;
    private String nombre;
    private double precio;

    public ProductoBase(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int id(){
        return id;
    }
    public String nombre(){
        return nombre;
    }

    public double precio(){
        return precio;
    }

}
