package homework;
import java.util.Scanner;
public class Homework_p38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("화씨로 변환 하고자 하는 섭씨를 입력해 주세요. : ");
		int degreeclecius = input.nextInt();		
		float f = (float)((1.8 * degreeclecius )+ 32);
		System.out.println("입력받은 섭씨는 "+degreeclecius+" 이며 이는 화씨로 "+f+"입니다.");
	}
}
