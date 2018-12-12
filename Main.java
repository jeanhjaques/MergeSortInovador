import java.util.Random;

public class Main {
	public static void main(String[]args) {
		int vet[] = new int[100];
		
		Random random = new Random();
		for(int i=0; i<vet.length; i++) {
			vet[i] = random.nextInt(1000);
		}
		
		for(int i=0; i<vet.length; i++) {
			System.out.print(vet[i]+" ");
		}
		System.out.println();
		
	    MergeSortInovador.mergeSortInovador(0, vet.length, vet);
		
		for(int i=0; i<vet.length; i++) {
			System.out.print(vet[i]+" ");
		}
	}
}
