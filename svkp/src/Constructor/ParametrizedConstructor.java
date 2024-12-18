package Constructor;
class Myclass2
{
	String color;
	int cost;
	String brand;
	
	
	//Parameterized  constructor
	Myclass2(String color, int cost ,String brand)
	{
		this.color=color;
		this.cost=cost;
		this.brand=brand;
	}
}

public class ParametrizedConstructor {
	
	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("Yellow",2338372,"AUDI");
		Myclass2 obj1=new Myclass2("GREY",2000000,"Bmw");
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
		System.out.println(obj1.color + " "+ obj1.cost+ " " +obj1.brand);

	}

}

