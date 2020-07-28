package set1;

public class Table {

	public static void main(String[] args) {
		int num = Helper.getPosInt();
		
		for (int i = 1; i <= 12; i+=1) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
