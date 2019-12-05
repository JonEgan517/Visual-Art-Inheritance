
public class DonatelloSculpture extends Sculpture
{
	@Override
	public void visual()
	{
		System.out.println("This sculture is the " + artwork + " by " + artist + ".");
	}
	
	@Override
	public void imagination()
	{
		System.out.println("I see the " + artwork + ".");
	}
	
	@Override
	public void size()
	{
		System.out.println("Height of the " + artwork + " 7 feet and 9 inches tall.");
	}
	
	@Override
	public void weight()
	{
		System.out.println("Weight of the " + artwork + " is more than 6 tons.");
	}
	
	public DonatelloSculpture()
	{
		artist = "Donatello";
		artwork = "Statue of St. Mark";
	}
}
