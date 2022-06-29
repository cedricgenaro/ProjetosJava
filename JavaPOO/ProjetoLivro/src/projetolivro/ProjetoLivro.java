/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Cedric
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa [4];
        p[0] = new Pessoa("Thiago", 23, "M");
        p[1] = new Pessoa("Pedro", 15, "M");
        p[2] = new Pessoa("Ana", 18, "F");
        p[3] = new Pessoa("Renata", 25, "F");
        
        Livro l[] = new Livro [3];
        l[0] = new Livro("As aventuras de TimTim", "Drauzio", 45, p[1]);
        l[1] = new Livro("Branca de Neve", "Leoncio", 100, p[2]);
        l[2] = new Livro("Gemidão","Kid bengala", 180, p[0]);
        
        //l[0].avancarPag();
       
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
        l[2].fechar();
    }
    
}
