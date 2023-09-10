package com.hand.demo.order.infra.feign.decoder;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 16:20
 */
@Component
public class SimpleErrorDecoder implements ErrorDecoder {

    @Autowired
    private Logger logger;

    @Override
    public Exception decode(String s, Response response) {
        logger.error("=====================================================");
        logger.error("发生错误：" + s);
        logger.error("错误url："+response.request().url());
        logger.error("=====================================================");
        return null;
    }
}
