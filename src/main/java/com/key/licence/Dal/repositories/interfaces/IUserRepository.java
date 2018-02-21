package com.key.licence.Dal.repositories.interfaces;

import com.key.licence.Dal.models.UserSauro;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jrafa on 2/4/2018.
 */
public interface IUserRepository extends CrudRepository<UserSauro, Integer>{}
