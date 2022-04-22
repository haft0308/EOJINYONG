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
		family[0].name = "강아지";
		action.action(family[0]);
		//((Dog)family[0]).run(); 
		//밑에 action함수 안에 *(처음배움)instanceof 명령어를 써서 패러미터 안에 Dog,Cat타입이 오면
		//Dog가 가지고 있는 run, Cat이 가지고 있는 grooming 함수를 불러오게 만들었다.
		family[1].name = "고양이";
		action.action(family[1]);
		//((Cat)family[1]).grooming();
		
	}

}
class Animal
{
	protected String name;
	
	public void cry()
	{
		System.out.println(this.name+"가 울음소리를 낸다.");
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
		System.out.println("멍멍");
	}
	
	public void run()
	{
		System.out.println(name + "가 뛴다.");
	}
}

class Cat extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("야옹");
	}
	
	public void grooming()
	{
		System.out.println(name + "가 그루밍한다.");
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