package com.example.serborll.procesado;

public class PojoClass {

    long fecha;
    String Habitacion;
    int temperatura;

    public PojoClass() {

    }

    public PojoClass(long fecha, String Habitacion, int temperatura) {
        this.fecha = fecha;
        this.Habitacion = Habitacion;
        this.temperatura = temperatura;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String habitacion) {
        Habitacion = habitacion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
