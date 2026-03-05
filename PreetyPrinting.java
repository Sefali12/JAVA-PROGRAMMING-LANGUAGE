public class PreetyPrinting {
    public static void main(String[] args){
        //float a=14.347f;
        //System.out.printf("The Float value is %.2f", a);
        //System.out.printf("Hello my name is %s and I am %s\n","Sefali","Gupta" );
        //String series="";
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+ i);
            builder.append(ch);

        }
        System.out.println(builder.toString());
        builder.reverse();


    }
    
}
