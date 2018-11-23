import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MetodosOrdenamiento{
	public static void ordenamientoBurbuja0(int numeros[]) {
		long tInicio,tFin;
		tInicio=System.nanoTime();
		int aux, intercambios=0, recorridos=0, comparaciones=0;
		for(int i = 0; i < numeros.length - 1; i++){
            for(int j = 0; j < numeros.length - 1; j++){
            	comparaciones++;
                if (numeros[j] < numeros[j + 1]){
                    aux = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = aux;
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
	
public static void ordenamientoBurbuja3(int[] numeros) {
		int recorridos=0, comparaciones=0, intercambios=0;
		long tFin, tInicio;	
		int i=1,aux;
		boolean ordenado;
		tInicio = System.nanoTime();
		do {
			i=i+1;
			ordenado = true;
			
			for(int j=0; j <= numeros.length-i; j++) {
				comparaciones++;
				if(numeros[j] > numeros[j+1]) {
					intercambios++;
					//ordenado = false;
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
				recorridos++;
			}
		} while( (i < numeros.length) && (ordenado == true) );
		 tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
 		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
 		System.out.println("Recorridos: "+recorridos);
 		System.out.println("Intercambios: "+intercambios);
 		System.out.println("Comparaciones: "+comparaciones);
		
	}
	
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
	
	public static void ordenamientoShellsort(int []numeros) {
		int salto,aux,i;
		boolean cambios;
		long tInicio,tFin;
		int recorridos=0, intercambios=0,comparaciones=0;
		tInicio=System.nanoTime();
		for(salto=numeros.length/2;salto !=0; salto/=2) {
			cambios=true;
			while(cambios) {
				cambios=false;
				for(i=salto; i<numeros.length;i++) {
					comparaciones++;
					if(numeros[i-salto]>numeros[i]) {
						aux=numeros[i];
						numeros[i]=numeros[i-salto];
						numeros[i-salto]=aux;
						cambios=true;
						intercambios++;
					}
					recorridos++;
				}
			}
		}
		tFin=System.nanoTime();
		double milliseconds = (tFin-tInicio) / 1000000.0;
 		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
 		System.out.println("Recorridos: "+recorridos);
 		System.out.println("Intercambios: "+intercambios);
 		System.out.println("Comparaciones: "+comparaciones);
	} //OrdenamientoShellsort
	
	public static void ordenamientoQuickSort(int numeros[], int primero, int ultimo) {
		int i,j,pivote,aux;
		i=primero;
		j=ultimo;
		pivote=numeros[primero];
		while(i<j) {
			while(numeros[i]<=pivote && i<j) {
				i++;
			}
			while(numeros[j]>pivote) {
				j--;
			}
			if(i<j) {
				aux=numeros[i];
				numeros[i]=numeros[j];
				numeros[j]=aux;
			}
		}
		numeros[primero]=numeros[j];
		numeros[j]=pivote;
		if(primero<j-1) {
			ordenamientoQuickSort(numeros, primero, j-1);
		}
		if(j+1<ultimo) {
			ordenamientoQuickSort(numeros, j+1, ultimo);
		}
	}//Metodo ordenamientoQuickSort
	public static void ordenamientoRadixSort(int[] arr) {
		long tInicio,tFin;
		int recorridos=0, intercambios=0,comparaciones=0;
		tInicio=System.nanoTime();
		if(arr.length==0) 
			return;
		int [][] np =new int [arr.length][2];
		int [] q = new int [0x100];
		int i=0,j,k,l,f=0;
		for (k=0; k<4; k++) 
			for(i=0;i<(np.length-1);i++)
				np[i][1]=i+1;
		    np[i][1]=-1;
		    for(i=0; i<q.length;i++)
		    	q[i]=-1;
		    for(f=i=0;i<arr.length;i++) {
		    	j=((0xFF<<(k<<3))&arr[i])>>(k<<3);
		    	comparaciones++;
		    	if(q[j]==-1)
		    		l=q[j]=f;
		    	else {
		    		l=q[j];
		    		while(np[l][1]!=-1)
		    			l=np[l][1];
		    		np[l][1]=f;
		    		l=np[l][1];
		    		intercambios++;
		    	}
		    	f=np[f][1];
		    	np[l][0]=arr[i];
		    	np[l][1]=-1;
		    	recorridos++;
		    }
		    for(l=q[i=j=0];i<0x100;i++)
		    	for(l=q[i];l!=-1;l=np[l][1])
		    		arr[j++]=np[l][0];
		    tFin=System.nanoTime();
			double milliseconds = (tFin-tInicio) / 1000000.0;
	 		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
	 		System.out.println("Recorridos: "+recorridos);
	 		System.out.println("Intercambios: "+intercambios);
	 		System.out.println("Comparaciones: "+comparaciones);
	}//OrdenamientoRadix
	
	
	public static void mostarVector(int numeros[]) {
		System.out.println(Arrays.toString(numeros));
	}//metodo mostrarVector
	
}//MetodosOrdenamiento 

public class EjemploMetodosOrdenamiento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		byte menu=0, submenu=0;
		int [] arregloDesordenado1= new int [100];
		int [] arregloDesordenado2= new int [10000];
		int [] arregloDesordenado3= new int [100000];
		int [] arregloDesordenado4= new int [1000000];
		
		Random numeroAleatorio =new Random();
		for(int i=0; i<arregloDesordenado1.length; i++) {
			arregloDesordenado1[i]=numeroAleatorio.nextInt(100);
		}
		for(int i=0; i<arregloDesordenado2.length; i++) {
			arregloDesordenado2[i]=numeroAleatorio.nextInt(100);
		}
		for(int i=0; i<arregloDesordenado3.length; i++) {
			arregloDesordenado3[i]=numeroAleatorio.nextInt(100);
		}
		for(int i=0; i<arregloDesordenado4.length; i++) {
			arregloDesordenado4[i]=numeroAleatorio.nextInt(100);
		}
		
		do {
			System.out.println("------------------Menu------------------");
			System.out.println("1. Ordenamiento Burbuja");
			System.out.println("2. Ordenamiento Seleccion");
			System.out.println("3. Ordenamiento Insercion");
			System.out.println("4. Salir");
			menu=entrada.nextByte();
			switch(menu) {
			case 1:
				int [] copiaVector1=arregloDesordenado1.clone();
				int [] copiaVector4 = arregloDesordenado2.clone();
				int [] copiaVector5 = arregloDesordenado3.clone();
				int [] copiaVector6 = arregloDesordenado4.clone();
				System.out.println("\n==================ORDENAMIENTO CON BURBUJA====================");
				System.out.println("1. Burbuja0");
				System.out.println("2. Burbuja1");
				System.out.println("3. Burbuja2");
				System.out.println("4. Burbuja3");
				submenu=entrada.nextByte();
				switch(submenu) {
				case 1:System.out.println("*********Burbuja0*********");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector1);
				MetodosOrdenamiento.ordenamientoBurbuja0(copiaVector1);
				MetodosOrdenamiento.mostarVector(copiaVector1);
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector4);
				MetodosOrdenamiento.ordenamientoBurbuja0(copiaVector4);
				MetodosOrdenamiento.mostarVector(copiaVector4);
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector5);
				MetodosOrdenamiento.ordenamientoBurbuja0(copiaVector5);
				MetodosOrdenamiento.mostarVector(copiaVector5);
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector6);
				MetodosOrdenamiento.ordenamientoBurbuja0(copiaVector6);
				MetodosOrdenamiento.mostarVector(copiaVector6);
				break;
				case 2:System.out.println("*********Burbuja1*********");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector1);
				MetodosOrdenamiento.ordenamientoBurbuja1(copiaVector1);
				MetodosOrdenamiento.mostarVector(copiaVector1);
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector4);
				MetodosOrdenamiento.ordenamientoBurbuja1(copiaVector4);
				MetodosOrdenamiento.mostarVector(copiaVector4);
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector5);
				MetodosOrdenamiento.ordenamientoBurbuja1(copiaVector5);
				MetodosOrdenamiento.mostarVector(copiaVector5);
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector6);
				MetodosOrdenamiento.ordenamientoBurbuja1(copiaVector6);
				MetodosOrdenamiento.mostarVector(copiaVector6);
				break;
				case 3:System.out.println("*********Burbuja2*********");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector1);
				MetodosOrdenamiento.ordenamientoBurbuja2(copiaVector1);
				MetodosOrdenamiento.mostarVector(copiaVector1);
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector4);
				MetodosOrdenamiento.ordenamientoBurbuja2(copiaVector4);
				MetodosOrdenamiento.mostarVector(copiaVector4);
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector5);
				MetodosOrdenamiento.ordenamientoBurbuja2(copiaVector5);
				MetodosOrdenamiento.mostarVector(copiaVector5);
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector6);
				MetodosOrdenamiento.ordenamientoBurbuja2(copiaVector6);
				MetodosOrdenamiento.mostarVector(copiaVector6);
				break;
				case 4:System.out.println("*********Burbuja3*********");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector1);
				MetodosOrdenamiento.ordenamientoBurbuja3(copiaVector1);
				MetodosOrdenamiento.mostarVector(copiaVector1);
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector4);
				MetodosOrdenamiento.ordenamientoBurbuja3(copiaVector4);
				MetodosOrdenamiento.mostarVector(copiaVector4);
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector5);
				MetodosOrdenamiento.ordenamientoBurbuja3(copiaVector5);
				MetodosOrdenamiento.mostarVector(copiaVector5);
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector6);
				MetodosOrdenamiento.ordenamientoBurbuja3(copiaVector6);
				MetodosOrdenamiento.mostarVector(copiaVector6);
				break;
				default:System.out.println("Opcion incorrecta!!");
				}
				break;
			
			case 2:int [] copiaVector2=arregloDesordenado1.clone();
			int [] copiaVector7=arregloDesordenado2.clone();
			int [] copiaVector8=arregloDesordenado3.clone();
			int [] copiaVector9=arregloDesordenado4.clone();
			System.out.println("\n==================ORDENAMIENTO CON SELECCION====================");
			System.out.println("*************Arreglo con 1,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector2);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector2);
			MetodosOrdenamiento.mostarVector(copiaVector2);
			System.out.println("*************Arreglo con 10,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector7);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector7);
			MetodosOrdenamiento.mostarVector(copiaVector7);
			System.out.println("*************Arreglo con 100,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector8);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector8);
			MetodosOrdenamiento.mostarVector(copiaVector8);
			System.out.println("*************Arreglo con 1,000,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector9);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector9);
			MetodosOrdenamiento.mostarVector(copiaVector9);
			break;
			
			case 3:int [] copiaVector3=arregloDesordenado1.clone();
			int [] copiaVector10=arregloDesordenado2.clone();
			int [] copiaVector11=arregloDesordenado3.clone();
			int [] copiaVector12=arregloDesordenado4.clone();
			System.out.println("\n==================ORDENAMIENTO CON INSERCION====================");
			System.out.println("*************Arreglo con 1,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector3);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector3);
			MetodosOrdenamiento.mostarVector(copiaVector3);
			System.out.println("*************Arreglo con 10,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector10);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector10);
			MetodosOrdenamiento.mostarVector(copiaVector10);
			System.out.println("*************Arreglo con 100,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector11);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector11);
			MetodosOrdenamiento.mostarVector(copiaVector11);
			System.out.println("*************Arreglo con 1,000,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector12);
			MetodosOrdenamiento.ordenamientoPorSeleccion(copiaVector12);
			MetodosOrdenamiento.mostarVector(copiaVector12);
			break;
			
			case 4: break;
			default: System.out.println("Opcion incorrecta!!");
			}
		}while(menu!=4);
		entrada.close();
	}

}
