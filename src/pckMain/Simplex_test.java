/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckMain;


        
public class Simplex_test {

    public static void main(String[] args){    
//        float[][] m = {
//            {0, -5, -1, -3, -1, -2  },
//            {12, 1, 2, -3, 1, 0  },
//            {15, 2, 0, 2, 3, 4  },
//            {13, 2, 4, 5, -3, 0},
//            {16, -1, 5, 2, -2, -1}
//        };
//        float[][] matrix = {
//            {d, ci},
//            {bj, Aij}
//        }//
//        where i = number of column, j = number of rows
//        matrix[0][0] is d
//        matrix[0][i] is c
//        matrix[j][0] is b
//        matrix[1 ... j][1 ... i] is A
        double [][] m2 = {
            {1, -0.05, -0.03, 0, 0, 0},
            {0, 2, 1, 1, 0, 40},
            {0, 1, 1, 0, 1, 30}

        };
        SimplexAlgorithm sa = new SimplexAlgorithm(m2.length, m2[0].length);
        sa.setMatrix(m2);
        while(!sa.checkC()){
            sa.printTableau();
            sa.makeIdentityColumn();
        }        
        System.out.println((sa.checkB()) ? "Feasible" : "Infeasible");
        if(sa.checkB()){
            sa.printX();            
        }
    }
}