package boot.jpa.join.service;

import boot.jpa.join.domain.board.BoardRepository;
import boot.jpa.join.domain.comment.CommentRepository;
import boot.jpa.join.domain.post.PostRepository;
import boot.jpa.join.domain.user.UserRepository;
import boot.jpa.join.dto.board.BoardPostDto;
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
public class PostServiceTests {

    @Autowired
    PostService postService;
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
    public void CrossJoinTest() {
        // given : data-h2.sql

        // when
        List<BoardPostDto> list = postService.fetchBoardPostCrossJoin();

        //then
        System.out.println();
        Assert.assertThat(list.size(), CoreMatchers.is(10));
    }

    @Test
    public void InnerJoinTest() {
        // given : data-h2.sql

        // when
        List<BoardPostDto> list = postService.fetchBoardPostInnerJoin();

        //then
        System.out.println();
        Assert.assertThat(list.size(), CoreMatchers.is(5));
    }
}



