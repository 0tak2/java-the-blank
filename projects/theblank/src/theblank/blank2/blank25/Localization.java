package theblank.blank2.blank25;

public class Localization {

	private String menuNameLocal;
	private String menuCommentLocal;
	private int menuPriceLocal;
	private String menuPriceSuffix;
	private String regionCode;
	
	public Localization() {
	}
	
	public Localization(String menuNameLocal, String menuCommentLocal, int menuPriceLocal, String menuPriceSuffix,
			String regionCode) {
		super();
		this.menuNameLocal = menuNameLocal;
		this.menuCommentLocal = menuCommentLocal;
		this.menuPriceLocal = menuPriceLocal;
		this.menuPriceSuffix = menuPriceSuffix;
		this.regionCode = regionCode;
	}

	public String getMenuNameLocal() {
		return menuNameLocal;
	}

	public void setMenuNameLocal(String menuNameLocal) {
		this.menuNameLocal = menuNameLocal;
	}

	public String getMenuCommentLocal() {
		return menuCommentLocal;
	}

	public void setMenuCommentLocal(String menuCommentLocal) {
		this.menuCommentLocal = menuCommentLocal;
	}

	public int getMenuPriceLocal() {
		return menuPriceLocal;
	}

	public void setMenuPriceLocal(int menuPriceLocal) {
		this.menuPriceLocal = menuPriceLocal;
	}

	public String getMenuPriceSuffix() {
		return menuPriceSuffix;
	}

	public void setMenuPriceSuffix(String menuPriceSuffix) {
		this.menuPriceSuffix = menuPriceSuffix;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
}
