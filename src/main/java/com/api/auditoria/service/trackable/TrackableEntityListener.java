package com.api.auditoria.service.trackable;

import java.time.ZonedDateTime;

import javax.persistence.PrePersist;

public class TrackableEntityListener {

	@PrePersist
	public void beforePersist(TrackableEntity trackableEntity) {
		trackableEntity.setDataAlteracao(ZonedDateTime.now());
	}
}
