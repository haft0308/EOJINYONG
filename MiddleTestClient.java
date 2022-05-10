package homeWork;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class MiddleTestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Client> client = new ArrayList<>();
		ClientMenu cc =new ClientMenu();
		cc.MenuProcess(client);
				
	}

}
class Client
{
	private String name;
	private String info;
	private int money;
	
	Client()
	{
		
	}
	Client(String name,String info,int money)
	{
		this.name = name;
		this.info = info;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[�̸� : "+name+"/ ���� : " 
				+ info +"/ �����ܾ� : " + money+"]";
	}
	
	
}

class ClientMenu
{
	Scanner sc = new Scanner(System.in);
	//���޴� �����
	//1 �� �߰�
	//2 �� �˻�
	//3 �� ����
	//4 �� ����
	//5 �� ��ü�˻�
	//6 �� ��ü����
	//7 ����.
	Client insert()
	{
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		String info = sc.next();
		System.out.print("�ܾ� : ");
		int money = sc.nextInt();
		return new Client(name, info, money);
	}
	int search(ArrayList<Client> client)
	{
		
		int idx = -1;
		Client c = new Client();
		c=null;
		String name1 = sc.next();
		
		for(int i = 0; i<client.size(); i++)
		{
			c = client.get(i);
			
			if(c.getName().equals(name1))
			{
				idx = i;
				
				break;
			}
		}
		if(idx == -1 ) 
		{
			System.out.println("�˻������ �����ϴ�.");
		}
		else
		{
			System.out.println("�˻���� :"+ c);
		}
		return idx;
		
	}
	void update(ArrayList<Client> client)
	{
		int index = search(client);
		Client c = client.get(index);
		String a = c.getInfo();
		int b = c.getMoney();
		System.out.println("������ ������ �Է��ϼ���.");
		String info = sc.next();
		System.out.println("������ �ܾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		c.setInfo(info);
		c.setMoney(money);
		System.out.println("�̷��� ����Ǿ����ϴ�.");
		System.out.println(a+"�� �̷��� ���߽��ϴ�. : "+c.getInfo());
		System.out.println(b+"�� �̷��� ���߽��ϴ�. : "+c.getMoney());
	}
	void delete(ArrayList<Client> client)
	{
		int index = search(client);
		Client c = client.get(index);
		String d = c.toString();
		
		client.remove(index); 
		System.out.println(d+"�� �����Ǿ����ϴ�.");
		
	}
	void allsearch(Iterator <Client> iter)
	{
		while(iter.hasNext())
	    {
	    	System.out.println(iter.next());
	    }
	}
	void alldelete(ArrayList<Client> client)
	{
		
		client.removeAll(client);
		System.out.println("��� �����Ǿ����ϴ�.");
	}
	
	
	void MenuProcess(ArrayList<Client> client)
	{
		
		int menu;
		boolean flag = false;
		
		while(flag == false)
		{	
			System.out.println("==========Ŭ���̾�Ʈ ���� ���α׷�==========");
			System.out.println("=======================================");
			System.out.println("1. �� �߰� 2. �� �˻� 3. �� ���� 4. �� ���� 5. �� ��ü�˻� 6. �� ��ü���� 7. ����.");
			menu = sc.nextInt();
			switch(menu) 
			{
			case 1:
				Client c = insert();
				boolean a = client.add(c);
				
				if(a == true)
				{
					System.out.println(c.toString());
					System.out.println("����� �߰��߽��ϴ�.");
				}
				else
				{
					System.out.println("�߰����� ���߽��ϴ�.");
				}
				break;
			case 2:
				System.out.print("ã���� �ϴ� ���� �̸� : ");
				search(client);
				break;
			case 3:
				System.out.println("������ �̸��� �Է��ϼ���.");
				update(client);
				break;
			case 4:
				System.out.println("������ �̸��� �Է��ϼ���.");
				delete(client);
				break;
			case 5:
				Iterator<Client>iter = client.iterator();
				if(iter.hasNext()==false)
				{
					System.out.println("�ƹ��͵� ����Ǿ� ���� �ʽ��ϴ�.");
				}
				allsearch(iter);
				break;
			case 6:
				alldelete(client);
				break;
			case 7:
				flag = true;
				break;
			}
		}
	}
}


class Info
{
	private String address;
	private String tel;
}