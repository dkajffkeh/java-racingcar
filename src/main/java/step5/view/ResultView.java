package step5.view;

import step5.domain.Car;
import step5.domain.CarStadium;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public void printWinners(List<Car> winners) {
        String winner = winners.stream()
            .map(Car::getName)
            .collect(Collectors.joining(","));
        System.out.println(winner + "가 최종 우승했습니다.\n");
    }

    public void printResult(CarStadium carStadium) {
        carStadium.getAllCars().forEach(this::print);
        System.out.println();
    }

    private void print(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getMovedCount(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
