// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package stringsimplify.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import java.text.Normalizer;

public class SimplifyString extends CustomJavaAction<java.lang.String>
{
	private java.lang.String Text;

	public SimplifyString(IContext context, java.lang.String Text)
	{
		super(context);
		this.Text = Text;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String string = Normalizer.normalize(this.Text, Normalizer.Form.NFD);
		string = string.replaceAll("\\p{M}", "");
		return string;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SimplifyString";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
