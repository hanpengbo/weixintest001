package com.hpb.weixintest001.model.message.req;

/**
 * Created by hpb on 2018-02-22.
 */
/**
 * 图片消息
 *
 */
public class ImageMessage extends BaseMessage {
    // 图片链接
    private String PicUrl;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }
}
