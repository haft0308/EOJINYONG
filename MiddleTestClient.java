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
		return "[이름 : "+name+"/ 정보 : " 
				+ info +"/ 보유잔액 : " + money+"]";
	}
	
	
}

class ClientMenu
{
	Scanner sc = new Scanner(System.in);
	//고객메뉴 만들기
	//1 고객 추가
	//2 고객 검색
	//3 고객 수정
	//4 고객 삭제
	//5 고객 전체검색
	//6 고객 전체삭제
	//7 종료.
	Client insert()
	{
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("정보 : ");
		String info = sc.next();
		System.out.print("잔액 : ");
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
			System.out.println("검색결과가 없습니다.");
		}
		else
		{
			System.out.println("검색결과 :"+ c);
		}
		return idx;
		
	}
	void update(ArrayList<Client> client)
	{
		int index = search(client);
		Client c = client.get(index);
		String a = c.getInfo();
		int b = c.getMoney();
		System.out.println("수정할 정보를 입력하세요.");
		String info = sc.next();
		System.out.println("수정할 잔액을 입력하세요.");
		int money = sc.nextInt();
		c.setInfo(info);
		c.setMoney(money);
		System.out.println("이렇게 변경되었습니다.");
		System.out.println(a+"가 이렇게 변했습니다. : "+c.getInfo());
		System.out.println(b+"가 이렇게 변했습니다. : "+c.getMoney());
	}
	void delete(ArrayList<Client> client)
	{
		int index = search(client);
		Client c = client.get(index);
		String d = c.toString();
		
		client.remove(index); 
		System.out.println(d+"가 삭제되었습니다.");
		
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
		System.out.println("모두 삭제되었습니다.");
	}
	
	
	void MenuProcess(ArrayList<Client> client)
	{
		
		int menu;
		boolean flag = false;
		
		while(flag == false)
		{	
			System.out.println("==========클라이언트 관리 프로그램==========");
			System.out.println("=======================================");
			System.out.println("1. 고객 추가 2. 고객 검색 3. 고객 수정 4. 고객 삭제 5. 고객 전체검색 6. 고객 전체삭제 7. 종료.");
			menu = sc.nextInt();
			switch(menu) 
			{
			case 1:
				Client c = insert();
				boolean a = client.add(c);
				
				if(a == true)
				{
					System.out.println(c.toString());
					System.out.println("멤버를 추가했습니다.");
				}
				else
				{
					System.out.println("추가하지 못했습니다.");
				}
				break;
			case 2:
				System.out.print("찾고자 하는 고객의 이름 : ");
				search(client);
				break;
			case 3:
				System.out.println("수정할 이름을 입력하세요.");
				update(client);
				break;
			case 4:
				System.out.println("삭제할 이름을 입력하세요.");
				delete(client);
				break;
			case 5:
				Iterator<Client>iter = client.iterator();
				if(iter.hasNext()==false)
				{
					System.out.println("아무것도 저장되어 있지 않습니다.");
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