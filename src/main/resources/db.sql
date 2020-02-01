DELIMITER //
   DROP PROCEDURE IF EXISTS CategoryProducts //
   CREATE PROCEDURE CategoryProducts (IN category VARCHAR(255))

   BEGIN
      SELECT id, name, category FROM product WHERE category = category;
   END //

DELIMITER ;