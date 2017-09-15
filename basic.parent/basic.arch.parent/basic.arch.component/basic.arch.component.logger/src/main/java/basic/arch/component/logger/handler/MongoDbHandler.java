package basic.arch.component.logger.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

import basic.arch.component.logger.bean.Group;
import basic.arch.component.logger.mongodb.BaseMongoImpl;

public class MongoDbHandler extends BaseMongoImpl<Group> implements ILoggerHandler  {

    public final static Logger logger = LoggerFactory.getLogger(MongoDbHandler.class);
    public MongoDbHandler(MongoTemplate mongoTemplate) {
        super();
        this.mongoTemplate = mongoTemplate;
    }
    @Override
    public void handle(Group group) {
           save(group);
    }
   
}
