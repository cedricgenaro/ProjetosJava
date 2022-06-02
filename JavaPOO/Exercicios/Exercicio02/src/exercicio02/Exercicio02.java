/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;

/**
 *
 * @author Cedric
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grampeador g1 = new Grampeador();
        g1.cor = "Vermelho";
        g1.modelo = "Raid";
        g1.tamanho = "pequeno";
        g1.carregar(5);
        g1.grampear();
        g1.exibir();
        
        Grampeador g2 = new Grampeador();
        g2.cor = "Preto";
        g2.modelo = "Gripen";
        g2.tamanho = "Médio";
        g2.carga = 0;
        g2.grampear();
        g2.exibir();
    }
    
}
