/*
 * Question:
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.


Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:
Constraints:

n == mat.length == mat[i].length
1 <= n <= 100
1 <= mat[i][j] <= 100

 */
class Solution {
    public int diagonalSum(int[][] mat) {
             int sum=0;
        int k=mat.length;
        for(int i=0;i<mat.length;i++){      //first loop
            for(int j=0;j<mat.length;j++){      //2nd loop
                if(i==j || i+j==mat.length-1){      //same as printing "X" pattern
                    sum+=(mat[i][j]);       //getting sum
                }
                
            }
        }
        return sum;     //return sum
    }
}