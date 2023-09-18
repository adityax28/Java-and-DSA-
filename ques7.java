// https://practice.geeksforgeeks.org/problems/c-if-else-decision-making4138/1?page=6&difficulty[]=-2&difficulty[]=-1&sortBy=submissions



// Solution

class Solution{
    static String compareFive(int N){
        // code here
        
        if(N < 5){
            return "Less than 5";
        }
        else if(N > 5){
            return "Greater than 5";
        }
        else{
            return "Equal to 5";
        }
    }
}