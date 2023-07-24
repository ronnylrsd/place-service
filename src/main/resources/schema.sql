CREATE TABLE IF NOT EXISTS place(
  id bigint AUTO_INCREMENT primary key,
  name varchar(255) NOT NULL,
  slug varchar(255) NOT NULL,
  state varchar(255) NOT NULL,
  created_at timestamp NOT NULL,
  updated_at timestamp NOT NULL
)