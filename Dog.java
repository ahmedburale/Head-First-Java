// 1. Write your class
class dog {
  // instance variables 
  int size; 
  String breed; 
  String name; 
  
  // a method 
  void bark() {
    System.out.println("Ruff! Ruff!");  
  }
}
//2. Write a tester(TestDrive) class
class DogTestDrive {
 // a main method 
 public static void main (String [] args){
    // Dog test code goes here
    Dog d = new Dog(); // Make a new Dog object 
    d.size = 40; // use the dot operator (.) to set the size of the Dog
    d.bark(); // and to call its bark method - tells it to bark by using the dot operator on the variable d to call bark()
  }

}
