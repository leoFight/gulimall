package com.leofight.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 1、如何使用Nacos作为配置中心管理配置
 * 1）、引入依赖
 * 		<dependency>
 * 			<groupId>com.alibaba.cloud</groupId>
 * 			<artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 * 		</dependency>
 * 	2）、创建一个bootstrap.properties
 * 		spring.application.name=gulimall-coupon
 * 		spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 	3)、需要给配置中心默认添加一个叫数据集（Data Id）gulimall-coupon.properties。默认规则，应用名.properties
 * 	4)、给 应用名.properties 添加任何配置
 * 	5）、动态获取配置
 * 		@RefreshScope：动态获取并刷新配置
 * 		@Value("${配置项的名}"):获取到配置
 * 		如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 * 	2、 细节
 * 	1）、命名空间： 配置隔离
 * 		默认：public（保留空间）：默认新增的所有配置都在public空间
 * 		1、 开发、测试、生产：利用命名空间来做环境隔离
 * 			注意：在bootstrap.properties;配置上，需要使用哪个命名空间下的配置
 * 			spring.cloud.nacos.config.namespace=055b2688-6448-4d50-9962-ec329d39efe0
 * 		2、每一个微服务之间互相隔离配置，每一个微服务创建自己的命名空间，只加载自己命名空间下的所有配置
 * 	2）、配置集：所有的配置的集合
 * 	3）、配置集ID:类似文件名
 * 		Data ID:类似文件名
 * 	4）、 默认分组
 * 		默认所有的配置集都属于：DEFAULT_GROUP:
 * 		1111,618 ,1212
 * 	每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
