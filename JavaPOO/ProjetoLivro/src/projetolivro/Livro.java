/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Cedric
 */
public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    public Pessoa leitor;
    
    //Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //Métodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //To String

    
    public String detalhes() {
        System.out.println("---------- DETALHES DO LIVRO ------------");
        return "Livro{ Título: " + titulo
                + "\n Autor=" + autor 
                + "\n Total de Paginas=" 
                + totPaginas + "\n Página atual: " 
                + pagAtual + "\n Aberto: " 
                + aberto + "\n Leitor: " 
                + leitor.getNome() + '}';
    }
    //Métodos abstratos
    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.setAberto(true);
        }else{
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()){
            this.setAberto(false);
        }else{
            System.out.println("O livro já está fechado!");
        }
    }

    @Override
    public void folhear(int pag) {
        if(this.isAberto()){
            this.setPagAtual(pag);
            if(pag > this.getTotPaginas()){
                this.setPagAtual(0);
            }
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
            if(this.getPagAtual() > this.getTotPaginas()){
                this.setPagAtual(0);
            }
        }else{
            System.out.println("O livro não está aberto!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
            if(this.getPagAtual() < 0){
                this.setPagAtual(0);
            }
        }
    }
    
    
}
