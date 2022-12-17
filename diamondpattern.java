
public class diamondpattern {
    
public static void main(String args[]){
    int n=4;
    for(int i=0;i<2*n;i++){
        int total=i>n ? 2*n-i:(2*i+1);
        int spaces=n-total;
        for(int s=0;s<(spaces);s++){
            System.out.print("");
        }
        for(int j=0;j<total;j++){
            System.out.print("*");

        }
        System.out.println("");



    }
}
}