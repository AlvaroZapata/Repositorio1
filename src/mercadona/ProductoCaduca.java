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
public class ProductoCaduca extends Producto {

    private Date fecha_cad;

    protected Date getFecha_cad() {
        return fecha_cad;
    }

    public void setFecha_cad(Date fecha_cad) {
        this.fecha_cad = fecha_cad;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(" La fecha es " + this.fecha_cad);

    }

}
