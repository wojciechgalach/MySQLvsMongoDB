package pl.com.nur.mysqlvsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.com.nur.mysqlvsmongo.model.MockarooMongo;

@Repository
public interface MockarooMongoRepo extends MongoRepository<MockarooMongo, String>{

}
