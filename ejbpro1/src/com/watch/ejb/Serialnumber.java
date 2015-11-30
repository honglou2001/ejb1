package com.watch.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * <p>Title: ejb title </p>
 * <p>Description: serialnumber MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-7-10 22:14:21
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "serialnumber")
public class Serialnumber   implements Serializable {
    @Id
	@Column(name = "funiqueid")
	private String funiqueid;
    
	@Column(name = "id")
	private Integer id;
    
	@Column(name = "serialnumber")
	private String serialnumber;
    
	@Column(name = "status",insertable=false,updatable=false)
	private String status;
    
	@Column(name = "ef",updatable=false)
	private String ef;
    
	@Column(name = "setgps",insertable=false,updatable=false)
	private String setgps;
    
	@Column(name = "gpsstatus",insertable=false,updatable=false)
	private String gpsstatus;
    
	@Column(name = "isreg",insertable=false)
	private String isreg;
    
	@Column(name = "lbs",insertable=false,updatable=false)
	private String lbs;
    
	@Column(name = "listenstatus",insertable=false,updatable=false)
	private String listenstatus;
    
	@Column(name = "online",insertable=false,updatable=false)
	private String online;
    
	@Column(name = "nickname")
	private String nickname;
    
	@Column(name = "fqrcode")
	private String fqrcode;
    
	@Column(name = "birthday")
	private String birthday;
    
	@Column(name = "fsex")
	private Integer fsex;
    
	@Column(name = "fweight")
	private String fweight;
    
	@Column(name = "feight")
	private String feight;
    
	@Column(name = "fgrade")
	private String fgrade;
    
	@Column(name = "fclass")
	private String fclass;
    
	@Column(name = "fschool")
	private String fschool;
    
	@Column(name = "fcallname")
	private String fcallname;
    
	@Column(name = "flogcount")
	private Integer flogcount;
    
	@Column(name = "floglasttime")
	private java.sql.Timestamp floglasttime;
    
	@Column(name = "floglastip")
	private String floglastip;
    
	@Column(name = "fdatastatus")
	private Integer fdatastatus;
    
	@Column(name = "fremark")
	private String fremark;
    
	@Column(name = "fpicture")
	private String fpicture;
    
