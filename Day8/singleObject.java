package Day8;

public class singleObject {
    static final singleObject obj = new singleObject();

    // Private constructor
    private singleObject() {
        System.out.println("Constructor called");
    }
    public static singleObject makeInstance() {
        return obj;
    }
    public String getMsg(){
        return "hey i am at getEmp";
    }
}