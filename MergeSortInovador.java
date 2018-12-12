public class MergeSortInovador{
	public static void mergeSortInovador(int p, int r, int v[]){
		int q;
		if(p<r-1){
			if(p+r<=8) {
				bubleSort(p,r,v);
			}
			else {
				q=(p+r)/2;
				mergeSortInovador(p,q,v);
				mergeSortInovador(q,r,v);
				intercala(p,q,r,v);
			}
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

	public static void bubleSort(int p, int r,int v[]) {
		int aux[] = new int[p+r];
		
		int i, j, k;
		i=p; j=r; k=0;
		
		while(i<j) {
			aux[k] = v[i]; i++; k++;
		}
		
		for(int x=aux.length-1; x>0; x--) {
			for(int y=0; y<x; y++) {
				if(v[y]> v[y+1]) {
					int valorAntigo = v[y];
					v[y] = v[y+1];
					v[y+1] = valorAntigo;
				}
			}
		}
		for(int x=0; i<aux.length; i++) {
			v[x] = aux[x];
		}
	}
}
