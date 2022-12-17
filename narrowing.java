public class narrowing {
    public static void main(String args[]){
        int i=300;
        byte b=(byte)i;
        System.out.println("b val is :"+b);
        System.out.println("i val is :"+i);
        int x=(int)4.5f;
        System.out.println("X val is :"+x);
        float y = (float)6.7;
        System.out.println("Y is :"+y);
    }
    
}
