CREATE TABLE autor (
    id INT PRIMARY KEY,    
    nombre VARCHAR(255) NOT NULL        
);

INSERT INTO autor (id, nombre) VALUES
(1, 'Miguel de Cervantes'),
(2, 'Jane Austen'),
(3, 'F. Scott Fitzgerald'),
(4, 'George Orwell'),
(5, 'Harper Lee'),
(6, 'J.D. Salinger'),
(7, 'Gabriel Garcia Marquez'),
(8, 'George R.R. Martin'),
(9, 'J.K. Rowling'),
(10, 'J.R.R. Tolkien'),
(11, 'Homer'),
(12, 'Cormac McCarthy'),
(13, 'Stephen King'),
(14, 'Donna Tartt'),
(15, 'Paulo Coelho'),
(16, 'Stieg Larsson'),
(17, 'Yann Martel'),
(18, 'Aldous Huxley'),
(19, 'Fyodor Dostoevsky');

CREATE TABLE libro (
    id INT PRIMARY KEY,
    idAutor INT,
    isbn VARCHAR(20) UNIQUE,
    titulo VARCHAR(255) NOT NULL,
    paginas INT DEFAULT 0,
    argumento TEXT
);

ALTER TABLE libro
ADD CONSTRAINT fk_libro_autor
FOREIGN KEY(idAutor) REFERENCES autor(id);

INSERT INTO libro (id, idAutor, isbn, titulo, paginas, argumento) VALUES
(1, 1, '9788491050292', 'Don Quijote de la Mancha', 863, 'Un hidalgo enloquece leyendo libros de caballerias y decide convertirse en caballero andante.'),
(2, 2, '9780141439600', 'Pride and Prejudice', 432, 'Historia de amor y prejuicios en la Inglaterra del siglo XIX.'),
(3, 3, '9780743273565', 'The Great Gatsby', 180, 'Un millonario misterioso obsesionado con un amor del pasado.'),
(4, 4, '9780451524935', '1984', 328, 'Una distopia sobre un regimen totalitario que controla todos los aspectos de la vida.'),
(5, 5, '9780061120084', 'To Kill a Mockingbird', 281, 'Una historia sobre racismo e injusticia en el sur de Estados Unidos.'),
(6, 6, '9780307474278', 'The Catcher in the Rye', 277, 'Un adolescente rebelde narra su experiencia en Nueva York.'),
(7, 7, '9788497592208', 'Cien años de soledad', 471, 'La historia de la familia Buendia en el pueblo ficticio de Macondo.'),
(8, 8, '9780553386790', 'A Game of Thrones', 694, 'Luchas de poder entre familias nobles en un mundo fantastico.'),
(9, 9, '9780439554930', 'Harry Potter and the Sorcerer''s Stone', 309, 'Un niño descubre que es mago y asiste a una escuela de magia.'),
(10, 10, '9780618640157', 'The Hobbit', 310, 'Un hobbit emprende una aventura para recuperar un tesoro custodiado por un dragon.'),
(11, 11, '9780140449266', 'The Odyssey', 541, 'El viaje de regreso de Ulises tras la guerra de Troya.'),
(12, 11, '9780140449136', 'The Iliad', 683, 'Relato epico de la guerra de Troya.'),
(13, 12, '9780307269751', 'The Road', 287, 'Un padre y su hijo sobreviven en un mundo postapocaliptico.'),
(14, 13, '9780307743657', 'The Shining', 447, 'Una familia se enfrenta a fuerzas sobrenaturales en un hotel aislado.'),
(15, 14, '9780812981605', 'The Goldfinch', 771, 'La vida de un joven marcada por una tragedia y una pintura robada.'),
(16, 15, '9780062315007', 'The Alchemist', 208, 'Un pastor busca su destino personal a traves de un viaje espiritual.'),
(17, 16, '9780307387899', 'The Girl with the Dragon Tattoo', 465, 'Un periodista y una hacker investigan una desaparicion.'),
(18, 17, '9781400079988', 'Life of Pi', 354, 'Un joven sobrevive en el mar con un tigre de Bengala.'),
(19, 18, '9780141182803', 'Brave New World', 311, 'Una sociedad futurista basada en el control y el placer.'),
(20, 19, '9780679783268', 'Crime and Punishment', 671, 'Un estudiante comete un crimen y enfrenta las consecuencias morales.');