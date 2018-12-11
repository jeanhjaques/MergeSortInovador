public class MergeSortInovador{
	public static void mergeSortInovador(int p, int r, int v[]){
		int q;
		if(p<r-1){
			q=(p+r)/2;
			mergeSortInovador(p,q,v);
			mergeSortInovador(q,r,v);
			intercala(p,q,r,v);
		}
	}
}
