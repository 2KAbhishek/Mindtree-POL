package set2;

public class RetailStore {

	public static void main(String[] args) {
		int[] ids = {5001,5002,5003,5004,5005};
		int[] prices = {10,20,30,40,50};
		int searchId = 5001;
		int searchPrice = 0;
		int foundAt = search(ids,searchId);
//		int foundAt = search(ids,5006);
		
		if (foundAt != -1) {
			searchPrice = prices[foundAt];
			int quantity = 2;
			int amount = searchPrice * quantity;
			System.out.printf(" Purchase details :\n Bill ID : 001 \n Customer ID : 1\n Purchase ID : 001\n Quantity : %d \n Discount : 0 \n Bill : %d",quantity,amount);
		}
		else System.out.println("Item not found");
	}

	private static int search(int[] ids, int searchId) {
		int foundAt = -1;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == searchId) {
				foundAt = i;
				break;
			}
		}
		return foundAt;
	}

}
