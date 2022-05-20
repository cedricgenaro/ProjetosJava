/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Cedric
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*JOptionPane.showMessageDialog(null, "Olá mundo! ");
        JOptionPane.showMessageDialog(null, "Olá mundo! ", "Alerta", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá mundo! ", "Erro interno", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá mundo! ", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá mundo! ", "Sem simbolo", JOptionPane.PLAIN_MESSAGE);//Tira o símbolo
        JOptionPane.showMessageDialog(null, "Olá mundo? ", "Duvida", JOptionPane.QUESTION_MESSAGE);*/
       //JOptionPane.showMessageDialog(null, "Você digitou o valor "+n);
       int n, s = 0; 
       do {            
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><i>(valor 0 interrompe)</i></html> "));
            s += n;
        } while(n != 0);
       JOptionPane.showMessageDialog(null, "<html>Resultado Final <br><hr>" +
               "<br>Somatório vale " + s + "</html>");
        
        
        
    }

}
