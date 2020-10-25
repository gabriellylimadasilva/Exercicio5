
import javax.swing.JOptionPane;

/*
Faça um programa que mostre todos os valores pares de um vetor de quinze posições que será
preenchido pelo usuário. 
Lembre-se: o vetor estará completamente preenchido e apenas com números naturais.
 */

public class ExercicioH {
    public static void main(String[] args) {
        int [] x = new int[15];    
        String msg = "";

    
        for(int i = 0; i < x.length; i++)
        {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));    
            if(x[i] % 2 == 0)
            { 
                msg = msg + "x["+i+"] = "+ x[i]+"\n";    
            }
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}
