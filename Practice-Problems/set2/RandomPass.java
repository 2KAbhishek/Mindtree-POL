package set2;

public class RandomPass {

	public static void main(String[] args) {
		Helper h = new Helper();
		System.out.println("Enter customer name : ");
		String name = h.scan.nextLine();
		System.out.println("Enter customer age : ");
		int age = h.getPosInt();
		System.out.println("Enter customer id : ");
		int id = h.getPosInt();
		System.out.println(genPass(name,age,id));
	}

	static String genPass(String name, int age, int id) {
		String pass = "";
		pass += age*id;
		int factor = id % age;
		for (int i = 0; i < name.length(); i+=2) {
			pass += (char)(name.charAt(i) + name.length() - i);
		}
		pass += factor * name.charAt(0);
		pass += factor*age;
		return pass;
	}

}
