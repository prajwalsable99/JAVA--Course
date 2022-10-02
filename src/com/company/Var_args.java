package com.company;

public class Var_args {


    static void avg(int x,int y){

        System.out.println((x+y)/2);
    }
    static void avg(int x,int y,int z){

        System.out.println((x+y+z)/3);
    }

    static int mod_avg(int ...arr){
        int res=0;
        //will get parameter array for multiple parameters []arr={a,b,c,d};
        for(int ele:arr) {
            res+=ele;

        }
        return  res;
    }


    public static void main(String[] args) {
        System.out.println("[ERROR $=> 404 <=$]");
//        int a=8;
//        int b=10;
//        System.out.print("avg is ");
//        avg(a,b);

        int x;
        x=mod_avg(1,2,3,4,5,6,7,8,9,10);
        System.out.println(x);











    }
}
