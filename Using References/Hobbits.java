class Hobbits {
  String name 
  public static void main(String [] args){
    
    Hobbits [] h = new Hobbits[3];
    int z = -1; 
    //Remember: Arrays start with element 0!
    while (z < 2){
      z = z + 1;
      h[z] = new Hobbits();
      h[z].name = "Bilbo";
      if (z == 1) {
        h[z].name = "Fredo";
      }
      if (z == 2) {
        h[z].name = "Sam";
      }
      System.out.print(h[z].name + " is a ");
      System.out.println("good Hobbit name");
    }
  
  }//Main method

}// class Hobbits 
