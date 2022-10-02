package com.company;

public class EXC_Finally {

    public static int divIde()
    {
        try{
            int c=4/2;
//            System.out.println(c);
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("ye to run hoga hi");

        }
        return -1;
    }
    public static void main(String[] args) {
        //finally always  executes
        System.out.println(divIde());

    }
}
