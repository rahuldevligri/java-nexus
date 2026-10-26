package OOPS.Constructors;

class Student {
    String name;
    int rollNo;

    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    Student(Student obj){
        this.name=obj.name;
        this.rollNo=obj.rollNo;
    }

    void display(){
        System.out.println(name+" "+rollNo);
    }
}

public class Main {
    public static void main(String[] args){
        Student s1=new Student("Rohit",101);

        Student s2=new Student(s1);
        s2.display();
    }
}
















