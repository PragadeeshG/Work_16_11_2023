package com.test1;

public class LabelColumnMap {
	private Integer id;
	private String fieldName;
	private String hdnFldName;
	private String uiName;
	private Integer uiSize;
	private boolean isAmendable;
	private boolean isSearchable;
	private String searchType;
	private String searchTypeIndicator;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public LabelColumnMap() {

	}

	public LabelColumnMap(Integer id, String fieldName, String hdnFldName, String uiName, Integer uiSize,
			boolean isAmendable, boolean isSearchable, String searchType, String searchTypeIndicator, String creationCr,
			String modifiedCr, String creationDate, String modifiedDate, String entityState) {
		super();
		this.id = id;
		this.fieldName = fieldName;
		this.hdnFldName = hdnFldName;
		this.uiName = uiName;
		this.uiSize = uiSize;
		this.isAmendable = isAmendable;
		this.isSearchable = isSearchable;
		this.searchType = searchType;
		this.searchTypeIndicator = searchTypeIndicator;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getHdnFldName() {
		return hdnFldName;
	}

	public void setHdnFldName(String hdnFldName) {
		this.hdnFldName = hdnFldName;
	}

	public String getUiName() {
		return uiName;
	}

	public void setUiName(String uiName) {
		this.uiName = uiName;
	}

	public Integer getUiSize() {
		return uiSize;
	}

	public void setUiSize(Integer uiSize) {
		this.uiSize = uiSize;
	}

	public boolean isAmendable() {
		return isAmendable;
	}

	public void setAmendable(boolean isAmendable) {
		this.isAmendable = isAmendable;
	}

	public boolean isSearchable() {
		return isSearchable;
	}

	public void setSearchable(boolean isSearchable) {
		this.isSearchable = isSearchable;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchTypeIndicator() {
		return searchTypeIndicator;
	}

	public void setSearchTypeIndicator(String searchTypeIndicator) {
		this.searchTypeIndicator = searchTypeIndicator;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
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
