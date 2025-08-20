import java.util.*;

public class Main{
     public static void main(String[] args){
          Scanner sc= new Scanner(System.in);
          
          int[][] arr= new int[3][3];
          
          System.out.println("Enter array elements: ");
          for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                    arr[i][j]=sc.nextInt();
               }
          }
          System.out.println("Before 90 degree rotation: ");
          
          for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
               }
               System.out.println();
          }
          System.out.println("After 90 degree rotation: ");
          for(int i=0;i<3;i++){
               for(int j=2;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
               }
               System.out.println();
          }
     }
}
