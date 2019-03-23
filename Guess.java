class Guess
{
	public static void main(String args[])
	throws java.io.IOException
	{
	 char ch, answer = 'K';
	 System.out.println("I'm thinking of a letter between A and Z.");
	 System.out.println("Can you Guess it:");
	 ch = (char) System.in.read();
	 if(ch == answer)
	 System.out.println("** Right **");
	}
}