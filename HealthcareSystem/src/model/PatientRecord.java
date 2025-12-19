package model;

public class PatientRecord 
{
	private String recordID;
	private String history;
	
	public PatientRecord(String recordID, String history) 
	{
		this.recordID = recordID;
		this.history = history;
	}

	public String getRecordID() {
		return recordID;
	}

	public String getHistory() {
		return history;
	}
}
