package CodingBat_Warmup1;
/*
 * 
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") �� "HeLLO"
endUp("hi there") �� "hi thERE"
endUp("hi") �� "HI"
 */
public class d3_endUp {
	public String endUp1(String str) {
		  if(str.length()<3)
		  return str.toUpperCase();
		  
		  String tmp=str.substring(str.lastIndexOf(-3),str.length());
		  String tmp1=tmp.toUpperCase();
		  String tmp2=str.substring(0,str.lastIndexOf(3));
		  return tmp2+tmp1;
	}
	
	// Solution
	public String endUp2(String str) {
		  if (str.length() <= 3) return str.toUpperCase();
		  int cut = str.length() - 3;
		  String front = str.substring(0, cut);
		  String back  = str.substring(cut);  // this takes from cut to the end
		  
		  return front + back.toUpperCase();
	}
}
