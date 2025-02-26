CREATE TABLE USUARIO(
  ID NUMBER(9) GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  nombre VARCHAR2(30) NOT NULL,
  apellido1 VARCHAR2(30) NOT NULL,
  apellido2 VARCHAR2(30) NOT NULL,
  email VARCHAR2(40) NOT NULL,
  contrasenia VARCHAR2(30) NOT NULL
);

CREATE TABLE TLFNO_USUARIO(
  id_usuario NUMBER(9),
  tlfno NUMBER(9),
  PRIMARY KEY (id_usuario,tlfno),
  FOREIGN KEY (id_usuario) REFERENCES USUARIO(ID)
);

CREATE TABLE UBICACION(
  ID NUMBER(9) GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  pais VARCHAR2(30) NOT NULL,
  ciudad VARCHAR2(30) NOT NULL,
  localidad VARCHAR2(30) NOT NULL,
  calle VARCHAR2(30) NOT NULL,
  cod_pos NUMBER(6) NOT NULL,
  numero NUMBER(3)
);

CREATE TABLE CATEGORIA(
  ID NUMBER(9) GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  nombre VARCHAR2(30),
  descripcion VARCHAR2(250)
);

CREATE TABLE ORGANIZADOR(
  ID NUMBER(9) GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  razon VARCHAR2(30)
);
CREATE TABLE TLFNO_ORGANIZADOR(
  id_organizador NUMBER(9),
  tlfno NUMBER(9),
  PRIMARY KEY (id_organizador, tlfno),
  FOREIGN KEY (id_organizador) REFERENCES ORGANIZADOR(ID)
);

CREATE TABLE EVENTO(
  ID NUMBER(9) GENERATED ALWAYS AS IDENTITY PRIMARY KEY,  
  nombre VARCHAR2 (30) NOT NULL,
  fecha DATE NOT NULL,
  duracion VARCHAR2(5) NOT NULL,  --Sigue el modelo "hh:mm"
  hora_inicio VARCHAR2(30) NOT NULL,
  id_ubicacion NUMBER(9),
  tipo VARCHAR2(1) CHECK(tipo IN ('T', 'C', 'A'))NOT NULL ,
  id_organizador NUMBER(9)NOT NULL,
  id_categoria NUMBER(9) NOT NULL,
  FOREIGN KEY (id_ubicacion) REFERENCES UBICACION(ID),
  FOREIGN KEY (id_organizador) REFERENCES ORGANIZADOR(ID),
  FOREIGN KEY (id_categoria) REFERENCES CATEGORIA(ID)
);

CREATE TABLE INSCRIPCION(
  id_usuario NUMBER(9),
  id_evento NUMBER(9),
  fecha_inscripcion DATE NOT NULL,
  PRIMARY KEY(id_usuario,id_evento),
  FOREIGN KEY(id_evento) REFERENCES EVENTO(ID),
  FOREIGN KEY(id_usuario) REFERENCES USUARIO(ID)
);