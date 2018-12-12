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
	public static void intercala(int p, int q, int r, int v[]) {
		int i, j, k, w[];
		i=p; j=q; k=0;
		w = new int[p+r];

		while(i<q && j<r) {
			if(v[i]<v[j]) {
				w[k] = v[i]; i++;
			}
			else {
				w[k] = v[j]; j++;
			}
			k++;
		}
		while(i<q) {
			w[k] = v[i]; i++; k++;
		}
		while(j<r) {
			w[k] = v[j]; j++; k++;
		}
		for(i=p;i<r;i++) {
			v[i] = w[i-p];
		}
	}
}
