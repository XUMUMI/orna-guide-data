package com.xumumi.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xumumi.Config;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

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

    public final Type getById(final int id) throws JsonProcessingException {
        Type ret = null;
        final Type[] result = select(Map.of("id", id));
        if (!Objects.isNull(result) && 0 < result.length) {
            ret = result[0];
        }
        return ret;
    }

    public final Type selectOne(final Object request) throws JsonProcessingException {
        Type ret = null;
        final ResponseEntity<String> entity = restTemplate.postForEntity(url, request, String.class);
        if (HttpStatus.OK == entity.getStatusCode()) {
            final ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            ret = objectMapper.readValue(entity.getBody(), type);
        }
        return ret;
    }

    public final Type[] select(final Object request) throws JsonProcessingException {
        Type[] ret = null;
        final ResponseEntity<String> entity = restTemplate.postForEntity(url, request, String.class);
        if (HttpStatus.OK == entity.getStatusCode()) {
            final ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            ret = (Type[]) objectMapper.readValue(entity.getBody(), type.arrayType());
        }
        return ret;
    }
}
