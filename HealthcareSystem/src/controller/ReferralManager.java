package controller;

import model.Referral;
import utils.FileUtil;

import java.util.ArrayList;

public class ReferralManager 
{
	private static ReferralManager instance;
	private ArrayList<Referral> referrals;

	private ReferralManager() {
		referrals = new ArrayList<>();
	}

	public static ReferralManager getInstance() {
		if (instance == null) {
			instance = new ReferralManager();
		}
		return instance;
	}

	public void addReferral(Referral referral) {
		for (Referral r : referrals) {
			if (r.getReferralID().equals(referral.getReferralID())) {
				return;
			}
		}
		referrals.add(referral);
		generateReferralFile(referral);
	}

	private void generateReferralFile(Referral referral) {
		String content = "Referral ID: " + referral.getReferralID() + "Notes: " + referral.getNotes();
		FileUtil.writeToFile("referral_" + referral.getReferralID() + ".txt", content);
	}

	public ArrayList<Referral> getReferrals() {
		return referrals;
	}
}
