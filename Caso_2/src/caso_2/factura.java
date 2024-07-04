/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_2;

/**
 *
 * @author David Hernandez
 */
public class factura {

    public String nombre;
    public int id;
    public int idFactura;
    public double montoFactura;
    public int mes;
    public String electricos;
    public String auto;
    public String constru;

    public factura(String nombreCliente, int id, int idFactura, double montoFactura, int mes, String electricos, String auto, String construccion) {
        this.nombre = nombre;
        this.id = id;
        this.idFactura = idFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.electricos = electricos;
        this.auto = auto;
        this.constru = constru;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getElectricos() {
        return electricos;
    }

    public void setElectricos(String electricos) {
        this.electricos = electricos;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getConstru() {
        return constru;
    }

    public void setConstru(String constru) {
        this.constru = constru;
    }

    
}
