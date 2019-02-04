public class Button{
  int posX, posY; 
  int btnWidth, btnHeight;
  String label;
  color c;
  
  public Button(int x, int y, int w, int h, String text) {
    posX = w/2 + x;
    posY = h/2 + y;
    btnWidth = w;
    btnHeight = h;
    label = text;
    c = color(0);  // white background
    
  }
  void display() {
    rectMode(CENTER);
    fill(c);
    rect(posX, posY, btnWidth, btnHeight, 5);
  }

  
  boolean overButton(){
    if (mouseX >= posX && mouseX <= posX + btnWidth && mouseY >= posY && mouseY <= posY + btnHeight) {
      return true;
    } else {
      return false;
    }
  }
}
