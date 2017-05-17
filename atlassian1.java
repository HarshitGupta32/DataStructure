// This is the text editor interface.
// Anything you type or change here will be seen by the other person in real time.

// Input: "apple", "banana", "orange"
// Expected output: All possible combinations

import java.util.*;
public class atlassian1{


    public static List<List<String>> allPossibleCombinations(String [] inp)
    {
        List<List<String>> result = new ArrayList<List<String>>();
        if(inp.length == 0)
            return result;
        allPossibleCombinationsUtil(inp,new ArrayList<String>(),result,0);

        return result;

    }

    public static void allPossibleCombinationsUtil(String [] inp,ArrayList<String> temp,List<List<String>> result, int start)
    {
        result.add(new ArrayList<String>(temp));
        for(int i= start;i<inp.length;i++)
        {
            temp.add(inp[i]);
            allPossibleCombinationsUtil(inp,temp,result,i+1);
            temp.remove(temp.size()-1);//this is the backtracking step
        }
    }

    public static HashMap<List<String>, Integer> getHashMappedValues(List<List<String>> inp)
    {
        HashMap<List<String>, Integer> result = new HashMap<List<String>, Integer>();
        for(List<String> temp : inp)
        {
            result.put(temp,result.containsKey(temp)? result.get(temp)+1 : 1 );
        }

        return result;
    }

    public static void main(String [] args)
    {
        String [] inp = new String []{"apple","bannana","orange"};
        List<List<String>> result = allPossibleCombinations(inp);
        for(List<String> temp : result)
        {
            for(String s : temp)
            {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}