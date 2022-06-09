/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Cedric
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos
    public void estadoAtual(){
        System.out.println("--------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }
    
    public void abrirConta(String t){
       this.setTipo(t);
       this.setStatus(true);
       if (t.equals("CC")){
           this.setSaldo(50);
       }else if(t.equals("CP")){
           this.setSaldo(150);
       }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
      if(this.getSaldo() > 0){
          System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
      }else if(this.getSaldo() < 0){
          System.out.println("Conta não pode ser fechada pois tem débito");
      }else{
          setStatus(false);
          System.out.println("Conta fechada com sucesso!");
      }  
    }
    public void depositar(float v) {
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
            
        }else{
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiciente para saque!");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo().equals("CC")){
            v = 12;
        }else if(this.getTipo().equals("CP")){
            v = 20;
        }
        if(this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            
        }else{
            System.out.println("Impossivel pagar a mensalidade de uma conta fechada!");
        }
    } 
    
    //Métodos especiais
    
    public ContaBanco() {
        this.saldo =0;
        this.status =false;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
