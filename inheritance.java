import java.util.Scanner;

class shape{
  //int sides;
  public void displayarea(){
    System.out.println("displaying area");
  }
}
class square extends shape{
    public void area(int sides){
        System.out.println("square has area:"+sides*sides);

    }
}
class circle extends shape{
    public void area(int r){
        System.out.println("area of circle is:"+3.14*r*r);
    }
}
class rhombus extends square{
    public void area(int d1,int d2){
        System.out.println("area of rhombus is:"+(d1*d2)/2);

    }
} 

public class inheritance {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int sides=scn.nextInt();
        int d1=scn.nextInt();
        int d2=scn.nextInt();
        int r=scn.nextInt();

 
       square sq=new square();
       rhombus ro=new rhombus();
       circle cr=new circle();
       sq.area(sides);
       cr.area(r);
       ro.area(d1,d2);
       
   
      
    }
    
}
