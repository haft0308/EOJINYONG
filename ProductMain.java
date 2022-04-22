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
		//product �迭Ÿ���� ��ü p�� productŸ���� 3���� �迭�� ���� �ְ�
		//���⼭ product 0,1,2�� ���� tvŸ�� computerŸ�� audio Ÿ������ ��ĳ������ �Ѵ�.
		//�� p[0]�� tvŬ������ �����ڸ� ȣ���ϴ� �迭�̰�
		//�� p[1]�� computerŬ������ �����ڸ� ȣ���ϴ� �迭�̰�
		//�� p[2]�� audioŬ������ �����ڸ� ȣ���ϴ� �迭�̴�
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
		
	
		
		
		//���� ������ ���δٸ� Ÿ���� �迭�� for���� �̿��Ͽ� �� ������ ������ 
		//buyerŸ���� ��ü b �ȿ� Ŭ���� void buy�Լ� �ȿ� p�� ������ �迭�� �־��
		//buy�Լ��� �з����� product p = p[i]�� ���� �ȴ�
		//buy�Լ��� Ǯ���
		//money = money - p.money(p�� money �̰� �̰� ������ �ڽ�Ŭ������ ��ӹ����ű� ������
		//computer, audio, tv������ ��밡���ϴ�.
		//�� p.money �� ������ �ڽ�Ŭ�������� ������ �ְ�
		//
	}

}
class Product
{
	int price;
	int bonuspoint;
	
	Product()
	{
		System.out.println("��ĳ���õǱ���");
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
		System.out.println("��ĳ���õ� ��");
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