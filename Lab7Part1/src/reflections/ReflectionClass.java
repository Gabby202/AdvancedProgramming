package reflections;

import java.lang.reflect.*;

public class ReflectionClass {

	public static void main(String[] args) {
		
		
		ReflectionClass r = new ReflectionClass();
		
		System.out.println(ReflectionClass.class.getName());
		System.out.println(r.getClass().getName());

		String className = "reflections.ReflectionClass";
		try {
			Class myClassObj = Class.forName(className);
			
			System.out.println(myClassObj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}


}
