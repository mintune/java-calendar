package mint.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다.
		
		System.out.print("두 수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String[] value = input.split(" ");
		
		int first = Integer.parseInt(value[0]);
		int second = Integer.parseInt(value[1]);
		
		System.out.println("두 수의 합은 " + (first+second) + " 입니다.");
		
		scanner.close();
	}
}
