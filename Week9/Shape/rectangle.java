package Week9.Shape;

public class rectangle extends shape {
    private int wei;
    private int hei;
    public rectangle(){
        
    }
    public rectangle(int wei,int hei){
        this.hei=hei;
        this.wei=wei;
    }
    public String toString(){
      return "This is a rectangle with width as"+wei+" and height as "+hei;
    }
    
}
