package com.tek.careconcern.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tek.careconcern.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{

//	UserEntity findByus
	

}
