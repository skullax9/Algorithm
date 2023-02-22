package funny;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class lotto {

	public static final Random random = new SecureRandom();

	public static void saveNumsByTxt(String title, List<List<Integer>> content, String date) {
		final String pathWithTitle = "C:\\lotto_log\\"+title+"님_발행내역.txt";
		final String buyDate = "발행일자 : "+date;

		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(pathWithTitle, true));

			fw.write(buyDate);
			fw.newLine();
			fw.newLine();

			for (int i = 0; i < content.size(); i++) {
				fw.write((i+1)+"번 : "+content.get(i).toString());
				fw.newLine();
			}
			fw.newLine();
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<List<Integer>> getLottoNums(int num) {

		List<List<Integer>> lottoNums = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			List<Integer> nums = new ArrayList<>();
			for (int j = 0; j < 6; j++) {
				int number = 1 + random.nextInt(45);

				if (!nums.contains(number)) {
					nums.add(number);
				} else {
					j--;
				}
			}
			Collections.sort(nums);
			lottoNums.add(nums);
		}
		return lottoNums;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		DateTimeFormatter formmaterTxt = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");

		System.out.print("발행자 성함 : ");
		String name = sc.nextLine();
		System.out.println("발행 날짜 : " + now.format(dtf));

		while (true) {
			System.out.print("몇 장 발행을 원하시나요? (1장에 1,000원으로 최대 10장, 10,000원 까지 구매 가능) : ");
			num = sc.nextInt();

			if (num <= 10) {
				break;
			} else {
				System.out.println("한 번에 10장을 초과하여 구매할 수 없습니다!!");
			}
		}

		System.out.println(num + "장 로또를 발행합니다..");

		List<List<Integer>> boughtLotto = getLottoNums(num);

		for (int i = 0; i < boughtLotto.size(); i++) {
			System.out.println((i+1) + "번 : " + boughtLotto.get(i).toString());
		}

		System.out.println("발행이 완료 되었습니다.");

		saveNumsByTxt(name, boughtLotto, now.format(formmaterTxt));
	}

}
