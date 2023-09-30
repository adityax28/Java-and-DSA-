// https://practice.geeksforgeeks.org/problems/c-arrays-sum-of-array-set-14805/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

// Solution 

class Solution {
    
    public long getSum(long a[], long n)
    {
        // Your code goes here
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        return sum;
    }
}