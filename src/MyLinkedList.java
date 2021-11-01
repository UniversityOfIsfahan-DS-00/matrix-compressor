import java.io.Serializable;

public class MyLinkedList implements Serializable {
    Node_ME head;
    int size;
    public MyLinkedList(){
        head=new Node_ME();
        //tail=new Node_ME(null);
        head.next=null;
        //tail.next
        size=0;
    }
    public int getSize(){
        Node_ME temp=head;
        while (temp.next!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
//    public void add(int element,int column){
//        Node_ME newNode=new Node_ME(column,element);
//        Node_ME temp=head;
//        for(int i=0;i<=size;i++){
//            temp=temp.next;
//            if(temp.next==tail){
//                temp.next=newNode;
//                newNode.next=tail;
//                size++;
//            }
//        }
//    }



}
