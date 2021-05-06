
public class BigNumbers {
	public int[] sum(int[] op1, int[] op2) {
		for (int i = 0; i < op1.length/2; i++) {
			int aux = op1[i];
			op1[i] = op1[op1.length -1 - i];
			op1[op1.length - 1 - i] = aux;
		}

		for (int i = 0; i < op2.length/2; i++) {
			int aux = op2[i];
			op2[i] = op2[op2.length - 1 - i];
			op2[op2.length - 1 - i] = aux;
		}

		int[] sum = new int[max(op1, op2)];

		if(op1.length > op2.length) {
			for(int i = 0; i < op2.length; i++) {
				sum[i] += op1[i] + op2[i];
				if(sum[i] > 10) {
					int digit = sum[i];
					sum[i] = sum[i] % 10;
					sum[i+1] = digit /10;
				}
			}
		} else {
			for(int i = 0; i < op1.length; i++) {
				sum[i] = op1[i] + op2[i];
				if(sum[i] > 10) {
					int digit = sum[i];
					sum[i] = sum[i] % 10;
					sum[i+1] = digit /10;
				}
			}

		}
		for (int i = 0; i < sum.length/2; i++) {
			int aux = sum[i];
			sum[i] = sum[sum.length - 1 - i];
			sum[sum.length - 1 - i] = aux;
		}
		return sum;
	}

	public int max(int[] op1, int[] op2) {
		if(op1.length > op2.length) {
			return op2.length;
		}

		return op1.length;

	}

	public static void main(String[] args) {
		System.out.println("Checking input...");

		int[] op1 = {2, 1, 7, 8};
		int[] op2 = {5, 9, 6};

		BigNumbers bn = new BigNumbers();
		int[] rez = bn.sum(op1, op2);
		int[] correct = {2, 7, 7, 4};
		System.out.println(noToString(op1) + " + " + noToString(op2) + 
				" = " + noToString(rez) + " C: " + noToString(correct));
	}

	private static String noToString(int[] no) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < no.length; i++) {
			sb.append(no[i]);
		}
		return sb.toString();
	}
}
