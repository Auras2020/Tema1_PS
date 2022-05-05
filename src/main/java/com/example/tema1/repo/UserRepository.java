package com.example.tema1.repo;

import com.example.tema1.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface User repository.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
