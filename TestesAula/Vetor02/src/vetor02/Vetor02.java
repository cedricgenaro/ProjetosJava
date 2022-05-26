/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;
import java.time.LocalDate;


/**
 *
 * @author Cedric
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate ano = LocalDate.now();
        int anoatual =2021; //ano.getYear();
        String mes[] = {"Jan", "Fev", "Marc","Abr","Mai","Jun","Jul","Ago","Set",
           "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if(anoatual % 4==0 && anoatual % 100 != 0 || anoatual % 4 != 0 
                && anoatual % 400 == 0){
            tot[1] = 29;
        }
        
        for(int c = 0; c < mes.length; c++){
            System.out.println("O mmês de " + mes[c] + " tem " + tot[c] + " dias");
        }
    }
}
