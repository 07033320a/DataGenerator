create table t_data_generator (
	id_ LONG not null primary key,
	data_ VARCHAR(75) null,
	type_ VARCHAR(75) null,
	createDate DATE null
);

create table t_qb_portlet (
	portlet_id LONG not null primary key,
	portlet_name VARCHAR(75) null,
	portlet_label_name VARCHAR(75) null,
	project_id LONG
);

create table t_qb_portlet_field (
	field_id LONG not null primary key,
	field_name VARCHAR(75) null,
	field_label_name VARCHAR(75) null,
	portlet_id LONG,
	reference_portlet_id LONG
);

create table t_qb_project (
	project_id LONG not null primary key,
	project_name VARCHAR(75) null
);

create table talend_TalendProcess (
	processId LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	version VARCHAR(75) null,
	className VARCHAR(75) null,
	fileEntryId LONG,
	description VARCHAR(75) null,
	context VARCHAR(75) null
);