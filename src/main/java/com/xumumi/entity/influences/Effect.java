package com.xumumi.entity.influences;

/**
 * 统一 {@link Buff} 和 {@link Status} 的接口
 *
 * @author xumumi
 */
public sealed interface Effect permits Buff, Status {
}
