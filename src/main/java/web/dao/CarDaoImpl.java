package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Лексус", "черный", 2));
        cars.add(new Car("Ланус", "перламут", 1));
        cars.add(new Car("Лада", "жёлтый", 3));
        cars.add(new Car("Опель", "красны", 2));
        cars.add(new Car("Бронетранспортер", "зеленный", 4));
        cars.add(new Car("Самолет", "синий", 0));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
