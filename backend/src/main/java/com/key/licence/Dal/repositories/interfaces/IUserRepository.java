package com.key.licence.Dal.repositories.interfaces;

import com.key.licence.Dal.models.Usr;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rafael Encinas.
 */
public interface IUserRepository extends CrudRepository<Usr, Integer> {
    @Query("Select u from Usr u where u.nickName=?1 and u.password=?2")
    Usr authentication(String nickname, String password);
}
