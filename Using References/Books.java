class Books {
  
  String title; 
  String author; 
  
}// class Books

class BookTestDrive {

  public static void main(String [] args) {
  
    Books [] myBooks = new Book[3];
    int x = 0; 
    
    // Remember: We've to actually make the Books objects!
    myBooks[0] = new Books();
    myBooks[1] = new Books();
    myBooks[2] = new Books();
    
    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
  
    myBooks[0].author = "Bob";
    myBooks[1].author = "Sue";
    myBooks[2].author = "Ian";
    
    while (x < 3) {
      System.out.print(" by ");
      System.out.println(myBooks[x].author);
      x = x + 1;
    }
  }
}//class BookTestDrive
