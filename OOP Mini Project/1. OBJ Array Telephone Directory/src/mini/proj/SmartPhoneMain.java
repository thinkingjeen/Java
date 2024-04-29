package mini.proj;

import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SmartPhone smartPhone = new SmartPhone();

		System.out.println("#������ 2���� �Է��մϴ�.");
		for (int i = 0; i < 2; i++) {
			smartPhone.addAddr(smartPhone.inputContactData());
		}

		while (true) {
			printMenu();
			String selectMenu = scanner.nextLine();

			switch (selectMenu) {
			case "1":
				smartPhone.addAddr((smartPhone.inputContactData()));
				break;

			case "2":
				smartPhone.printAllAddr();
				break;

			case "3":
				System.out.println("����ó�� �˻��� �̸��� �Է����ּ���.");
				smartPhone.searchAddr(scanner.nextLine());
				break;

			case "4":
				System.out.println("����ó���� ������ �̸��� �Է����ּ���.");
				smartPhone.deleteAddr(scanner.nextLine());
				break;

			case "5":
				System.out.println("����ó���� ������ �̸��� �Է����ּ���.");
				String name = scanner.nextLine();
				smartPhone.searchAddr(name);
				System.out.println("�����͸� ���� �Է����ּ���.");
				smartPhone.editAddr(name, smartPhone.inputContactData());
				break;

			case "6":
				System.out.println("���α׷��� �����մϴ�.");
				return; // System.exit(0);

			default:
				System.out.println("�߸��� �޴� �Դϴ�. �ٽ� �������ּ���.");
				break;
			}
		}
	}

	public static void printMenu() {
		System.out.println("�ּҰ��� �޴�-------------");
		System.out.println(">> 1. ����ó ���");
		System.out.println(">> 2. ��� ����ó ���");
		System.out.println(">> 3. ����ó �˻�");
		System.out.println(">> 4. ����ó ����");
		System.out.println(">> 5. ����ó ����");
		System.out.println(">> 6. ���α׷� ����");
		System.out.println("-----------------------");
	}
}