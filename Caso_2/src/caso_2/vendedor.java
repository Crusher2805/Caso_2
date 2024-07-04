/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_2;

/**
 *
 * @author David Hernandez
 */
public class vendedor {

    public String nombreVendedor;
    public int puntos;
    public double comisiones;

    public vendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
        this.puntos = 0;
        this.comisiones = 0.0;
    }

    public void factura(factura factura) {
        if (factura.getElectricos()!=null && factura.getElectricos().equals("si")) {
            if (factura.getAuto()!= null && factura.getAuto().equals("si")) {
                if (factura.getConstru()!=null && factura.getConstru().equals("si")) {
                    
                    if (factura.getMontoFactura() > 50000) {
                        
                        comisiones += factura.getMontoFactura() * 0.1;
                        puntos += 3;
                    }
                } else {
                   
                    if (factura.getMontoFactura() > 50000) {
                        
                        comisiones += factura.getMontoFactura() * 0.1;
                        puntos += 3;
                    } else {
                        
                        comisiones += factura.getMontoFactura() * 0.04;
                        puntos += 1;
                    }
                }
            } else {
              
                if (factura.getMontoFactura() > 50000) {
                  
                    comisiones += factura.getMontoFactura() * 0.1;
                    puntos += 3;
                } else {
                
                    comisiones += factura.getMontoFactura() * 0.02;
                    puntos += 1;
                }
            }
        } else if (factura.getAuto()!= null && factura.getAuto().equals("si")) {
            
            if (factura.getMontoFactura() > 50000) {
                
                comisiones += factura.getMontoFactura() * 0.1;
                puntos += 3;
            } else {
               
                comisiones += factura.getMontoFactura() * 0.02;
                puntos += 1;
            }
        } else if (factura.getConstru()!= null && factura.getConstru().equals("si")) {
            
            comisiones += factura.getMontoFactura() * 0.08;
            puntos += 2;
        }

        
        if (factura.getMontoFactura() > 50000) {
            comisiones += factura.getMontoFactura() * 0.05;
            puntos += 1;
        }
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

   
    }

    

