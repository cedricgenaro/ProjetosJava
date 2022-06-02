/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampada;
import javax.swing.JOptionPane;

/**
 *
 * @author Cedric
 */
public class Lampada {
    String modelo;
    int watts = 75;
    String cor;
    String formato;
    boolean status;
    
    void acender(){
        if(!this.status){
            this.status = true;
            System.out.println("A lampada foi acesa!");
        }else 
            System.out.println("Erro! A lampada já está acesa");
        }
    
    void apagar(){
        if(this.status){
            this.status = false;
            System.out.println("A lampada foi apagada");
        }else {
            System.out.println("Erro! A lampada já está apagada");
        }
        
    }
    
    void exibir() {
        JOptionPane.showMessageDialog(null,
                "<html>Dados da Lampada<hr> \n Modelo: "+ this.modelo
                 + "\n Watts: " + this.watts + 
                  "\n Cor: " + this.cor +
                  "\n Formato: " + this.formato +
                   "\n Status: " + this.status);
              
    }
    
    
}
