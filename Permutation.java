package graphs;

import java.util.LinkedList;
import java.util.List;

public class PermuteString {
	private static List<String> res;
	
	public static List<String> permutation(int n){
		res = new LinkedList<>();
		dfs(n, 1, 0, "F");
		dfs(n, 0, 1, "M");
		return res;
	}
	
	public static void dfs(int n, int fc, int mc, String solution) {
		if(fc == n && mc == n) {
			res.add(solution);
			return;
		}
		if(fc < n )
			dfs(n, fc + 1, mc, solution + "F");
		/*
		// female and male are equal
		if(mc < n)
			dfs(n, fc, mc + 1, solution + "M");
		*/
		// female first
		if(mc < fc)
			dfs(n, fc, mc + 1, solution + "M");
	}
	
	public static void main(String[] args) {
		List<String> res = permutation(3);
		for(String str : res){
			System.out.println(str);
		}
	}
}
