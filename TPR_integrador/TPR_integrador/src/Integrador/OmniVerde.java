
package Integrador;

public class OmniVerde extends Castor implements Pata {
    private String nombre;
    private double pico;
    private double patas;
    
    public OmniVerde(String nombre) {
        super();
        this.pico = 6.8;
        this.patas = 7.5;
        this.nombre = nombre;
        System.out.println("Ornitorrinco Verde '"+ nombre +"' creado");
    }
    
    @Override
    public void tocarOrgano() {
        System.out.println("Presione tecla para continuar...");
        teclado.nextInt();
        teclado.nextLine();
        System.out.println("Do - Re - Mi");
        System.out.println("Fa - So - La - Si");
    }
    
    public void tocarGuitorgan() {
        System.out.println(nombre +" esta tocando la Guitorgan: ");
        tocarGuitarra();
        tocarOrgano();
        System.out.println("cuac guase...");
    }

    public String getNombre() {
        return nombre;
    }
    
}
