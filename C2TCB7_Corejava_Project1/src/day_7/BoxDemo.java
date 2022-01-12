package day_7;

class Box{
	float height;
	float width;
	float length;
	
	float calcVol() {
		return width*height*length;
		
	}
}

public class BoxDemo {
	

	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.height=2.5f;
		box1.width=1.5f;
		box1.length=2.0f;
		
		float vol=box1.calcVol();
		System.out.println("Volume of box1: "+vol);
		
		Box box2=new Box();
		box2.height=3.5f;
		box2.width=2.5f;
		box2.length=1.5f;
		
		vol=box2.calcVol();
		System.out.println("Volume of box2: "+vol);

	}

}
