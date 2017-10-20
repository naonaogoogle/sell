create table product_info
(
  product_id varchar(32) not null
    primary key,
  product_name varchar(64) not null comment '商品名称',
  product_price decimal(8,2) not null comment '单价',
  product_stock int not null comment '库存',
  product_description varchar(64) null comment '描述',
  product_icon varchar(512) null comment '小图',
  category_type int not null comment '类目编号',
  create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP not null comment '修改时间'
)
  comment '商品表'
;

