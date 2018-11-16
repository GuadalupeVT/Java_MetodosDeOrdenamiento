import java.util.Arrays;
import java.util.Scanner;

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
				if (numeros[j]>numeros[j+1]) {
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
		Scanner entrada = new Scanner (System.in);
		byte menu=0, submenu=0;
		do {
			System.out.println("------------------Menu------------------");
			System.out.println("1. Ordenamiento Burbuja");
			System.out.println("2. Ordenamiento Seleccion");
			System.out.println("3. Ordenamiento Insercion");
			System.out.println("4. Salir");
			menu=entrada.nextByte();
			switch(menu) {
			case 1:
				System.out.println("1. Burbuja0");
				System.out.println("2. Burbuja1");
				System.out.println("3. Burbuja2");
				System.out.println("4. Burbuja3");
				submenu=entrada.nextByte();
				switch(submenu) {
				case 1:
				case 2:
				case 3:
				case 4:
				default:
				}
				break;
			case 2:
			case 3:
			case 4: break;
			default: System.out.println("Opcion incorrecta!!");
			}
		}while(menu!=4);
		// Menu
				System.out.println("\n==================ORDENAMIENTO CON BURBUJA====================");
				System.out.println("*********Burbuja0*********");
				int edades0[]= {34,25,12,87,9,10,34,37,24,2};
				MetodosOrdenamiento.mostarVector(edades0);
				MetodosOrdenamiento.ordenamientoBurbuja1(edades0);
				MetodosOrdenamiento.mostarVector(edades0);
				System.out.println("*********Burbuja1*********");
				int edades[]= {34,25,12,87,9,10,34,37,24,2};
				MetodosOrdenamiento.mostarVector(edades);
				MetodosOrdenamiento.ordenamientoBurbuja1(edades);
				MetodosOrdenamiento.mostarVector(edades);
				System.out.println("*********Burbuja2*********");
				int edadesb1[]= {34,25,12,87,9,10,34,37,24,2};
				MetodosOrdenamiento.mostarVector(edadesb1);
				MetodosOrdenamiento.ordenamientoBurbuja2(edadesb1);
				MetodosOrdenamiento.mostarVector(edadesb1);
				System.out.println("*********Burbuja3*********");
				int edadesb2[]= {34,25,12,87,9,10,34,37,24,2};
				MetodosOrdenamiento.mostarVector(edadesb2);
				//MetodosOrdenamiento.ordenamientoBurbuja3(edadesb2);
				MetodosOrdenamiento.mostarVector(edadesb2);
				System.out.println("\n==================ORDENAMIENTO CON SELECCION====================");
				int edades2[]= {34,25,12,87,9,10,34,37,24,2};
				MetodosOrdenamiento.mostarVector(edades2);
				MetodosOrdenamiento.ordenamientoPorSeleccion(edades2);
				MetodosOrdenamiento.mostarVector(edades2);
				System.out.println("\n==================ORDENAMIENTO CON INSERCION====================");
				int edades3[]= {34,25,12,87,9,10,34,37,24,2};
				MetodosOrdenamiento.mostarVector(edades3);
				MetodosOrdenamiento.insercionDirecta(edades3);
				MetodosOrdenamiento.mostarVector(edades3);

	}

}
