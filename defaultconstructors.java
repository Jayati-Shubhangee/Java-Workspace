class records{
    String name;
    int marks;
    void display(){
        System.out.println(name+" "+marks);
    }
    records(){
        name="joy";
        marks=65;
    }
}
public class defaultconstructors {
    public static void main(String[] args) {
        records r= new records();
        r.display();
    }
}
