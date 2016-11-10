/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.sql.Date;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Iterator;

public class Mercadona {

    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void rellenarDatos() {
        Producto p;
        ProductoCaduca pc;
        ProductoFresco pf;
        Bebida b;
        BebidaAlcohol ba;
        Empleado em;

        for (int i = 0; i < 10; i++) {
            em = new Empleado();
            em.setNombre("EMPLEADO " + i);
            em.setEdad(1 + i);
            empleados.add(em);
        }

        for (int i = 0; i < 10; i++) {

            p = new Producto();
            p.setCodigo(11);
            p.setNombre("Arroz");
            p.setPeso(0.87654);
            productos.add(p);

            pc = new ProductoCaduca();
            pc.setCodigo(22);
            pc.setFecha_cad(Date.valueOf(LocalDate.now()));
            productos.add(pc);

            pf = new ProductoFresco();
            pf.setCodigo(33);
            pf.setFecha_cad(Date.valueOf(LocalDate.now()));
            pf.setTemperatura("3º GRADOS " + i);
            productos.add(pf);

            b = new Bebida();
            b.setCodigo(44);
            b.setAzucar(30);
            b.setFecha_cad(Date.valueOf(LocalDate.now()));
            productos.add(b);

            ba = new BebidaAlcohol();
            ba.setCodigo(55);
            ba.setFecha_cad(Date.valueOf(LocalDate.now()));
            ba.setAzucar(50);
            ba.setGraduacion(40);
            productos.add(ba);

        }
    }

    public static void mostrarBebidas() {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida) {
                //System.out.println(productos.get(i).getCodigo());
                System.out.println(((Bebida) productos.get(i)).getAzucar());

            }
        }

    }

    public static void mostrarProductos() {
        for (Producto producto : productos) {
            producto.mostrar();

        }
    }

    public static void mostrarMediaGraduacion() {
        int Suma = 0;
        int cont = 0;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof BebidaAlcohol) {

                Suma += ((BebidaAlcohol) productos.get(i)).getGraduacion();   //Suma+= es igual a Suma = Suma +
                cont++;

            }

        }
        System.out.println(Suma / cont);
    }

    public static void mostrarAzucarNoAlcohol() {

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebida && (!(productos.get(i) instanceof BebidaAlcohol))) {
                System.out.println(((Bebida) productos.get(i)).getAzucar());
                System.out.println(((Bebida) productos.get(i)).getCodigo());
                System.out.println(((Bebida) productos.get(i)).getFecha_cad());
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        //mostrarBebidas();
        mostrarProductos();
        //mostrarAzucarNoAlcohol();
        //mostrarMediaGraduacion();
    }

}
