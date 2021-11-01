import java.io.Serializable;

public class Node_ME implements Serializable {
        int column;
        int element;
        Node_ME next;
        public Node_ME(int column,int element){
            this.column=column;
            this.element=element;
        }
        public Node_ME(int element){
            this.element=element;
        }

    public Node_ME() {

    }

}
