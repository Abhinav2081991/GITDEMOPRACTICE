package ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {


    public static void main(String[] args) {

        ArrayList<Student> list  = new ArrayList<Student>();
        Student s1 = new Student(11,"Abhinav1", 6);
        Student s2 = new Student(9,"Abhinav1", 4);
        Student s3 = new Student(61,"Abhinav1", 1);


        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(Student s : list) {
            System.out.println(s.age + s.name + s.id);
        }

        Collections.sort(list);

        for(Student s : list) {
            System.out.println(s.age + s.name + s.id);
        }

    }
}
