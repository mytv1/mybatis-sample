package com.demo.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ItemsDynamicSqlSupport {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211926+09:00", comments = "Source Table: items")
	public static final Items items = new Items();
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212567+09:00", comments = "Source field: items.id")
	public static final SqlColumn<Integer> id = items.id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212627+09:00", comments = "Source field: items.user_id")
	public static final SqlColumn<Integer> userId = items.userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212677+09:00", comments = "Source field: items.name")
	public static final SqlColumn<String> name = items.name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212002+09:00", comments = "Source Table: items")
	public static final class Items extends SqlTable {
		public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
		public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);
		public final SqlColumn<String> name = column("name", JDBCType.LONGVARCHAR);

		public Items() {
			super("items");
		}
	}
}