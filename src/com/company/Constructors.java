package com.company;


class Stud {

    int id;
    private float marks;

    // normal constructor
    public Stud(){
        id=11;
        marks=99.99f;
    }
    //parameterized constructor
    public Stud(int m,float n){
        this.id=m;
        this.marks=n;
    }

    public void setId(int y) {
        this.id = y;
    }

    public void setMarks(float x) {
//        this.marks=x;
        marks = x;
    }

    public void show()
    {
        System.out.println("id: "+id+" marks :"+marks);
    }
}
public class Constructors {


    public static void main(String[] args) {

        System.out.println("[------------------]");

        Stud obj=new Stud();
        obj.show();
        obj.setId(22);
        obj.setMarks(77.f);
        obj.show();

        Stud ob2=new Stud(33,66);
        ob2.show();



    }
}
