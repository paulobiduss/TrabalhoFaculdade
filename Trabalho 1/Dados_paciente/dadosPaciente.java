package Dados_paciente;

import javax.swing.JOptionPane;

public class dadosPaciente {
    public String nome;
    public String tiposangue;
    public String ano;

    public void ArmazenaDados(){
        nome = JOptionPane.showInputDialog("SEU NOME :");
        tiposangue = JOptionPane.showInputDialog("SEU TIPO SANGUINEO:");
        ano = JOptionPane.showInputDialog("ANO DE NASCIMENTO:");
    }

}
