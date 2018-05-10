# 蚂蚁矿池招聘各种语言工程师
```
工作职责:
	1.参与挖矿、账务、统计、底层区块链等系统的设计与开发;
	2.参与系统逻辑模型和物理模型的设计, 负责业务功能实现和线上代码调优;
	3.负责相关技术基础架构的设计和搭建, 提升工程效率与工程质量;
任职资格:
	1.熟练使用 Java/Python/Go/C++中的任何一门语言;
	2.熟悉 RESTful 服务，深刻理解 MVC、OOP、IoC、AOP 等概念;
	3.熟练使用关系、文档性数据库;
	4.熟悉缓存、消息队列、定时任务等相关技术;
	5.能独立分析问题, 善于研究业务, 分析产品, 有 data sense;
	6.为人踏实, 善良正直, 热爱学习技术, 长期关注技术的发展趋势;
	7.熟悉比特币与区块链原理优先，github与stackoverflow贡献者优先;
	8.简历投递sen.hong@bitmain.com
```
# naivechain
Naivechain - a blockchain implementation in 200 lines of code.

### Quick start
```
git clone https://github.com/sunysen/naivechain.git
cd naivechain
mvn clean install
java -jar naivechain.jar 8080 7001
java -jar naivechain.jar 8081 7002 ws://localhost:7001

```


### HTTP API

- query blocks

  ```
  curl http://localhost:8080/blocks

  ```

- mine block

  ```
  curl -H "Content-type:application/json" --data '{"data" : "Some data to the first block"}' http://localhost:8080/mineBlock

  ```

- add peer

  ```
  curl http://localhost:8080/addPeer?peer=ws://localhost:7001

  ```

- query peers

  ```
  curl http://localhost:8080/peers
  ```
