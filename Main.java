
package pkg1;


import java.util.Scanner;

public class Main {
public int angka;
public int x;


	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkanpa angka = ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
			System.out.print(fibonaci(i) + "  ");
		
	}

	private static int fibonaci(int z)
	{
            int f;
		if(z==1 || z==2){
			f=1;
                }
                else{
			f = fibonaci(z-1) + fibonaci(z-2);
                }
		return f;
	}
    
}



