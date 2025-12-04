
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //System.out.println(list+":"+list.size());
        
        list.add(10);
        list.add(10);
        list.add(1009);
        list.add(10);
        list.set(0,198);
        System.out.println(list+":"+list.size());
        System.out.println(list.get(1));
        list.removeFirst();
        System.out.println(list+":"+list.size());
       // list.removeAll(list);
       // System.out.println(list+":"+list.size());
       list.add(1,-13788);
       System.out.println(list+":"+list.size());
      // list.add(-1,-13788);//does not give compile time erro but gives runtime error in this 
      // System.out.println(list+":"+list.size());
      list.add(4,-13788);//there are indexes till 3 so if we add 4 so it will add it without giving any error but if we add index like 5 which is one more then it will give index out of bound error 
      System.out.println(list+":"+list.size());
      list.add(5,-13788);
      System.out.println(list+":"+list.size());
    
    //loops in arraylist
    for(int i=0;i<list.size();i++){
        int val=list.get(i);
        System.out.println(val);


    }
    //second method
    for(int val:list){
        System.out.print(val+"\t");
    }
}
}

