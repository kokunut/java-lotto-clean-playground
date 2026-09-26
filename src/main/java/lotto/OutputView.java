package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OutputView {

    public void printPurchaseResult(int lottoCount) {
        System.out.println();
        System.out.println(lottoCount + "개를 구매했습니다.");
    }

    public void printLottoNumbers(List<Integer> numbers) {
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        System.out.println(sortedNumbers);
    }
}