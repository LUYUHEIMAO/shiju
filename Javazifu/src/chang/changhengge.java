package chang;

import chang.*;
import java.util.Scanner;

public class changhengge {
	public static void main(String args[]) {
		System.out.println("请输入你所要整理对齐的古诗：");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		// String str =
		// "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行";
		for (int a = 0; a < str.length() / 7; a++) {
			if (a % 2 == 0) {
				String subTest1 = str.substring(a * 7 + 0, a * 7 + 7);
				System.out.print(subTest1 + "，");
			}
			if (a % 2 != 0) {
				String subTest1 = str.substring(a * 7 + 0, a * 7 + 7);
				System.out.println(subTest1 + "。");
			}
		}
		System.out.println("————————————————————————————————————————————");

		String string = str;
		System.out.print("输入要查找的词或词语：");
		Scanner input1 = new Scanner(System.in);
		String in = input1.next();
		int count = getCount(str, in);
		System.out.println("本诗中存在" + count + "个" + in);
//		 char[] ch=string.toCharArray();
//		 char c=in.charAt(0);
//		 for (int i = 0; i < ch.length; i++) {
//		 if (c==ch[i]) {
//		 count++;
//		 }
//		 }
//		 System.out.println("本诗中存在"+count+"个字符"+c);
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
