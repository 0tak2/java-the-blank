package theblank.blank2.blank25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestStup2 {
	public ArrayList<Menu> getMenuList() {
		ArrayList<Menu> list = new ArrayList<Menu>();
		
		list.add(new Menu("BigMac", "Big Big One", 5));
		list.add(new Menu("SangsChiCom", "Spicy...", 4));
		list.add(new Menu("1955", "better than Big Mac", 6));
		
		list.add(new Menu("BulgogiBurger", "Inspired By Korean Food", 3,
				new Localization("불고기버거", "한국의 불고기에 영감을 받은 현지화 메뉴", 3500, "원", "KR")));
		list.add(new Menu("SaewooBurger", "Inspired By Korean Food", 3,
				new Localization("새우버거", "롯데리아에 자극받은 현지화 메뉴", 3500, "원", "KR")));
		list.add(new Menu("OkkoBurger", "Inspired By Japanese Food", 3,
				new Localization("오꼬노미야키버거", "일본 음식에 자극받은 현지화 메뉴... 이런 거 있나...?", 350, "엔", "JP")));
		list.add(new Menu("DongpaBurger", "Inspired By Chinese Food", 3,
				new Localization("동파육버거", "중국 음식에 자극받은 현지화 메뉴... 이런 거 있나...?", 35, "위엔", "CN")));
		
		return list;
	}
}

class About {
	private static String aboutTheProgram = "맥도날드 전사 메뉴정보조회";
	private static String version = "v1.2 beta";
	public static String getAbout() {
		return aboutTheProgram + "\n" + version;
	}
}

public class Blank25 {

	public static void main(String[] args) {
		List<Menu> list = new TestStup2().getMenuList();
		
		System.out.println(About.getAbout());
		System.out.print ("검색할 메뉴 이름을 입력해주세요. > ");
		
		Scanner sc = new Scanner(System.in);
		
		String query = null;
		while(!(query = sc.next()).equals("exit")) {
			for (Menu menu : list) {
				if (query.equals(menu.getMenuName())) {
					System.out.println("Name: " + menu.getMenuName());
					System.out.println("Comment: " + menu.getMenuComment());
					System.out.println("Price(US): " + menu.getMenuPrice());
					
					Localization local = menu.getLocalization();
					if (local != null) {
						String region = local.getRegionCode();
						System.out.println("Name("+ region +"): " + local.getMenuNameLocal());
						System.out.println("Comment("+ region +"): " + local.getMenuCommentLocal());
						System.out.println("Price("+ region +"): " + local.getMenuPriceLocal()
												+ local.getMenuPriceSuffix());
					}
					
					break;
				}
			}
		}
	}
}
