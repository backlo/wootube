INSERT INTO user(name, email, password, is_active)
VALUES ('회원에이', 'a@test.com', '1234qwer', true);

INSERT INTO user(name, email, password, is_active)
VALUES ('회원비', 'b@test.com', '1234qwer', true);

INSERT INTO video (title, description, content_path, origin_file_name, writer_id)
VALUES ('video_a', '비디오 에이 입니다.', 'pathA', 'video_a.mp4', 1);

INSERT INTO video (title, description, content_path, origin_file_name, writer_id)
VALUES ('video_b', '비디오 비 입니다.', 'pathB', 'video_b.mp4', 2);

INSERT INTO comment (contents, video_id, writer_id)
VALUES ('비디오 A의 회원 A의 댓글', 1, 1);

INSERT INTO comment (contents, video_id, writer_id)
VALUES ('비디오 A의 회원 B의 댓글', 1, 2);

INSERT INTO comment (contents, video_id, writer_id)
VALUES ('비디오 B의 회원 A의 댓글', 2, 1);

INSERT INTO comment (contents, video_id, writer_id)
VALUES ('비디오 B의 회원 B의 댓글', 2, 2);