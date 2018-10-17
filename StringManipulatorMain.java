/**
 * Katelyn DePaula
 */
import java.util.Scanner;

public class StringManipulatorMain 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		StringManipulator manip = new StringManipulator();
		System.out.println("Which method would you like to run? Choose ");
		System.out.print(manip.noVowel("hello") + manip.reverse(" hello"));
		System.out.println("");
	}
}
