package Day6;

import java.util.Scanner;
class myException extends Exception{
    myException(String message){
        super(message);
    }
}

public class UserDefinedException {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        try{
            if(b==0) throw new myException("Zero divide mai nhi hota bhaiiiii");
            int ans = a/b;
        }catch (myException e){
            System.out.println(e);
        }
    }
}