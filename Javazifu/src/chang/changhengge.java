package chang;

import chang.*;
import java.util.Scanner;

public class changhengge {
	public static void main(String args[]) {
		System.out.println("����������Ҫ�������Ĺ�ʫ��");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		// String str =
		// "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������";
		for (int a = 0; a < str.length() / 7; a++) {
			if (a % 2 == 0) {
				String subTest1 = str.substring(a * 7 + 0, a * 7 + 7);
				System.out.print(subTest1 + "��");
			}
			if (a % 2 != 0) {
				String subTest1 = str.substring(a * 7 + 0, a * 7 + 7);
				System.out.println(subTest1 + "��");
			}
		}
		System.out.println("����������������������������������������������������������������������������������������");

		String string = str;
		System.out.print("����Ҫ���ҵĴʻ���");
		Scanner input1 = new Scanner(System.in);
		String in = input1.next();
		int count = getCount(str, in);
		System.out.println("��ʫ�д���" + count + "��" + in);
//		 char[] ch=string.toCharArray();
//		 char c=in.charAt(0);
//		 for (int i = 0; i < ch.length; i++) {
//		 if (c==ch[i]) {
//		 count++;
//		 }
//		 }
//		 System.out.println("��ʫ�д���"+count+"���ַ�"+c);
	}

	public static int getCount(String str, String in) {
		int count = 0;
		int index = str.indexOf(in);
		while (index != -1) {
			count++;
			int a = index + in.length();
			str = str.substring(a);
			index = str.indexOf(in);
		}
		return count;
	}
}
