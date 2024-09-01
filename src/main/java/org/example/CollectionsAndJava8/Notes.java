package org.example.CollectionsAndJava8;

public class Notes {

	public Integer notesId;
	public String  notesName;
	public Integer tagId;
	
	/**
	 * @param notesId
	 * @param notesName
	 * @param tagId
	 */
	public Notes(Integer notesId, String notesName, Integer tagId) {
		super();
		this.notesId = notesId;
		this.notesName = notesName;
		this.tagId = tagId;
	}
	/**
	 * @return the notesId
	 */
	public Integer getNotesId() {
		return notesId;
	}
	/**
	 * @param notesId the notesId to set
	 */
	public void setNotesId(Integer notesId) {
		this.notesId = notesId;
	}
	/**
	 * @return the notesName
	 */
	public String getNotesName() {
		return notesName;
	}
	/**
	 * @param notesName the notesName to set
	 */
	public void setNotesName(String notesName) {
		this.notesName = notesName;
	}
	/**
	 * @return the tagId
	 */
	public Integer getTagId() {
		return tagId;
	}
	/**
	 * @param tagId the tagId to set
	 */
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	
	
}
