package com.xumumi.config;

import com.xumumi.util.LanguageUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;
import java.util.Objects;

@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    @Override
    public final void addInterceptors(final InterceptorRegistry registry){
        registry.addInterceptor(new LanguageInterceptor())
                .addPathPatterns("/**");
    }

    private static class LanguageInterceptor implements HandlerInterceptor {
        @Override
        public final boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler){
            final LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
            Locale local = new Locale("zh-CN");
            if (Objects.nonNull(localeResolver)) {
                local = localeResolver.resolveLocale(request);
            }
            LanguageUtil.setCurrentLang(local.toString());
            return true;
        }
    }
}