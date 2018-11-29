import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	
	public static void mostarVector(int numeros[]) {
		System.out.println(Arrays.toString(numeros));
	}//metodo mostrarVector
	
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
	
	public static void ordenamientoIntercalacion(){
		File archivo1=new File("./src/Archivo1.txt");
		File archivo2=new File("./src/Archivo2.txt");
		
		FileReader frA1=null;
		BufferedReader brA1;
		FileReader frA2=null;
		BufferedReader brA2;
		
		FileWriter archivo3=null;
		PrintWriter pr=null;
		
		try {//Apertura del archivo para escritura
			archivo3=new FileWriter("./src/ArchivoSalida.txt",false);
			pr=new PrintWriter(archivo3);
			
			try {//Apertura del archivo1 para lectura
				frA1=new FileReader(archivo1);
				brA1=new BufferedReader(frA1);
				String lineaArchivo1;
				
				try {//Apertura del archivo2 para lectura
					frA2=new FileReader(archivo2);
					brA2=new BufferedReader(frA2);
					String lineaArchivo2;
					boolean repetir=true;
					
					lineaArchivo1=brA1.readLine();
					lineaArchivo2=brA2.readLine();
					
					do {//Se realizan comparaciones mientras la bandera no cambie
						if(Integer.parseInt(lineaArchivo1)<Integer.parseInt(lineaArchivo2)) {
							pr.println(lineaArchivo1);
							if((lineaArchivo1=brA1.readLine())==null) {
								pr.println(lineaArchivo2);
								while((lineaArchivo2=brA2.readLine())!=null) {
									pr.println(lineaArchivo1);
								}
								repetir=false;
							}
						}
						else if (Integer.parseInt(lineaArchivo1)>Integer.parseInt(lineaArchivo2)) {
							pr.println(lineaArchivo2);
							if((lineaArchivo2=brA2.readLine())==null) {
								pr.println(lineaArchivo1);
								while ((lineaArchivo1=brA1.readLine())!=null) {
									pr.println(lineaArchivo1);
								}
								repetir=false;
							}
						}
						else {
							pr.println(lineaArchivo1);
							pr.println(lineaArchivo2);
							if((lineaArchivo1=brA1.readLine())==null){
								pr.println(lineaArchivo2);
								while((lineaArchivo2=brA2.readLine())!=null) {
									pr.println(lineaArchivo2);
								}
								repetir=false;
							}
							if((lineaArchivo2=brA2.readLine())==null) {
								pr.println(lineaArchivo1);
								while((lineaArchivo1=brA1.readLine())!=null) {
									pr.println(lineaArchivo1);
								}
								repetir=false;
							}
						}
					}while(repetir);
				}catch (FileNotFoundException e) {
					System.out.println("Error al abrir el archivo");
					//e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						frA2.close();
					}catch(IOException e) {
						System.out.println("Error al cerrar el archivo");
					}
				}//Final del archivo2
			}catch (FileNotFoundException e) {
				System.out.println("Error al abrir el archivo");
				//e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					frA1.close();
				}catch (IOException e) {
					System.out.println("Error al cerrar el archivo");
				}
			}//Final del archivo1
			System.out.println("Archivos combinados y ordenados correctamente");
		}catch (IOException e ) {
			System.out.println("Error al abrir o crear el archivo");
		}finally {
			try {
				archivo3.close();
			}catch(IOException e) {
				System.out.println("Error al cerrar el archivo");
			}
		} //Final del archivo3
	}//Intercalacion de archivos
	public static void mergeSort(Integer[]array, int lo, int n) {
		int low = lo;
		int high = n;
		if(low>=high) {
			return;
		}
		int middle =(low+high)/2;
		mergeSort(array,low,middle);
		mergeSort(array,middle+1,high);
		int end_low=middle;
		int start_high=middle+1;
		while ((lo<=end_low) && (start_high<=high)) {
			if(array[low]<array[start_high]) {
				low++;
			}else {
				int Temp=array[start_high];
				for(int k=start_high-1;k>=low;k--) {
					array[k+1]=array[k];
				}
				array[low]=Temp;
				low++;
				end_low++;
				start_high++;
			}
		}
	}//Mezcla Directa
	public static Integer[] lectura() {
		File archivo1=new File("./src/Archivo3.txt");
		FileReader frA1=null;
		BufferedReader brA1;
		Integer[] arr1=new Integer[0];
		
		try { //Se lee el archivo
			frA1=new FileReader(archivo1);
			brA1=new BufferedReader(frA1);
			String lineaArchivo1;
			try {
				lineaArchivo1 = brA1.readLine();
				String [] numeros= lineaArchivo1.split(",");
				arr1=new Integer[numeros.length];
				for(int i=0; i<=numeros.length-1; i++) {
					 Integer intObj = new Integer(numeros[i]);
					 arr1[i]=intObj;
				 }
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el archivo");
			e.printStackTrace();
		}try {
			frA1.close();
		}catch(IOException e) {
			System.out.println("Error al cerrar el archivo");
		}
		return arr1;
	}
private static Comparable[] aux;
   public static void ordenamientoMezclaNatural(Comparable[] a) { //Originalmente es el                                                  
    aux = new Comparable[a.length];                              // que se manda a llamar
	  ordenamientoMezclaNatural(a, 0, a.length - 1);
	  mostrar(a);
	  }
	 public static boolean estaOrdenado(Comparable[] a) { //Para ver si el arreglo ya esta ordenado
	   for (int i = 1; i < a.length; i += 1) {
	     if (a[i - 1].compareTo(a[i]) > 0) {
	      return false;
	    }
	  }
	  return true;
	}
	//Se sobrecarga el metodo con diferentes parametros
	private static void ordenamientoMezclaNatural(Comparable[] a, int primero, int ultimo) { 
	  int i = primero;
	  int j = 0;
	  int medio = 0;
	  int az = 0;
	  while (true) {
	   i = 0;
	    while (i < a.length) {
	     if (i == a.length - 1) {
	       break;
	      } else if (a[i].compareTo(a[i + 1]) > 0) {
	       break;
	      }
	      i++;
	    }
	    j = i + 1;
	    while (j < a.length) {
	    if (j == a.length - 1) {
	      break;
	    } else if (a[j].compareTo(a[j + 1]) > 0) {
	      break;
	      }
	    j++;
	    }
	 //      medio = primero + (j - primero) / 2;
	  Mezcla(a, primero, i, j);
	  primero = 0;

	  if (estaOrdenado(a)) {
	    break;
	  }
	 }
	}
	public static void Mezcla(Comparable[] a, int primero, int medio, int ultimo) {
	int i = primero;
	int j = medio + 1;
	for (int k = primero; k <= ultimo; k++) {
	  aux[k] = a[k];
	}
	for (int k = primero; k <= ultimo; k++) {
	  if (i > medio) {
	    a[k] = aux[j++];
	  } else if (j > ultimo) {
	    a[k] = aux[i++];
	  } else if (aux[i].compareTo(aux[j]) > 0) {
	    a[k] = aux[j++];
	  } else {
	    a[k] = aux[i++];
	  }
	 }
	 }
	  public static void mostrar(Comparable[] a) {
	   for (int i = 0; i < a.length; i++) {
	    System.out.print(a[i] + " ");
	   }
	  }	
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
		//PRUEBAS
		do {
			System.out.println("------------------Menu------------------");
			System.out.println("1. Ordenamiento Burbuja");
			System.out.println("2. Ordenamiento Seleccion");
			System.out.println("3. Ordenamiento Insercion");
			System.out.println("4. Ordenamiento Shellshort");
			System.out.println("5. Ordenamiento Quicksort");
			System.out.println("6. Ordenamiento Radixsort");
			System.out.println("********* Ordenamiento externo *********");
			System.out.println("7. Intercalacion de archivos");
			System.out.println("8. Mezcla Directa");
			System.out.println("9. Mezcla Natural");
			System.out.println("10. Salir");
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
			MetodosOrdenamiento.insercionDirecta(copiaVector3);
			MetodosOrdenamiento.mostarVector(copiaVector3);
			System.out.println("*************Arreglo con 10,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector10);
			MetodosOrdenamiento.insercionDirecta(copiaVector10);
			MetodosOrdenamiento.mostarVector(copiaVector10);
			System.out.println("*************Arreglo con 100,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector11);
			MetodosOrdenamiento.insercionDirecta(copiaVector11);
			MetodosOrdenamiento.mostarVector(copiaVector11);
			System.out.println("*************Arreglo con 1,000,000 datos************");
			System.out.print("Vector original: ");
			MetodosOrdenamiento.mostarVector(copiaVector12);
			MetodosOrdenamiento.insercionDirecta(copiaVector12);
			MetodosOrdenamiento.mostarVector(copiaVector12);
			break;
			
			case 4: 
				int [] copiaVector13=arregloDesordenado1.clone();
				int [] copiaVector14=arregloDesordenado2.clone();
				int [] copiaVector15=arregloDesordenado3.clone();
				int [] copiaVector16=arregloDesordenado4.clone();
				System.out.println("\n==================ORDENAMIENTO CON SHELLSORT====================");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector13);
				MetodosOrdenamiento.ordenamientoShellsort(copiaVector13);
				MetodosOrdenamiento.mostarVector(copiaVector13);
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector14);
				MetodosOrdenamiento.ordenamientoShellsort(copiaVector14);
				MetodosOrdenamiento.mostarVector(copiaVector14);
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector15);
				MetodosOrdenamiento.ordenamientoShellsort(copiaVector15);
				MetodosOrdenamiento.mostarVector(copiaVector15);
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector16);
				MetodosOrdenamiento.ordenamientoShellsort(copiaVector16);
				MetodosOrdenamiento.mostarVector(copiaVector16);			
			break;
			
			case 5: 
				int [] copiaVector17=arregloDesordenado1.clone();
				int [] copiaVector18=arregloDesordenado2.clone();
				int [] copiaVector19=arregloDesordenado3.clone();
				int [] copiaVector20=arregloDesordenado4.clone();
				System.out.println("\n==================ORDENAMIENTO QUICKSORT====================");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector17);
				long tInicio=System.nanoTime();
				MetodosOrdenamiento.ordenamientoQuickSort(copiaVector17,0,copiaVector17.length-1);
				long tFin=System.nanoTime();
				double milliseconds = (tFin-tInicio) / 1000000.0;
		 		System.out.println("-----Tiempo de procesamineto: "+(milliseconds));
				MetodosOrdenamiento.mostarVector(copiaVector17);
				tInicio=tFin=0;
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector18);
				tInicio=System.nanoTime();
				MetodosOrdenamiento.ordenamientoQuickSort(copiaVector18,0, copiaVector18.length-1);
				tFin=System.nanoTime();
				milliseconds = (tFin-tInicio) / 1000000.0;
				MetodosOrdenamiento.mostarVector(copiaVector18);
				tInicio=tFin=0;
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector19);
				tInicio=System.nanoTime();
				MetodosOrdenamiento.ordenamientoQuickSort(copiaVector19,0, copiaVector19.length-1);
				tFin=System.nanoTime();
				milliseconds = (tFin-tInicio) / 1000000.0;
				MetodosOrdenamiento.mostarVector(copiaVector19);
				tInicio=tFin=0;
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector20);
				tInicio=System.nanoTime();
				MetodosOrdenamiento.ordenamientoQuickSort(copiaVector20, 0, copiaVector20.length-1);
				tFin=System.nanoTime();
				milliseconds = (tFin-tInicio) / 1000000.0;
				MetodosOrdenamiento.mostarVector(copiaVector20);
				tInicio=tFin=0;
				break;
				
			case 6:
				int [] copiaVector21=arregloDesordenado1.clone();
				int [] copiaVector22=arregloDesordenado2.clone();
				int [] copiaVector23=arregloDesordenado3.clone();
				int [] copiaVector24=arregloDesordenado4.clone();
				System.out.println("\n==================ORDENAMIENTO RADIXSORT====================");
				System.out.println("*************Arreglo con 1,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector21);
				MetodosOrdenamiento.ordenamientoRadixSort(copiaVector21);
				MetodosOrdenamiento.mostarVector(copiaVector21);
				System.out.println("*************Arreglo con 10,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector22);
				MetodosOrdenamiento.ordenamientoRadixSort(copiaVector22);
				MetodosOrdenamiento.mostarVector(copiaVector22);
				System.out.println("*************Arreglo con 100,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector23);
				MetodosOrdenamiento.ordenamientoRadixSort(copiaVector23);
				MetodosOrdenamiento.mostarVector(copiaVector23);
				System.out.println("*************Arreglo con 1,000,000 datos************");
				System.out.print("Vector original: ");
				MetodosOrdenamiento.mostarVector(copiaVector24);
				MetodosOrdenamiento.ordenamientoRadixSort(copiaVector24);
				MetodosOrdenamiento.mostarVector(copiaVector24);
				break;
			case 7:
				System.out.println("\n==================ORDENAMIENTO EXTERNO INTERCALACIÓN====================");
			    MetodosOrdenamiento.ordenamientoIntercalacion();
			    break;
			case 8:
				System.out.println("\n==================MEZCLA DIRECTA====================");
				try {
					BufferedReader br = new BufferedReader(new FileReader("./src/task.txt"));
					List <Integer> lines = new ArrayList <Integer>();
					String line;
					while ((line=br.readLine())!=null) {
						lines.add(Integer.parseInt(line));
					}
					br.close();
					Integer[] inputArray = lines.toArray(new Integer[lines.size()]);
					MetodosOrdenamiento.mergeSort(inputArray, 0, inputArray.length-1);
					for(Integer i : inputArray) {
						System.out.println(i);
					}
				}catch (IOException ie) {
					System.out.println(ie.getMessage());
				}break;
			case 10:break;
			default: System.out.println("Opcion incorrecta!!");
			}
		}while(menu!=10);
		entrada.close();
	}

}
