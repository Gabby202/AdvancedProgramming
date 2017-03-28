package resource;

import java.util.ListResourceBundle;

public class ProgramResource_sp extends ListResourceBundle{
	
	
	private static final Object[][] contents = {{"Hello", "Hola"},  {"French", "francés"},  {"German", "alemán"},  {"Spanish", "el español"}};


		@Override
		protected Object[][] getContents() {
			// TODO Auto-generated method stub
			return contents;
		}
}
		



