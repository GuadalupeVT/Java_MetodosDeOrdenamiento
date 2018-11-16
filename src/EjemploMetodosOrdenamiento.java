

class MetodosOrdenamiento{
	public static void ordenamientoBurbuja0(int numeros[]) {
		long tInicio,tFin;
		tInicio=System.nanoTime();
		int aux, intercambios=0, recorridos=0, comparaciones=0;
		for(int i=0; i<numeros.length;i++) {
			for (int j=i+1; j<numeros.length; j++) {
				comparaciones++;
				if (numeros[j]>numeros[j+1]) {
					aux =(byte)numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=aux;
					intercambios++;
				}
				recorridos++;
			}
		}
		tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
		System.out.println("Recorridos: "+recorridos);
		System.out.println("Intercambios: "+intercambios);
		System.out.println("Comparaciones: "+comparaciones);
	}//Class OrdenamientoBurbuja0
	
	public static void ordenamientoBurbuja1(int numeros[]) {
		long tInicio,tFin;
		tInicio=System.nanoTime();
		int aux, intercambios=0, recorridos=0, comparaciones=0;
		for(int i=2; i<=numeros.length;i++) {
			for (int j=0; j<=(numeros.length-i); j++) {
				comparaciones++;
				if (numeros[j]>numeros[j+1]) {
					aux =numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					intercambios++;
				}
				recorridos++;
			}	
		}
		tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
		System.out.println("Recorridos: "+recorridos);
		System.out.println("Intercambios: "+intercambios);
		System.out.println("Comparaciones: "+comparaciones);
	}//OrdenamietoBurbuja1
	
	public static void ordenamientoBurbuja2(int numeros[]) {
		long tInicio,tFin;
		tInicio=System.nanoTime();
		int aux, intercambios=0, recorridos=0, comparaciones=0;
		int i=1;
		boolean ordenado=false;
		while(i<numeros.length && ordenado==false){
			i=i+1;
			ordenado=true;
			for(int j=0; j<=(numeros.length-i);j++) {
				comparaciones++;
				if(numeros[j]>numeros[j+1]) {
					ordenado=false;
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					intercambios++;
				}
				recorridos++;
			}
		}
		tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
		System.out.println("Recorridos: "+recorridos);
		System.out.println("Intercambios: "+intercambios);
		System.out.println("Comparaciones: "+comparaciones);
		
	}//OrdenamientoBurbuja2
	
	public static void ordenamientoBurbuja3(int []numeros) {
		long tInicio,tFin;
		tInicio=System.nanoTime();
		int aux, intercambios=0, recorridos=0, comparaciones=0;
		int i=1;
		boolean ordenado=false;
		do {
			recorridos++;
			ordenado=true;
			for(int j=0; j<numeros.length-i; j++) {
				comparaciones++;
				if (numeros[j]<numeros[j+1]) {
					ordenado=false;
					aux = numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					intercambios++;
				}
			}
		}while(!(i<numeros.length || ordenado==false));
		tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
		System.out.println("Recorridos: "+recorridos);
		System.out.println("Intercambios: "+intercambios);
		System.out.println("Comparaciones: "+comparaciones);
	} //OrdenamientoBurbuja3
	
}//MetodosOrdenamiento 

public class EjemploMetodosOrdenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
