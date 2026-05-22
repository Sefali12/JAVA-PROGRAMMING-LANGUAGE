import java.util.ArrayList;
public class Maze {
    public static void main(String[] args){
        //System.out.println(count(3,3));
        //path("",3,3);
        pathdiag("",3,3);
    }
    
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right=count(r-1,c);
        int left=count(r,c-1);
        return right+left;
    }

    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }

    }
      static void pathdiag(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1 && c>1){
            pathdiag(p+'v',r-1,c-1);
        }
        if(r>1){
            pathdiag(p+'D',r-1,c);
        }
        if(c>1){
            pathdiag(p+'R',r,c-1);
        }

    }
}
