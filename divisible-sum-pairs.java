import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class Item{
        int value;
        int index;
        int remainder;
        Item(int value, int index, int remainder){
            this.value = value;
            this.index = index;
            this.remainder = remainder;
        }
    }
    
    static class Items{
        Item item1;
        Item item2;
        Items(Item item1, Item item2){
            this.item1 = item1;
            this.item2 = item2;
        }
    }
    
    static int divisibleSumPairs(int n, int k, int[] ar) {
        Map<Integer, List<Item>> map = new HashMap<>();
        List<Items> pairs = new ArrayList<Items>();
        for(int i =0; i<n ; i++){
            int curr = ar[i];
            int remainder = curr%k;
            if(remainder == 0)remainder = k;
            Item currItem =new Item(curr, i, remainder);
            if(map.containsKey(k - remainder)){
                for(Item item1:map.get(k - remainder)){
                    pairs.add(new Items(item1, currItem));
                } 
            }
            if(remainder == k)remainder = 0;
            if(map.containsKey(remainder)){
                map.get(remainder).add(currItem);
            }
            else{
                List<Item> items = new ArrayList<>();
                items.add(currItem);
                map.put(remainder, items);
            }  
        }
        
        return pairs.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}

/**
You are given an array of  integers, , and a positive integer, . Find and print the number of pairs where  and  +  is divisible by .

Input Format

The first line contains  space-separated integers,  and , respectively. 
The second line contains  space-separated integers describing the respective values of .

Constraints

Output Format

Print the number of  pairs where  and  +  is evenly divisible by .

Sample Input

6 3
1 3 2 6 1 2
Sample Output

 5
**/
