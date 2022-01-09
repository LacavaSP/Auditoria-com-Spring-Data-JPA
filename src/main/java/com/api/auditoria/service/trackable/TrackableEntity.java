package com.api.auditoria.service.trackable;

import java.time.ZonedDateTime;

public interface TrackableEntity {

	void setDataAlteracao(ZonedDateTime dataAlteracao);
}
