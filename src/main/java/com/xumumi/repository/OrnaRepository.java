package com.xumumi.repository;

import com.xumumi.api.Config;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Locale;
import java.util.Map;

/**
 * 从 orna guide 服务器获取内容接口
 *
 * @author xumumi
 */
class OrnaRepository<Type> {
    @Resource
    private RestTemplate restTemplate;
    private final Class<? extends Type> type;
    private final String url;

    OrnaRepository(final Config config, final Class<? extends Type> value) {
        type = value;
        final String ornaGuideUrl = config.getUrl();
        url = "%s%s".formatted(ornaGuideUrl, type.getSimpleName().toLowerCase(Locale.ROOT));
    }

    public final Type getById(final Integer id) {
        Type ret = null;
        final Type[] objectList = (Type[]) restTemplate.postForObject(url, Map.of("id", id), type.arrayType());
        if (null != objectList && 1 == objectList.length) {
            ret = objectList[0];
        }
        return ret;
    }
}
