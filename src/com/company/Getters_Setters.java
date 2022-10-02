package com.company;

class Student{

    int id;
    private float marks;

    public void setMarks(float x){
//        this.marks=x;
            marks=x;
    }



    public void show()
    {
        System.out.print("car id id "+id+" and marks are "+marks);
    }
}



public class Getters_Setters {


    public static void main(String[] args) {
        System.out.println("[--------]");

        Student st=new Student();
        st.id=11;
//        can't acces marks as its private and can only be acces by  methods
//        st.marks=33.4f;
        st.setMarks(22.3f);
        st.show();



    }

}
