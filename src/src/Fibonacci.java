package src;

import java.util.Comparator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Fibonacci {
	public static IntStream generateFibonacciSequence() {
        // To be implemented: Proper implementation.
		
		
        return IntStream.of(1, 1, 2, 3, 5, 8, 13);
    }
	
	
	 
	 
	public static void main(String[] args) {
		Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] });
		/* Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] })
	      .limit(92).forEach(p->System.out.println(p[0]));
		
		IntStream.iterate(new int[]{ 1, 1 }, p->new int[]{ p[1], p[0]+p[1] });  */
		
		// IntStream.iterate(new Integer[]{ 1, 1 }, p->new Integer({ p[1], p[0]+p[1] }));
		

	} 
}
