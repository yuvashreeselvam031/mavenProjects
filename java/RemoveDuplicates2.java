

import java.util.LinkedHashSet;

import java.util.Set;


public class RemoveDuplicates2 {


	public static void main(String[] args) {

		String st = "I like mock interview as it is same as real interview";
		System.out.println(st);
		
		String[] strwords = st.split(" ");

		Set<String> ss = new LinkedHashSet<String>();

		for (int i = 0; i < strwords.length; i++) {
			ss.add(strwords[i]);
		
		}
		int size = ss.size();
	
	for (int i= 0; i< size; i++) {
		Object[] array = ss.toArray();
		String a = " " +array[i];
		System.out.print(a);
		
	}
		
		
	}

}
