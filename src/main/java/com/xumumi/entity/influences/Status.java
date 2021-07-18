package com.xumumi.entity.influences;

import com.xumumi.entity.Base;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 异常状态类，从数据库读取
 *
 * @author xumumi
 */
@Entity
@Table(name = "statuses")
public final class Status extends Base implements Effect {
}
