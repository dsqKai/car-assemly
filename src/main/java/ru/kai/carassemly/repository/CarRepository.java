package ru.kai.carassemly.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kai.carassemly.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, String> {
}
