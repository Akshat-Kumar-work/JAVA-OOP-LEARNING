
abstract class car {  //by using abstarct keyword we cant make object of this class, only children class can take function of it
     
     int price;
    abstract  void start();}

class bmw extends car{
 void start(){
    System.out.println("bmw starting ");
 }
}

public class Abstraction implements robot { //implement is used to take functionality of robot class which is interface 

    public static void main (String [] args){
    Abstraction ak = new Abstraction();
    ak.shoot(); 
    }

    
    public void shoot() { //shoot function from a interface class robot
      System.out.println("shooting");    
    }
    
}
interface robot{ //it allow to take function and implement it on another classs
    void shoot();
    }
