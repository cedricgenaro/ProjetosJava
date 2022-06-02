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
public class Menu {

    int opcao;
    Corrida c = new Corrida();

    void carregarMenu() {

        this.opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> <b>-- Sua Corrida -- <hr></b>"
                + "\n [1] Cadastar corrida."
                + "\n [2] Alterar cadastro "
                + "\n [3] Cancelar corrida "
                + "\n [4] Exibir cadastro \n"));

        switch (this.opcao) {
            case 1:
                c.cadastar();
                c.status = true;
                this.carregarMenu();
                break;
            case 2:
                this.opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Aterar cadastro <hr> \n"
                        + "[1] Alterar todo o registro"
                        + "\n [2] Alterar data"
                        + "\n [3] Alterar horário"
                        + "\n [4] Alterar local de inicio"
                        + "\n [5] Alterar ponto final \n"));
                switch (this.opcao) {
                    case 1:
                        c.cadastar();
                        this.carregarMenu();
                        break;
                    case 2:
                        c.alterarData();
                        this.carregarMenu();
                        break;
                    case 3:
                        c.alterarHorario();
                        this.carregarMenu();
                        break;
                    case 4:
                        c.alterarLocalPartida();
                        this.carregarMenu();
                        break;
                    case 5:
                        c.alterarPontoFinal();
                        this.carregarMenu();

                }
                c.alterarHorario();
                this.carregarMenu();
                break;
            case 3:
                if (c.status) {
                    JOptionPane.showMessageDialog(null, "Corrida cancelada com sucesso!");
                    c.status = false;
                    this.carregarMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro! Corrida cancelada anteriormente", "Erro", JOptionPane.ERROR_MESSAGE);
                    this.carregarMenu();
                }
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "<html> ---Dados da Corrida-- <hr> \n"
                        + "Data: " + c.date
                        + "\n Horario: " + c.horario
                        + "\n Local de Partida: " + c.localPartida
                        + "\n Ponto Final: " + c.pontoFinal
                        + "\n Vai acontecer? " + c.status);
                this.carregarMenu();
            default:
                throw new AssertionError();
        }
    }

}
