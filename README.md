#### 1.环境配置
JDK1.8+
Tomcat8
<br>Mysql5.6+
#### 2.部署说明
a.建议使用Eclipse打开项目，更新项目，修改conf.properties的数据库账号密码,导出为war文件放置Tomcat根目录下
<br> b.将src\main\resources目录下的imxss.sql导入mysql中
<br> c.在user_info表中添加一个用户
<br>```INSERT INTO `imxss`.`user_info` (`id`, `userPwd`, `mobile`, `email`, `createTime`, `status`, `roleId`, `logo`, `nickName`, `smtp`, `sendEmail`, `sendPwd`) VALUES (NULL, 'd70488316f90e4b3b14f532f197adfa8', '18888888888', 'admin@admin.com', NULL, '0', '1', NULL, 'admin', NULL, NULL, NULL)```
 即创建一个用户名为admin@admin.com,密码为123456的账户
<br>d.访问网站，完成操作
#### 3.免安装说明
a.使用Eclipse打开项目，更新项目，导出为war文件放置Tomcat根目录下
<br>b.将src\main\resources\config\conf.properties的installed字段改为1
<br>c.在服务器启动后访问/install/install.jsp进行安装
#### 4.尾巴
a.这份代码是fork人家的，但是在免安装操作的时候始终返回“数据库写入失败”，被迫修改installed=0实施手动安装
b.原本的数据库文件imxss.sql在导入过程中会存在中文乱码，所以进行了一些修改
c.手动导入的密码是经过MD5多次加密的，需要查看源码自己打印出想要的密码