	@Column(name = "fupdatetime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "fphonenum")
	private String fphonenum;
	
	@Column(name = "fphonetime")
	private java.sql.Timestamp fphonetime;
	
	@Column(name = "fislostinfo")
	private String fislostinfo;
	
	@Column(name = "fislosttime")
	private java.sql.Timestamp fislosttime;
	
	@Transient
	private String fusrid;
	
	@Transient
	private String fusrname;
	
	@Transient
	private String fusrphone;
	
	@Transient
	private String fclientnumber;

	//设备类型:0-手表，1-手环，2-脂肪秤
	@Column(name = "fdevtype")
	private Integer fdevtype;	

	public String getFphonenum() {
		return fphonenum;
	}

	public void setFphonenum(String fphonenum) {
		this.fphonenum = fphonenum;
	}

	public java.sql.Timestamp getFphonetime() {
		return fphonetime;
	}

	public void setFphonetime(java.sql.Timestamp fphonetime) {
		this.fphonetime = fphonetime;
	}

	public String getFislostinfo() {
		return fislostinfo;
	}

	public void setFislostinfo(String fislostinfo) {
		this.fislostinfo = fislostinfo;
	}

	public java.sql.Timestamp getFislosttime() {
		return fislosttime;
	}

	public void setFislosttime(java.sql.Timestamp fislosttime) {
		this.fislosttime = fislosttime;
	}

	public String getFuniqueid() {
		return funiqueid;
	}
    
	public void setFuniqueid(String funiqueid) {		     
         this.funiqueid = funiqueid;
	}
	public Integer getId() {
		return id;
	}
    
	public void setId(Integer id) {		     
         this.id = id;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
    
	public void setSerialnumber(String serialnumber) {		     
         this.serialnumber = serialnumber;
	}
	public String getStatus() {
		return status;
	}
    
	public void setStatus(String status) {		     
         this.status = status;
	}
	public String getEf() {
		return ef;
	}
    
	public void setEf(String ef) {		     
         this.ef = ef;
	}
	public String getSetgps() {
		return setgps;
	}
    
	public void setSetgps(String setgps) {		     
         this.setgps = setgps;
	}
	public String getGpsstatus() {
		return gpsstatus;
	}
    
	public void setGpsstatus(String gpsstatus) {		     
         this.gpsstatus = gpsstatus;
	}
	public String getIsreg() {
		return isreg;
	}
    
	public void setIsreg(String isreg) {		     
         this.isreg = isreg;
	}
	public String getLbs() {
		return lbs;
	}
    
	public void setLbs(String lbs) {		     
         this.lbs = lbs;
	}
	public String getListenstatus() {
		return listenstatus;
	}
    
	public void setListenstatus(String listenstatus) {		     
         this.listenstatus = listenstatus;
	}
	public String getOnline() {
		return online;
	}
    
	public void setOnline(String online) {		     
         this.online = online;
	}
	public String getNickname() {
		return nickname;
	}
    
	public void setNickname(String nickname) {		     
         this.nickname = nickname;
	}
	public String getFqrcode() {
		return fqrcode;
	}
    
	public void setFqrcode(String fqrcode) {		     
         this.fqrcode = fqrcode;
	}
	public String getBirthday() {
		return birthday;
	}
    
	public void setBirthday(String birthday) {		     
         this.birthday = birthday;
	}
	public Integer getFsex() {
		return fsex;
	}
    
	public void setFsex(Integer fsex) {		     
         this.fsex = fsex;
	}
	public String getFweight() {
		return fweight;
	}
    
	public void setFweight(String fweight) {		     
         this.fweight = fweight;
	}
	public String getFeight() {
		return feight;
	}
    
	public void setFeight(String feight) {		     
         this.feight = feight;
	}
	public String getFgrade() {
		return fgrade;
	}
    
	public void setFgrade(String fgrade) {		     
         this.fgrade = fgrade;
	}
	public String getFclass() {
		return fclass;
	}
    
	public void setFclass(String fclass) {		     
         this.fclass = fclass;
	}
	public String getFschool() {
		return fschool;
	}
    
	public void setFschool(String fschool) {		     
         this.fschool = fschool;
	}
	public String getFcallname() {
		return fcallname;
	}
    
	public void setFcallname(String fcallname) {		     
         this.fcallname = fcallname;
	}
	public Integer getFlogcount() {
		return flogcount;
	}
    
	public void setFlogcount(Integer flogcount) {		     
         this.flogcount = flogcount;
	}
	public java.sql.Timestamp getFloglasttime() {
		return floglasttime;
	}
    
	public void setFloglasttime(java.sql.Timestamp floglasttime) {		     
         this.floglasttime = floglasttime;
	}
	public String getFloglastip() {
		return floglastip;
	}
    
	public void setFloglastip(String floglastip) {		     
         this.floglastip = floglastip;
	}
	public Integer getFdatastatus() {
		return fdatastatus;
	}
    
	public void setFdatastatus(Integer fdatastatus) {		     
         this.fdatastatus = fdatastatus;
	}
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
	}
	public String getFpicture() {
		return fpicture;
	}
    
	public void setFpicture(String fpicture) {		     
         this.fpicture = fpicture;
	}
	public java.sql.Timestamp getFupdatetime() {
		return fupdatetime;
	}
    
	public void setFupdatetime(java.sql.Timestamp fupdatetime) {		     
         this.fupdatetime = fupdatetime;
	}
	
	public String getFusrid() {
		return fusrid;
	}

	public void setFusrid(String fusrid) {
		this.fusrid = fusrid;
	}

	public String getFusrname() {
		return fusrname;
	}

	public void setFusrname(String fusrname) {
		this.fusrname = fusrname;
	}
	
	public String getFusrphone() {
		return fusrphone;
	}

	public void setFusrphone(String fusrphone) {
		this.fusrphone = fusrphone;
	}
	
	public Integer getFdevtype() {
		return fdevtype;
	}

	public void setFdevtype(Integer fdevtype) {
		this.fdevtype = fdevtype;
	}
	
	
	public String getFclientnumber() {
		return fclientnumber;
	}

	public void setFclientnumber(String fclientnumber) {
		this.fclientnumber = fclientnumber;
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