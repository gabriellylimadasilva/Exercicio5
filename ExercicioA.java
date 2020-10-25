
import javax.swing.JOptionPane;

/*
Construa um programa que recebe um conjunto de vinte valores em um vetor, calcula a média 
aritmética desses valores e exibe todos os elementos menores do que a média. 
 */

public class ExercicioA {

    private static int i;
    public static void main(String[] args) {
    double[] notas = new double[20];
    double soma = 0, media = 0;
    String msg = "";

    for(int i = 0; i < notas.length; i++)
    {
        notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota "+(i+1)));
        soma = soma + notas[i];
    }
    media = soma / notas.length;
    
    for(int i = 0; i < notas.length; i++)
    {
        if(notas[i]<media)
        {
        msg = msg + "notas["+i +"] = "+ notas[i]+"\n";
        }
    }
    JOptionPane.showMessageDialog(null, "A média é "+media);
    JOptionPane.showMessageDialog(null, msg);
    }
}

