/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampada;

/**
 *
 * @author Cedric
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada l1 = new Lampada();
        l1.modelo = "Led";
        l1.cor = "Azul";
        l1.formato = "Redonda";
        l1.status = true;
        l1.acender();
        l1.exibir();
        l1.apagar();
        
        Lampada l2 = new Lampada();
        l2.modelo = "Led";
        l2.cor = "Branca";
        l2.formato = "Quadrada";
        l2.status = false;
        l2.apagar();
        l2.exibir();
    }
    
}
