package com.mongodicegame.repository;

import com.mongodicegame.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IgameRepository extends MongoRepository<Game, Long> {

}
