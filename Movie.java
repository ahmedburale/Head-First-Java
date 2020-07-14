
class Movie {
  String title; 
  String genre; 
  int rating; 
  
  void playIt() {
    System.out.println("Playing the movie"); 
  }
}

/*
The MovieTestDrive class creates class (instances) of the Movie class and uses the dot operator(.) to set the instance 
variables to a specific value. The MovieTestDrive class also invokes (calls) a method on one of the objects
*/
public class MovieTestDrive {
  public static void main (String [] args) {
  Movie one = new Movie(); 
  one.title = "Gone with the Stock";
  one.genre = "Tragic";
  one.rating = -2;
  Movie two = new Movie(); 
  two.title = "Lost in Cubicle Space";
  one.genre = "Comedy";
  one.rating = 5;
  two.playIt();
  Movie three = new Movie();
  three.title = "Byte Club";
  three.genre = "Tragic but ultimately uplifting";
  three.rating = 127;
  
  }
}
