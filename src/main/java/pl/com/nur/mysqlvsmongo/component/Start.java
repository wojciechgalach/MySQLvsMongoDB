package pl.com.nur.mysqlvsmongo.component;

import org.springframework.stereotype.Controller;
import pl.com.nur.mysqlvsmongo.model.MockarooMongo;
import pl.com.nur.mysqlvsmongo.service.MockarooList;
import pl.com.nur.mysqlvsmongo.repository.MockarooMongoRepo;
import pl.com.nur.mysqlvsmongo.repository.MockarooSqlRepo;

@Controller
public class Start {

    private MockarooMongoRepo mockarooMongoRepo;
    private MockarooSqlRepo mockarooSqlRepo;
    private MockarooList mockarooList;

    public Start(MockarooMongoRepo mockarooMongoRepo, MockarooSqlRepo mockarooSqlRepo, MockarooList mockarooList) {
        this.mockarooMongoRepo = mockarooMongoRepo;
        this.mockarooSqlRepo = mockarooSqlRepo;
        this.mockarooList = mockarooList;
    }


//    @EventListener(ApplicationReadyEvent.class)
    @TimeAspectIntrface
    public void initMongo(){

        for (int i = 0; i < mockarooList.getMockarooList().size(); i++) {
             mockarooMongoRepo.save(new MockarooMongo(mockarooList.getMockarooList().get(i)));
        }
        System.out.println("Mongo zapis");
    }

    @TimeAspectIntrface
    public void readMongo(){

        mockarooMongoRepo.findAll();
        System.out.println("Mongo wczytanie");
    }

    @TimeAspectIntrface
    public void delMongo(){
        mockarooMongoRepo.deleteAll();
        System.out.println("Mongo del");
    }


    @TimeAspectIntrface
    public void initSQL(){
        for (int i = 0; i < mockarooList.getMockarooList().size(); i++) {
            mockarooMongoRepo.save(new MockarooMongo(mockarooList.getMockarooList().get(i)));
        }
        System.out.println("SQL zapis");
    }

    @TimeAspectIntrface
    public void readSQL(){
        mockarooSqlRepo.findAll();
        System.out.println("SQL wczytanie");
    }

    @TimeAspectIntrface
    public void delSQL(){
            mockarooMongoRepo.deleteAll(); //.save(new MockarooMongo(mockarooList.getMockarooList().get(i)));

        System.out.println("SQL del");
    }
}
