// https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1?page=1&sprint=29e21edbc2d2152d81c29bbcb11a5325&sortBy=submissions

// Solution

class Compute {
    
    public int largest(int arr[], int n)
    {
        int max = arr[0];
        
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}