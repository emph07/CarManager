package pl.afossa.carmanager.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by emph on 2015-10-01.
 */
@Repository
public interface CarRepository extends CrudRepository<Car, Long>{
}
