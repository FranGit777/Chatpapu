package org.example;

import productos.ProductoBase;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<ProductoBase> inventario = new ArrayList<>();

    public int getSize(){
        return inventario.size();
    }

    public void agregarProducto(ProductoBase producto) {
        inventario.add(producto);
    }

    public void mostrarInventario() {
        System.out.println("Inventario: ");
        for (ProductoBase producto : inventario) {
            System.out.println(producto);
        }
    }

}