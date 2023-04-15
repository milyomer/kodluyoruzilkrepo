
public class OrtArray {

	public static void main(String[] args) {
		int[] ortalama = new int[] { 5, 8, 9, 62, 75, 32, 14, 65 };
		double sum=0;
		for(int i: ortalama) {
			sum+=i;
		}
		System.out.print(sum/ortalama.length);
	}
}
