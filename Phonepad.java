import java.util.ArrayList;
public class Phonepad {
    public static void main(String[] args){
        ArrayList<String> ans=Phonepad("","12");
        System.out.println(ans);

    }
    static ArrayList<String> Phonepad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
            //System.out.println(p);
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(Phonepad(p+ch,up.substring(1)));

        }
        return list;

    }
    
}
