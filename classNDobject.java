//creating class , in which these rollno , name and marks are prooperties for every single object created by class
class student {
    int rollno ;
    String name ;
    float marks ;

    //creating constructor without argument 
    student(){
        this.rollno = 13;
        this.marks= 123;
        this.name= " akshat";
    }

    //creating constructor , with argument 
     student( String name, int rollno , float marks ){
        this.rollno= rollno;
        this.name = name;
        this.marks = marks;
     }

    //creating function inside a class
    void greeting (){
        System.out.println("hello ji namesty");
    }

}

public class classNDobject {
    public static void main (String [] args){

        //creating object student1
     /*  student student1 = new student(); // new keyword dynamically allocate memory and return reference variable
       student1.rollno = 1;
       student1.name = "akshat";
       student1.marks=100;
      System.out.println(student1.rollno);
       System.out.println(student1.name);
       System.out.println(student1.marks);*/

       //constructor , creating object and giving properties using constructor
        student student2 = new student(); //here constructor called which dont have argument 
        System.out.println(student2.rollno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        //using function from class
        student2.greeting();

        //  creating a object and properties using constructor argument 
        student student3 = new student("avnnish", 2, 45); // here student constructor called which had a arguments

        System.out.println(student3.marks+" "+student3.name+" "+student3.rollno);


    }

}