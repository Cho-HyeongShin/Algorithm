package algorithm;

import java.util.*;
public class leetCode_1817 {
	public static void main(String[] args) {
		class Solution {
		    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
		        Map<Integer,Set<Integer>> mp=new HashMap<>();
		        int res[]=new int[k];
		        
		        for(int log[]:logs){
		          int id=log[0];
		          int time=log[1];
		          if(mp.containsKey(id)){
		            Set<Integer> timeset=mp.get(id);
		            timeset.add(time);
		          }
		          else{
		             Set<Integer> timeset=new HashSet<>();
		             timeset.add(time);
		            mp.put(id,timeset);
		          }
		        }
		      for(int id:mp.keySet()){
		        int idx=mp.get(id).size();
		        res[idx-1]++;
		      }
		      return res;
		    }
		}
	}
	}
