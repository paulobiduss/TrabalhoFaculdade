package testeColesterol;

import Dados_paciente.dadosPaciente;

import javax.swing.*;

public class colesterol {
    public int HDL;
    public int LDL;
    public String tiporisco;
    public void colHdl(){
                dadosPaciente D = new dadosPaciente();
                D.ArmazenaDados();

                 tiporisco = JOptionPane.showInputDialog("ESCREVA EM MAISCULO QUAL SEU RISCO DE SAÚDE:" + "\n" + "B - BAIXO, M - MEDIO OU A - ALTO");
                    LDL = Integer.parseInt(JOptionPane.showInputDialog("LDL POR MG/L"));
                    HDL = Integer.parseInt(JOptionPane.showInputDialog("HDL POR MG/L"));

        int idade = 2023 - Integer.parseInt(D.ano);
        String men;
        men = "";
                if (tiporisco.equals("B") && LDL <= 100  ) {
                  men = "LDL - BOM";

                     } else if (tiporisco.equals("B") &&   LDL >= 100) {
                           men = "LDL - RUIM";
                    }
                         else if (tiporisco.equals("M") &&   LDL <= 70) {
                         men = "LDL - RUIM";
                        }
                            else if (tiporisco.equals("M") &&  LDL >= 70) {
                             men = "LDL - BOM";
                        }
                    else if (tiporisco.equals("A")  &&  LDL <= 50 ) {
                     men = "LDL - BOM";
                    }
                        else if (tiporisco.equals("A") &&  LDL >= 50) {
                         men = "LDL - RUIM";
        }

                    if((idade >= 0 || idade <= 19) && HDL > 45 ){

                                JOptionPane.showMessageDialog(null,"PACIENTE :" +  D.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ D.tiposangue + "\n" + "HDL - BOM" +"\n"+ men);
                            } else if (idade > 20 && HDL > 40 ){

                                JOptionPane.showMessageDialog(null,"PACIENTE :" +  D.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ D.tiposangue + "\n" + "HDL - BOM"+"\n"+ men);
                            } else if ( (idade >= 0 || idade <= 19) && HDL < 45 ){

                                JOptionPane.showMessageDialog(null,"PACIENTE :" +  D.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ D.tiposangue + "\n" + "HDL - RUIM"+"\n"+ men);
                            } else if (idade > 20 && HDL < 40){

                                JOptionPane.showMessageDialog(null,"PACIENTE :" +  D.nome +"\n" + "IDADE :" + idade + "\n" +"TIPO SANGUINEO :"+ D.tiposangue + "\n" + "HDL - RUIM"+"\n"+ men);
                            }
    }}

