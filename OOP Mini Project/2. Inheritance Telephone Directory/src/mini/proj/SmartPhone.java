package mini.proj;

import java.util.Scanner;

public class SmartPhone {

	Addr[] addrs;
	int numOfCount = 0;
	Scanner in;

	public SmartPhone() {
		addrs = new Addr[10];
		in = new Scanner(System.in);
	}

	public Addr inputContactData() {
		System.out.print("이름 :");
		String name = in.nextLine();
		System.out.print("전화번호 :");
		String phoneNumber = in.nextLine();
		System.out.print("이메일 :");
		String email = in.nextLine();
		System.out.print("주소 :");
		String address = in.nextLine();
		System.out.print("그룹(친구/가족/회사/거래처) :");
		String group = in.nextLine();
		if(group.equals("회사")){
			System.out.print("회사이름 :");
			String companyName = in.nextLine();
			System.out.print("부서이름 :");
			String teamName = in.nextLine();
			System.out.print("직급 :");
			String rank = in.nextLine();
			return new CompanyAddr(name, phoneNumber, email, address, group, companyName,teamName,rank);	
		}
		else if(group.equals("거래처")){
			System.out.print("거래처이름 :");
			String customerName = in.nextLine();
			System.out.print("거래품목 :");
			String customerItem = in.nextLine();
			System.out.print("직급 :");
			String rank = in.nextLine();
			return new CustomerAddr(name, phoneNumber, email, address, group, customerName,customerItem,rank);	
		}
		return new Addr(name, phoneNumber, email, address, group);
	}

	public void addAddr(Addr addr) {
		addrs[numOfCount] = addr;
		numOfCount++;
		System.out.println(">>> 데이터가 저장되었습니다.(" + numOfCount + ")");
	}

	public void printAddr(Addr addr) {
	//	System.out.println("이름 :" + addr.getName());
	//	System.out.println("전화번호 :" + addr.getPhoneNumber());
	//	System.out.println("이메일 :" + addr.getEMail());
	//	System.out.println("주소 :" + addr.getAddress());
	//	System.out.println("그룹(친구/가족) :" + addr.getGroup());
		addr.printInfo(addr);
		System.out.println("==================================");
	}

	public void printAllAddr() {
		for (int i = 0; i < numOfCount; i++) {
			printAddr(addrs[i]);
		}
	}

	public void searchAddr(String name) {
		for (int i = 0; i < numOfCount; i++) {
			Addr addr = addrs[i];
			if (addr.getName().equals(name)) {
				printAddr(addr);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	public void deleteAddr(String name) {
		for (int i = 0; i < numOfCount; i++) {
			Addr addr = addrs[i];
			if (addr.getName().equals(name)) {
				for (int j = i; j < numOfCount; j++) {
					addrs[j] = addrs[j + 1];
				}
				numOfCount--;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	public void editAddr(String name, Addr newContact) {
		for (int i = 0; i < numOfCount; i++) {
			if (addrs[i].getName().equals(name)) {
				addrs[i] = newContact;
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
}
