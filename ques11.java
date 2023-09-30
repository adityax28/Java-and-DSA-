// https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1?page=1&difficulty[]=-2&category[]=Arrays&sortBy=submissions

// Solution 



class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return sum;
    
    }
}