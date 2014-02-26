package Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilityRegex {
	
	public static Boolean EvalItem(String Item, String pattern) {
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(Item);
		return m.find();
	}
	
}
