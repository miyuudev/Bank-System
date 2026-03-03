package com.miyuudev.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miyuudev.demo.model.Account;

public interface AccountRepository extends JpaRepository <Account, Long>{

}
