package elemOfopp.day5;

public class Order {
private int orderId;
private String orderName;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public Order(int orderId, String orderName) {
	this.orderId = orderId;
	this.orderName = orderName;
}
/*
 *1�� ���жϱ��ԱȵĶ����Ƿ�Ϊ�գ���Ϊ��ǰ���󲻿���Ϊ�գ����򲻿��ܵ���equals������
 *2����ֱ���ж����õĵ�ַ�Ƿ�һ����һ���Ļ���Ȼ���
 *3���Զ����ڲ����ݽ��бȽ�
 * 
 */
/*@Override
public boolean equals(Object obj){
	if (obj==null) {
		return false;
	}else if(this==obj) {
		return true;
	}else if (obj instanceof Order) {
		Order order=(Order)obj;
		if(order.orderId==this.orderId&&order.orderName.equals(this.orderName)) {
			return true;
		}else {
			return false;
		}
	}
	return false;
}*/
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + orderId;
	result = prime * result + ((orderName == null) ? 0 : orderName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	if (orderId != other.orderId)
		return false;
	if (orderName == null) {
		if (other.orderName != null)
			return false;
	} else if (!orderName.equals(other.orderName))
		return false;
	return true;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
}

}
