class Solution {
	public static void main(String[] args) {
		int[] a = { 6, 10, 6, 9, 7, 8 };

		Solution ref = new Solution();
		System.out.println("answer: " + ref.solution(a));
	}

	public int solution(int[] A) {
		if (A.length == 0 || A.length == 1) {
			return 0;
		}

		int suma = 0;
		int wynik = 0;

		for (int i = 0; i < A.length; i++) {
			suma=0;
			for (int j = i + 1; j < A.length; j++) {
				if(Math.abs(A[i]-A[j]) <= 1) {
					suma+=1;
				}
				else {
					if(suma>wynik)  {
						wynik = suma;
					}
				}
				//System.out.println("odbliczanie dla: " + A[i] + " jest wynik: " + wynik);
			}
		}

		return wynik+1;
	}
}
