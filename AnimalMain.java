package polymorphism;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal [] family = new Animal[2];
		
		for(int i = 0; i < 2; i++)
		{
			if (i == 0)
			{
				family[i] = new Dog();
			}
			else
			{
				family[i] = new Cat();
			}
		}
		System.out.println(family[0]);
		System.out.println(family[1]);
		
		AnimalAction action = new AnimalAction();
		family[0].name = "������";
		action.action(family[0]);
		//((Dog)family[0]).run(); 
		//�ؿ� action�Լ� �ȿ� *(ó�����)instanceof ��ɾ �Ἥ �з����� �ȿ� Dog,CatŸ���� ����
		//Dog�� ������ �ִ� run, Cat�� ������ �ִ� grooming �Լ��� �ҷ����� �������.
		family[1].name = "�����";
		action.action(family[1]);
		//((Cat)family[1]).grooming();
		
	}

}
class Animal
{
	protected String name;
	
	public void cry()
	{
		System.out.println(this.name+"�� �����Ҹ��� ����.");
	}
	Animal()
	{
		
	}
}

class Dog extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("�۸�");
	}
	
	public void run()
	{
		System.out.println(name + "�� �ڴ�.");
	}
}

class Cat extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("�߿�");
	}
	
	public void grooming()
	{
		System.out.println(name + "�� �׷���Ѵ�.");
	}
}

class AnimalAction
{
	void action(Animal animal)
	{
		animal.cry();
		if(animal instanceof Dog)
		{
			((Dog)animal).run();
		}
		else if (animal instanceof Cat)
		{
			((Cat)animal).grooming();
		}
	
	}
	
}