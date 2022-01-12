package day_16;

class Bank
{
	float getRateOfInterest()
	{
		return 6.7f;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 7.0f;// Method Overriding
	}
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 6.8f;// Method Overriding
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;// Method Overriding
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj1=new SBI(); //Dynamic binding
		System.out.println(obj1.getRateOfInterest());
	}


}
