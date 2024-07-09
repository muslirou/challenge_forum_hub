create table topicos (

    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensagem varchar(200) not null unique,
    data_criacao datetime not null,
    status varchar(100) not null,
    autor varchar(100) not null,
    curso varchar(100) not null,
    respostas varchar(250) not null,

    primary key(id)

);