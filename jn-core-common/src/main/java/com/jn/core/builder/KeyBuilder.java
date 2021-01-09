package com.jn.core.builder;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class KeyBuilder {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return 生成后主键
     */
    public synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

    /**
     * 生成加前缀的唯一主键
     * @param prefix 固定前缀
     * @return 生成后主键
     */
    public String getUniqueKey(String prefix) {
        return prefix + getUniqueKey();
    }

    /**
     * 生成随机字母或数字
     * @param n 位数
     * @return 生成后字符串
     */
    public String getRandomLettersOrNumbers(int n) {
        StringBuilder val = new StringBuilder();
        Random random = new Random();
        for ( int i = 0; i < n; i++ )
        {
            String str = random.nextInt( 2 ) % 2 == 0 ? "num" : "char";
            if ( "char".equalsIgnoreCase( str ) ) { // 产生字母
                int nextInt = random.nextInt( 2 ) % 2 == 0 ? 65 : 97;
                val.append((char) (nextInt + random.nextInt(26)));
            } else { // 产生数字
                val.append(String.valueOf(random.nextInt(10)));
            }
        }
        return val.toString();
    }
}
