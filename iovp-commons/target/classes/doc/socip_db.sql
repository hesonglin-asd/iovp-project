-- =======================================================================================
-- ==========          Smart Offcial Cars Information Platform (SOCIP)          ==========
-- ==========          Database Initialization SQL                              ==========
-- ==========          @Author: Arthur                                          ==========
-- ==========          @Version: 1.0.0                                          ==========
-- ==========          @Since: 1.0.0                                            ==========
-- =======================================================================================
-- ====== 创建并使用数据库：socip_db
drop database if exists socip_db;
create database socip_db character set utf8mb4;
use socip_db;

-- ====== 部门信息表：sys_department
drop table if exists sys_department;
create table sys_department(
    id varchar(100) not null comment '主键',
    parent varchar(100) comment '上级部门',
    name varchar(100) not null comment '部门名称',
    code varchar(100) not null comment '部门编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='部门信息表';

-- ====== 角色信息表：sys_role
drop table if exists sys_role;
create table sys_role(
    id varchar(100) not null comment '主键',
    name varchar(100) not null comment '角色名称',
    code varchar(100) not null comment '角色编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='角色信息表';

-- ====== 菜单信息表：sys_menu
drop table if exists sys_menu;
create table sys_menu(
    id varchar(100) not null comment '主键',
    parent varchar(100) comment '上级菜单',
    text varchar(100) not null comment '菜单名称',
    code varchar(100) not null comment '菜单编码',
    url varchar(100) comment '链接地址',
    icon varchar(100) comment '菜单图标',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='菜单信息表';

-- ====== 角色菜单表：sys_role_menu
drop table if exists sys_role_menu;
create table sys_role_menu(
    role varchar(100) comment '角色信息',
    menu varchar(100) comment '菜单信息'
)Engine=InnoDB charset=utf8mb4 comment='角色菜单表';

-- ====== 用户信息表：sys_user
drop table if exists sys_user;
create table sys_user(
    id varchar(100) not null comment '主键',
    name varchar(100) not null comment '用户名称',
    cellphone varchar(100) not null comment '手机号码',
    password varchar(500) not null comment '登录密码：MD5 加密',
    role varchar(100) not null comment '用户角色',
    department varchar(100) not null comment '用户部门',
    idCard varchar(100) not null comment '身份证号码',
    email varchar(500) comment '电子邮箱地址',
    avatar varchar(500) comment '用户头像',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='用户信息表';

-- ====== 驾驶员状态信息表：sys_driver_status
drop table if exists sys_driver_status;
create table sys_driver_status(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '状态文本',
    code varchar(100) not null comment '状态编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='驾驶员状态信息表';

-- ====== 驾驶证类型信息表：sys_driver_license_type
drop table if exists sys_driver_license_type;
create table sys_driver_license_type(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '类型文本',
    code varchar(100) not null comment '类型编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='驾驶证类型信息表';

-- ====== 驾驶员信息表：sys_driver
drop table if exists sys_driver;
create table sys_driver(
    id varchar(100) not null comment '主键',
    name varchar(100) not null comment '驾驶员名称',
    cellphone varchar(100) not null comment '手机号码',
    licenseType varchar(100) not null comment '驾驶证类型',
    licenseNo varchar(100) not null comment '驾驶证号码',
    licenseImage varchar(500) comment '驾驶证照片',
    idCard varchar(100) not null comment '身份证号码',
    idCardImage varchar(500) comment '身份证号码照片',
    licensePoints int(10) not null default 0 comment '驾驶证累计积分',
    driverStatus varchar(100) comment '驾驶员状态',
    remark varchar(500) comment '备注',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='驾驶员信息表';

-- ====== 合作单位类型信息表：unit_type
drop table if exists unit_type;
create table unit_type(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '类型文本',
    code varchar(100) not null comment '类型编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='合作单位类型信息表';

-- ====== 合作单位信息表：unit_info
drop table if exists unit_info;
create table unit_info(
    id varchar(100) not null comment '主键',
    unitType varchar(100) not null comment '单位类型',
    unitName varchar(100) not null comment '单位名称',
    linkman varchar(100) not null comment '联系人姓名',
    cellphone varchar(100) not null comment '联系人手机号码',
    address varchar(500) not null comment '合作单位地址',
    remark varchar(500) comment '备注',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='合作单位信息表';

-- ====== 车辆座位数信息表：car_seat
drop table if exists car_seat;
create table car_seat(
    id varchar(100) not null comment '主键',
    number varchar(100) not null comment '座位数量',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆座位数信息表';

-- ====== 车辆状态信息表：car_status
drop table if exists car_status;
create table car_status(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '状态文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆状态信息表';

-- ====== 油料标号类型表：car_oil_label
drop table if exists car_oil_label;
create table car_oil_label(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='油料标号类型表';

-- ====== 维修保养类型信息表：car_maintenance_type
drop table if exists car_maintenance_type;
create table car_maintenance_type(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='维修保养类型信息表';

-- ====== 违章类型信息表：car_violation_type
drop table if exists car_violation_type;
create table car_violation_type(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='违章类型信息表';

-- ====== 用车费用类型信息表：car_expense_type
drop table if exists car_expense_type;
create table car_expense_type(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='用车费用类型信息表';

-- ====== 车辆类型类型信息表：car_brand_type
drop table if exists car_brand_type;
create table car_brand_type(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆类型类型信息表';

-- ====== 车辆信息表：car_info
drop table if exists car_info;
create table car_info(
    id varchar(100) not null comment '主键',
    no varchar(100) not null comment '车牌号码',
    brand varchar(100) not null comment '车辆品牌',
    seat varchar(100) not null comment '车辆座位数',
    engineNo varchar(100) not null comment '发动机号码',
    frameNo varchar(100) not null comment '车架号码',
    carImage varchar(500) comment '车辆照片',
    purchaseDate date comment '购买时间',
    nextInspectDate date comment '下次年检时间',
    expireInsuranceDate date comment '保险到期时间',
    carStatus varchar(100) not null comment '车辆状态',
    remark varchar(500) comment '备注',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆信息表';

-- ====== 车辆加油记录表：car_oil_record
drop table if exists car_oil_record;
create table car_oil_record(
    id varchar(100) not null comment '主键',
    car varchar(100) not null comment '车牌号码',
    unit varchar(100) not null comment '合作单位',
    oilLabel varchar(100) not null comment '油料标号',
    unitPrice decimal(10, 2) not null comment '油料单价',
    volume decimal(10, 2) not null comment '加油容量',
    totalAmount decimal(10, 2) not null comment '总加油金额',
    oilDate date comment '加油日期',
    remark varchar(500) comment '备注',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆加油记录表';

-- ====== 车辆维修保养记录表：car_maintenance_record
drop table if exists car_maintenance_record;
create table car_maintenance_record(
    id varchar(100) not null comment '主键',
    car varchar(100) not null comment '车牌号码',
    unit varchar(100) not null comment '合作单位',
    maintenanceType varchar(100) not null comment '保养类型',
    totalAmount decimal(10, 2) not null comment '总加油金额',
    maintenanceDate date comment '保养日期',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆维修保养记录表';

-- ====== 车辆违章记录表：car_violation_record
drop table if exists car_violation_record;
create table car_violation_record(
    id varchar(100) not null comment '主键',
    car varchar(100) not null comment '车牌号码',
    violationType varchar(100) not null comment '违章类型',
    address varchar(500) not null comment '违章地点',
    points int(10) not null comment '违章扣分',
    amount decimal(10, 2) not null comment '违章罚款',
    driver varchar(100) not null comment '驾驶员信息',
    violationStatus int (2) not null default 0 comment '违章处理状态：0-未处理，1-已处理',
    violationDate date comment '违章日期',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆违章记录表';

-- ====== 车辆年检记录表：car_inspect_record
drop table if exists car_inspect_record;
create table car_inspect_record(
    id varchar(100) not null comment '主键',
    car varchar(100) not null comment '车牌号码',
    unit varchar(100) not null comment '合作单位',
    inspectDate date comment '年检日期',
    nextInspectDate date comment '下一次年检日期',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆年检记录表';

-- ====== 保险记录表：car_insurance_record
drop table if exists car_insurance_record;
create table car_insurance_record(
    id varchar(100) not null comment '主键',
    car varchar(100) not null comment '车牌号码',
    unit varchar(100) not null comment '合作单位',
    amount decimal(10, 2) not null comment '投保金额',
    insuranceDate date comment '投保日期',
    expireInsuranceDate date comment '保险到期时间',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='保险记录表';

-- ====== 车辆使用记录表：car_use_record
drop table if exists car_use_record;
create table car_use_record(
    id varchar(100) not null comment '主键',
    car varchar(100) not null comment '车牌号码',
    apply varchar(100) not null comment '申请编号',
    beginDate datetime not null comment '开始用车日期',
    expectBackDate datetime not null comment '预计还车日期',
    realityBackDate datetime comment '实际还车日期',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆使用记录表';

-- ====== 车辆申请状态信息表：car_apply_status
drop table if exists car_apply_status;
create table car_apply_status(
    id varchar(100) not null comment '主键',
    text varchar(100) not null comment '状态文本',
    code varchar(100) not null comment '编码',
    status int(2) not null default 1 comment '系统状态：0-禁用，1-启用',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆申请状态信息表';

-- ====== 车辆申请使用记录表：car_apply
drop table if exists car_apply;
create table car_apply(
    id varchar(100) not null comment '主键',
    applyNo varchar(100) not null comment '申请编号',
    applyUser varchar(100) not null comment '申请人',
    applyCellphone varchar(100) not null comment '申请人手机号码',
    memberCount int(2) not null comment '成员数量',
    applyBeginDate datetime not null comment '申请出行日期',
    expectBackDate datetime not null comment '申请返回日期',
    targetAddress varchar(500) not null comment '出行目的地',
    applyRemark varchar(500) comment '申请备注',
    applyDate datetime not null default CURRENT_TIMESTAMP comment '申请日期',
    examineUser varchar(100) comment '审核人',
    examineRemark varchar(500) comment '审核备注',
    examineDate datetime comment '审核日期',
    car varchar(100) comment '车辆信息',
    driver varchar(100) comment '驾驶员信息',
    driverCellphone varchar(100) comment '驾驶员手机号码',
    realityBackDate datetime comment '实际换车日期',
    applyStatus varchar(100) not null comment '申请状态',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateUser varchar(100) comment '修改人',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆申请使用记录表';

-- ====== 车辆使用费用记录表：car_use_expense
drop table if exists car_use_expense;
create table car_use_expense(
    id varchar(100) not null comment '主键',
    apply varchar(100) not null comment '申请信息',
    car varchar(100) not null comment '车辆信息',
    expenseType varchar(100) not null comment '费用类型',
    expenseAmount decimal(10, 2) comment '费用金额',
    createUser varchar(100) comment '创建人',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    primary key (id)
)Engine=InnoDB charset=utf8mb4 comment='车辆使用费用记录表';