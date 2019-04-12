package unit.test;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers.equals("")) {
			return 0;
		}

		String[] parts = numbers.split(",");
		int answer = 0;
		for (int i = 0; i < parts.length; i++) {
			if (Integer.parseInt(parts[i]) < 0) {
				throw new IllegalArgumentException("Only Positive Numbers " + Integer.parseInt(parts[i]));
			} else {
				answer = answer + Integer.parseInt(parts[i]);
			}
		}

		return answer;

	}
}
