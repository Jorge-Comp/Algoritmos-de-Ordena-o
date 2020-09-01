/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Bubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Num= {9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0,-10,50,0};
        int Num1[]= new int[Num.length];
        Bubble_Sort t = new Bubble_Sort();
        bubble_sort(Num,Num1);
        
        for(int i=0;i<Num1.length;i++){
            System.out.println(Num1[i]);
        }
    }
    
    public static int[] bubble_sort(int[] Num,int[]Num1){
        int aux;
        for(int i=0;i<Num.length;i++){
            for(int j=i+1;j<Num.length;j++ ){
                if(Num[i]>Num[j]){
                    aux=Num[i];
                    Num[i]=Num[j];
                    Num[j]=aux;        
                }
            }
            Num1[i]=Num[i];
        }
        return Num1;
    }
    
}
