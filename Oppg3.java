import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Oppg3 {
	
	public static void main(String[] args) {
		
		List<Ansatt> ansatte = List.of(
			new Ansatt("Rikard", "Reke", Kjonn.MANN, "sjef", 100000),
			new Ansatt("Herman", "Hest", Kjonn.MANN, "slave", 200000),
			new Ansatt("Ariel", "Ape", Kjonn.DAME, "slave", 300000),
			new Ansatt("Marte", "Maur", Kjonn.DAME, "slave", 400000),
			new Ansatt("Gard", "Gaupe", Kjonn.MANN, "sjef", 500000)
		);
		
		//a
		List<String> kunEtternavn = ansatte.stream()
			.map(a -> a.getEtternavn())
			.toList();
		
		System.out.print("ansatte sine etternavn: ");
		for (String e : kunEtternavn) {
			System.out.print(e + " ");
		}
			
		//b
		Long d = ansatte.stream()
			.filter(k -> k.getKjonn() == Kjonn.DAME)
			.count();
		System.out.print("\nantall ansatte damer: " + d);
		
		//c
		double gj = ansatte.stream()
			.filter(k -> k.getKjonn() == Kjonn.DAME)
			.mapToDouble(Ansatt::getAarslonn)
			.average()
			.orElse(0.0);
		System.out.println("\ngjsnitt aarslonn damer: " + gj);
		
		//d
		List<Ansatt> justerSjefLonn = ansatte.stream()
			.filter(a -> a.getStilling().contains("sjef"))
			.peek(a -> a.setAarslonn((a.getAarslonn() * 107) / 100))
			.toList();
			
		for (Ansatt s : justerSjefLonn) {
			System.out.println("sjef: " + s);
		}
		
		//e
		boolean lonnOverAatte = ansatte.stream()
			.anyMatch(a -> a.getAarslonn() >= 800000);
			
		System.out.println("en ansatt har aarslonn over 800k?: " + lonnOverAatte);
		
		//f
		System.out.println("alle ansatte: ");
		ansatte.stream().forEach(System.out::println);
		
		//g
		List<Ansatt> lavestLonn = ansatte.stream()
			.filter(a -> a.getAarslonn == ansa
	}
}