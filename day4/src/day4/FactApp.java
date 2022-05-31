package day4;

public class FactApp {

	public static void main(String[] args) {
		int n=10;
		int ans=factorial(n);
		System.out.println(ans);
		System.out.println(factorial1(n));

	}
	static int factorial(int n) {
		int result=1;
		for(int i=0;i<n;i++) {
			result*=n-i;
		}
		return result;
	}
	//recursive(再帰処理)
	static int factorial1(int n) {
		if(n==1) {
			return n;
		}
		return n*factorial1(n-1);
	}

}
