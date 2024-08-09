package com.trek.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {

	@Column(name = "CREATE_TIME")
	private LocalDateTime createTime;

	@Column(name = "UPDATE_TIME")
	private LocalDateTime updateTime;
}
