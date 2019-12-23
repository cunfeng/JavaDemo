package com.example.client.domain;

import lombok.Data;

@Data
public class Addesss {
    private String addressId;//"地址的id"
    private String userOpenid;//"用户的openid",
    private String userName;//"用户的姓名",
    private String userPhone;//"用户的电话",
    private String userSex;// "用户的性别"
    private String userAddress;//"用户的地址"
    private String addressDoorplate;//"门牌号"
    private String addressTitle;//"标签"
}
