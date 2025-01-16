
package com.mycompany.waze_2;

public class Ruta {
   private String puntoInicio;
    private String puntoDestino;
    private double distancia;
    private String tiempoEstimado;

    public Ruta(String puntoInicio, String puntoDestino, double distancia, String tiempoEstimado) {
        this.puntoInicio = puntoInicio;
        this.puntoDestino = puntoDestino;
        this.distancia = distancia;
        this.tiempoEstimado = tiempoEstimado;
    }

    public void mostrarRuta() {
        System.out.println("Ruta desde " + puntoInicio + " hasta " + puntoDestino);
        System.out.println("Distancia: " + distancia + " km, Tiempo estimado: " + tiempoEstimado);
    }
}
