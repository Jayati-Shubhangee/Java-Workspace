
//import java.lang.classfile.components.ClassPrinter;

public class basicconcept {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
               head=tail=temp;
          

            }
            else{
               //setting address of new node next part as null
                tail.next=temp;
                tail=temp;
             

            }
            size++;
            
           

        }
        void addfirst(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }
            else{ 
                temp.next=head;
                head=temp;
                
            }
            size++;
            
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
            System.out.println("size of ll is"+size);
        }
      public void addat(int idx, int val){
        //creating a newnode
        
        if(idx>size|| idx<0){
            System.out.println("it is invalid position");
        }
        else if(idx==0){
            addfirst(val);

        }
       else if(idx==size){
            addLast(val);
        }
        else{
        Node newnode=new Node();
        newnode.data=val;
        newnode.next=null;
            Node temp =head;//initialize the temp with head for traversal
int i=0;
while(i<idx-1){
    i++;
    temp=temp.next;
   
}
newnode.next=temp.next;
temp.next=newnode;
size++;
 }
}



void removelast(){
    if(size==0){
        System.out.println("underflow case");
    }
    else if(size==1){
        head=tail=null;
        size=0;
    }
    else{
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
        size--;
    }
    
}


void reverse(){
    Node temp=tail;
    for(int i=size-1;i>=0;i--){
        System.out.print(temp.data+"->");
        //temp=temp.next;
    }
}
    }


    public static void testList(LinkedList list){
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        list.addfirst(5);
        list.display();
        list.addat(3, 15);
         list.display();
         list.reverse();
        /*list.removelast();
        list.display();
        list.removelast();
        list.display();
        list.removelast();
        list.display();
        list.removelast();
        list.display();
        list.removelast();
        list.display();
        list.removelast();
        list.display();*/
        
   
    }
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
        testList(list);
       }

    
}
