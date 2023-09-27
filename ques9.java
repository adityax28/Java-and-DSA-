// https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718013/1

// Solution

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 1; i <= n + (n-1); i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //for(int k = 1; k <= i; k++){
           //     System.out.print("*");
           // }
            System.out.println();
        }
    }
}