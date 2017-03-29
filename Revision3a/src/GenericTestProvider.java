
public class GenericTestProvider {

	public static void main(String[] args) {
		
		GenericClassInfoProvider<String> g = new GenericClassInfoProvider<String>();
		System.out.println(g.getSimpleClassName(new String(" ")));
		
	}

}
