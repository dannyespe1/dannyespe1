
package com.mycompany.waze_2;

public class Usuario {
    private String id;
    private String nombre;
    private String ubicacionActual;

    public Usuario(String id, String nombre, String ubicacionActual) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacionActual = ubicacionActual;
    }

    public void actualizarUbicacion(String nuevaUbicacion) {
        this.ubicacionActual = nuevaUbicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }
}
