package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super("Charmander", 4);
	}
	
	public Charmander(String name)
	{
		super(name, 4);
	}
	
	public int toast()
	{
		return 1;
	}
	
	public int fieryDance()
	{
		return 1;
	}
}
