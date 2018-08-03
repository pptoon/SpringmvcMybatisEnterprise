# 创建库和用户，分配权限
``` sql
create user ju identified by 'ju';
create database mybatis;
use mybatis;
grant all privileges on mybatis.* to ju ;
flush privileges;
```

# 创建表
``` sql
#创建一个tb_user表，有id, name  sex、 age列
CREATE TABLE tb_user(
  ID INT(11) PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(18) DEFAULT NULL,
  SEX CHAR(2) DEFAULT NULL,
  AGE INT(11) DEFAULT NULL
);

```

# 错误解决
```
# mysql Authentication plugin ‘caching_sha2_password’ cannot be loaded 
ALTER USER ju@localhost IDENTIFIED WITH mysql_native_password BY 'ju';

# Cause: java.sql.SQLException: Could not retrieve transation read-only status server
mysql 版本太新，将maven中的包由 mysql-connector-java-5.1.29.jar替换成：mysql-connector-java-8.0.12
```

如果坚持要用5.1.29来连接mysql 8 ，可以试试网上的文章（我没试）：
[解决： ERROR JDBCExceptionReporter:78 - Could not retrieve transation read-only status server](https://blog.csdn.net/zero_plus/article/details/47295507)