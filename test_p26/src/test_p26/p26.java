package test_p26;


public class p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();

		car1.show();
		
	}

}

class Car
{
	private int num;
	private double gas;
	public Car() 
	{
		num = 0;
		gas = 0.0;
		System.out.println("產生了車子" ); 
	}
	public void show()
	{
		System.out.println("車號是" + num ); 
		System.out.println("汽油量是" + gas ); 
	}
}
