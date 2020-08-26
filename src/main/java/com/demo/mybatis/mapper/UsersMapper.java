package com.demo.mybatis.mapper;

import static com.demo.mybatis.mapper.UsersDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.demo.mybatis.model.Users;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UsersMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21112+09:00", comments = "Source Table: users")
	BasicColumn[] selectList = BasicColumn.columnList(id, birthday, name);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210657+09:00", comments = "Source Table: users")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210685+09:00", comments = "Source Table: users")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210713+09:00", comments = "Source Table: users")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Users> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210739+09:00", comments = "Source Table: users")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Users> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210766+09:00", comments = "Source Table: users")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("UsersResult")
	Optional<Users> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210795+09:00", comments = "Source Table: users")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "UsersResult", value = {
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "birthday", property = "birthday", jdbcType = JdbcType.DATE),
			@Result(column = "name", property = "name", jdbcType = JdbcType.LONGVARCHAR) })
	List<Users> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21089+09:00", comments = "Source Table: users")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210927+09:00", comments = "Source Table: users")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210953+09:00", comments = "Source Table: users")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.210976+09:00", comments = "Source Table: users")
	default int deleteByPrimaryKey(Integer id_) {
		return delete(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211005+09:00", comments = "Source Table: users")
	default int insert(Users record) {
		return MyBatis3Utils.insert(this::insert, record, users,
				c -> c.map(id).toProperty("id").map(birthday).toProperty("birthday").map(name).toProperty("name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211044+09:00", comments = "Source Table: users")
	default int insertMultiple(Collection<Users> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, users,
				c -> c.map(id).toProperty("id").map(birthday).toProperty("birthday").map(name).toProperty("name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211076+09:00", comments = "Source Table: users")
	default int insertSelective(Users record) {
		return MyBatis3Utils.insert(this::insert, record, users,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(birthday)
						.toPropertyWhenPresent("birthday", record::getBirthday).map(name)
						.toPropertyWhenPresent("name", record::getName));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211145+09:00", comments = "Source Table: users")
	default Optional<Users> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21117+09:00", comments = "Source Table: users")
	default List<Users> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211198+09:00", comments = "Source Table: users")
	default List<Users> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211224+09:00", comments = "Source Table: users")
	default Optional<Users> selectByPrimaryKey(Integer id_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211252+09:00", comments = "Source Table: users")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, users, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211295+09:00", comments = "Source Table: users")
	static UpdateDSL<UpdateModel> updateAllColumns(Users record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(birthday).equalTo(record::getBirthday).set(name)
				.equalTo(record::getName);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211375+09:00", comments = "Source Table: users")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Users record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(birthday).equalToWhenPresent(record::getBirthday)
				.set(name).equalToWhenPresent(record::getName);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211422+09:00", comments = "Source Table: users")
	default int updateByPrimaryKey(Users record) {
		return update(c -> c.set(birthday).equalTo(record::getBirthday).set(name).equalTo(record::getName).where(id,
				isEqualTo(record::getId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211491+09:00", comments = "Source Table: users")
	default int updateByPrimaryKeySelective(Users record) {
		return update(c -> c.set(birthday).equalToWhenPresent(record::getBirthday).set(name)
				.equalToWhenPresent(record::getName).where(id, isEqualTo(record::getId)));
	}
}