-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('签到情况', '2012', '1', '/system/attendance', 'C', '0', 'system:attendance:view', '#', 'admin', sysdate(), '', null, '签到情况菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('签到情况查询', @parentId, '1',  '#',  'F', '0', 'system:attendance:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('签到情况新增', @parentId, '2',  '#',  'F', '0', 'system:attendance:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('签到情况修改', @parentId, '3',  '#',  'F', '0', 'system:attendance:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('签到情况删除', @parentId, '4',  '#',  'F', '0', 'system:attendance:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('签到情况导出', @parentId, '5',  '#',  'F', '0', 'system:attendance:export',       '#', 'admin', sysdate(), '', null, '');
