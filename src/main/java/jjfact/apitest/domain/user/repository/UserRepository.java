package jjfact.apitest.domain.user.repository;

import jjfact.apitest.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
