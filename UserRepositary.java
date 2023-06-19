package net.javaguides.studentuserform.repo;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.studentuserform.model.User;

public interface UserRepositary extends CrudRepository<User, Integer> {

}
