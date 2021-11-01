import javax.xml.soap.Node;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

       readFile();
        //System.out.println(matrix.get(2).head.next.element);
        L6:
        while (true){
            System.out.println("0) INSERT");
            System.out.println("1) DELETE");
            System.out.println("2) SEARCH");
            System.out.println("3) UPDATE");
            System.out.println("4) PRINT");
            System.out.println("5) SAVE FILE");
            System.out.println("6) EXIT");


            switch (sc.nextInt()){
                case 0:{
                    matrix.insert(1,1,400);
                    break ;
                }
                case 1:{
                    matrix.delete(3,1);
                    break;
                }
                case 2:{
                    matrix.search(754);

                    break;
                }
                case 3:{

                    matrix.update(5,1,443);
                    break;
                }
                case 4:{

                    matrix.print(true);
                    break;
                }
                case 5:{

                    matrix.save_file();
                    matrix.saveCsv();
                    break;
                }
                case 6:{
                    break L6;
                }
            }
        }
    }
    public static Matrix matrix=new Matrix(10,10,5);
    public static Scanner sc=new Scanner(System.in);

    public static void readFile() throws IOException {
        File matrix_file =new File("M(10,5).csv");
        Reader r=new FileReader("M(10,5).csv");
        BufferedReader br=new BufferedReader(r);
        String DELIMITER = ",";
        //MyLinkedList[] matrix=new MyLinkedList[10];
         for(int i=0;i<10;i++){
             //MyLinkedList l=new MyLinkedList();
             Node_ME temp_prev =matrix.get(i).head;
             //l.head=null;
             //l.tail=null;
             String[] s=br.readLine().split(DELIMITER);

             for(int j=0;j<5;j++){
                 if(Integer.parseInt(s[j])!=0){
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
                     Node_ME newNode=new Node_ME(j,Integer.parseInt(s[j]));
                     temp_prev.next=newNode;
                     newNode.next= null;
                     temp_prev=newNode;
                     matrix.get(i).size++;
                 }
             }

             //matrix[i]=l;
         }
    }
}
