package polymorphism;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Buyer b2 = new Buyer();
		System.out.println();
		Product [] p = new Product[3];
		p[0] = new Tv();
		p[1] = new Computer();
		p[2] = new Audio();
		//product 배열타입의 객체 p는 product타입의 3개의 배열을 갖고 있고
		//여기서 product 0,1,2는 각각 tv타입 computer타입 audio 타입으로 업캐스팅을 한다.
		//즉 p[0]은 tv클래스의 생성자를 호출하는 배열이고
		//즉 p[1]은 computer클래스의 생성자를 호출하는 배열이고
		//즉 p[2]은 audio클래스의 생성자를 호출하는 배열이다
		Product p1 = new Tv();
		((Tv)p1).volume =10;
		
		Tv t11 = (Tv)p1;
		t11.volume = 11;
		
		Product p2 = new Computer();
		((Computer)p2).ram = 12;
		
		Computer c11 = (Computer)p2;
		c11.price = 10000;
		
		for (int i = 0; i < 3; i ++)
		{
			b.buy(p[i]);
			b.print();
		}
		
		System.out.println("----------------------------");
		
		Product [] p3 = new Product[4];
		
		for (int i = 0; i < 4; i++)
		{
			if(i <2)
			{
				p3[i] = new Tv();
			}
			else if(i >=2&&i<3)
			{
				p3[i] = new Computer();
			}
			else
			{
				p3[i] = new Audio();
			}
		}
		for(int i = 0; i < 4; i++)
		{
			b2.buy(p3[i]);
			b2.print();
		}
		System.out.println("------------------");
		((Product)p3[0]).price = 10000;
		
		System.out.println(p3[0].price);
		System.out.println(p3[0]);
		
	
		
		
		//위의 각각의 서로다른 타입의 배열을 for문을 이용하여 맨 위에서 설정한 
		//buyer타입의 객체 b 안에 클래스 void buy함수 안에 p의 각각의 배열을 넣어보면
		//buy함수의 패러미터 product p = p[i]로 들어가게 된다
		//buy함수를 풀어보면
		//money = money - p.money(p의 money 이고 이건 각각의 자식클래스가 상속받은거기 때문에
		//computer, audio, tv에서도 사용가능하다.
		//즉 p.money 는 각각의 자식클래스에서 받을수 있고
		//
	}

}
class Product
{
	int price;
	int bonuspoint;
	
	Product()
	{
		System.out.println("업캐스팅되기전");
	}
	
}

class Tv extends Product
{
	int channel;
	int volume;
	Tv()
	{
		price = 100;
		bonuspoint = 100;
	}
}

class Computer extends Product
{
	int cpu;
	int ram;
	Computer()
	{
		price = 200;
		bonuspoint=200;
		System.out.println("업캐스팅된 후");
	}
}

class Audio extends Product
{
	int volume;
	int speaker;
	
	Audio()
	{
		price = 50;
		bonuspoint =50;
	}
	
	
}



class Buyer
{
	int money;
	int bonuspoint;
	
	Buyer()
	{
		this.money = 10000;
		this.bonuspoint = 0;
	}
	
	void buy(Product p)
	{
		money = money - p.price;
		bonuspoint = bonuspoint +p.bonuspoint;
	}
	void print()
	{
		System.out.println("money = "+money);
		System.out.println("bonuspoint = "+bonuspoint);
	}
}