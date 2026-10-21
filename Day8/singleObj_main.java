package Day8;

public class singleObj_main {
    static void main(String[] args) {
        singleObject obj1 = singleObject.makeInstance();
        singleObject obj2 = singleObject.makeInstance();
        String msg = obj1.getMsg();
        System.out.println(msg);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}