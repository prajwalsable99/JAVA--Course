package com.company;

// 1st base constructor then derived

class Base{
    int x;
    public  Base(){
        System.out.println("BASE CLASS");
        this.x=0;
    }
    public Base(int x) {
        System.out.println("BASE CLASS -PARA");
        this.x = x;
    }


}
class Derived extends Base{
    int y;
    public Derived() {
        System.out.println("DERIVED CLASS");
        this.y=0;
    }

    public Derived(int x,int y) {
        super(x);
        this.y=y;
        System.out.println("DERIVED CLASS-PARA");
    }
}

class Again_Derived extends Derived{

    int z;
    public Again_Derived() {
        this.z=0;
        System.out.println("AGAIN DERIVED");
    }

    public Again_Derived(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("AGAIN DERIVED PARA");
    }
}
public class Constru_in_inher {


    public static void main(String[] args) {


////    Base b=new Base();
//    Derived d=new Derived(5,4);
        Again_Derived ob=new Again_Derived();
        Again_Derived obj=new Again_Derived(1,2,3);














    }
}
