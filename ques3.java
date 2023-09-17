//  https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/0

// Solution 

class Solution{
    static String compareNM(int n,int m){
        // code here
        
        if(n > m){
            return "greater";
        }
        else if(n < m){
            return "lesser";
        }
        else{
            return "equal";
        }
        
    }
}