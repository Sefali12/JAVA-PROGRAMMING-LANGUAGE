public class CharSkip {
    public static void main(String[] args){
        skip("","bccad");
        System.out.println(skipApple("","bcfappled"));

    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));


        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skipApple(String p,String up){
        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith("apple")){
            return skipApple(p,up.substring(5));
        }
        else{
            return skipApple(p+up.charAt(0),up.substring(1));
        }
    }
    
}
