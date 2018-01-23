import java.util.*;

import com.sun.glass.ui.Size;

import java.lang.*;
import java.io.*;

public class F4 {
	
	public static int topological(boolean edges[][]){
	//public static Stack<Integer> topological(boolean edges[][]){
		Stack<Integer> vertex= new Stack<Integer>();
		while(vertex.size()!=edges.length) {
		
		for(int i=0; i<edges.length  && !vertex.contains(i); i++) {	
			int path=0;
			for(int k=0; k<edges.length; k++) 
				if(edges[i][k])
					path++;
				
			if(path==0) {
				 vertex.push(i); 
				 if(!vertex.isEmpty())
				 System.out.println(vertex.peek());

				 for(int j=0; j<edges.length; j++) {
						edges[j][i]=false;
					}
		}
	}		
}
		//return vertex;
		//return(vertex.peek());
		return 1;
}
	
	public static void main (String[] args) throws java.lang.Exception
	{
	boolean m[][]={ {false, false, false, true, true, false},
				    {true, false, true, false, false, false},
				    {false, true, false,false, true, false},
				    {false, false, false, false, false, true},
				    {false, false, false, true, false, false},
				    {false, false, false, false, false, false}
				};
//	remoteMates(m, 2);
//	System.out.println(remoteMates(m, 0));
	System.out.println(topological(m));
	
			}

}
