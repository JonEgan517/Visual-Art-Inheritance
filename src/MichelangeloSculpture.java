
public class MichelangeloSculpture extends Sculpture
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
		System.out.println("Height of the " + artwork + " 17 feet tall.");
	}
	
	@Override
	public void weight()
	{
		System.out.println("Weight of the " + artwork + " is  not stated.");
	}
	
	public MichelangeloSculpture()
	{
		artist = "Michelangelo";
		artwork = "Statue of David";
	}
}
