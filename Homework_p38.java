package homework;
import java.util.Scanner;
public class Homework_p38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ���� ��ȯ �ϰ��� �ϴ� ������ �Է��� �ּ���. : ");
		int degreeclecius = input.nextInt();		
		float f = (float)((1.8 * degreeclecius )+ 32);
		System.out.println("�Է¹��� ������ "+degreeclecius+" �̸� �̴� ȭ���� "+f+"�Դϴ�.");
	}
}
