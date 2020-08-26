package com.demo.mybatis.mapper;

import static com.demo.mybatis.mapper.ItemsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.demo.mybatis.model.Items;
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
public interface ItemsMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213504+09:00", comments = "Source Table: items")
	BasicColumn[] selectList = BasicColumn.columnList(id, userId, name);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212724+09:00", comments = "Source Table: items")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212767+09:00", comments = "Source Table: items")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212805+09:00", comments = "Source Table: items")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Items> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212847+09:00", comments = "Source Table: items")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Items> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.212891+09:00", comments = "Source Table: items")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("ItemsResult")
	Optional<Items> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213063+09:00", comments = "Source Table: items")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "ItemsResult", value = {
			@Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
			@Result(column = "name", property = "name", jdbcType = JdbcType.LONGVARCHAR) })
	List<Items> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213148+09:00", comments = "Source Table: items")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213194+09:00", comments = "Source Table: items")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, items, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213231+09:00", comments = "Source Table: items")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, items, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213272+09:00", comments = "Source Table: items")
	default int deleteByPrimaryKey(Integer id_) {
		return delete(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213317+09:00", comments = "Source Table: items")
	default int insert(Items record) {
		return MyBatis3Utils.insert(this::insert, record, items,
				c -> c.map(id).toProperty("id").map(userId).toProperty("userId").map(name).toProperty("name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213379+09:00", comments = "Source Table: items")
	default int insertMultiple(Collection<Items> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, items,
				c -> c.map(id).toProperty("id").map(userId).toProperty("userId").map(name).toProperty("name"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213434+09:00", comments = "Source Table: items")
	default int insertSelective(Items record) {
		return MyBatis3Utils.insert(this::insert, record, items,
				c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(userId)
						.toPropertyWhenPresent("userId", record::getUserId).map(name)
						.toPropertyWhenPresent("name", record::getName));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21356+09:00", comments = "Source Table: items")
	default Optional<Items> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, items, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213599+09:00", comments = "Source Table: items")
	default List<Items> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, items, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213635+09:00", comments = "Source Table: items")
	default List<Items> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, items, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213669+09:00", comments = "Source Table: items")
	default Optional<Items> selectByPrimaryKey(Integer id_) {
		return selectOne(c -> c.where(id, isEqualTo(id_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213762+09:00", comments = "Source Table: items")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, items, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213811+09:00", comments = "Source Table: items")
	static UpdateDSL<UpdateModel> updateAllColumns(Items record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalTo(record::getId).set(userId).equalTo(record::getUserId).set(name)
				.equalTo(record::getName);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21388+09:00", comments = "Source Table: items")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Items record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(id).equalToWhenPresent(record::getId).set(userId).equalToWhenPresent(record::getUserId).set(name)
				.equalToWhenPresent(record::getName);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.213944+09:00", comments = "Source Table: items")
	default int updateByPrimaryKey(Items record) {
		return update(c -> c.set(userId).equalTo(record::getUserId).set(name).equalTo(record::getName).where(id,
				isEqualTo(record::getId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.214003+09:00", comments = "Source Table: items")
	default int updateByPrimaryKeySelective(Items record) {
		return update(c -> c.set(userId).equalToWhenPresent(record::getUserId).set(name)
				.equalToWhenPresent(record::getName).where(id, isEqualTo(record::getId)));
	}
}