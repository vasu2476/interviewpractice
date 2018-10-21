package threads;
import java.io.*;
import java.util.*; import java.text.*; import java.math.*; import java.util.regex.*;

public class Solution {
	int n=99;
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   /* Scanner scan=new Scanner(System.in);
    String str=scan.next();
    int k=scan.nextInt();
    SortedSet<String> sets=new TreeSet<String>();
    for(int i=0;i<=str.length()-k;i++){
        sets.add(str.substring(i,i+k));
    }
    System.out.println(sets.first());
    System.out.println(sets.last());*/
	
	Solution s=new Solution();
	System.out.println(s.incr(s.n));
}

private int incr(int n) {
	// TODO Auto-generated method stub
	return n++;
}
}
