import java.util.function.Function;
import java.util.List;

public class Oppg2 {
	
	//private
	public static void main(String[] args) {
		
		int tillegg = 50000;
		double prosent = 0.05;
		
		Function<Ansatt, Integer> kroneTillegg = a -> a.getAarslonn() + tillegg;
		//type cast
		Function<Ansatt, Integer> prosentTillegg = a -> (int) (a.getAarslonn() * (1 + prosent));
		
		Function<Ansatt, Integer> lavLonnKroneTillegg = a -> a.getAarslonn() + tillegg;
		
		Function<Ansatt, Integer> lavLonnProsentTillegg = a -> (int) (a.getAarslonn() * (1 + prosent));
		

		List<Ansatt> ansatte = List.of(
			new Ansatt("A", "B", Kjonn.MANN, "C", 10000),
			new Ansatt("D", "E", Kjonn.MANN, "F", 10000),
			new Ansatt("G", "H", Kjonn.MANN, "I", 10000),
			new Ansatt("J", "K", Kjonn.MANN, "L", 10000),
			new Ansatt("M", "N", Kjonn.DAME, "O", 10000)
		);
		
		skrivUtAlle(ansatte);
		
		lonnsoppgjor(ansatte, prosentTillegg);
		
		System.out.println();
		skrivUtAlle(ansatte);
	}
	
	public static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> func) {
		
		for (Ansatt ansatt : ansatte) {
		
			int tillegg = func.apply(ansatt);
			
			ansatt.setAarslonn(tillegg);
		}
	}
	
	private static void skrivUtAlle(List<Ansatt> ansatte) {
		
		for (Ansatt ansatt : ansatte) {
			
			System.out.println(ansatt);
		}
		
	}
}