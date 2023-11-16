package com.test1;

public class CodeMap {
	private Integer codeId;
	private String mappingCode1;
	private String mappingValue1;
	private String mappingCode2;
	private String mappingvalue2;
	private String mappingCode3;
	private String mappingvalue3;
	private String mappingSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CodeMap() {

	}

	public CodeMap(Integer codeId, String mappingCode1, String mappingValue1, String mappingCode2, String mappingvalue2,
			String mappingCode3, String mappingvalue3, String mappingSystem, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.codeId = codeId;
		this.mappingCode1 = mappingCode1;
		this.mappingValue1 = mappingValue1;
		this.mappingCode2 = mappingCode2;
		this.mappingvalue2 = mappingvalue2;
		this.mappingCode3 = mappingCode3;
		this.mappingvalue3 = mappingvalue3;
		this.mappingSystem = mappingSystem;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCodeId() {
		return codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public String getMappingCode1() {
		return mappingCode1;
	}

	public void setMappingCode1(String mappingCode1) {
		this.mappingCode1 = mappingCode1;
	}

	public String getMappingValue1() {
		return mappingValue1;
	}

	public void setMappingValue1(String mappingValue1) {
		this.mappingValue1 = mappingValue1;
	}

	public String getMappingCode2() {
		return mappingCode2;
	}

	public void setMappingCode2(String mappingCode2) {
		this.mappingCode2 = mappingCode2;
	}

	public String getMappingvalue2() {
		return mappingvalue2;
	}

	public void setMappingvalue2(String mappingvalue2) {
		this.mappingvalue2 = mappingvalue2;
	}

	public String getMappingCode3() {
		return mappingCode3;
	}

	public void setMappingCode3(String mappingCode3) {
		this.mappingCode3 = mappingCode3;
	}

	public String getMappingvalue3() {
		return mappingvalue3;
	}

	public void setMappingvalue3(String mappingvalue3) {
		this.mappingvalue3 = mappingvalue3;
	}

	public String getMappingSystem() {
		return mappingSystem;
	}

	public void setMappingSystem(String mappingSystem) {
		this.mappingSystem = mappingSystem;
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
