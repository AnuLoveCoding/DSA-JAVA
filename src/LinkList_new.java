class List_node{
    int data;
    List_node next;

    public List_node(int data) {
        this.data = data;
    }

}

class List_node1{
    int data;
    List_node1 next;

    public List_node1(int data) {
        this.data = data;
    }
}

public class LinkList_new {
    public static void main(String[] args) {
//        List_node node0 = new List_node(15);
//        List_node node1 = new List_node(5);
//        List_node node2 = new List_node(20);
//        List_node node3 = new List_node(88); //***
//        List_node node4 = new List_node(105);
//        List_node node5 = new List_node(20);
//        List_node node6 = new List_node(220);

//        List_node node7 = new List_node(7);
//        List_node node8 = new List_node(84);
//        List_node node9 = new List_node(56);

//        node0.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//
//        List_node curr = node0;

        List_node1 nod1 = new List_node1(24);
        List_node1 nod2 = new List_node1(26);
        List_node1 nod3 = new List_node1(99);
        List_node1 nod4 = new List_node1(102);
        List_node1 nod5 = new List_node1(66);
        List_node1 nod6 = new List_node1(20);

        nod1.next = nod2;




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
//        curr = node0;

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

//        insert_node(node0);

//        int count = 0;
//
//        while(curr != null){
////            System.out.print(curr.data + " ");
//            count++;
//            curr = curr.next;
//        }
//        System.out.println();
//
//        System.out.println(count);

//        write a program to delete a node in LinkList;

//        int pos = 3;
//
//        int i = 0;
//
//        List_node prevoius = null;
//
//        if(pos == 0){
//            curr = curr.next;
//        }
//
//        while(i <= pos && curr.next != null){
//            prevoius = curr;
//            curr = curr.next;
//            i++;
//        }
//
//        prevoius.next = curr.next;
//
//        curr = node0;
//
//        while(curr != null){
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//        System.out.println();

//        curr = node0;

//        List_node previous = null;
//
//        while(curr.next != null){
//            previous = curr;
//            curr = curr.next;
//        }
//
//        previous.next = null;
//
//        curr = node0;
//
//        while(curr != null){
//            System.out.print(curr.data + " ");
////            count++;
//            curr = curr.next;
//        }
//        System.out.println();

//         remove(node0);


    }

//    write a program to delete a node in LinkList;

//    public static void remove(List_node node0){
//        List_node curr = node0;
//
//        List_node previous = null;
//
//        while(curr.next != null){
//            previous = curr;
//            curr = curr.next;
//        }
//
//        previous.next = null;
//
//        curr = node0;
//
//        while(curr != null){
//            System.out.print(curr.data + " ");
//            curr = curr.next;
//        }
//        System.out.println();
//    }

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
