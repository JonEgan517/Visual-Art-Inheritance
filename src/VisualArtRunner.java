
public class VisualArtRunner 
{
	public static void main(String[] args)
	{
		VisualArt [] gallery = new VisualArt[4];
		gallery[0] = new DaVinciPainting();
		gallery[1] = new BobRossPainting();
		gallery[2] = new MichelangeloSculpture();
		gallery[3] = new DonatelloSculpture();
		
		
		for(VisualArt a : gallery)
		{
			a.madeOf();
			a.visual();
			a.imagination();
			a.size();
			a.weight();
			System.out.println("");
		}
	}
}
