package TemplatePattern;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		Play play1 = new Basketball();
		Play play2 = new Football();
		
		play1.play();
		
		System.out.println();
		
		play2.play();
	}
}
