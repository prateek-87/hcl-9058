package Day6.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsClass {
    static class Person{
        String name;
        String gender;
        Person(String name, String gender){
            this.name = name;
            this.gender = gender;
        }
    }
    static void main() {
//        List<Integer> l = new ArrayList<>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//
//        l.stream().filter((num)->num%2==0).forEach(System.out::println);
//        List<Integer> newLs = l.stream().filter((num)->num%2==0).toList();
//        System.out.println(newLs);

        List<Person> p = new ArrayList<>();

        p.add(new Person("Prateek","male"));
        p.add(new Person("Kamal","male"));
        p.add(new Person("Shruti","female"));
        p.add(new Person("Divy","male"));
        p.add(new Person("Ritu","female"));

        p.stream().map((person)->{
            if(person.gender=="male") return "Mr. "+person.name;
            return "Mrs. "+person.name;
        }).forEach(System.out::println);
    }
}