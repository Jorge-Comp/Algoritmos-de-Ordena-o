/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection_sort;

/**
 *
 * @author Jorge
 */
public class Selection_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Num= {5,3,2,6,7,9};
        int aux,aux2,j;
        for(int i=0; i<Num.length-1;i++){
            aux = Num[i];
            
            j=i+1;
            while(aux>Num[j]){
                aux2=aux;
                aux=Num[j];    
                Num[j]=aux2;
                j++;
            }
            Num[i]=aux;
            
        }
        for(int i=0; i<Num.length;i++){
            System.out.println(Num[i]);
        }

    }
    
}
