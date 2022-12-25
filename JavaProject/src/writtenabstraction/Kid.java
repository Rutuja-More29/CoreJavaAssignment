package writtenabstraction;

public class Kid {
	void readBook()
	{
		System.out.println("Kid read a Book");
	}
}
class Teenager extends Kid{
	void readBook(String book)
	{
		System.out.println("Teenager read:"+book);
	}
}