package String_1;
/*
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) �� "H"
theEnd("Hello", false) �� "o"
theEnd("oh", true) �� "o"
 */
public class b4_theEnd {
	public String theEnd1(String str, boolean front) {
		  if(front==true)
		  return str.substring(0,1);
		  return str.substring(str.length()-1);
	}
	
	// Solution
    public String theEnd2(String str, boolean front) {
        if (front) return str.substring(0, 1);
        return str.substring(str.length() - 1);
    }
}
