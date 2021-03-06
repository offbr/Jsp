package shop.order;

import java.util.HashMap;

public class CartMgr_1 {
	private HashMap hCart = new HashMap<>();
	
	public void addCart(OrderBean obean){
		String product_no = obean.getProduct_no();
		int quantity = Integer.parseInt(obean.getQuantity());
		
		if(quantity > 0){
			//동일 상품 주문여부 확인
			if(hCart.containsKey(product_no)){
				OrderBean temp = (OrderBean)hCart.get(product_no);
				quantity += Integer.parseInt(temp.getQuantity());
				temp.setQuantity(Integer.toString(quantity));
				hCart.put(product_no, temp);
				System.out.println(quantity);	
			}else{//새 상품 주문시
				hCart.put(product_no, obean);
			}
			
			
		}
	}
	
	public HashMap getCartList(){
		return hCart;
	}
	
	public void updateCart(OrderBean obean){
		String product_no = obean.getProduct_no();
		hCart.put(product_no, obean);
	}
	
	public void deleteCart(OrderBean obean){
		String product_no = obean.getProduct_no();
		hCart.remove(product_no);
	}
	
}













