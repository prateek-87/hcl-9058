package Day6;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int div = a/b;
            System.out.println(div);
        }catch (Exception e){
            System.out.println("The Exception is : "+e);
        }
        sc.close();
    }
}
