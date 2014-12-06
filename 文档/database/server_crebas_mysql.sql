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
   CLASS_TYPE           int not null comment '1:公用类; 2:请求类; 3:响应类',
   STATUS               int not null comment '0-无效，-1-不存在，1-有效，2-待确认，3-未设计，4-已开发',
   CLASS_BELONG         int comment '响应类要填写它归属的哪个请求类',
   CLASS_MEMO           varchar(4000),
   ORDER_BY             float,
   UPDATE_DATE          datetime,
   TEST_URL             varchar(200),
   TEST_TYPE            int comment 'json测试必须提供；1:提供智能测试',
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
   VARIABLE_CLASSRELATION varchar(100) comment '如果变量类名中包含?，则需要在这里指定?代表的具体类名',
   VARIABLE_DESC        varchar(100) not null,
   VARIABLE_MUST        int not null comment '0-非必填，1-必填，-1-未知',
   VARIABLE_STATUS      int not null comment '1-正常，2-扩展预留，3-仅对测试有效，-1-有疑问',
   VARIABLE_MEMO        varchar(1024),
   RELATION_CLASS_ID    int not null comment '该变量属于哪个类',
   ORDER_BY             int,
   TEST_TYPE            int comment '默认为文本输入，1-select选择',
   TEST_DATASET         varchar(1024) comment '用于提供测试中需要的数据',
   TEST_DESC            varchar(200),
   primary key (VARIABLE_ID)
);

alter table TL_CLASS_INFO add constraint FK_Reference_1 foreign key (PROJECT_ID)
      references TL_PROJECT (PROJECT_ID) on delete restrict on update restrict;

alter table TL_SERVER_INFO add constraint FK_Reference_3 foreign key (PROJECT_ID)
      references TL_PROJECT (PROJECT_ID) on delete restrict on update restrict;

alter table TL_VARIABLE add constraint FK_Reference_2 foreign key (RELATION_CLASS_ID)
      references TL_CLASS_INFO (CLASS_ID) on delete restrict on update restrict;

