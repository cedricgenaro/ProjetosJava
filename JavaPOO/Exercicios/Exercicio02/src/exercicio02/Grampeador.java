/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;
import javax.swing.JOptionPane;
/**
 *
 * @author Cedric
 */
public class Grampeador {
    String tamanho;
    String cor;
    String modelo;
    int carga;
    
    void carregar(int n){
        this.carga += n;
    }
    
    void grampear(){
        if(carga > 0){
            System.out.println("Estou grampeando");
            
        }else{
            System.out.println("Erro! estou sem grampos");
        }
    }
    
    void exibir(){
        JOptionPane.showMessageDialog(null, "<html> Dados: <hr>"
                + "\n Modelo: " + this.modelo +
                "\n Tamanho: " + this.tamanho + 
                "\n Carga: " + this.carga + 
                "\n Cor: " + this.cor);
    }
}
