package com.commiao.basic.business.tools.sms;

/**
 * 
 * @brief 类简要说明
 *
 *        类详细说明 1.1通过status==0表示发送成功 如果code==CS0000 则表示操作成功 1.2status==1表示发送失败
 *        如果Code==CF0001则表示操作失败 Msg =操作失败 如果Code==CF0007则表示参数解析错误
 *        如果Code==CF0008参数非法 msg=如果没有模板，则内容不能为空 如果Code==CF0009手机号码格式错误
 *        msg=phoneNum:XXX不是正确的手机号码 如果Code==CF0012短信发送次数太多
 *        msg=每个手机号码每天发送短信验证码的次数不得超过15条 如果Code==CF0013短信发送间隔太短
 *        msg=短信发送间隔不到30秒，请耐心等待
 * 
 * @author - 2016年8月10日 程珑 创建初始版本
 *
 */
public class SmsMsgState {
    public static String getDescription(String code) {
        switch (code) {
        case "CS0000":
            return "success";
        case "CF0001":
            return "操作失败";
        case "CF0007":
            return "参数解析错误";
        case "CF0008":
            return "如果没有模板，则内容不能为空";
        case "CF0009":
            return "手机号码格式错误";
        case "CF0012":
            return "今日的操作次数已超限，请您明日再试";
        case "CF0013":
            return "操作太频繁，请您稍后再试";
        default:
            return null;
        }
    }
    public static String getDescriptionApp(String code) {
        switch (code) {
        case "CS0000":
            return "success";
        case "CF0001":
            return "操作失败";
        case "CF0007":
            return "参数解析错误";
        case "CF0008":
            return "如果没有模板，则内容不能为空";
        case "CF0009":
            return "手机号码格式错误";
        case "CF0012":
            return "操作已超今日上限";
        case "CF0013":
            return "操作频繁，请稍后再试";
        default:
            return null;
        }
    }
}
