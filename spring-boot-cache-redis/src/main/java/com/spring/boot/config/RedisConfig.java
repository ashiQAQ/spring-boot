package com.spring.boot.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Bean
//    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {  
//        StringRedisTemplate template = new StringRedisTemplate(factory);  
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);  
//        ObjectMapper om = new ObjectMapper();  
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);  
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);  
//        jackson2JsonRedisSerializer.setObjectMapper(om);  
//        template.setValueSerializer(jackson2JsonRedisSerializer);  
//        template.afterPropertiesSet();  
//        return template;  
//    }
	
}
