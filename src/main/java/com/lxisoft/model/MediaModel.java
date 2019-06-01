package com.lxisoft.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaModel {

	private Long id;
	
	private Long activityId;

    private Long completedActivityId;
    
    private byte[] file;

	private String fileContentType;

    private String fileName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getCompletedActivityId() {
		return completedActivityId;
	}

	public void setCompletedActivityId(Long completedActivityId) {
		this.completedActivityId = completedActivityId;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
