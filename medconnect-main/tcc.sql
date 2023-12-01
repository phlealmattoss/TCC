create database medconnect;
use medconnect;

CREATE TABLE Atendimento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT,
    id_profissional INT,
	id_hospital INT,
    data_hora DATETIME not null,
    observacoes TEXT,
    diagnostico TEXT not null,
    tratamento_prescrito TEXT not null,
    FOREIGN KEY (id_paciente) REFERENCES Pacientes(id),
    FOREIGN KEY (id_profissional) REFERENCES Profissionais(id),
    FOREIGN KEY (id_hospital) REFERENCES Hospital(id)
);
CREATE TABLE Hospital (
    id_hospital INT AUTO_INCREMENT PRIMARY KEY,
    nome_hospital VARCHAR(255) not null,
    endereco_hospital TEXT not null
 );
 
create table paciente (
 id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    cpf varchar(20) not null,
    nome VARCHAR(255)not null,
    sobrenome VARCHAR(255)not null,
    genero VARCHAR(10)not null,
    endereco TEXT not null,
    estado_civil varchar(25) not null,
    telefone VARCHAR(20)not null,
    email VARCHAR(255)not null,
    senha  VARCHAR(255)not null,
    contato_emergencia VARCHAR(255) not null,
    data_nascimento date not null,
    idade int not null,
    cep varchar(10) not null,
    COMO_NOS_CONHECEU VARCHAR(255)not null,
    QUEIXA VARCHAR(255)not null,
    ACOMPANHAMENTO_ESPECIALISTA VARCHAR(255)not null,
	ALERGIAS VARCHAR(255)not null,
    MEDICAMENTOS_USO VARCHAR(255)not null,
    SINTOMAS_FEBRE VARCHAR(255)not null,
    ATIVIDADE_FÍSICA VARCHAR(255)not null,
    CRISE_CONVULSIVA VARCHAR(255)not null,
    DORES_CORPO VARCHAR(255)not null,
    SINTOMAS_GRIPE VARCHAR(255)not null,
    CIRURGIA_RECENTE VARCHAR(255)not null
    );
    create table login(
    email_cpf varchar (250) not null primary key,
    senha varchar (100) not null
    );
    
    
