-- 1. создаем пользователя
create user adm password 'adm';
-- 2. создаем схему
CREATE SCHEMA sh AUTHORIZATION adm;
-- 3. выдаем дефолтовые привиллегии для pc_ms пользователя
alter default privileges for user adm in schema sh grant select, insert, update, delete on tables to adm;
alter default privileges for user adm in schema sh grant usage, select on sequences to adm;
grant usage on schema sh to adm;
-- 4. устанавливаем дефолтную схему пользователю
alter user adm set search_path = 'sh';