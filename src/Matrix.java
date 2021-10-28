public class Matrix {
    MyLinkedList[] matrix;
    public Matrix(int size){
        matrix=new MyLinkedList[size];
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
//    public void delete(int row, int col){
//        Node_ME temp=this.get(row).head;
//        L2:
//        for(int i=0;i<col;i++){
//            if(temp.next.column==col){
//                temp.next=temp.next.next;
//                this.get(row).size--;
//                break L2;
//            }
//            temp=temp.next;
//        }
//    }
//    public void search(int value){
//        L3:
//        for(int i=0;i<matrix.length;i++){
//            Node_ME temp=this.get(i).head;
//            for(int j=0;j<this.get(i).size;j++){
//                if(temp.element==value){
//                    System.out.println("EXIST");
//                    break L3;
//                }
//                temp=temp.next;
//            }
//        }
//        System.out.println(" NOT EXIST");
//    }
//    public void update(int row, int col, int value){
//        Node_ME temp=this.get(row).head;
//        L4:
//        while (temp.next!=null){
//            if(temp.column==col){
//                temp.element=value;
//                break L4;
//            }
//            temp=temp.next;
//        }
//    }
//    public void print(boolean type){
//        if(type==true){
//
//            for(int i=0;i<matrix.length;i++){
//                Node_ME temp=this.get(i).head;
//                for(int j=0;j<this.get(i).size;j++){
//                    System.out.println("[ "+i+" ] "+"[ "+temp.column+" ] "+"[ "+temp.element+" ]");
//                    temp=temp.next;
//                }
//            }
//        }else{
//
//        }
//    }
//    public void save_file(){
//
//    }
}
