/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dimensaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Cedric
 */
public class DimensaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit dt = Toolkit.getDefaultToolkit();
        Dimension d = dt.getScreenSize();
        System.out.println("A sua tela está em resolução " + d.width + " x " + d.height);
    }
    
}
