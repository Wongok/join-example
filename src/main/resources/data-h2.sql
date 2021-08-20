insert into USER (name, email) values ('park1', 'wongok1@gmail.com');
insert into USER (name, email) values ('park2', 'wongok2@gmail.com');

insert into BOARD (board_name) values ('board1');
insert into BOARD (board_name) values ('board2');
insert into BOARD (board_name) values ('board3');

insert into POST (title, content, board_id, user_id) values ('title1', 'content1', '1', '1');
insert into POST (title, content, board_id, user_id) values ('title2', 'content2', '1', '2');
insert into POST (title, content, board_id, user_id) values ('title3', 'content3', '1', '2');
insert into POST (title, content, board_id, user_id) values ('title4', 'content4', '2', '1');
insert into POST (title, content, board_id, user_id) values ('title5', 'content5', '2', '2');
insert into POST (title, content, board_id, user_id) values ('title5', 'content5', '3', '2');

insert into COMMENT (comment, user_id, post_id) values ('comment1', '1', '1');
insert into COMMENT (comment, user_id, post_id) values ('comment2', '1', '1');
insert into COMMENT (comment, user_id, post_id) values ('comment3', '1', '1');
insert into COMMENT (comment, user_id, post_id) values ('comment4', '1', '2');
insert into COMMENT (comment, user_id, post_id) values ('comment5', '1', '2');
insert into COMMENT (comment, user_id, post_id) values ('comment6', '1', '2');
insert into COMMENT (comment, user_id, post_id) values ('comment7', '1', '3');
insert into COMMENT (comment, user_id, post_id) values ('comment8', '1', '3');
insert into COMMENT (comment, user_id, post_id) values ('comment9', '1', '3');
insert into COMMENT (comment, user_id, post_id) values ('comment10', '2', '4');
insert into COMMENT (comment, user_id, post_id) values ('comment11', '2', '4');
insert into COMMENT (comment, user_id, post_id) values ('comment12', '2', '4');
insert into COMMENT (comment, user_id, post_id) values ('comment1', '2', '5');
insert into COMMENT (comment, user_id, post_id) values ('comment1', '2', '5');
insert into COMMENT (comment, user_id, post_id) values ('comment1', '2', '5');