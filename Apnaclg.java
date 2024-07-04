// So basically i am writing the codes for each topic which i learnt from that video so if you are referring oops from apna college this file might be useful 
// Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts defined below : 

// Eg no 1 ----->classes in java
// So we are making a class pen which will have its properties and those properties will be used by object pen1
// This keyword is used to determine which object has called which method Then call your method

// class Pen{
//     String color;
//     String type;

//     // public void write(){
//     //     System.out.println("Pen is writing something");
//     // }

//     public void printcolor(){
//         System.out.print(this.color);
//         System.out.println(this.type);
//     }
// }

// public class Apnaclg{
//     public static void main(String args[]){
//         Pen pen1 = new Pen();
        
//         pen1.color="blue";
//         pen1.type=" Gel pen";
//         // pen1.write();

//         Pen pen2 = new Pen();
//         pen2.color="black";
//         pen2.type = " ball Pen";
//         pen1.printcolor();
//         pen2.printcolor();
//     }
// }








// Eg no 2 ------> Let us make a student class where student rollno and name will be the properties

// class student{
//     String Name;
//     int Rollnumber;

//     public void Information(){
//         System.out.print(this.Name);
//         System.out.println(this.Rollnumber);
//     }
// }

// public class Apnaclg{
//     public static void main(String args[]){
//         student student1 = new student();
//         student1.Name="Chetan Marathe";
//         student1.Rollnumber=32;
//         student1.Information();
//     }
// }






// Eg no 3 Non parameterized Constructor
// Constructors constructs the object
// Constructor has the same name as that of class
// Constructor is a special function that runs when you create an object
// Constructors dont return anything they dont have any return type
// constructors are called only once 

// class human{
//     String nickname;
//     String gender;

//     public void info(){
//         System.out.println(this.nickname);
//         System.out.println(this.gender);
//     }

//     human(){
//         System.out.println("Constructor is called which is non parameterized");
//     }

// }
// public class Apnaclg{
//     public static void main(String args[]){
//         human Chetan = new human();
//         Chetan.nickname="Codestar";
//         Chetan.gender="Male";
//         Chetan.info();
//     }
// }






// Eg no 4 -----> Paramterized constructor

// class fruit{
//     String name;
//     int price;

//     fruit(String name , int price){
//         this.name = name;
//         System.out.println(name);
//         this.price = price;
//         System.out.println(price);
//     }
// }
// public class Apnaclg{
//     public static void main(String args[]){
//         fruit fruit1 = new fruit("Mango",100);
        
//     }
// }






// Eg no 4 ---> Copy Constructor
// copy constructor copy one object to another object

// class Student{
//     String name;
//     int age;

//     Student(Student s2){
//         this.name=s2.name;
//         this.age=s2.age;
//     }
//     Student(){

//     }
//     public void print(){
//         System.out.println(this.name);
//         System.out.println(this.age);

//     }


// }

// public class Apnaclg{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name="Chetan";
//         s1.age=100;
        

//         Student s2 = new Student(s1);
//         s2.print();

//     }
// }




// IN THE JAVA PROGRAMMING WE DONT WRITE DESTRUCTORS THEY ARE BY DEFAULT PRESENT AUTOMATICALLY THAT IS GARBAGE COLLECTOR IS PRESENT. THE STUFF WHICH IS WASTING MEMORY IS DELETED BY GARBAGE COLLECTOR

// EG no -----> 5 Compile time Polymorphism
// same name functions but for different purpose
// return type should not be same or the parameters should not be same

// class Student{
//     String name;
//     int age;

//     public void printinfo(String name){
//         System.out.println(this.name);

//     }
//     public void printinfo(int age){
//         System.out.println(this.age);
//     }
// }
// public class Apnaclg{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name="Chetan";
//         s1.age=32;

//         Student s2 = new Student();
//         s2.name="Sahil";
//         s2.age=34;
//         s1.printinfo(s1.name);

//         s2.printinfo(s2.age);


//     }
// }






// Eg no 6 -----> iheritance
// single , multilevel , heirarchical , hybrid we dont have multiple inheritance but interfaces
// a class inherits the methods and properties from another class
// consider creating a website where there will be round buttons present so will will write the code for that buttons once and the other classes will inherit the property of being round from  that class so code reusablity is been seen.

// class shape{
//     String color;
// }
// class triangle extends shape{

// }
// public class Apnaclg{
//     public static void main(String args[]){
//         triangle t1 = new triangle();
//         t1.color = "red";

//     }
// }

// Eg no 7 ----> single inheritance
// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println((1/2)*b*h);
//     }  
//  }
 




// eg no 8 ---> multilevel
// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println((1/2)*b*h);
//     }  
//  }
//  class EquilateralTriangle extends Triangle {
//     int side;
//  }




// eg no 9 ---> heiarchical inheritance
// class Shape {
//     public void area() {
//         System.out.println("Displays Area of Shape");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println((1/2)*b*h);
//     }  
//  }
//  class Circle extends Shape {
//     public void area(int r) {
//         System.out.println((3.14)*r*r);
//     }  




// eg no 10 ----> hybrid inheritance
// We see different types of inheritance at same place





// Acess modifiers
// to access private we use gettters and setters

// class Account {
//    public String name;
//    protected String email;
//    private String password;


//    public void setPassword(String password) {
//        this.password = password;
//    }
// }
// public class Sample {
//    public static void main(String args[]) {
//        Account a1 = new Account();
//        a1.name = "Apna College";
//        a1.setPassword("abcd");
//        a1.email = "hello@apnacollege.com";
//    }
// }


// Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java). 




// Abstraction 

// abstract class Animal {
//     abstract void walk();
//     void breathe() {
//         System.out.println("This animal breathes air");
//     }
//     Animal() {
//         System.out.println("You are about to create an Animal.");
//     }
//  }
 
 
//  class Horse extends Animal {
//     Horse() {
//         System.out.println("Wow, you have created a Horse!");
//     }
//     void walk() {
//         System.out.println("Horse walks on 4 legs");
//     }
//  }
 
 
//  class Chicken extends Animal {
//     Chicken() {
//         System.out.println("Wow, you have created a Chicken!");
//     }
//     void walk() {
//         System.out.println("Chicken walks on 2 legs");
//     }
//  }
 
 
//  public class Apnaclg {
//     public static void main(String args[]) {
//        Horse horse = new Horse();
//        horse.walk();
//        horse.breathe();
//     }
//  }







// interfaces
// interface Animal {
//    void walk();
// }
// class Horse implements Animal {
//    public void walk() {
//        System.out.println("Horse walks on 4 legs");
//    }
// }

// class Chicken implements Animal {
//    public void walk() {
//        System.out.println("Chicken walks on 2 legs");
//    }
// }

// public class OOPS {
//    public static void main(String args[]) {
//       Horse horse = new Horse();
//       horse.walk();
//    }
// }







// static keyword in java
// class Student {
//     static String school;
//     String name;   
//  }
 
 
//  public class OOPS {
//     public static void main(String args[]) {
//         Student.school = "JMV";
//         Student s1 = new Student();
//         Student s2 = new Student();
 
 
//         s1.name = "Meena";
//         s2.name = "Beena";
 
 
//         System.out.println(s1.school);
//         System.out.println(s2.school);
//     }
//  }
 
 
 





