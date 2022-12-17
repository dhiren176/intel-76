import java.util.Scanner;
public class radius {
    public static void main(String args[]){
        double pi = 3.14;
        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
       int r = sc.nextInt();
       double  Area = pi*r*r;
        System.out.println("Area is :"+Area);
    }
    
}
