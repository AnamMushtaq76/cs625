class CountToLabd {
	public static void main(String args[]) {
	for(int i = 1; i < 10; i++) {
	System.out.println("\nouter loop pass" + i +",Inner loop:");
	for(int j = 1; j < 10; j++) {
	if(j == 5)
	System.out.println(j);
	}
	}
	}
}