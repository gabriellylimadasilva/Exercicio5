/*
Faça um programa que preenche um vetor com cem inteiros e, ao final, exibe o vetor em ordem contrária.
 */


import javax.swing.JOptionPane;

public class ExercicioB {

private static int i;

    public static void main(String[] args) {
          int[] x = new int[5];
          String msg = "";

          for(int i = 0; i < x.length; i++)
          {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
          }
          for(int i = x.length-1; i >=0; i--)
          {
            msg = msg + "x["+i +"] = "+ x[i ]+"\n";
          }           
            JOptionPane.showMessageDialog(null,msg);
          }
    }

