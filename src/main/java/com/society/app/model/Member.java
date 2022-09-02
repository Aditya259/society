package com.society.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String[] verifyWith;
	private String registrationDate;
	private String memberName;
	private String relativeName;
	private String[] relativeRelation;
	private String[] gender;
	private String dob;
	private String[] maritialStatus;
	private String address;
	private String district;
	private String state;
	private String branchName;
	private String pincode;
	private String aadharNo;
	private String panNo;
	private String voterNo;
	private String mobileNo;
	private String emailId;
	private String occupation;
	private String education;
	private String introMcode;
	private String introMname;
	private String photo;
	private String nomineeName;
	private String nomineeRelation;
	private String nomineeAddress;
	private String nomineeKycNo;
	private String nomineeMobileNo;
	private String nomineeAge;
	private String nomineePanNo;
	private String[] nomineeKycType;
	private String memberFees;
	private String shareAllotedForm;
	private String noOfShare;
	private String shareAmount;
	private String paymentBy;
	private String remarks;
	private boolean memberStatus;
	private boolean mobileBanking;
	private boolean netBanking;
	private boolean smsSend;
	private boolean isMinor;
	private String rationCardNo;
	private String dlNo;
	private String bankName;
	private String bankbranch;
	private String accountNo;
	private String ifscCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRationCardNo() {
		return rationCardNo;
	}

	public void setRationCardNo(String rationCardNo) {
		this.rationCardNo = rationCardNo;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankbranch() {
		return bankbranch;
	}

	public void setBankbranch(String bankbranch) {
		this.bankbranch = bankbranch;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String[] getVerifyWith() {
		return verifyWith;
	}

	public void setVerifyWith(String[] verifyWith) {
		this.verifyWith = verifyWith;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	public String[] getRelativeRelation() {
		return relativeRelation;
	}

	public void setRelativeRelation(String[] relativeRelation) {
		this.relativeRelation = relativeRelation;
	}

	public String[] getGender() {
		return gender;
	}

	public void setGender(String[] gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String[] getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String[] maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getVoterNo() {
		return voterNo;
	}

	public void setVoterNo(String voterNo) {
		this.voterNo = voterNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getIntroMcode() {
		return introMcode;
	}

	public void setIntroMcode(String introMcode) {
		this.introMcode = introMcode;
	}

	public String getIntroMname() {
		return introMname;
	}

	public void setIntroMname(String introMname) {
		this.introMname = introMname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public String getNomineeAddress() {
		return nomineeAddress;
	}

	public void setNomineeAddress(String nomineeAddress) {
		this.nomineeAddress = nomineeAddress;
	}

	public String getNomineeKycNo() {
		return nomineeKycNo;
	}

	public void setNomineeKycNo(String nomineeKycNo) {
		this.nomineeKycNo = nomineeKycNo;
	}

	public String getNomineeMobileNo() {
		return nomineeMobileNo;
	}

	public void setNomineeMobileNo(String nomineeMobileNo) {
		this.nomineeMobileNo = nomineeMobileNo;
	}

	public String getNomineeAge() {
		return nomineeAge;
	}

	public void setNomineeAge(String nomineeAge) {
		this.nomineeAge = nomineeAge;
	}

	public String getNomineePanNo() {
		return nomineePanNo;
	}

	public void setNomineePanNo(String nomineePanNo) {
		this.nomineePanNo = nomineePanNo;
	}

	public String[] getNomineeKycType() {
		return nomineeKycType;
	}

	public void setNomineeKycType(String[] nomineeKycType) {
		this.nomineeKycType = nomineeKycType;
	}

	public String getMemberFees() {
		return memberFees;
	}

	public void setMemberFees(String memberFees) {
		this.memberFees = memberFees;
	}

	public String getShareAllotedForm() {
		return shareAllotedForm;
	}

	public void setShareAllotedForm(String shareAllotedForm) {
		this.shareAllotedForm = shareAllotedForm;
	}

	public String getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(String noOfShare) {
		this.noOfShare = noOfShare;
	}

	public String getShareAmount() {
		return shareAmount;
	}

	public void setShareAmount(String shareAmount) {
		this.shareAmount = shareAmount;
	}

	public String getPaymentBy() {
		return paymentBy;
	}

	public void setPaymentBy(String paymentBy) {
		this.paymentBy = paymentBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public boolean isMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(boolean memberStatus) {
		this.memberStatus = memberStatus;
	}

	public boolean isMobileBanking() {
		return mobileBanking;
	}

	public void setMobileBanking(boolean mobileBanking) {
		this.mobileBanking = mobileBanking;
	}

	public boolean isNetBanking() {
		return netBanking;
	}

	public void setNetBanking(boolean netBanking) {
		this.netBanking = netBanking;
	}

	public boolean isSmsSend() {
		return smsSend;
	}

	public void setSmsSend(boolean smsSend) {
		this.smsSend = smsSend;
	}

	public boolean isMinor() {
		return isMinor;
	}

	public void setMinor(boolean isMinor) {
		this.isMinor = isMinor;
	}

	@Override
	public String toString() {
		return "Member [verifyWith=" + verifyWith + ", registrationDate=" + registrationDate + ", memberName="
				+ memberName + ", relativeName=" + relativeName + ", relativeRelation=" + relativeRelation + ", gender="
				+ gender + ", dob=" + dob + ", maritialStatus=" + maritialStatus + ", address=" + address
				+ ", district=" + district + ", state=" + state + ", branchName=" + branchName + ", pincode=" + pincode
				+ ", aadharNo=" + aadharNo + ", panNo=" + panNo + ", voterNo=" + voterNo + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", occupation=" + occupation + ", education=" + education + ", introMcode="
				+ introMcode + ", introMname=" + introMname + ", photo=" + photo + ", nomineeName=" + nomineeName
				+ ", nomineeRelation=" + nomineeRelation + ", nomineeAddress=" + nomineeAddress + ", nomineeKycNo="
				+ nomineeKycNo + ", nomineeMobileNo=" + nomineeMobileNo + ", nomineeAge=" + nomineeAge
				+ ", nomineePanNo=" + nomineePanNo + ", nomineeKycType=" + nomineeKycType + ", memberFees=" + memberFees
				+ ", shareAllotedForm=" + shareAllotedForm + ", noOfShare=" + noOfShare + ", shareAmount=" + shareAmount
				+ ", paymentBy=" + paymentBy + ", remarks=" + remarks + ", memberStatus=" + memberStatus
				+ ", mobileBanking=" + mobileBanking + ", netBanking=" + netBanking + ", smsSend=" + smsSend
				+ ", isMinor=" + isMinor + "]";
	}

}
