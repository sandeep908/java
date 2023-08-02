import java.util.* ;


class GenericTreeRep {
    private static class Node{
        int data ;
        ArrayList<Node> child = new ArrayList<>() ;

    }

    public static void display(Node node){
        String str = node.data+"->" ;
        for(Node ch:node.child){
            str +=ch.data+" ," ;
        }
        str +=" ." ;
        System.out.println(str);

        for(Node ch:node.child){
            display(ch) ;
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {10 ,20 ,50 ,-1 ,60 ,-1 ,-1 ,30 ,70 ,-1 ,80 ,110 ,-1 ,120 ,-1 ,-1 ,90 ,-1 ,-1 ,40 ,100 ,-1 ,-1 ,-1} ;
        Stack<Node> st = new Stack<>() ;
        Node root=null ;
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i]==-1){
                st.pop() ;
            }
            else{
                Node t = new Node() ;
                t.data = arr[i] ;

                if(st.size()>0){
                    st.peek().child.add(t) ;

                }else{
                    root=t ;
                }
                st.push(t) ;
            }
        }
        display(root) ;
    }
}

