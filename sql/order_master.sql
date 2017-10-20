create table order_master
(
  order_id varchar(32) not null
    primary key,
  buyer_name varchar(32) not null comment '买家名字',
  buyer_phone varchar(32) not null comment '买家电话',
  buyer_address varchar(128) not null comment '买家地址',
  buyer_openid varchar(64) not null comment '买家微信openid',
  order_amount decimal(8,2) not null comment '订单总金额',
  order_status tinyint(3) default '0' not null comment '订单状态,默认0新下单',
  pay_status tinyint(3) default '0' not null comment '支付状态，默认0，未支付',
  create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
  update_time timestamp default CURRENT_TIMESTAMP not null comment '修改时间'
)
  comment '订单表'
;

create index idx_buyer_openid
  on order_master (buyer_openid)
;

