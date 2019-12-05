public class DaVinciPainting extends Painting
{
	@Override
	public void visual()
	{
		System.out.println("This painting is the " + artwork + " by " + artist + ".");
	}
	
	@Override
	public void imagination()
	{
		System.out.println("I see a woman in this painting or is it " + artist + ".");
	}
	
	@Override
	public void size()
	{
		System.out.println("Dimensions of the " + artwork + " 30 x 20 7/8 inches.");
	}
	
	@Override
	public void weight()
	{
		System.out.println("Weight of the " + artwork + " is 18 pounds.");
	}
	
	public DaVinciPainting()
	{
		artist = "Leonardo da Vinci";
		artwork = "Mona Lisa";
	}
}
