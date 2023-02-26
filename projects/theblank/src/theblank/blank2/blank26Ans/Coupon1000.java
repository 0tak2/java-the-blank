package theblank.blank2.blank26Ans;

public class Coupon1000 extends Coupon {

	@Override
	public double calcCouponPrice(Menu menu) {
		Localization local = menu.getLocalization();
		if (local != null &&
				local.getRegionCode().equals("KR")) {
			return local.getMenuPriceLocal() - 1000;
		} else {
			return local.getMenuPriceLocal();
		}
	}

}
