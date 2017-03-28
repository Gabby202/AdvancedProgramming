package resource;

import java.util.ListResourceBundle;

public class ProgramResource_fr extends ListResourceBundle{
	
	
	private static final Object[][] contents = {{"Hello", "Bonjour"},  {"French", "Francais"},  {"German", "allemand"},  {"Spanish", "Espanol"}};


		@Override
		protected Object[][] getContents() {
			// TODO Auto-generated method stub
			return contents;
		}
}
		



