package week2;

import week3.Rect;

public class Test14 {

	public static void main(String[] args) {
		//���뼺
		Rect usa = new Rect();
		
		usa.input();
		int a = usa.area();
		int l = usa.length();
		
		usa.print(a, l);
	}

}
