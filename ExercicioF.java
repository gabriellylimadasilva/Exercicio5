
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
Crie um programa que recebe as temperaturas máximas de cada dia de um mês (31 dias) e as
armazene em um vetor. O programa deverá exibir:
- A menor e a maior temperatura do mês;
- A temperatura média mensal;
- Os dias com a temperatura máxima menor do que a temperatura média mensal
 */

public class ExercicioF {
    public static void main(String[] args) {
    int [] x = new int[31];
    int media = 0;
    String msg = "";
    
    for(int i = 0; i < x.length; i++)
    {
        int aux = 0;
        aux = 1 + i;
        x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura do dia "+aux));
        media = media + x[i];
    }
      
    media = media / x.length;
    int aux2 = 0; 
    for(int i = 0; i < x.length; i++)
    {
        
        
        if(x[i] < media)
        {   
            aux2 = 1 + i;
            msg = msg +  "dia: "+aux2+ " com temperatura de: "+ x[i]+ " \n";     
        }    
    }
    
    
    Arrays.sort(x);
        
    JOptionPane.showMessageDialog(null," A menor temperatura do mês é: "+ x[0]+"\n");
    JOptionPane.showMessageDialog(null," A maior temperatura do mês é: "+ x[x.length-1]+"\n");
    JOptionPane.showMessageDialog(null," A media da temperatura do mês é: "+ media+"\n");
    JOptionPane.showMessageDialog(null,"Os dias com a temperatura máxima menor do que a temperatura média mensal:" + "\n"+ msg);
   
    }
}
            

