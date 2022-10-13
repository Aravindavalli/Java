import java.util.*;
class count{
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner a=new Scanner(System.in);
        try{
            int n=a.nextInt();
            int c=0;
            while(n!=0){
                n=n/10;
                c++;
            }
            System.out.println("No.of digits : " + c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}