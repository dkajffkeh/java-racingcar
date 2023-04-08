package com.nextstep.racingcargame.core;

import static com.nextstep.racingcargame.core.RandomNumberGenerator.getRandomZeroToNine;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    protected Cars(int numberOfCars) {
        List<Car> cars = new ArrayList<>();

        for (int index = 0; index < numberOfCars; index++) {
            cars.add(new Car());
        }
        this.cars = cars;
    }

    public int carSize() {
        return cars.size();
    }

    public void moveCars() {
        for (int carIndex = 0; carIndex < carSize(); carIndex++) {
            CarMover carMover = new CarMover(getRandomZeroToNine());
            carMover.moveCar(cars.get(carIndex));
        }
    }

    public void disPlayCarsTravelDistance() {
        for (int carIndex = 0; carIndex < carSize(); carIndex++) {
            cars.get(carIndex).printTravelDistance();
        }
    }
}
