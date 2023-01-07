import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner robot = new Scanner (System.in);
        
        int a = robot.nextInt();
        int b = robot.nextInt();
        
        adder yo = new adder ();
        yo.print();
        
         int sum = yo.add(a,b);
        System.out.print(sum);

        robot.close();
        
    }
    
}
class Arithmetic {
    int add (int a, int b){
        int sum=0;
        sum += a+b;
        return sum;
    }
}

class adder extends Arithmetic{
    
    void print (){
    System.out.println("My super class is Arithmetic");
    }
    
   int  add(int a , int b){
        
        return super.add(a,b);
    }
}




