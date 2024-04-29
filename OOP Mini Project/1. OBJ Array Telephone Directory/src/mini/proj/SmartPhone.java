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
		System.out.print("�̸� :");
		String name = in.nextLine();
		System.out.print("��ȭ��ȣ:");
		String phoneNumber = in.nextLine();
		System.out.print("�̸��� :");
		String email = in.nextLine();
		System.out.print("�ּ� :");
		String address = in.nextLine();
		System.out.print("�׷�(ģ��/����) :");
		String group = in.nextLine();

		return new Addr(name, phoneNumber, email, address, group);
	}

	public void addAddr(Addr addr) {
		addrs[numOfCount] = addr;
		numOfCount++;
		System.out.println(">>> �����Ͱ� ����Ǿ����ϴ�.(" + numOfCount + ")");
	}

	public void printAddr(Addr addr) {
		System.out.println("�̸� :" + addr.getName());
		System.out.println("��ȭ��ȣ:" + addr.getPhoneNumber());
		System.out.println("�̸��� :" + addr.getEMail());
		System.out.println("�ּ� :" + addr.getAddress());
		System.out.println("�׷�(ģ��/����) :" + addr.getGroup());
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
		System.out.println("�˻� ����� �����ϴ�.");
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
		System.out.println("�˻� ����� �����ϴ�.");
	}

	public void editAddr(String name, Addr newContact) {
		for (int i = 0; i < numOfCount; i++) {
			if (addrs[i].getName().equals(name)) {
				addrs[i] = newContact;
				return;
			}
		}
		System.out.println("�˻� ����� �����ϴ�.");
	}
}