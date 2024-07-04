/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_2;
import javax.swing.JOptionPane;

/**
 *
 * @author David Hernandez
 */
public class Caso_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primero preguntar el nombre del vendedor
        
        String nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre del vendedor");

        // crear una instancia a la clase vendedor 
        vendedor vendedor = new vendedor(nombreVendedor);

        // preguntar la cantidad de facturas para asi limitar el for
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a registrar"));

        for (int i = 0; i < cantidadFacturas; i++) {
            
            //Luego realizar los diferentes inputs de los datos solicitados
           
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente"));
            int idFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la factura"));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mes indicado con numeros"));
            String electricos = JOptionPane.showInputDialog("La factura tiene productos eléctricos (si o no)");
            String auto = JOptionPane.showInputDialog("La factura tiene productos automotrices (si o no)");
            String constru = JOptionPane.showInputDialog("La factura tiene productos de construcción (si o no)");

           // luego crear otra instancia llamando a  los parametros de la clase factura
            factura factura = new factura(nombre, id, idFactura, montoFactura, mes, electricos, auto, constru);

           // llamar la clase factura con el metodo
            vendedor.factura(factura);
        }

// imprimir los resultados
        JOptionPane.showMessageDialog(null, "Puntos acumulados: " + vendedor.getPuntos());
        JOptionPane.showMessageDialog(null, "Comisiones totales: " + vendedor.getComisiones());
    }
}
