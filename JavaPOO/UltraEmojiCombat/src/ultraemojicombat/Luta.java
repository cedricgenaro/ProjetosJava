/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Cedric
 */
public class Luta {
    
   //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
   //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(this.isAprovada()){
             System.out.println("-----------------------------------------");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
             System.out.println("-----------------------------------------");
            System.out.println("### DESAFIANTE ###");    
            this.desafiante.apresentar();
            //int vencedor = (int) (Math.random() * (3 - 0));
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// 0 1 2
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("-----------------------------------------");
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou Desafiado
                    System.out.println("-----------------------------------------");
                    System.out.println("O lutador " + this.desafiado.getNome() + " ganhou a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Ganhou o desafiante
                    System.out.println("-----------------------------------------");
                    System.out.println("O lutador " + this.desafiante.getNome() + " ganhou a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
