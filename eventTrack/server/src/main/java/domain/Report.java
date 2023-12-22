package domain;

import java.util.Date;

public class Report {
	
	private String reportID;
	
	private String content;
	
	private Date creationDate;
	
	

	public Report(String reportID, String content, Date creationDate) {
		super();
		this.reportID = reportID;
		this.content = content;
		this.creationDate = creationDate;
	}

	public String getReportID() {
		return reportID;
	}

	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public String generateContent() {
		return content;
	}
	
	public void retrievecontent() {
		
	}

}
