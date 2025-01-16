
package com.mycompany.waze_2;

public class Reporte {
    private String tipoEvento;
    private String ubicacion;
    private String horaReporte;

    public Reporte(String tipoEvento, String ubicacion, String horaReporte) {
        this.tipoEvento = tipoEvento;
        this.ubicacion = ubicacion;
        this.horaReporte = horaReporte;
    }

    public void mostrarReporte() {
        System.out.println("Evento: " + tipoEvento + ", Ubicación: " + ubicacion + ", Hora: " + horaReporte);
    }
}
