package ru.job4j.condition;
 
public class Point {
   private int x;
   private int y;
   
 
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
	  
  }
  
  public int getX() {
      return this.x;
  }
 
  public int getY() {
     return this.y;
  }
  
  public boolean testCondition(int a, int b) {

	  return (b == a) ? true : false;
  }
  
}