package com.hpb.weixintest001.model.message.req;

/**
 * Created by hpb on 2018-02-22.
 */
/**
 * 文本消息
 *
 */
public class TextMessage extends BaseMessage {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
