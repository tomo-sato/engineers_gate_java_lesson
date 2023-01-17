package lesson_01.works_01;

/**
 * １．基礎構文（変数、for文、if文）
 * <p>
 * １．文字列型の変数を2つ（変数名：str1, str2）用意してください。<br>
 * それぞれの変数に「aaa」「bbb」を代入してください。<br>
 * 代入した値を入れ替えてください。
 *
 * @author tomo-sato
 */
public class Lesson_01_01 {

	/**
	 * main関数
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "bbb";

		System.out.println("str1=" + str1 + ", str2=" + str2);

		String tmpStr = str1;
		str1 = str2;
		str2 = tmpStr;

		System.out.println("str1=" + str1 + ", str2=" + str2);
	}
}
