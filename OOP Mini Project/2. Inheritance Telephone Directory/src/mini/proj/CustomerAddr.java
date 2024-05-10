package mini.proj;

public class CustomerAddr extends Addr {
	
	private String customerName;
	private String customerItem;
	private String rank;
	
	CustomerAddr(String name, String phoneNumber, String eMail, String address, String group, String customerName,String customerItem, String rank){
		super(name,phoneNumber,eMail,address,group);
		this.customerName = customerName;
		this.customerItem = customerItem;
		this.rank = rank;
	}

	@Override
	public void printInfo() {
		System.out.println("이름 :" + this.getName());
		System.out.println("전화번호 :" + this.getPhoneNumber());
		System.out.println("이메일 :" + this.getEMail());
		System.out.println("주소 :" + this.getAddress());
		System.out.println("그룹 (친구/가족/회사/거래처):" + this.getGroup());
		System.out.println("거래처이름 :" + customerName);
		System.out.println("거래품목 :" + customerItem);
		System.out.println("직급 :" + rank);
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerItem() {
		return customerItem;
	}
	
	public void setCustomerItem(String customerItem) {
		this.customerItem = customerItem;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
}
