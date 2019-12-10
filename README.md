# shiju
计182 2018310786 米彦鹏
## 一、实验目的
1、掌握字符串String及其方法的使用 <br>2、掌握异常处理结构<br>

## 二、实验要求
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：<br>
1、每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”<br>
2、允许提供输入参数，统计古诗中某个字或词出现的次数<br>
3、考虑操作中可能出现的异常，在程序中设计异常处理程序<br>
输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续> 输出： 汉皇重色思倾国，御宇多年求不得。 杨家有女初长成，养在深闺人未识。 天生丽质难自弃，一朝选在君王侧。 回眸一笑百媚生，六宫粉黛无颜色。 春寒赐浴华清池，温泉水滑洗凝脂。 侍儿扶起娇无力，始是新承恩泽时。 云鬓花颜金步摇，芙蓉帐暖度春宵。 春宵苦短日高起，从此君王不早朝。………… 注意： 输入的内容，利用main方法中的args数组传递
## 三、实验过程
用Scanner input = new Scanner(System.in)和String str = input.nextLine()构建输入，在用if语句在规律处阶段加逗号和句号，然后编写函数进行小串查找，最后在输入处添加异常处理。
## 四、流程图
![image](https://github.com/LUYUHEIMAO/shiju/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191118154632.png)
五、核心代码
package chang;

import chang.*;

import java.io.IOException;
import java.util.Scanner;

public class changhengge {
	public static void main(String args[]) {
		System.out.println("请输入你所要整理对齐的古诗：");
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("请重新输入");
			String str = input.nextLine();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("IO'S type error!");
		}
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
## 六、系统运行截图
![image](https://github.com/LUYUHEIMAO/shiju/blob/master/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20191118154139.png)
## 七、编程感想
这次实验让我运用到了函数和异常处理，让我对其的认识更加深刻
