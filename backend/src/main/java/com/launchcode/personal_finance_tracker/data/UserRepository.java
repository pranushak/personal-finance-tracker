package com.launchcode.personal_finance_tracker.data;

import com.launchcode.personal_finance_tracker.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
