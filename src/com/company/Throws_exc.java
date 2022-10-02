package com.company;




class MY_NEG_EXC extends Exception {
    @Override
    public String getMessage() {
        return "<>NEgATIVE RADIUS";
    }


}

public class Throws_exc {
    public static int divide(int a,int b)throws ArithmeticException{
        int c=a/b;
        return c;
    }

    public static double FArea(double r) throws  MY_NEG_EXC{
        if (r<0)
        {
            throw  new MY_NEG_EXC();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args) {


//        try{
//        int x=divide(5,0);
//        System.out.println(x);
//         }
//        catch (Exception e){
//            System.out.println(e);
//        }


        double R=-6;
        try {
            double Area = FArea(R);
            System.out.println(Area);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("-----------------");
    }
}
