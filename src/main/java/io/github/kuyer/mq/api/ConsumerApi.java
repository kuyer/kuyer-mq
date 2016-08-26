package io.github.kuyer.mq.api;

import java.util.List;

/**
 * 消息消费接口
 * @author rory.zhang
 */
public interface ConsumerApi {
	
	/**
	 * 根据队列获取消息
	 * @param queueName 队列名称
	 */
	public void getMessage(String queueName);
	
	/**
	 * 根据队列获取消息
	 * @param queueName 队列名称
	 * @param isRead 是否已读 true表示已读；false表示未读
	 */
	public void getMessage(String queueName, Boolean isRead);
	
	/**
	 * 根据消息ID删除消息
	 * @param messageId
	 * @return
	 */
	public boolean deleteMessage(String messageId);
	
	/**
	 * 根据消息ID删除消息
	 * @param messageId
	 * @return
	 */
	public boolean deleteMessage(List<String> messageIds);

}
