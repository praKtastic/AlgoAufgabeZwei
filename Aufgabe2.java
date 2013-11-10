package de.ostfalia.algo.aufgabe2;

public class Aufgabe2 implements A2Interface {
	
public int zaehler;

	@Override
	public int binomialkoeffizient_Fakultaet(int n, int k) {
		// TODO Auto-generated method stub
		
		return 0;
		
	}

	@Override
	public int fakultaet(int n) {
		// TODO Auto-generated method stub
		
		
		if(n==0||n==1) return 1;
		else return n*fakultaet(n-1);
		
	
	}

	@Override
	public int binomialkoeffizient_Iterativ(int n, int k) {
		// TODO Auto-generated method stub
		
//		int idee=1;
//		for(int i=1;i<k;i++){
//			idee=idee*(n-1)/(i+1);
//			;
//		
//	
//			
//		}
//		return idee;
		
		
		if (k > n) return 0;
		else {
			int a = 1;
			for (long i = n-k+1; i <= n; i++) a *= i;
			int b = 1;
			for (long i = 2; i <= k; i++) b *= i;
			return a / b;
		}
	}

	@Override
	public int binomialkoeffizient_Rekursiv(int n, int k) {
		// TODO Auto-generated method stub
	
//		if(k==0||k==n)
//			return 1;
//			else 
//				return binomialkoeffizient_Rekursiv(n-1,k-1)+binomialkoeffizient_Rekursiv(n-1, k);
		
//		if(k==1)
//			return n;
//		else if(n>=k&&k==0)
//			return 1;
//		else
//			
//			return (n*binomialkoeffizient_Rekursiv(n-1, k-1)/k);
		zaehler++;
		if(k==0)
		return 1;
		else if (k==n)
			return 1;
		else
			return binomialkoeffizient_Rekursiv(n-1, k-1)+binomialkoeffizient_Rekursiv(n-1, k=1);
		
		
	}

	@Override
	public int binomialkoeffizient_Iterativ2(int n, int k) {
		// TODO Auto-generated method stub
	
		return 1*(fakultaet(n)/fakultaet(k)*fakultaet((n-k)));
		
		
	}

	@Override
	public int getZaehler() {
		// TODO Auto-generated method stub
		
		return zaehler;
	}

}
