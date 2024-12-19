package Leetcode_sol.codechef;

import java.util.*;

class disc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		while(a>0){
		    
		    int n = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(int i=0;i<n;i++){
		        
		        int val = sc.nextInt();
		        arr[i] = val;
		    }
		    
		    Stack<Integer> vals = new Stack<>();
		    Stack<Integer> ind = new Stack<>();
		    
		    vals.push(arr[0]);
		    ind.push(0);
		    
		    int max = 0;
		    
		    for(int i=1;i<n;i++){
		        
		        int val = arr[i];
		        
		        while(vals.size()>0){
		            
		            int tp = vals.peek();
		            
		            if(tp<val){
		                vals.pop();
		                ind.pop();
		            }else{
		               break;
		               
		            }
		        }
		        
		        if(vals.size()>0){
		            
		            int tpIn = ind.peek();
		            
		            int diff = i - tpIn;
		            diff--;
		            
		            if(diff>max)
		            max = diff;
		        }else{
		            
		            max = i;
		        }
		        
		        vals.push(val);
		        ind.push(i);
		    }
		    
		    System.out.println(max);
		    
		    a--;
		}

	}
}