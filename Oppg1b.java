import java.util.function.BiFunction;
import java.lang.Math;

public class Oppg1b {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> summerFunksjon = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> storstFunksjon = (a, b) -> Math.max(a, b);
		BiFunction<Integer, Integer, Integer> absoluttFunksjon = (a, b) -> Math.abs(a - b);
		
		int sum = beregn(12, 13, summerFunksjon);
		int storre = beregn(-5, 3, storstFunksjon);
		int absolutt = beregn(54, 45, absoluttFunksjon);
		
		System.out.println(sum);
		System.out.println(storre);
		System.out.println(absolutt);
	}
	
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> biFunc) {
		
		return biFunc.apply(a, b);
	}
}