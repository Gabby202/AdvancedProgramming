import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class InvestigatorClass {

	public InvestigatorClass() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		MysteryClass mc = new MysteryClass();
		
		Method[] methods = mc.getClass().getDeclaredMethods();
		Field[] fields = mc.getClass().getFields();

		
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i].getName());
			System.out.println(methods[i].getReturnType());
			System.out.println(methods[i].getModifiers());
			System.out.println(methods[i].getReturnType());
			System.out.println(methods[i].getParameterTypes()[0].getName());

			
			try {
				System.out.println(methods[i].invoke(mc, 122));
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			System.out.println(" ");
		}
		
		for(int i = 0; i < fields.length; i++) {
			
			System.out.println(fields[i].getName());
			System.out.println(fields[i].getType());
			System.out.println(" ");
		}
		
		
	}
}
