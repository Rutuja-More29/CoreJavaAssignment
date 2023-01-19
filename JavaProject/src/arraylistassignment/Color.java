package arraylistassignment;
import java.util.ArrayList;
public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<>();
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		color.add("Blue");
		color.add("orange");
		color.add("Black");
		color.add("grey");
		for(String s:color)
		{
			System.out.print(s+" ");
		}
		
	}

}
