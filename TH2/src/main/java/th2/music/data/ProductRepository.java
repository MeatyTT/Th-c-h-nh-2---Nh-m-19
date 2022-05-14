package th2.music.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import th2.music.business.*;
@Repository
public interface ProductRepository extends CrudRepository<Product, String>{

}
