
package Integrador;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Castor {
    protected double longitudCola;
    protected double velocidad;
    protected Scanner teclado;

    public Castor() {
        teclado = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ingrese la longitud de la cola del castor en (cm): ");
                this.longitudCola = teclado.nextDouble();
                teclado.nextLine();
                System.out.println("Ingrese la velocidad del castor (Km/h): ");
                this.velocidad = teclado.nextDouble();
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero valido");
                teclado.nextLine();
            }
        }
    }
    
    public void nadar() {
        System.out.println("Nadando a "+ velocidad +" Km/h ");
    }
    
    public void tocarGuitarra() {
        Random random = new Random();
        for(int i = 0;i < 3; i++) {
            int cuerda = random.nextInt(6)+1;
            System.out.println("toca cuerda "+ cuerda);
        }
    }
    
}
