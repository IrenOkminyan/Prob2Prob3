/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prob2
{
	 public static int remoteMates(boolean edges[][], int vertex) {
		 int number=0;
		 Stack<Integer>  itself= new Stack<Integer>();
		 Stack<Integer>  neighbour= new Stack<Integer>();
		
		 itself.push(vertex);
		 
		 for(int i=0; i< edges.length; i++) {
			 if(edges[vertex][i])
				 itself.push(i);
						 }
		 
		  for(int j=0; j< edges.length; j++) {
			  if(itself.contains(j)) {
			//System.out.println(j);
			for(int k=0; k< edges.length; k++)
				 if(edges[j][k]&& !neighbour.contains(k)&& !itself.contains(k))
					 neighbour.push(k);
			  }
		  }
		while(!neighbour.isEmpty()) {
			neighbour.pop();
			number=number+1;
		}

		 return number;
	 }
	 
	 
//	public static int deepestPath(boolean edges[][], int vertex) {
//		Stack<Integer> path= new Stack<Integer>();
//		int[] array=new int[edges.length];
//		int count=0;
//		
//		 for(int i=0; i< edges.length; i++) {
//			 if(edges[vertex][i]) {
//				 array[i]=1;
//				 path.push(i);
//						 }
//			 boolean yet=true;
//			 while(yet) {
//				 yet=false;
//				 for(int j=0; j< edges.length; j++) {
//					 
//				 }
//				 array[i]++;
//			 
//		 }
//		
//		 }
//		
//		
//		
//		return count;
//	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	boolean m[][]={ {false, false, false, true, true, false},
				    {true, false, true, false, false, false},
				    {false, true, false,false, true, false},
				    {false, false, false, false, false, true},
				    {false, false, false, true, false, false},
				    {false, false, false, false, false, false}
				};
	remoteMates(m, 2);
	System.out.println(remoteMates(m, 0));
	//System.out.println(m.length);
			}
}