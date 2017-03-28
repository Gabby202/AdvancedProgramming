
public class GenericClassInfoProvider <T> {
	
	private T type;
	
	public String getSimpleClassName(T type) {
		return type.getClass().getSimpleName();	
	}

}
