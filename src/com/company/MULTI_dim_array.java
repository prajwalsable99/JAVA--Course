package com.company;

public class MULTI_dim_array {


    public static void main(String[] args) {


        System.out.println("[MULTI_DIMENSIONAL_ARRAY]");

        int [][]building;
        building=new int[3][3];
        building[0][0]=11;
        building[0][1]=22;
        building[0][2]=33;
        building[1][0]=44;
        building[1][1]=55;
        building[1][2]=66;
        building[2][0]=77;
        building[2][1]=88;
        building[2][2]=99;

       for (int i=0;i<3;i++)
       {
           for (int j=0;j<3;j++)
           {
               System.out.print("[ ");
               System.out.print(building[i][j]);
               System.out.print(" ] ");
           }
           System.out.println();
       }
    }
}
