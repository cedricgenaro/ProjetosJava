/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12;
import javax.swing.JOptionPane;

/**
 *
 * @author Cedric
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, cont = 0, pares = 0, impares = 0, ac100 = 0, med = 0, s = 0;
        do {            
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um valor:<br>(0 interrompe) </html>"));
            if(num != 0){
                cont++;
                if(num % 2 == 0)pares++;
                else impares++;
                if (num > 100)ac100++;
                s += num;
            }
        } while (num != 0);
        med = s / cont;
        JOptionPane.showMessageDialog(null,
                "<html>Resultado:<hr> Total de valores: "+cont+"<br>"
                        +"Total de Pares: "+pares+"<br>"
                        +"Total de Impares: "+impares+"<br>"
                        +"Acima de 100: "+ac100+"<br>"
                        +"Média dos valores: "+med+"<br>"
                        +"</html>","Resultado final",
                        JOptionPane.INFORMATION_MESSAGE );
        
    }
    
}
