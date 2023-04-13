package com.nextstep.racingcargame.view;

import com.nextstep.racingcargame.core.Cars;
import java.util.List;

public class ResultView {

    private static final String RESULT_MSG = "실행 결과";

    private static final String ADDITIONAL_WINNER_MSG = "가 최종 우승했습니다.";

    private static final String CAR_NAME_AND_DISTANCE_DELIMITER = " : ";

    private static final String CAR_DISTANCE_DISPLAY_UNIT = "-";

    private static final String BLANK_STRING_FOR_NEW_LINE = "";


    public static void createNewLine() {
        printSource(BLANK_STRING_FOR_NEW_LINE);
    }

    public static void printWinners(Cars cars) {
        printSource(cars.joinedWinnerNames() + ADDITIONAL_WINNER_MSG);
    }

    public static void printSource(String source) {
        System.out.println(source);
    }

    public static void printResultMsg() {
        printSource(RESULT_MSG);
    }

    public static void printAllCarCurrentDistance(Cars cars) {
        List<String> carCurrentDistances =
                cars.getAllCarCurrentDistance(
                        CAR_NAME_AND_DISTANCE_DELIMITER,
                        CAR_DISTANCE_DISPLAY_UNIT);

        carCurrentDistances.forEach(ResultView::printSource);
    }
}
