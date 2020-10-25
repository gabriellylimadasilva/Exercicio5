
import javax.swing.JOptionPane;

/*
 Construa um programa que lê um vetor de números reais com quinze elementos e zera todos os
valores negativos. No final, o programa deve apresentar todos os elementos do vetor.
 */

public class ExercicioE {
    public static void main(String[] args) {
    double [] x = new double[15];
    String msg = "";

    for(int i = 0; i < x.length; i++)
    {
        x[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real"));
    }
    
    for(int i = 0; i<x.length; i++){
        if(x[i]<0)
        {
           x[i] = 0;
        }
        msg = msg + "x["+i +"] = "+ x[i ]+"\n";       
    }            
 
    JOptionPane.showMessageDialog(null,msg);
    }
    }

