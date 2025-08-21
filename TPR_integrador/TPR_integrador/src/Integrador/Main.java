
package Integrador;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("------ Creacion de Ornitorrincos ------");
        OmniVerde omniVerde = new OmniVerde ("Perry");
        OmniAzul blue = new OmniAzul ("Blue");
        OmniAzul blui = new OmniAzul ("Blui");
        
        System.out.println("\n------ Habilidades de los Ornitorrincos ------");
        
        System.out.println("\n--- "+ omniVerde.getNombre() +" (Verde) ---");
        omniVerde.nadar();
        omniVerde.tocarGuitorgan();
        
        System.out.println("\n--- "+ blue.getNombre() +" (Azul) ---");
        blue.nadar();
        blue.tocarGuitarra();
        
        System.out.println("\n--- "+ blui.getNombre() +" (Azul) ---");
        blui.nadar();
        blui.tocarGuitarra();
        
        System.out.println("\n------ Arreglo de Hermanos ------");
        Castor[] hermanos = new Castor[3];
        
        try {
            hermanos[0] = blue;
            hermanos[1] = omniVerde;
            hermanos[2] = blui;
            hermanos[3] = omniVerde;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indice fuera de los limites del arreglo");
        } finally {
            System.out.println("Los ornitohermanos estan juntos al fin...");
        }
        
        System.out.println("------ Mejores Nadadores (Azul)------");
        List<OmniAzul> mejoresNadadores = new ArrayList<>();
        for (Castor hermano : hermanos) {
            if (hermano instanceof OmniAzul) {
                mejoresNadadores.add((OmniAzul) hermano);
            }
        }
        
        Collections.sort(mejoresNadadores, new Comparator<OmniAzul>() {
            @Override
            public int compare(OmniAzul o1, OmniAzul o2) {
                return Double.compare(o1.getPropulsion(), o2.getPropulsion());
            }
        });
        
        System.out.println("Nadadores ordenados por propulsion ascendente: ");
        Iterator<OmniAzul> iterador = mejoresNadadores.iterator();
        while (iterador.hasNext()) {
            OmniAzul nadador = iterador.next();
            System.out.println(nadador.getNombre() +" - Propulsion: "+ nadador.getPropulsion() +" Km/s");
        }
        
        teclado.close();
    }
}
