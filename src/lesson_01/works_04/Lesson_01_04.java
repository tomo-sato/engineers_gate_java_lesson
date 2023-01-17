package lesson_01.works_04;

/**
 * １．基礎構文（変数、for文、if文）
 * <p>
 * ４．1から100までの要素を持つ配列を作成し偶数だけ表示してください。
 *
 * @author tomo-sato
 */
public class Lesson_01_04 {

	/**
	 * main関数
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {

		int[] iArr = new int[100];

		for (int i = 0; i < 100; i++) {
			iArr[i] = i + 1;
		}

		for (int i : iArr) {
			if ((i % 2) == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
