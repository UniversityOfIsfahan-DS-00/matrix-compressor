import javax.xml.soap.Node;
import java.io.*;

public class Main {
    public static void main(String[] args){

        Thread readFileTread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    readFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //System.out.println(matrix[2].head.next.element);
    }
    public static MyLinkedList[] matrix=new MyLinkedList[10];
    public static void readFile() throws IOException {
        File matrix_file =new File("M(10,5).csv");
        Reader r=new FileReader("M(10,5).csv");
        BufferedReader br=new BufferedReader(r);
        String DELIMITER = ",";
        //MyLinkedList[] matrix=new MyLinkedList[10];
         for(int i=0;i<10;i++){
             MyLinkedList l=new MyLinkedList();
             Node_ME temp_prev =l.head;
             //l.head=null;
             //l.tail=null;
             String[] s=br.readLine().split(DELIMITER);

             for(int j=0;j<5;j++){
                 if(Integer.valueOf(s[j])!=0){
//                     if(temp_prev!=null){
//                         Node_ME newNode=new Node_ME(j,Integer.valueOf(s[j]));
//                         temp_prev.next=newNode;
//                         temp_prev=newNode;
//                     }
//                     else {
//                         Node_ME newNode=new Node_ME(j,Integer.valueOf(s[j]));
//                         l.head.next=newNode;
//                         temp_prev=newNode;
//                     }
                     Node_ME newNode=new Node_ME(j,Integer.valueOf(s[j]));
                     temp_prev.next=newNode
                     newNode.next= l.tail;
                     temp_prev=newNode;
                     l.size++;
                 }
             }

             matrix[i]=l;
         }
    }
}
