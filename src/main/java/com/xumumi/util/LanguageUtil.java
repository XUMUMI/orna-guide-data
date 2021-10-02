package com.xumumi.util;

/**
 * 语言配置工具类
 *
 * @author xumumi
 */
@SuppressWarnings("WeakerAccess")
public class LanguageUtil {
    public static final String ZH_CN = "zh_CN";
    public static final String EN_US = "en_US";
    public static final String DEFAULT_LANGUAGE = ZH_CN;

    private String lang;

    private static final ThreadLocal<LanguageUtil> CONTEXT = ThreadLocal.withInitial(LanguageUtil::new);

    public LanguageUtil() {
        lang = DEFAULT_LANGUAGE;
    }

    private static LanguageUtil getCurrentContext() {
        return CONTEXT.get();
    }

    public static String getCurrentLang() {
        return getCurrentContext().lang;
    }

    public static void setCurrentLang(final String lang) {
        getCurrentContext().lang = lang;
    }
}