/*Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive 
and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with positive number.
Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.*\

//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int ele:arr)
        {
            if(ele>=0)
            pos.add(ele);
            else
            neg.add(ele);
        }
        int i=0,index=0;
        while(i<pos.size() && i<neg.size())
        {
            arr[index]=pos.get(i);
            index++;
            arr[index]=neg.get(i);
            index++;
            i++;
        }
        while(i<pos.size())
        {
            arr[index]=pos.get(i);
            i++;
            index++;
        }
        while(i<neg.size())
        {
            arr[index]=neg.get(i);
            i++;
            index++;
        }
        
    }
}
