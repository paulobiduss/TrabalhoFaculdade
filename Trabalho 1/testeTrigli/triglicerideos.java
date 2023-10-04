package testeTrigli;
import Dados_paciente.dadosPaciente;

import javax.swing.*;

public class triglicerideos {

    public int tring;
    public void testeTrigl(){
        dadosPaciente b = new dadosPaciente();
        b.ArmazenaDados();

        tring = Integer.parseInt(JOptionPane.showInputDialog("TRIGLICERIDEOS POR MG/L:"));

        int idade = 2023 - Integer.parseInt(b.ano);

        if((idade >= 0 || idade <=9) && tring <= 75){
            JOptionPane.showMessageDialog(null,"PACIENTE :" +  b.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ b.tiposangue + "\n" + "TRIGLICERIDEOS BOM");
                    }else if ((idade >= 0 || idade <=9) && tring >= 75) {
                        JOptionPane.showMessageDialog(null,"PACIENTE :" +  b.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ b.tiposangue + "\n" + "TRIGLICERIDEOS RUIM");
                            } else if ((idade >= 10 || idade <=19) && tring <= 90) {
                                JOptionPane.showMessageDialog(null,"PACIENTE :" +  b.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ b.tiposangue + "\n" + "TRIGLICERIDEOS BOM");
                                                } else if ((idade >= 10 || idade <=19) && tring >= 90) {
                                                    JOptionPane.showMessageDialog(null,"PACIENTE :" +  b.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ b.tiposangue + "\n" + "TRIGLICERIDEOS RUIM");
                                                }else if (idade >= 20 && tring <= 150) {
                                            JOptionPane.showMessageDialog(null,"PACIENTE :" +  b.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ b.tiposangue + "\n" + "TRIGLICERIDEOS BOM");
                                                    }else if (idade >= 20  && tring >= 150) {
                                                        JOptionPane.showMessageDialog(null,"PACIENTE :" +  b.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ b.tiposangue + "\n" + "TRIGLICERIDEOS RUIM");
                                                    }


    }


}
