package br.com.gomes.bankclienttransaction.amqp;

import br.com.gomes.bankclienttransaction.utils.AMQPConstantes;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovimentoContaCorrenteAMQPConfiguracao {
	@Bean
	Queue queue() {
		return new Queue(AMQPConstantes.QUEUE_NAME_CLIENT_TRANSACTION, false);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange(AMQPConstantes.TOPIC_EXCHANGE_NAME);
	}

	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(AMQPConstantes.ROUTING_KEY_TRANSACTION);
	}

	@Bean
	SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(AMQPConstantes.QUEUE_NAME_NOTIFICATION);
		return container;
	}
	
	@Bean
	public RabbitTemplate rabbitTemplate(
			ConnectionFactory connectionFactory,
			Jackson2JsonMessageConverter messageConverter) {
		
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(messageConverter);
		return rabbitTemplate;
	}
	
	@Bean
	public Jackson2JsonMessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	} 
}
