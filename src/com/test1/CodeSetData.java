package com.test1;

public class CodeSetData {
	private Integer codeSetId;
	private String description;
	private String mapTableName;
	private String startDate;
	private String endDate;
	private boolean recordCreated;
	private boolean recordModified;
	private boolean recordDeleted;
	private String actionSource;
	private String processName;
	private Integer processId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CodeSetData() {

	}

	public CodeSetData(Integer codeSetId, String description, String mapTableName, String startDate, String endDate,
			boolean recordCreated, boolean recordModified, boolean recordDeleted, String actionSource,
			String processName, Integer processId, String creationDate, String modifiedDate, String entityState) {
		super();
		this.codeSetId = codeSetId;
		this.description = description;
		this.mapTableName = mapTableName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.recordCreated = recordCreated;
		this.recordModified = recordModified;
		this.recordDeleted = recordDeleted;
		this.actionSource = actionSource;
		this.processName = processName;
		this.processId = processId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCodeSetId() {
		return codeSetId;
	}

	public void setCodeSetId(Integer codeSetId) {
		this.codeSetId = codeSetId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMapTableName() {
		return mapTableName;
	}

	public void setMapTableName(String mapTableName) {
		this.mapTableName = mapTableName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public boolean isRecordCreated() {
		return recordCreated;
	}

	public void setRecordCreated(boolean recordCreated) {
		this.recordCreated = recordCreated;
	}

	public boolean isRecordModified() {
		return recordModified;
	}

	public void setRecordModified(boolean recordModified) {
		this.recordModified = recordModified;
	}

	public boolean isRecordDeleted() {
		return recordDeleted;
	}

	public void setRecordDeleted(boolean recordDeleted) {
		this.recordDeleted = recordDeleted;
	}

	public String getActionSource() {
		return actionSource;
	}

	public void setActionSource(String actionSource) {
		this.actionSource = actionSource;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
