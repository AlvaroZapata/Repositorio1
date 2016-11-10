/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Bebida extends Producto {

    private int azucar;
    private Date fecha_cad;

    public Date getFecha_cad() {
        return fecha_cad;
    }

    public void setFecha_cad(Date fecha_cad) {
        this.fecha_cad = fecha_cad;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public void mostrar() {

        super.mostrar();
        System.out.println(" El azucar es " + this.azucar);
    }

}
