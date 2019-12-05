
public class BobRossPainting extends Painting
{
	@Override
	public void visual()
	{
		System.out.println("This painting is the " + artwork + " by " + artist + ".");
	}
	
	@Override
	public void imagination()
	{
		System.out.println("I see a mountain. Below the moutain there is a river and a forest.");
	}
	
	@Override
	public void size()
	{
		System.out.println("Dimensions of the " + artwork + " 60 x 90 cm.");
	}
	
	@Override
	public void weight()
	{
		System.out.println("Weight of the " + artwork + " 6 pounds.");
	}
	
	public BobRossPainting()
	{
		artist = "Bob Ross";
		artwork = "Cascading Falls";
	}
}
