package boot.jpa.join.service;

import boot.jpa.join.domain.board.BoardRepository;
import boot.jpa.join.domain.comment.CommentRepository;
import boot.jpa.join.domain.post.PostRepository;
import boot.jpa.join.domain.user.UserRepository;
import boot.jpa.join.dto.post.PostFindAllResponseDto;
import boot.jpa.join.dto.user.UserFindAllResponseDto;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;
    @Autowired
    BoardRepository boardRepository;
    @Autowired
    PostRepository postRepository;
    @Autowired
    CommentRepository commentRepository;


    @After
    public void cleanUp() {
        userRepository.deleteAll();
        boardRepository.deleteAll();
        postRepository.deleteAll();
        commentRepository.deleteAll();
    }

    @Test
    public void FetchJoinTest() {
        // given : data-h2.sql

        // when
        List<UserFindAllResponseDto> list = userService.UserPostFetchJoin();

        //then
        System.out.println();
        Assert.assertThat(list.size(), CoreMatchers.is(5));
    }

    @Test
    public void InnerJoinTest() {
        // given : data-h2.sql

        // when
        List<PostFindAllResponseDto> list = userService.UserPostInnerJoin();

        //then
        System.out.println();
        Assert.assertThat(list.size(), CoreMatchers.is(5));
    }
}
