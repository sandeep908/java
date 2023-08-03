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

    static int size=0;
    public static int size(Node node){ 
      for(Node ch:node.child){
        size++ ;
        size(ch) ;
      }
      return size+1 ;
    }

    static int max = Integer.MIN_VALUE ;
    public static int max(Node node){
      for(Node ch:node.child){
        if(ch.data>max){
          max=ch.data ;
        }
        max(ch) ;
      }
      if(node.data>max){
        max=node.data ;
      }
      return max ;
    }

    static int height(Node node){
      int ht=-1 ;
      for(Node ch:node.child){
        int dept = height(ch);
        ht= Math.max(ht ,dept) ;
      }
      return ht+1 ;
    }

    static void preOrder(Node node){
      System.out.print("  pre-> "+node.data);
      for(Node ch:node.child){
        preOrder(ch);
      }
    }
  
    static void postOrder(Node node){
      
      for(Node ch:node.child){
        postOrder(ch);
      }
      System.out.print("  post-> "+node.data);
    }
    public static void levelOrder(Node node){
      Queue<Node> q = new ArrayDeque<>() ;
      q.add(node) ;
      while(q.size()>0){
        node = q.remove() ;
        System.out.print(node.data+" ");
        for(Node ch:node.child){
          q.add(ch) ;
        }
      }
    }

    static void LevelOrderLineWise(Node node){
      Queue<Node> q = new ArrayDeque<>() ;
      Queue<Node> cq = new ArrayDeque<>() ;
      q.add(node) ;
      while(q.size()>0){
        node = q.remove() ;
        System.out.print(node.data+" ");
        for(Node ch:node.child){
          cq.add(ch);
        }
        if(q.size()==0){
          q = cq ;
          cq = new ArrayDeque<>() ;
          System.out.println();
        }
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
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        LevelOrderLineWise(root) ;
        System.out.println(size(root));
        System.out.println(height(root));
        System.out.println(max(root));
    }
}

