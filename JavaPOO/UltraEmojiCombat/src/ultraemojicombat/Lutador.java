/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Cedric
 */
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos Acessores
   public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int vit){
        this.vitorias = vit;
    }
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    
    public int getEmpates(){
        return this.empates;
    }
    
    public void setEmpates(int em){
        this.empates = em;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(){
        if(this.getPeso() < 52.2 || this.getPeso() > 120.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
    }
    //Métodos
    public void status(){
         System.out.println("-----------------------------------------");
        System.out.println("==== Status do Lutador =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("É um peso  " + this.getCategoria());
        System.out.print(this.getVitorias()+ " vitórias,  ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates.");
    }
    
    public void apresentar(){
        System.out.println("-----------------------------------------");
        System.out.println("===== Ficha do lutador ====");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
}
