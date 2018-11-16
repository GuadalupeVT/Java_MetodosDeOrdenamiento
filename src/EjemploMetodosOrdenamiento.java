import java.util.Arrays;

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
		boolean ordenado;
		do {
			i=i+1;
			ordenado=true;
			for(int j=0; j<=numeros.length-i; j++) {
				comparaciones++;
				if (numeros[j]<numeros[j+1]) {
					//ordenado=false;
					aux = numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					intercambios++;
				}
				recorridos++;
			}
		}while(i<numeros.length || ordenado==true);
		tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
		System.out.println("Recorridos: "+recorridos);
		System.out.println("Intercambios: "+intercambios);
		System.out.println("Comparaciones: "+comparaciones);
	} //OrdenamientoBurbuja3
	
	public static void ordenamientoPorSeleccion(int []numeros) {
		int recorridos=0, intercambios=0, comparaciones=0;
		long tInicio,tFin;
		tInicio=System.nanoTime();
		 int  menor, pos, tmp;
         for (int i = 0; i < numeros.length - 1; i++) { 
               menor = numeros[i];
               pos = i; 
               for (int j = i + 1; j < numeros.length; j++){
                     if (numeros[j] < menor) { 
                         menor = numeros[j]; 
                         pos = j;
                     }
               }
               comparaciones++;
               if (pos != i){ 
                   tmp = numeros[i];
                   numeros[i] = numeros[pos];
                   numeros[pos] = tmp;
                   intercambios++;
               }
               recorridos++;
         }
         tFin=System.nanoTime();
 		double milliseconds = (tFin-tInicio) / 1000000.0;
 		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
 		System.out.println("Recorridos: "+recorridos);
 		System.out.println("Intercambios: "+intercambios);
 		System.out.println("Comparaciones: "+comparaciones);
	}//Metodo ordenamientoPorSeleccion
	
	public static void insercionDirecta(int numeros[]) {
		int j, aux;
		long tInicio,tFin;
		int recorridos=0, intercambios=0,comparaciones=0;
		tInicio=System.nanoTime();
		for(int i=1; i<numeros.length;i++) {
			aux=numeros[i];
			j=i-1;
			comparaciones++;
			while((j>=0)&& (aux<numeros[j])){
				numeros[j+1]=numeros[j];
				j--;
				intercambios++;
			}
			numeros[j+1]=aux;
			recorridos++;
		}
		tFin=System.nanoTime();
 		double milliseconds = (tFin-tInicio) / 1000000.0;
 		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
 		System.out.println("Recorridos: "+recorridos);
 		System.out.println("Intercambios: "+intercambios);
 		System.out.println("Comparaciones: "+comparaciones);
	}//metodo insercionDirecta
	
	public static void mostarVector(int numeros[]) {
		System.out.println(Arrays.toString(numeros));
	}//metodo mostrarVector
	
}//MetodosOrdenamiento 

public class EjemploMetodosOrdenamiento {
	public static void main(String[] args) {
		

	}

}
