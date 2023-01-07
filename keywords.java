
    class yo {
        int age;
       protected yo (int age){ //protected means only children class can acess it 
         this.age = age;
        }
    }
    
    class to extends yo{
        to(int age ){
        super(age);
    
        }
    }
    public class keywords { 
        static void dowork (int n){ 
            n=2;
    /*here public keyword is used to provide a function 
    or method to be used in other class or file we can 
    call a dowork function in other file tooo*/
        }
    
        private  static void tyby (){
          /*here the private make the function available only for this
          public class encapsulation , no other class can use it*/
        }
        public static void main (String [] args){
            tyby();
    
            yo ho = new yo(5);
            System.out.println(ho.age);
                
            
        }
    }
    

