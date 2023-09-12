# CREATE DATABASE cms CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
use cms;

INSERT INTO cms.author (id, first_name, last_name) VALUES (1, 'name1', 'last1');
INSERT INTO cms.author (id, first_name, last_name) VALUES (2, 'name2', 'last2');

INSERT INTO cms.article (id, content, created, title, updated, author_id) VALUES (1, 'content1', '2023-09-12 16:48:00.000000', 'title1', '2023-09-12 16:48:08.000000', 1);
INSERT INTO cms.article (id, content, created, title, updated, author_id) VALUES (2, '2', '2023-09-12 16:50:06.000000', 'title2', '2023-09-12 16:50:15.000000', 1);
INSERT INTO cms.article (id, content, created, title, updated, author_id) VALUES (3, '2', '2023-09-12 16:50:06.000000', 'title2', '2023-09-12 16:50:15.000000', 2);
INSERT INTO cms.article (id, content, created, title, updated, author_id) VALUES (4, '2', '2023-09-12 16:50:06.000000', 'title2', '2023-09-12 16:50:15.000000', 2);

INSERT INTO cms.category (id, description, name, id_article) VALUES (1, 'desc1', 'name1', 2);
INSERT INTO cms.category (id, description, name, id_article) VALUES (2, 'desc1', 'name1', 3);
