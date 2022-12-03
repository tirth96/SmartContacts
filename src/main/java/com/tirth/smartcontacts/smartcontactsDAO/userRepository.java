package com.tirth.smartcontacts.smartcontactsDAO;

import com.tirth.smartcontacts.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Integer> {

}
