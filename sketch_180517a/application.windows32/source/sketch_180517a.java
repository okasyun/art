import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_180517a extends PApplet {

public void setup() {
  
}

public void draw() {
  if (mousePressed) {
    fill(0);
  } else {
    fill(255);
  }
     ellipse(mouseX, mouseY, 80, 80);
}
    
  public void settings() {  size(480, 120); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180517a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
