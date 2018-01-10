public class UlangDo2
{
	public static void main(String args[]){
	int c=1;
	double f;
	System.out.println("---------------------------");
	System.out.println("Celcius          Fahrenheit");
	System.out.println("---------------------------");
	do
	{
		f=1.8 * c + 32;
	System.out.println("celcius:"+c+"Fahrenheit : " + f);
	c++;
	} while (c<=10);
	System.out.println("---------------------------");
	}
	}
