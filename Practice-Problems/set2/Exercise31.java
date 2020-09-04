package set2;

public class Exercise31 {
	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.print("Enter no. of customers : ");
		int n = h.getPosInt();
		CoffeeCustomer[] coffeeCus = new CoffeeCustomer[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter customer name : ");
			String name = h.scan.next();
			System.out.println("Enter customer mobile number : ");
			String mobile = h.scan.next();
			double rating = -1;
			
			while (!(rating >= 0 && rating <= 5 )) {
				System.out.println("Enter a rating between 0 & 5: ");
				rating = h.getDouble();
			}
			
			CoffeeCustomer cc = new CoffeeCustomer(name, mobile, rating);
			coffeeCus[i] = cc;
//			System.out.println(cc.toString());
		}
	}
}
