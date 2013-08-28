package covariance;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		List<SubA> subAList = new ArrayList<SubA>();
		subAList.add(new SubA());
		
		List<? extends Super> list = subAList;

		list.add(new SubA());
		
		for(Super s : list) {
			System.out.println(s.toString());
		}
	}

}
