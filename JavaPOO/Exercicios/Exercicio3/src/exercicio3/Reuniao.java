/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author Cedric
 */
public class Reuniao {
    String data;
    String time;
    boolean status;
    String local;
    
    void marcar(){
        if(status){
            System.out.println("Erro! A reunião deve ser canecelada.");
        }else{
            this.data = JOptionPane.showInputDialog(null, "Qual será a data da renião? ");
            this.time = JOptionPane.showInputDialog(null, "Qual o horário? ");
            this.local = JOptionPane.showInputDialog(null, "Aonde será a reunião? ");
            if(!"".equals(this.data) && !"".equals(this.time) && !"".equals(this.local)){
                JOptionPane.showMessageDialog(null, "Reunião marcada com sucesso! ");
                this.status = true;
            }else{
                JOptionPane.showMessageDialog(null, "ERRO! Todos os dados devem ser preenchidos");
            }
        }
    }
    
    void cancelar(){
        if(status){
            System.out.println("A reunião foi cancelada com sucesso!");
            this.status = false;
        }else{
            System.out.println("Erro a reunião já foi cancelada!");
        }
    }
    
    void alterarLocal(){
        if(status){
            this.local = JOptionPane.showInputDialog(null, "Qual será o novo local? ");
        }else{
            System.out.println("Erro! A reunião foi cancelada");
        }
        
    }
    void exibir() {
        JOptionPane.showMessageDialog(null, "<html>Dados da reunião: <hr>" + 
                "\n Data: " + this.data +
                "\n Hora: " + this.time +
                "\n Local: " + this.local +
                "\n Status: " + this.status);
        
    }
    
}
