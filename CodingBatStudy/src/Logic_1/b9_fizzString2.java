package Logic_1;
/*Logic-1 > fizzString2
Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division,
so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
(See also: FizzBuzz Code and Introduction to Mod)
fizzString2(1) �� "1!"
fizzString2(2) �� "2!"
fizzString2(3) �� "Fizz!"*/
public class b9_fizzString2 {
	public String fizzString2(int n) {
		  if(n%3==0&&n%5==0)
		  return "FizzBuzz!";
		  if(n%3==0)
		  return "Fizz!";
		  if(n%5==0)
		  return "Buzz!";
		  return n+"!";
		}
	
	// Solution
    public String sfizzString2(int n) {
        String out = "";
        if (n % 3 == 0) out = out + "Fizz";
        if (n % 5 == 0) out = out + "Buzz";
        return out.equals("") ? new String(n + "!") : out + "!";
    }
}
