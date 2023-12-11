CREATE SCHEMA `wallet_balance_directory`;

CREATE TABLE `wallet_balance_directory`.`wallet` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `user` VARCHAR(45) NULL,
  PRIMARY KEY (`id`)
);
  
  
CREATE TABLE `wallet_balance_directory`.`currency` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `walletId` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`walletId`) REFERENCES wallet(`id`)
);

insert into wallet_balance_directory.wallet values (1, 'Rafal', 'Rafal');

insert into wallet_balance_directory.currency values (1, "BTC", 1);
insert into wallet_balance_directory.currency values (2, "ETH", 1);