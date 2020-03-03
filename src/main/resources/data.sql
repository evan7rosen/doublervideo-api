INSERT INTO videos(title,url,date) VALUES
('Ice Den Scottsdale Summer Ice Show - Boots and Blades', 'y_G-lOh12p8', 'June 10, 2017'),
('Ice Den Chandler Holiday Ice Spectacular', '76Fen4BEhgo', 'December 21, 2019'),
('Ice Den Scottsdale 20th Anniversary Ice Show', 'dOxj8Xv3fp4', 'June 16, 2018'),
('Julian Gil at Desert Breeze Skate Championships', 'K6rNq19SURM', 'June 16, 2013'),
('AZ Ice Gilbert Holiday Ice Show - Aladdin on Ice', 'KVWBjEg3yxI', 'December 14, 2019'),
('Ice Den Scottsdale Summer Ice Show - Love', 'y_G-lOh12p8', 'June 5, 2018'),
('Ice Den Scottsdale Holiday Ice Spectacular', '76Fen4BEhgo', 'December 18, 2018');

INSERT INTO users(name,email,password) VALUES
('Evan Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Daniel Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Robert Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Julie Rosen', 'evan@doublervideo.com', 'DoubleRVid1'),
('Kristy Rosen', 'evan@doublervideo.com', 'DoubleRVid1');


insert into users_videos (user_id, video_id) VALUES
 (1, 1), (2, 1), (3, 1), (4, 1), (5, 1), (1, 2), (2, 2), (3, 2), (4, 2), (5, 2),
 (1, 3), (2, 3), (3, 3), (4, 3), (5, 3)