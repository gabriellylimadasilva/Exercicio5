
import javax.swing.JOptionPane;

/*
Faça um programa que preenche um vetor com cinquenta elementos inteiros e altera todo 
valor negativo para seu oposto positivo, ao final o programa deve exibir o vetor já modificado.
 */

public class ExercicioC {
    public static void main(String[] args) {
    int[] x = new int [10];
    String msg = "";
    
    for (int i = 0; i < x.length; i++)
    {
        x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
    }
    for(int i = 0; i < x.length; i++)
    {
        if (x[i]<0)
        {
            x[i] = x[i]*-1;
            msg = msg + "x["+i +"] = "+ x[i]+"\n";
        }
        else
        {
            msg = msg + "x["+i+"] = "+ x[i]+"\n";
        }
    }
    JOptionPane.showMessageDialog(null, msg);
    }
}

