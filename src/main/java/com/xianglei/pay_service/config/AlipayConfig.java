package com.xianglei.pay_service.config;

import org.springframework.stereotype.Component;

@Component
public class AlipayConfig {
    // 商户appid
    public static String APPID = "2016102400753018";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY =
            "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCLgBPAScd2BPy0xsOQ2Ima1suBisvs61MyWtSV0L36Qh+a5uUIULgYDajLAaeMm47moC7pyI0AJoU5kz1HDE3N3DA1pVQwYWjfqjbhmBAGrhs5FMxbMy7gBhkIjUc/dOLL0Y7O0jER2s1idv5MORfM84kcEvaJXqXPEDKpCUGahpO5i9onJmPKqd9x0E7mOvj8lr02aIM1h/oYoVtsQoi+cWM4irSVfM3lkJO6oW2cTbRfr5rYoVI9iletEmoPnGGsnoosmoRiiiBdhPJwl5tb/uWeqiATp2kOueqWgrHxXjbwDiKSTqKu62zRsVRqE0G/FVCvzqSQLjcr/E4ff6llAgMBAAECggEAYfT56ZjlW1Z9LWQ1h8zGM9iI5tpUAHXu4fkuNlVyUf2Eu/1O7tvfqeRNlt/+i5ngasoopzmQ6X4jJx7hdLaLG/d2UvVZfO+p+QVJrHhfKJGxxA96wL/cNquRgJPUaBbn+z+YDFtE4cjHWFE+mL+umtiYewJF5Ih13kT9jf1V9+9m+/9eKwZ5xtNtOievQ/LCXEZ53B2bEkUBmw2LSb0QneVfb4de/Do5jB+JTF/GXImNbp5JoDjx+thZhqiSrPo5Cv5FI9pA6t3h2u6SKUEtpCtbrtR9OF+Xm/N0sJy1OVzPgc9Go9AoWmbKFqRS5OMdmhW+hk1E3np7NDS667GeAQKBgQC+PrUIbQz2DPQ+Uu8+trXOR4IHPxaI2qi57O4KPVp1Gmb6Vc5I0dmgrKTHqJ8NqlBpjzAdLZj3joVQxStdJo1wt3La9B5gVCWY6+nZqbtnsRYOLE/TwYdTV+iuVLKMBhBEHsGw0CxI7Oy6GkF3Fw6c/ggNcEeJfY0dNvtODp7X4QKBgQC7t18eNpdX/pClyNnYj0cvNRwQZxz66XURk40wE9MrdJFbFb4NteyHambWni+S8XpmVpXUaVrk166OiEy7IO0V/8nM+x6XsH/TyHjeTTdwGChH00cpbRbZxZ6cP5SG5o2842r4cyvfijz5+qqqeTwJAuWQK5eCblSA4EnVUauyBQKBgCT4irXYe2xVmCGEfHnzh+FOhDZkTDzMQX3gTWIwCiQ3vUto4W3FWkWfR2aFnmNJddcNvIvvEIsLZ10K9CJmG5aMEAX86upNcAEH16o1EfZUs7SNZ/X+5g2MR+uZChmsE/0o/PsfeXuyj06bS52ZHX3k4Cu8ZiqR+5px1OSWcsgBAoGBAKrJGQc6D9QFTcEnzduT7+XpYhEiX2GBiftlzWzSfKvqsFy4mWOMAxjpG4tj/FCq1vvJByRsfj/6Y1xWcclHGa2MPSP7zUehU4txt1Y51phrwiom9XWhRMr5W2c5CX76wDX8itRkpKQK95NQFnpnNtHUCtxybLREgSmH5mTom1epAoGAdChOl4zkHGub/G+CmxX1EGcNXWa3SbEQ7rwdxz+BJtBeJtKVv9aJ67tsDSPAjjW+ZrdB6gdyFgQpnW3DczeiLH+DFZDNPAGAcYt2ux8zLJ4bLQ1i6QfZTQFv4lx9K5eYWBX0ANalQRSZXl8UnVKLmPzHPzHffLzSHJi8m3CnWkU=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://28k6010n77.wicp.vip/callback.html";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://28k6010n77.wicp.vip/return.html";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi4ATwEnHdgT8tMbDkNiJmtbLgYrL7OtTMlrUldC9+kIfmublCFC4GA2oywGnjJuO5qAu6ciNACaFOZM9RwxNzdwwNaVUMGFo36o24ZgQBq4bORTMWzMu4AYZCI1HP3Tiy9GOztIxEdrNYnb+TDkXzPOJHBL2iV6lzxAyqQlBmoaTuYvaJyZjyqnfcdBO5jr4/Ja9NmiDNYf6GKFbbEKIvnFjOIq0lXzN5ZCTuqFtnE20X6+a2KFSPYpXrRJqD5xhrJ6KLJqEYoogXYTycJebW/7lnqogE6dpDrnqloKx8V428A4ikk6iruts0bFUahNBvxVQr86kkC43K/xOH3+pZQIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";
}