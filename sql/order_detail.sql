create table order_detail
(
	detail_id varchar(32) not null
		primary key,
	order_id varchar(32) not null,
	product_id varchar(32) not null,
	prodict_name varchar(64) not null comment '商品名称',
	product_price decimal(8,2) not null comment '商品价格',
	product_quantity int not null comment '商品数量',
	product_icon varchar(512) null comment '商品小图',
	create_time timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
	update_time timestamp default CURRENT_TIMESTAMP not null comment '修改时间'
)
comment '订单详情表'
;

create index idx_order_id
	on order_detail (order_id)
;

