/*
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence
Example 2:

Input: S = "gfg"
Output: gf
Explanation: Only keep the first
occurrence*/

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


class Solution {
    String removeDups(String S) {
        // code here
        ArrayList<Character> al=new ArrayList<Character>();
        int i,j;
        String str="";
        for(i=0;i<S.length();i++)
        {
            if(!al.contains(S.charAt(i)))
            {
                al.add(S.charAt(i));
            }
        }
        for(i=0;i<al.size();i++)
        {
            str+=al.get(i);
        }
        return str;
    }
}
