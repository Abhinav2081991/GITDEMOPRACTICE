package ComparablePractice;

public class Student implements Comparable<Student>{

    public int age;
    public String name;
    public int id;

    public Student(int age, String name, int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student st) {
        if(age ==st.age){
            return 0;
        }
        else if(age > st.age){
            return 1;
        }
        else{
            return -1;
        }
    }

}
