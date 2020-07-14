class DrumKit {
  boolean topHat = true;
  booean snare = true; 
  
  void playTopHat() {
    System.out.println("ding ding da-ding");
  {
  vod playSnare() {
    System.out.println("bang bang ba-bang");
  }
}

class DrumKitTestDrive {
  public static void main (String [] args) {
    DrumKit d = new Drumkit();
    d.playSnare(); 
    d.snare = false; 
    d.playTopHat(); 
    
    if (d.snare == true) {
    d.playSnare();
    }
  }
}
