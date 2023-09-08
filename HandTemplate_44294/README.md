## 一、项目结构
![img.png](source/mdImgs/img.png)
#### 疑问
* vo: 不可变的属性、只有getter方法、表示领域对象的属性
* dto: 用于传输数据对象，通常用于在不同层之间传递数据

----
## 二、学习记录
### 依赖注入
#### 方式
* setter
* 构造方法
#### 场景
* 普通Bean注入
  * @Component + @Autowired
  * @Scope 设置Bean的作用域
* 设置别名
  * @Bean(name)
  * @Qualifier(name)
  
  ![img_2.png](source/mdImgs/img_l_2.png)
* 忽略不存在的Bean
  * @Autowired(required=false)
* Bean注入List
  * @Component + @Order + @Autowired

  ![img.png](source/mdImgs/img_l.png)

#### Bean没有@Component注解（三方库）
```Java
@Configuration
@ComponentScan
public class AppConfig {
    // 创建一个Bean:
    @Bean
    ZoneId createZoneId() {
        return ZoneId.of("Z");
    }
}
```
### Bean创建
#### 初始化和销毁
* @PostConstruct
* @PreDestroy
* Spring只根据注解寻找没有参数的方法，与方法名无关
#### 通过工厂模式创建Bean（TODO:工厂模式）
* 实现Factory<T>接口
* 重写getObject方法

----

## 三、项目练习

### 全局异常处理
![img_1.png](source/mdImgs/img_1.png)
#### 自定义的异常类
  * 部分场景，手动抛出异常结束程序，反馈信息更灵活
#### 配置全局异常处理器
  * 让自定义异常类生效
  * 对未知异常进行标记和处理

----

### 前后端交互协议
![img_2.png](source/mdImgs/img_2.png)
#### 响应格式
![img_4.png](source/mdImgs/img_4.png)
#### 疑惑
* Rs类应该放在哪个包里

----

### API控制层
* 暴露 API

![img_3.png](source/mdImgs/img_3.png)

----

### 接口测试
![img_5.png](source/mdImgs/img_5.png)

* 接口测试文件(Postman Json)

![img_6.png](source/mdImgs/img_6.png)

### Mybatis增删改查
#### 建表SQL文件
![img.png](source/mdImgs/img_l_3.png)
#### 增删改查
* 批量插入

![img_7.png](source/mdImgs/img_7.png)
* 修改

![img_8.png](source/mdImgs/img_8.png)
* 删除

![img_9.png](source/mdImgs/img_9.png)
* 查询

![img_10.png](source/mdImgs/img_10.png)

#### 增删改查的Junit 测试
![img_16.png](source/mdImgs/img_16.png)

#### 多条件查询
![img_11.png](source/mdImgs/img_11.png) 

#### 多表查询
##### 一对一
  * 查询老师对应的课程（一个课程一个老师）
![img_13.png](source/mdImgs/img_13.png)
![img.png](source/mdImgs/img_b.png)
##### 一对多
  * 查询某个部门中的员工（一个部门多个员工）
![img_12.png](source/mdImgs/img_12.png)
![img_1.png](source/mdImgs/img_b_1.png)
* 多对多
  * 查询各学生的成绩单信息（一个学生多门课程，一门课程多个学生）

![img_14.png](source/mdImgs/img_14.png)

![img_15.png](source/mdImgs/img_15.png)

![img_2.png](source/mdImgs/img_b_2.png)
