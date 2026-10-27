package org.example.day9.School;

import org.example.day9.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Schools {
    @Autowired
    Student st;

    public void getStName(){
        System.out.println(st.getName());
    }

    public void setName(String name){
        st.setName(name);
    }

}
