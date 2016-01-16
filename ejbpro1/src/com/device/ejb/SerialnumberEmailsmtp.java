package com.device.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_emailsmtp MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2016-1-16 13:35:54
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_serialnumber_emailsmtp")
public class SerialnumberEmailsmtp   implements Serializable {
    private static final long serialVersionUID = 1L;    
    @Id
	@Column(name = "FSMtpRecID")
	private String fsmtprecid;
    
    @Column(name = "FIncreaseID",insertable=false,updatable=false)
	private Integer fincreaseid;
    
	@Column(name = "FType")
	private Integer ftype;
    
	@Column(name = "FAppId")
	private String fappid;
    
	@Column(name = "FUserID")
	private String fuserid;
    
	@Column(name = "FName")
	private String fname;
    
	@Column(name = "FMailhost")
	private String fmailhost;
    
	@Column(name = "FMailUserName")
	private String fmailusername;
    
	@Column(name = "FMailPassword")
	private String fmailpassword;
    
	@Column(name = "FMailAddress")
	private String fmailaddress;
    
	@Column(name = "FMailFromName")
	private String fmailfromname;
    
	@Column(name = "FIsDefault")
	private Integer fisdefault;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "FUpdateUser")
	private String fupdateuser;
    
	@Column(name = "FRemark")
	private String fremark;
    

	public String getFsmtprecid() {
		return fsmtprecid;
	}
    
	public void setFsmtprecid(String fsmtprecid) {		     
         this.fsmtprecid = fsmtprecid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public Integer getFtype() {
		return ftype;
	}
    
	public void setFtype(Integer ftype) {		     
         this.ftype = ftype;
	}
	public String getFappid() {
		return fappid;
	}
    
	public void setFappid(String fappid) {		     
         this.fappid = fappid;
	}
	public String getFuserid() {
		return fuserid;
	}
    
	public void setFuserid(String fuserid) {		     
         this.fuserid = fuserid;
	}
	public String getFname() {
		return fname;
	}
    
	public void setFname(String fname) {		     
         this.fname = fname;
	}
	public String getFmailhost() {
		return fmailhost;
	}
    
	public void setFmailhost(String fmailhost) {		     
         this.fmailhost = fmailhost;
	}
	public String getFmailusername() {
		return fmailusername;
	}
    
	public void setFmailusername(String fmailusername) {		     
         this.fmailusername = fmailusername;
	}
	public String getFmailpassword() {
		return fmailpassword;
	}
    
	public void setFmailpassword(String fmailpassword) {		     
         this.fmailpassword = fmailpassword;
	}
	public String getFmailaddress() {
		return fmailaddress;
	}
    
	public void setFmailaddress(String fmailaddress) {		     
         this.fmailaddress = fmailaddress;
	}
	public String getFmailfromname() {
		return fmailfromname;
	}
    
	public void setFmailfromname(String fmailfromname) {		     
         this.fmailfromname = fmailfromname;
	}
	public Integer getFisdefault() {
		return fisdefault;
	}
    
	public void setFisdefault(Integer fisdefault) {		     
         this.fisdefault = fisdefault;
	}
	public Integer getFdatastatus() {
		return fdatastatus;
	}
    
	public void setFdatastatus(Integer fdatastatus) {		     
         this.fdatastatus = fdatastatus;
	}
	public Integer getFfieldstatus() {
		return ffieldstatus;
	}
    
	public void setFfieldstatus(Integer ffieldstatus) {		     
         this.ffieldstatus = ffieldstatus;
	}
	public java.sql.Timestamp getFaddtime() {
		return faddtime;
	}
    
	public void setFaddtime(java.sql.Timestamp faddtime) {		     
         this.faddtime = faddtime;
	}
	public java.sql.Timestamp getFupdatetime() {
		return fupdatetime;
	}
    
	public void setFupdatetime(java.sql.Timestamp fupdatetime) {		     
         this.fupdatetime = fupdatetime;
	}
	public String getFupdateuser() {
		return fupdateuser;
	}
    
	public void setFupdateuser(String fupdateuser) {		     
         this.fupdateuser = fupdateuser;
	}
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}