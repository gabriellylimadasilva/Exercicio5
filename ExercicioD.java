
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
Faça um programa que lê um vetor de cinquenta elementos e exibe, ao final, o menor valor lido.
 */

public class ExercicioD {
 
    public static void main(String[] args) {
          int[] x = new int[5];
          String msg = "";

          for(int i = 0; i < x.length; i++)
          {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
          }
          
          Arrays.sort(x);
        
        msg = msg + "x["+0 +"] = "+ x[0]+"\n";
        
        JOptionPane.showMessageDialog(null,msg);
    }
}
