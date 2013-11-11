package de.ostfalia.algo.aufgabe2;

public class Aufgabe2 implements A2Interface {

	public int zaehler = 0;

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	@Override
	public int binomialkoeffizient_Fakultaet(int n, int k) {
		// TODO Auto-generated method stub
		
		return 1*((fakultaet(n)/(fakultaet(n-k)*fakultaet(k))));
		
	}

	@Override
	public int fakultaet(int n) {
		// TODO Auto-generated method stub

		if (n == 0 || n == 1)
			return 1;
		else
			return n * fakultaet(n - 1);

	}

	@Override
	public int binomialkoeffizient_Iterativ(int n, int k) {
		// TODO Auto-generated method stub

		if (k > n)
			return 0;
		else {

			int a = 1;
			for (int i = n - k + 1; i <= n; i++)
				a *= i;
			int b = 1;
			for (int i = 2; i <= k; i++)
				b *= i;
			return a / b;
		}
	}

	@Override
	public int binomialkoeffizient_Rekursiv(int n, int k) {
		// TODO Auto-generated method stub

		this.zaehler += 1;
		int koeffizient = 0;
		if (0 <= k && k <= n) {
			if (k == 0 || k == n) {
				koeffizient = 1;
			} else {
				if (n >= 1 && (1 <= k && k < n)) {
					koeffizient = binomialkoeffizient_Rekursiv(n - 1, k - 1)
							+ binomialkoeffizient_Rekursiv(n - 1, k);
				}
			}
		}
		return koeffizient;
	}

	@Override
	public int binomialkoeffizient_Iterativ2(int n, int k) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getZaehler() {
		// TODO Auto-generated method stub
		return zaehler;
	}

}
