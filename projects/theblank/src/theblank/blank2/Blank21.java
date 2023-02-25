package theblank.blank2;

import java.util.Scanner;

public class Blank21 {

	public static void main(String[] args) {
		String menus[] = {"빅맥", "상스치콤", "1955버거", "애플파이", "맥너겟"};
		String comments[] = {"우리가게 시그니쳐~~", "매콤한 치킨버거", "난빅맥보다이게더조아", "빼먹으면섭섭하자너", "가끔 쿠폰주면 사묵지"};
		int prices[] = {5000, 4000, 6000, 3000, 2500};
		
		System.out.println("지금은 한 1985년쯤... 이 프로그램은 미국맥도날드의 메뉴정보질의프로그램입니다..");
		System.out.print ("검색할 메뉴 이름을 입력해주세요. > ");
		
		Scanner sc = new Scanner(System.in);
		
		String query = null;
		while(!(query = sc.next()).equals("exit")) {
			for (int i=0; i<menus.length; i++) {
				String menu = menus[i];
				
				if (menu.equals(query)) {
					System.out.println(menus[i]);
					System.out.println(comments[i]);
					System.out.println(prices[i]);
					break;
				}
			}
		}
	}
}
