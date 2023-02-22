package library;

public class Nonamed {

	public static final String EMPTY = "";

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNotEmpty(final CharSequence cs) {
		return !isEmpty(cs);
	}

	public static boolean equals(final CharSequence cs1, final CharSequence cs2) {
		if (cs1 == cs2) {
			return true;
		}
		if (cs1 == null || cs2 == null) {
			return false;
		}
		if (cs1.length() != cs2.length()) {
			return false;
		}
		if (cs1 instanceof String && cs2 instanceof String) {
			return cs1.equals(cs2);
		}
		// Step-wise comparison
		final int length = cs1.length();
		for (int i = 0; i < length; i++) {
			if (cs1.charAt(i) != cs2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static String reverse(final CharSequence cs) {
		if (isEmpty(cs)) {
			return EMPTY;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = cs.length() - 1; i >= 0; i--) {
			sb.append(cs.charAt(i));
		}

		return sb.toString();
	}

	public static String switchCase(final CharSequence cs) {
		if (isEmpty(cs)) {
			return EMPTY;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cs.length(); i++) {
			String s = String.valueOf(cs.charAt(i));

			if (Character.isUpperCase(cs.charAt(i))) {
				s = s.toLowerCase();
			} else if (Character.isLowerCase(cs.charAt(i))) {
				s = s.toUpperCase();
			}

			sb.append(s);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String sd = "PICKING-RACK-01";
		System.out.println(sd.substring(sd.length()-2));
	}

}
