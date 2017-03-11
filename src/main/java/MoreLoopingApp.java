import com.sqa.wc.helpers.*;

/**
 *   File Name: MoreLoopingApp.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 10, 2017
 *
 */

/**
 * MoreLoopingApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class MoreLoopingApp {

	/**
	 * @param args
	 */
	static String appName = "More Loops";

	public static void main(String[] args) {
		String user = AppBasics.welcomeUserAndName(appName);
		oneLoop();
		// twoLoops();
		twoLoopsDemo();
		// threeLoops();
		threeLoopsDemo();
		loopQuestion();
		AppBasics.farewellUser(appName, user);

	}

	/**
	 *
	 */
	private static void from0To5() {
		int i = 0;
		while (i < 6) {
			System.out.print("[" + i + "]");
			i++;
		}
		System.out.println("");
	}

	/**
	 *
	 */
	private static void from1000To8() {
		int i = 1000;
		while (i > 8) {
			System.out.print(i + "<<<");
			i = (i / 5);
		}
		System.out.println("8");
	}

	/**
	 *
	 */
	private static void from10To5() {
		int i = 10;
		while (i > 5) {
			System.out.print(i + ", ");
			i--;
		}
		System.out.println("5");
	}

	/**
	 *
	 */
	private static void from9999To1111() {
		int i = -9999;
		while (i < -1110) {
			System.out.print("{{{{" + i);
			i = (i / 3);
		}
		System.out.println("");
	}

	/**
	 *
	 */
	private static void loopQuestion() {
		Boolean isValid = false;
		while (!isValid) {
			String answer = AppBasics.requestString("What do you want to do? (Enter EXIT to quit)");
			if (answer.equals("EXIT")) {
				isValid = true;
			}
		}
	}

	/**
	 *
	 */

	private static void oneLoop() {
		from10To5();
		from0To5();
		from1000To8();
		from9999To1111();
		System.out.println("");
	}

	/**
	 *
	 */
	private static void threeLoops() {
		int i = 0;
		String type = "*";
		while (i < 6) {
			System.out.print(AppBasics.repeatString(type, i));
			System.out.println("");
			i++;
		}
		System.out.println("");
	}

	/**
	 *
	 */
	private static void threeLoopsDemo() {
		int i = 6;
		int count = 1;
		String space = "A";
		String type = "*";
		while (i > 0) {
			for (int j = i; j > 0; j--) {
				System.out.print(space);
			}
			for (int j2 = count; j2 != count + count; j2++) {
				System.out.print(type);
			}
			System.out.println();
			i--;
			count++;
		}
		System.out.println();
	}

	// for (int j2 = 1; j2 < 6; j2++) {
	// System.out.print(type);
	// }

	/**
	 * @param args
	 * @param repeated
	 *
	 */
	private static void twoLoops() {
		/**
		 *
		 */
		int i = 6;
		String type = "*";
		while (i > 0) {
			System.out.print(AppBasics.repeatString(type, i));
			System.out.println("");
			i--;
		}
		System.out.println("");
	}

	/**
	 *
	 */

	/**
	 *
	 */
	private static void twoLoopsDemo() {
		int i = 6;
		String type = "*";
		while (i > 0) {
			for (int j = i; j > 0; j--) {
				System.out.print(type);
			}
			System.out.println("");
			i--;
		}
		System.out.println("");
	}
}
