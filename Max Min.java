/*Given an array A of size N of integers. Your task is to find the sum of minimum and maximum element in the array.

Example 1:

Input:
N = 5
A[] = {-2, 1, -4, 5, 3}
Output: 1
Explanation: min = -4, max =  5. Sum = -4 + 5 = 1
 

Example 2:

Input:
N = 4
A[]  = {1, 3, 4, 1}
Output: 5
Explanation: min = 1, max = 4. Sum = 1 + 4 = 5
*/
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min=A[0];
        int max=A[0];
        
        for(int i=1;i<N;i++)
        {
           if(min>A[i])
           {
               min=A[i];
           }
           if(max<A[i])
           {
               max=A[i];
           }
        }
        return min+max;
    }
}
