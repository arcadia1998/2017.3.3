
public class Book {

	private String name,isbn,press;
	private float price;
	public Book(String name1,String isbn1,String press1){
		name = name1;
		isbn = isbn1;
		press = press1;
	}
	public void setPrice(float v1){
		if(v1<0){
			System.out.println("Error");
		}else{
			price = v1;
		}
	}
	public float getPrice(){
		return price;
	}
	public static void main(String[] args) {
		String name1[][]={{"213","青文出版","World Teacher"},
				          {"123","角川出版","Sword Art Online"},
				          {"321","青文出版","Re:Zero"}};

	}

}
