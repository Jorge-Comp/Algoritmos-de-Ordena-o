
package javaapplication1;

/**
 *
 * @author Jorge
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] Num= {9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0};
       
       
       for(int j=1; j<Num.length; j++){
          int chave=Num[j];
          int i=j-1;
          while (i>=0 && Num[i]>chave){
              Num[i+1]=Num[i];
              i--;
              Num[i+1]=chave;
          }
       }
       for(int h=0;h<Num.length;h++){
           System.out.println(Num[h]);
       }
    }


}
