package com.company;





/*
                Human
                /   \
               /     \
              /       \
             /         \
        publisher   subscriber


*/
class Human{

    public String name;
    public  String gender;

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class publisher extends Human{

    private int salary;

    public publisher(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}



class subscriber extends Human{

    private int expenditure;

    public subscriber(String name, String gender,int expenditure) {
        super(name, gender);
        this.expenditure=expenditure;
    }

    public int getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(int expenditure) {
        this.expenditure = expenditure;
    }
}





public class Hierarchical_Inheritance {

    public static void main(String[] args) {


        System.out.println("[---example to demonstrate Hierarchical Inheritance---] ");

        publisher pub=new publisher("Diana","female",50000);

        subscriber sub=new subscriber("sam","male",3000);


        System.out.println("publisher: ");

        System.out.println("name : "+pub.getName());
        System.out.println("gender: "+pub.getGender());
        System.out.println("salary : "+pub.getSalary());

        System.out.println();

        System.out.println("subscriber: ");
        System.out.println("name : "+sub.getName());
        System.out.println("gender : "+sub.getGender());
        System.out.println("expenditure : "+sub.getExpenditure());


    }



}
