package jjfact.apitest.repository.user;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jjfact.apitest.domain.user.QUser;
import jjfact.apitest.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;

import static jjfact.apitest.domain.user.QUser.user;

@RequiredArgsConstructor
@Repository
public class UserRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public User findById(Long id){
        User findUser = queryFactory.selectFrom(user)
                .where(user.id.eq(id))
                .fetchOne();

        if(findUser == null){
            throw new NoSuchElementException("조회 실패");
        }
        return findUser;
    }

    public User findByEmail(String email){
        User findUser = queryFactory
                .selectFrom(user)
                .where(user.email.eq(email))
                .fetchOne();

        if(findUser == null){
            throw new NoSuchElementException("조회 실패");
        }
        return findUser;
    }

    public long duplicateCheckEmail(String email){
        User findUser = queryFactory.selectFrom(user)
                .where(user.email.eq(email))
                .fetchOne();

        if (findUser != null){
            return 1;
        }else {
            return 0;
        }
    }

    public long duplicateCheckUsername(String username) {
        User findUser = queryFactory.selectFrom(user)
                .where(user.username.eq(username))
                .fetchOne();

        if (findUser != null){
            return 1;
        }else {
            return 0;
        }
    }
}
