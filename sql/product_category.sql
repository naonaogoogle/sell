create table product_category
(
  category_id int auto_increment
    primary key,
  category_name varchar(64) not null comment '类目名称',
  category_type int not null comment '类目编号',
  create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP not null comment '修改时间',
  constraint uqe_category_type
  unique (category_type)
)
  comment '类目表'
;

