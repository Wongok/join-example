package boot.jpa.join.domain.user;

import boot.jpa.join.dto.post.PostFindAllResponseDto;
import boot.jpa.join.dto.user.UserFindAllResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    /*@Query("select p " +
            "from Post p " +
            "INNER JOIN p.user u")*/
    @Query("select u.posts " +
            "from User u ")
    List<PostFindAllResponseDto> UserPostInnerJoin();

    @Query("select u " +
            "from User u " +
            "JOIN FETCH u.posts")
    List<UserFindAllResponseDto> FetchJoinUserPost();
}
