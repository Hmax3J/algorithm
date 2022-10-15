package level5;

public class Test {
	public long sum(int[] a) {
		long result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Test n = new Test();
		
		int[] a = {2147483647, 1};
		
		System.out.println(n.sum(a));
	}
}