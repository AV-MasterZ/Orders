CREATE TABLE orders (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    customer_name varchar(50) NOT NULL,
    customer_address varchar(200) NOT NULL,
    amount bigint NOT NULL,
    created_dt timestamp NOT NULL
);

CREATE TABLE products (
    serial_number varchar(50) PRIMARY KEY,
    title varchar(50) NOT NULL,
    description text,
    sp_date date NOT NULL
);

CREATE TABLE order_details (
    id bigint PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    product_serial_number varchar(50) REFERENCES products (serial_number) NOT NULL,
    quantity integer NOT NULL,
    order_id bigint REFERENCES orders (id) NOT NULL
);