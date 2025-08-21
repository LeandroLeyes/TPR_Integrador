
package Integrador;

import java.util.Scanner;

public class OmniAzul extends Castor {
    private double propulsion;
    private String nombre;
    private Scanner teclado;
    
    public OmniAzul(String nombre) {
        super();
        this.teclado = new Scanner(System.in);
        this.nombre = nombre;
        do {
            System.out.println("Ingrese propulsion para "+ nombre +" (8-10 Km/s) ");
            this.propulsion = teclado.nextDouble();
            if (propulsion < 8 || propulsion > 10) {
                System.out.println("La Propulsion debe estar entre 8 y 10 Km/s ");
            }
        } while (propulsion < 8 || propulsion > 10);
        System.out.println("Ornitorrinco Azul '"+ nombre +"' creado");
    }
    
    @Override
    public void nadar() {
        double velocidadTotal = velocidad + propulsion;
        System.out.println(nombre +" nadando a "+ velocidadTotal +" Km/h ");
    }

    public double getPropulsion() {
        return propulsion;
    }

    public String getNombre() {
        return nombre;
    }
    
}
