package com.demo.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210459+09:00", comments = "Source Table: users")
	public static final Users users = new Users();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210567+09:00", comments = "Source field: users.id")
	public static final SqlColumn<Integer> id = users.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210599+09:00", comments = "Source field: users.birthday")
	public static final SqlColumn<Date> birthday = users.birthday;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210625+09:00", comments = "Source field: users.name")
	public static final SqlColumn<String> name = users.name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210527+09:00", comments = "Source Table: users")
	public static final class Users extends SqlTable {
		public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
		public final SqlColumn<Date> birthday = column("birthday", JDBCType.DATE);
		public final SqlColumn<String> name = column("name", JDBCType.LONGVARCHAR);

		public Users() {
			super("users");
		}
	}
}