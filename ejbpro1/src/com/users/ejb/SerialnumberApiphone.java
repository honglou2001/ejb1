package com.users.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_apiphone MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-9-5 21:20:02
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_serialnumber_apiphone")
public class SerialnumberApiphone   implements Serializable {
    @Id
	@Column(name = "FClientID")
	private String fclientid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FAppId")
	private String fappid;
    
	@Column(name = "FUserID")
	private String fuserid;
    
	@Column(name = "FSNID")
	private String fsnid;
    
	@Column(name = "FSNNumber")
	private String fsnnumber;
    
	@Column(name = "FClientNumber")
	private String fclientnumber;
    
	@Column(name = "FClientPwd")
	private String fclientpwd;
    
	@Column(name = "FClientType")
	private String fclienttype;
    
	@Column(name = "FFriendlyName")
	private String ffriendlyname;
    
	@Column(name = "FMobile")
	private String fmobile;
    
	@Column(name = "FRoam")
	private String froam;
    
	@Column(name = "FBalance")
	private java.math.BigDecimal fbalance;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FCreateDate")
	private java.sql.Timestamp fcreatedate;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "FRemark")
	private String fremark;
    

	public String getFclientid() {
		return fclientid;
	}
    
	public void setFclientid(String fclientid) {		     
         this.fclientid = fclientid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
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
	public String getFsnid() {
		return fsnid;
	}
    
	public void setFsnid(String fsnid) {		     
         this.fsnid = fsnid;
	}
	public String getFsnnumber() {
		return fsnnumber;
	}
    
	public void setFsnnumber(String fsnnumber) {		     
         this.fsnnumber = fsnnumber;
	}
	public String getFclientnumber() {
		return fclientnumber;
	}
    
	public void setFclientnumber(String fclientnumber) {		     
         this.fclientnumber = fclientnumber;
	}
	public String getFclientpwd() {
		return fclientpwd;
	}
    
	public void setFclientpwd(String fclientpwd) {		     
         this.fclientpwd = fclientpwd;
	}
	public String getFclienttype() {
		return fclienttype;
	}
    
	public void setFclienttype(String fclienttype) {		     
         this.fclienttype = fclienttype;
	}
	public String getFfriendlyname() {
		return ffriendlyname;
	}
    
	public void setFfriendlyname(String ffriendlyname) {		     
         this.ffriendlyname = ffriendlyname;
	}
	public String getFmobile() {
		return fmobile;
	}
    
	public void setFmobile(String fmobile) {		     
         this.fmobile = fmobile;
	}
	public String getFroam() {
		return froam;
	}
    
	public void setFroam(String froam) {		     
         this.froam = froam;
	}
	public java.math.BigDecimal getFbalance() {
		return fbalance;
	}
    
	public void setFbalance(java.math.BigDecimal fbalance) {		     
         this.fbalance = fbalance;
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
	public java.sql.Timestamp getFcreatedate() {
		return fcreatedate;
	}
    
	public void setFcreatedate(java.sql.Timestamp fcreatedate) {		     
         this.fcreatedate = fcreatedate;
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