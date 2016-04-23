import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JamesBond {
	public boolean bondRegex(String input) {
		Pattern p = Pattern.compile("([^\\(]\\s)*\\(\\s([^0]\\s)*(0\\s){2}7\\s([^\\)]\\s)*\\)\\s*");
		Matcher m = p.matcher(input);
		return m.find();
	}
}
