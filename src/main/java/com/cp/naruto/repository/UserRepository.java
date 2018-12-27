package com.cp.naruto.repository;

import com.cp.naruto.pojo.Buff;
import com.cp.naruto.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<Buff, Integer>, JpaSpecificationExecutor<Buff> {

}
