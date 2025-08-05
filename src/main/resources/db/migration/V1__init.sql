CREATE TABLE donor (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    email VARCHAR(255),
    name VARCHAR(255)
);

CREATE TABLE payment (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    payment_ref VARCHAR(255),
    amount BIGINT,
    status VARCHAR(20),
    creation_instant TIMESTAMP
);

CREATE TABLE donation (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    donor_id BIGINT,
    payment_id BIGINT,
    FOREIGN KEY (donor_id) REFERENCES donor(id),
    FOREIGN KEY (payment_id) REFERENCES payment(id)
);
