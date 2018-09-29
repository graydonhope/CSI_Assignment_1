public class BitShift{
	public static void main(String[] args){
		//System.out.println(Integer.toBinaryString(9));
		//System.out.println(Integer.toBinaryString(9 >> 1));

		Integer b = 31;
		String bLength = Integer.toBinaryString(b);
		int length = bLength.length();
		System.out.println("length: " + length);
		int a = 0;
		while(b>0){
			System.out.println(Integer.toBinaryString(b));
			b = b>>1;
			a++;
		}
		System.out.println("Iterations: " + a);
	}


	//Preconditon: x >= y >= 0
	public void bitShiftsExecuted(int x, int y){
		//After you convert y to a binary string, it takes the length of y times of bit shifting to guarentee a 0 value
	}
}