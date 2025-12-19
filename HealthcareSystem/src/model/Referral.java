package model;

public class Referral 
{
	private String referralID;
	private String notes;
	
	public Referral(String referralID, String notes) 
	{
		this.referralID = referralID;
		this.notes = notes;
	}

	public String getReferralID() {
		return referralID;
	}

	public String getNotes() {
		return notes;
	}
}
