/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author usuario
 */
public class BebidaAlcohol extends Bebida {

    private int graduacion;

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(" La graduacuin es " + this.graduacion);
    }

}
