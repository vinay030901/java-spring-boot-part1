package app1;

public class SomethingWrongHappen extends Exception{
	public SomethingWrongHappen(String message, Throwable clause)
	{
		super(message,clause);
	}
}	
