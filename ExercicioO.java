
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 Faça um programa que recebe cinquenta números inteiros em um vetor, os ordena e exibe o vetor
ordenado crescente..
 */

public class ExercicioO {
    public static void main(String[] args) {
        int[] x = new int[50];
        String msg = "";

        for(int i = 0; i < x.length; i++)
        {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
        
        Arrays.sort(x);
        
        for(int i = 0; i < x.length; i++)
        {
            msg = msg + "x["+i +"] = "+ x[i ]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,msg);
    }
}

