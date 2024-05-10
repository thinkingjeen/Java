package mini.proj;

public class CompanyAddr extends Addr {
	
	private String companyName;
	private String teamName;
	private String rank;
	
	CompanyAddr(String name, String phoneNumber, String eMail, String address, String group, String companyName,String teamName, String rank){
		super(name,phoneNumber,eMail,address,group);
		this.companyName = companyName;
		this.teamName = teamName;
		this.rank = rank;
	}
	
	@Override
	public void printInfo() {
		System.out.println("이름 :" + this.getName());
		System.out.println("전화번호 :" + this.getPhoneNumber());
		System.out.println("이메일 :" + this.getEMail());
		System.out.println("주소 :" + this.getAddress());
		System.out.println("그룹 (친구/가족/회사/거래처):" + this.getGroup());
		System.out.println("회사이름 :" + companyName);
		System.out.println("부서이름 :" + teamName);
		System.out.println("직급 :" + rank);
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
}