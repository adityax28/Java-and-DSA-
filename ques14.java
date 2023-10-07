// https://practice.geeksforgeeks.org/problems/java-arrays-set-11354/1?page=3&difficulty[]=-2&difficulty[]=-1&category[]=Arrays&sortBy=submissions

// Solution 

class Compute
{
    String average(int A[], int N)
    {
        double avg = 0;
        for(int i = 0; i < N; i++){
            avg += A[i];
           
        }
        
        //String aveg = Integer.toString(avg);
        return String.format("%.2f",avg/N);
        
    }
}