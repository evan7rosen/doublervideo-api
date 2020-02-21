INSERT INTO videos(title,url,date) VALUES
('AZ Ice Peoria Summer Ice Show - Wish Upon a Star', '7uGhUWSmZZY', 'May 26, 2018'),
('AZ Ice Gilbert Holiday Ice Show - The Time Train', 'QrR_gm6RqCo', 'December 7-8 2018'),
('Ice Den 20th Anniversary Ice Show', '7TML_MTQdg4', 'June 16, 2018'),
('Ice Den Summer Ice Show - Grammys on Ice', 'https://drive.google.com/file/d/1cQgxM-dR5AkgMMkVWKkXRjFliMZrroS0/preview', 'June 15, 2019'),
('AZ Ice Gilbert Holiday Ice Show - Aladdin on Ice', 'https://drive.google.com/file/d/1gEGlyNTTbHaagcUwc4tlRG5t7i4DsHxs/preview', 'December 14, 2019');

INSERT INTO users(name,email,password) VALUES
('Evan Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Daniel Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Robert Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Julie Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Kristy Rosen', 'evan@doublervideo.com', 'DoubleRVid1');


insert into users_videos (user_id, video_id) VALUES
 (1, 1), (2, 1), (3, 1), (4, 1), (5, 1), (1, 2), (2, 2), (3, 2), (4, 2), (5, 2),
 (1, 3), (2, 3), (3, 3), (4, 3), (5, 3), (1, 4), (1, 5), (2, 4), (2, 5), (3, 4)