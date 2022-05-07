 import java.util.*;
class low_high{

public static void main(String args[]){

int low,high;
int sum=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter low number");
low=sc.nextInt();

System.out.println("Enter high number");
high=sc.nextInt();
int i = low;
 while(i<=high)
  {
        sum = sum+i;
         i=i+1;
         
    }
     System.out.println(sum);    
   }
   
   }