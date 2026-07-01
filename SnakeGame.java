import processing.core.PApplet;

public class SnakeGame extends PApplet{
  //intial windows setup
  public void settings(){
    size(600,400);
  }
  
  public void setup(){
    background(30, 30, 40);
    noStroke();
  }

  public void draw(){
    //container
    fill(30, 30, 40, 20);
    rect(0, 0, width, height);

    //objects
    fill(255,0,0);
    rect(300,200, 30,30);
    fill(0, 200, 255); 
    ellipse(100,100, 25, 25);
  }

  public static void main(String[] args){
      PApplet.main("SnakeGame");
  }
} 
