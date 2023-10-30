CREATE SCHEMA `wallet_balance_directory`;

CREATE TABLE `wallet_balance_directory`.`currency` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
