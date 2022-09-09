package com.exquilla.kafkaExample.config;
import org.apache.kafka.clients.admin.NewTopic;
@Configuration
class topicConfig {
	@Bean
	public NewTopic demoTopic() {
		return TopicBuilder.name("demo")
				.build();
	}
}
