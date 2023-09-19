CREATE TABLE `spring_crud_basico`.`person`
(
    `id`            BIGINT      NOT NULL AUTO_INCREMENT,
    `name`          VARCHAR(30) NOT NULL,
    `user_name`     VARCHAR(30) NOT NULL,
    `date_registry` DATE        NOT NULL,
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB;