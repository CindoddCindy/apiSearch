package apisearch.apisearch.repository;

import apisearch.apisearch.entity.Car;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, Integer>, JpaSpecificationExecutor<Car>{
}
