/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Cedric
 */
public class Corrida {

    String date;
    String local;
    String localPartida;
    String pontoFinal;
    String horario;
    boolean status;

    void cadastar() {
        this.alterarData();
        this.alterarHorario();
        this.alterarLocalPartida();
        this.alterarPontoFinal();
    }

    void alterarData() {
        this.date = JOptionPane.showInputDialog(null, "Quando será a corrida? \n", "EX; 25/05/2022");
    }

    void alterarHorario() {
        this.horario = JOptionPane.showInputDialog(null, "Qual é o horário? \n", "Ex: 15h30");
    }

    void alterarLocalPartida() {
        this.localPartida = JOptionPane.showInputDialog(null, "Onde será o local de inicio? \n");
    }

    void alterarPontoFinal() {
        this.pontoFinal = JOptionPane.showInputDialog(null, "Onde vai ser o ponto final? \n");
    }

}
