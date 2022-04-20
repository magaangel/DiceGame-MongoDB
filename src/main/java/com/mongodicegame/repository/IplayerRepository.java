package com.mongodicegame.repository;

import com.mongodicegame.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IplayerRepository extends MongoRepository<Player, Long> {
    /*se deben definir en la interface porque Spring solo tiene findById, pero tiene un findBy con una clausula where
    que permite usar otro atributo y poder encontrar el objeto por un String que sea igual
     */
    public Player findByEmail(String email);


    public Player findByNickName(String nickName);
}
