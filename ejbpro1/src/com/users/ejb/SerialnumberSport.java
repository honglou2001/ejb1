package com.users.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_sport MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-9 12:48:13
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_serialnumber_sport")
public class SerialnumberSport   implements Serializable {
    @Id
	@Column(name = "FSportRecID")
	private String fsportrecid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FUserID")
	private String fuserid;
    
	@Column(name = "FDataToUsrid")
	private String fdatatousrid;
    
	@Column(name = "FSNID")
	private String fsnid;
    
	@Column(name = "FSNNumber")
	private String fsnnumber;
    
	@Column(name = "FDevType")
	private Integer fdevtype;
    
	@Column(name = "FMeterInfo")
	private String fmeterinfo;
    
	@Column(name = "FVal1")
	private Integer fval1;
    
	@Column(name = "FVa2")
	private Integer fva2;
    
	@Column(name = "FChar1")
	private String fchar1;
    
	@Column(name = "FChar2")
	private String fchar2;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FSportTime")
	private java.sql.Timestamp fsporttime;
    
	@Column(name = "FBleId")
	private String fbleid;
    
	@Column(name = "FSportdate")
	private String fsportdate;
    
	@Column(name = "FStep")
	private Integer fstep;
    
	@Column(name = "FDistance")
	private Integer fdistance;
    
	@Column(name = "FCal")
	private Integer fcal;
    
	@Column(name = "FFloor")
	private Integer ffloor;
    
	@Column(name = "FHeartRate")
	private Integer fheartrate;
    
	@Column(name = "FHeartrateMin")
	private Integer fheartratemin;
    
	@Column(name = "FHeartRateMax")
	private Integer fheartratemax;
    
	@Column(name = "FHeartStr")
	private String fheartstr;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "FRemark")
	private String fremark;
    

	public String getFsportrecid() {
		return fsportrecid;
	}
    
	public void setFsportrecid(String fsportrecid) {		     
         this.fsportrecid = fsportrecid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFuserid() {
		return fuserid;
	}
    
	public void setFuserid(String fuserid) {		     
         this.fuserid = fuserid;
	}
	public String getFdatatousrid() {
		return fdatatousrid;
	}
    
	public void setFdatatousrid(String fdatatousrid) {		     
         this.fdatatousrid = fdatatousrid;
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
	public Integer getFdevtype() {
		return fdevtype;
	}
    
	public void setFdevtype(Integer fdevtype) {		     
         this.fdevtype = fdevtype;
	}
	public String getFmeterinfo() {
		return fmeterinfo;
	}
    
	public void setFmeterinfo(String fmeterinfo) {		     
         this.fmeterinfo = fmeterinfo;
	}
	public Integer getFval1() {
		return fval1;
	}
    
	public void setFval1(Integer fval1) {		     
         this.fval1 = fval1;
	}
	public Integer getFva2() {
		return fva2;
	}
    
	public void setFva2(Integer fva2) {		     
         this.fva2 = fva2;
	}
	public String getFchar1() {
		return fchar1;
	}
    
	public void setFchar1(String fchar1) {		     
         this.fchar1 = fchar1;
	}
	public String getFchar2() {
		return fchar2;
	}
    
	public void setFchar2(String fchar2) {		     
         this.fchar2 = fchar2;
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
	public java.sql.Timestamp getFsporttime() {
		return fsporttime;
	}
    
	public void setFsporttime(java.sql.Timestamp fsporttime) {		     
         this.fsporttime = fsporttime;
	}
	public String getFbleid() {
		return fbleid;
	}
    
	public void setFbleid(String fbleid) {		     
         this.fbleid = fbleid;
	}
	public String getFsportdate() {
		return fsportdate;
	}
    
	public void setFsportdate(String fsportdate) {		     
         this.fsportdate = fsportdate;
	}
	public Integer getFstep() {
		return fstep;
	}
    
	public void setFstep(Integer fstep) {		     
         this.fstep = fstep;
	}
	public Integer getFdistance() {
		return fdistance;
	}
    
	public void setFdistance(Integer fdistance) {		     
         this.fdistance = fdistance;
	}
	public Integer getFcal() {
		return fcal;
	}
    
	public void setFcal(Integer fcal) {		     
         this.fcal = fcal;
	}
	public Integer getFfloor() {
		return ffloor;
	}
    
	public void setFfloor(Integer ffloor) {		     
         this.ffloor = ffloor;
	}
	public Integer getFheartrate() {
		return fheartrate;
	}
    
	public void setFheartrate(Integer fheartrate) {		     
         this.fheartrate = fheartrate;
	}
	public Integer getFheartratemin() {
		return fheartratemin;
	}
    
	public void setFheartratemin(Integer fheartratemin) {		     
         this.fheartratemin = fheartratemin;
	}
	public Integer getFheartratemax() {
		return fheartratemax;
	}
    
	public void setFheartratemax(Integer fheartratemax) {		     
         this.fheartratemax = fheartratemax;
	}
	public String getFheartstr() {
		return fheartstr;
	}
    
	public void setFheartstr(String fheartstr) {		     
         this.fheartstr = fheartstr;
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