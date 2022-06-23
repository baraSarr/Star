package star;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String repeat;
		do {
			
			System.out.print("entrer n: ");
			int n = sc.nextInt();
			if(n==0) {
				System.out.println("Dimensions incorrectes");
			}
			else {
				createStar(n);
			}
			System.out.print("Voulez-vous entrer une autre valeur?[y/n] ");
			repeat = sc.next();
		}
		while(repeat.equalsIgnoreCase("y"));
		sc.close();
		
	}

	public static void createStar(int n) {
		top(n);
		sides(n);
		middle(n);
		sides(n);
		bottom(n);
	}
	
	private static void top(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=5*n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private static void sides(int n) {
		for(int i=1;i<=2*n;i++) {
			System.out.print("* ");
		}
		for(int i=0;i<=2*n;i++) {
			System.out.print(" ");
		}
		for(int i=1;i<=2*n;i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	private static void middle(int n) {
		//top 
		 for (int i=1; i<=n; i++)
	        {
			 //left
	            for (int j = 1; j <= i; j++)
	            {
	            	if(j==i) {
	            		System.out.print("* ");
	            	}
	            	else {
	            		System.out.print("  ");
	            	}
	            }
	            //space between
	            for (int k = i*2; k <= n*5-1; k++)
	            {
	                System.out.print("  ");
	            }
	            //right
	            for (int l = 1; l <= i; l++)
	            {
	            	if(l==1) {
	            		System.out.print("* ");
	            	}
	            	else {
	            		System.out.print("  ");
	            	}
	            }
	            System.out.println();
	        }
	        
	        for (int i=1; i<=n-1; i++)
	        {
	            for (int j = n-1; j >= i; j--)
	            {
	            	if(j==i) {
	            		System.out.print("* ");
	            	}
	            	else {
	            		System.out.print("  ");
	            	}
	            }
	            for (int p = 1; p <= i*2; p++)
	            {
	                System.out.print(" ");
	                
	            }
	            for (int p = 1; p <= 6*n; p++)
	            {
	                System.out.print(" ");
	                
	            }
	            for (int k = 1; k <= i; k++)
	            {
	                System.out.print("  ");
	            }
	            for (int l = 1; l < n; l++)
	            {
	            	if(l==1) {
	            		System.out.print("* ");
	            	}
	            	else {
	            		System.out.print("  ");
	            	}
	            }
	            
	            System.out.println();
	        }
	}

	private static void bottom(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=3*n+4;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
				if(j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=i;j<=n;j++) {
				if(j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
