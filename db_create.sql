CREATE SCHEMA `wallet_balance_directory`;

CREATE TABLE `wallet_balance_directory`.`wallet` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);
  
CREATE TABLE `wallet_balance_directory`.`asset` (
  `id` INT NOT NULL,
  `payment_date` DATETIME NOT NULL,
  `currency_used_for_payment` VARCHAR(7) NOT NULL,
  `value_paid` DECIMAL(10,2) NOT NULL,
  `walletId` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`walletId`) REFERENCES wallet(`id`)
);
