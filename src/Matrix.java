import java.io.*;

public class Matrix implements Serializable {
    MyLinkedList[] matrix;
    int row;
    int col;
    public Matrix(int size,int row,int col){
        matrix=new MyLinkedList[size];
        this.row=row;
        this.col=col;
    }
    public MyLinkedList get(int i){
        return matrix[i];
    }
    public void insert(int row, int col, int value){
        Node_ME temp=this.get(row).head;
        L1:
        for(int i=0;i<col;i++){
            if(temp.next.column>col){
                Node_ME newNode=new Node_ME(col,value);
                newNode.next=temp.next;
                temp.next=newNode;
                this.get(row).size++;
                break L1;
            }
            temp=temp.next;
        }
    }
    public void delete(int row, int col){
        Node_ME temp=this.get(row).head;
        L2:
        for(int i=0;i<col;i++){
            if(temp.next.column==col){
                temp.next=temp.next.next;
                this.get(row).size--;
                break L2;
            }
            temp=temp.next;
        }
    }
    public void search(int value){
        L3:
        for(int i=0;i<matrix.length;i++){
            Node_ME temp=this.get(i).head;
            for(int j=0;j<this.get(i).size;j++){
                if(temp.element==value){
                    System.out.println("EXIST");
                    break L3;
                }
                temp=temp.next;
            }
        }
        System.out.println(" NOT EXIST");
    }
    public void update(int row, int col, int value){
        Node_ME temp=this.get(row).head;
        L4:
        while (temp.next!=null){
            if(temp.column==col){
                temp.element=value;
                break L4;
            }
            temp=temp.next;
        }
    }
    public void print(boolean type){
        if(type==true){

            for(int i=0;i<matrix.length;i++){
                Node_ME temp=this.get(i).head;
                for(int j=0;j<this.get(i).size;j++){
                    System.out.println("[ "+i+" ] "+"[ "+temp.column+" ] "+"[ "+temp.element+" ]");
                    temp=temp.next;
                }
            }
        }else{
            for(int i=0;i<this.row;i++){
                Node_ME temp=this.get(i).head;
                for(int j=0;j<this.col;j++){
                    if(temp.column==col){
                        System.out.println(temp.element);
                        temp=temp.next;
                    }
                    else{
                        System.out.println(0);
                    }
                }
                System.out.println();
            }
        }
    }
    public void save_file() throws IOException {
        FileOutputStream fo=new FileOutputStream("save.csv");
        ObjectOutputStream bs=new ObjectOutputStream(fo);
        bs.writeObject(Main.matrix);
    }
}
