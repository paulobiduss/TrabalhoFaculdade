package testeGlicemico;

import Dados_paciente.dadosPaciente;

import javax.swing.*;
public class Glicemia {

    public String glicose;

    public void testeGlicemia(){
        dadosPaciente r = new dadosPaciente();
                    r.ArmazenaDados();

                glicose = JOptionPane.showInputDialog("GLICOSE POR MG/L:");

            int gli = Integer.parseInt(glicose);
        int num = Integer.parseInt(r.ano);

                if(gli < 100){
                    JOptionPane.showMessageDialog(null,"PACIENTE :" +  r.nome +"\n" + "IDADE :" + (2023 - num) + "\n" +"TIPO SANGUINEO :"+ r.tiposangue + "\n" + "Normoglicemia");
                }
                        if (gli >= 100 && gli < 126){
                            JOptionPane.showMessageDialog(null,"PACIENTE :" +  r.nome +"\n" + "IDADE :" + (2023 - num) + "\n" +"TIPO SANGUINEO :"+ r.tiposangue + "\n" + "Pré-diabetes");
                        } else if (gli >= 126){
                                    JOptionPane.showMessageDialog(null,"PACIENTE :" +  r.nome +"\n" + "IDADE :" + (2023 - num) + "\n" +"TIPO SANGUINEO :"+ r.tiposangue + "\n" + "Diabetes estabelecido");
                                }

    }
}
