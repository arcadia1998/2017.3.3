
public class cw1 {

	public static void main(String[] args) {
		Staff s1 = new Staff("Tony","0101");
		s1.setGender('m');
		s1.setHeight(171.6f);
		s1.setWeight(68.9f);
		System.out.println(s1.getName());
		System.out.println(s1.getID());
		System.out.println(s1.getGender());
		System.out.println(s1.getHeight());
		System.out.println(s1.getWeight());
	}

}
