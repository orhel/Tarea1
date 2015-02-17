public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		return false;
	}
	
	//devuelve "gratis" si lempiras es igual a 0
	//devuelve "barato" si lempiras es menor que 100
	//devuelve "normal" si lempiras es menor que 200
	//de lo contrario devuelve caro
	//nota: solo aceptan minusculas
	static String obtenerPrecio(int lempiras)
	{
		if(lempiras==0) return "gratis"; //Cuando lempiras es 0
		else if(lempiras<100) return "barato";//cuando lempiras es menor que 100
		else if(lempiras<200) return "normal";//cuando lempiras es menor que 200
		return "caro";//cuando lempiras es mayor que 200
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{
		if(num==1)return 1;//cuando numero sea 1, devuelve 1
        else num=num*factorial(num-1);//cuando numero es mayor que 1
        return num;
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];//devuelve la posicion indicada
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];//devuelve la posicion indicada
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;//devuelve el atributo x
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if(num==1) return 1;//devuelve 1 si el numero es 1
		else if (num==0) return 0;//devuelve 0 si el numero es 0
		return fibonacci(num-1) + fibonacci(num-2);//formula para el fibonacci de los numeros mayores que 1
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 1 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0) return 1;//si numero es 0 devuelve 1
		else if(num==1) return 2;//si numero es igual a 1 devuelve 2
		return funcionRecursiva(num-1)*2+1;//formula de la funcion recursiva
	}
	
	public static void main(String[] args)
	{

	}

}
