package arraylistcodes;
import java.util.ArrayList;
public class MovieTTheaterMain {

	public static void main(String[] args) {
		ArrayList<Theater>thr=new ArrayList<>();
		MovieTTheaterOperation mtto=new MovieTTheaterOperation();
			mtto.setArrayList(thr);
			
			mtto.Display(thr);
			mtto.removeMovie(thr);

	}

}
