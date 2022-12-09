package polymorphismassignment;

public class Kids {
	void readBook()
	{
		System.out.println("kids reading a book");
	}
	void readBook(String novel,String grammer )
	{
		System.out.println("kids reading:"+(novel+grammer));
	}
	public static void main(String[] args) {
		Kids k=new Kids();
		k.readBook();
		k.readBook("novel", "grammer");

	}

}
