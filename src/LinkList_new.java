class List_node{
    int data;
    List_node next;

    public List_node(int data) {
        this.data = data;
    }

}

//class List_node1{
//    int data;
//    List_node1 next;
//
//    public List_node1(int data, List_node1 next) {
//        this.data = data;
//        this.next = next;
//    }
//}

public class LinkList_new {
//    public static class node2{
//        int data;
//        node2 next;
//
//        public node2(int data, node2 next) {
//            this.data = data;
//            this.next = next;
//        }
//
//    }
    public static void main(String[] args) {
        List_node node0 = new List_node(15);
        List_node node1 = new List_node(5);
        List_node node2 = new List_node(20);
        List_node node3 = new List_node(88);
        List_node node4 = new List_node(105);
        List_node node5 = new List_node(20);
        List_node node6 = new List_node(220);
        List_node node7 = new List_node(7);
        List_node node8 = new List_node(84);
        List_node node9 = new List_node(56);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node0.next = node1;
        node5.next = node6;

        List_node curr = node0;

//      find element present in LinkList;
//        int b = 7;
//        int flag = 0;
//
//        for (;curr != null; curr = curr.next){
//            if(curr.data == b){
//                flag = 1;
//            }
//        }

//        while(curr != null){
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//        System.out.println();

//      write a program for add the node;
//        while(curr.next != null ){
//            curr = curr.next;
//        }
//        curr.next = node7;
//        curr.next.next = node8;
//        curr.next.next.next = node9;
//
//
        curr = node0;

        List_node node10 = new List_node(202);

        List_node previous = null;

        int k = 1;

        while(k < 4 && curr.next != null){
            previous = curr;
            curr = curr.next;
            k++;
        }

        previous.next = node10;
        node10.next = curr;

        curr = node0;

//        insert_node(node0);

        int count = 0;

        while(curr != null){
//            System.out.print(curr.data + " ");
            count++;
            curr = curr.next;
        }
        System.out.println();

        System.out.println(count);

    }

//    public static List_node insert_node(List_node node0){
//       List_node curr = node0;
//
//        List_node node10 = new List_node(202);
//
//        List_node previous = null;
//
//        int k = 1;
//
//        while(k < 4 && curr.next != null){
//            previous = curr;
//            curr = curr.next;
//            k++;
//        }
//
//        previous.next = node10;
//        node10.next = curr;
//
//        curr = node0;
//        return curr;
//    }
}
