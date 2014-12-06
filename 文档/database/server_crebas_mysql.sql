/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/11/30 15:10:25                          */
/*==============================================================*/


drop table if exists TL_CLASS_INFO;

drop table if exists TL_PROJECT;

drop table if exists TL_SERVER_INFO;

drop table if exists TL_VARIABLE;

/*==============================================================*/
/* Table: TL_CLASS_INFO                                         */
/*==============================================================*/
create table TL_CLASS_INFO
(
   CLASS_ID             int not null auto_increment,
   PROJECT_ID           int not null,
   PACKAGE_NAME         varchar(50) not null,
   CLASS_NAME           varchar(50) not null,
   CLASS_CN             varchar(50) not null,
   CLASS_TYPE           int not null comment '1:������; 2:������; 3:��Ӧ��',
   STATUS               int not null comment '0-��Ч��-1-�����ڣ�1-��Ч��2-��ȷ�ϣ�3-δ��ƣ�4-�ѿ���',
   CLASS_BELONG         int comment '��Ӧ��Ҫ��д���������ĸ�������',
   CLASS_MEMO           varchar(4000),
   ORDER_BY             float,
   UPDATE_DATE          datetime,
   TEST_URL             varchar(200),
   TEST_TYPE            int comment 'json���Ա����ṩ��1:�ṩ���ܲ���',
   TEST_DEMO            varchar(4000),
   TEST_DEMO_DESC       varchar(4000),
   primary key (CLASS_ID)
);

/*==============================================================*/
/* Table: TL_PROJECT                                            */
/*==============================================================*/
create table TL_PROJECT
(
   PROJECT_ID           int not null auto_increment,
   PROJECT_NAME         varchar(50) not null,
   PROJECT_MEMO         varchar(200),
   primary key (PROJECT_ID)
);

/*==============================================================*/
/* Table: TL_SERVER_INFO                                        */
/*==============================================================*/
create table TL_SERVER_INFO
(
   SERVER_ID            int not null auto_increment,
   PROJECT_ID           int not null,
   SERVER_ADDR          varchar(200) not null,
   SERVER_DESC          varchar(200) not null,
   primary key (SERVER_ID)
);

/*==============================================================*/
/* Table: TL_VARIABLE                                           */
/*==============================================================*/
create table TL_VARIABLE
(
   VARIABLE_ID          int not null auto_increment,
   VARIABLE_NAME        varchar(50) not null,
   VARIABLE_CLASSNAME   varchar(100) not null,
   VARIABLE_CLASSRELATION varchar(100) comment '������������а���?������Ҫ������ָ��?����ľ�������',
   VARIABLE_DESC        varchar(100) not null,
   VARIABLE_MUST        int not null comment '0-�Ǳ��1-���-1-δ֪',
   VARIABLE_STATUS      int not null comment '1-������2-��չԤ����3-���Բ�����Ч��-1-������',
   VARIABLE_MEMO        varchar(1024),
   RELATION_CLASS_ID    int not null comment '�ñ��������ĸ���',
   ORDER_BY             int,
   TEST_TYPE            int comment 'Ĭ��Ϊ�ı����룬1-selectѡ��',
   TEST_DATASET         varchar(1024) comment '�����ṩ��������Ҫ������',
   TEST_DESC            varchar(200),
   primary key (VARIABLE_ID)
);

alter table TL_CLASS_INFO add constraint FK_Reference_1 foreign key (PROJECT_ID)
      references TL_PROJECT (PROJECT_ID) on delete restrict on update restrict;

alter table TL_SERVER_INFO add constraint FK_Reference_3 foreign key (PROJECT_ID)
      references TL_PROJECT (PROJECT_ID) on delete restrict on update restrict;

alter table TL_VARIABLE add constraint FK_Reference_2 foreign key (RELATION_CLASS_ID)
      references TL_CLASS_INFO (CLASS_ID) on delete restrict on update restrict;

