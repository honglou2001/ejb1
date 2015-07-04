package com.watch.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_loc_electfence MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-6-25 9:43:17
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_loc_electfence")
public class LocElectfence   implements Serializable {
    @Id
	@Column(name = "FLocFenID")
	private String flocfenid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FEltFenceID")
	private Integer feltfenceid;
    
	@Column(name = "FSerialnumber")
	private String fserialnumber;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FEltLongitude")
	private String feltlongitude;
    
	@Column(name = "FEltLatitude")
	private String feltlatitude;
    
	@Column(name = "FEltScope")
	private Double feltscope;
    
	@Column(name = "FEltAddress")
	private String feltaddress;
    
	@Column(name = "FLongitude")
	private String flongitude;
    
	@Column(name = "FLatitude")
	private String flatitude;
    
	@Column(name = "FAddress")
	private String faddress;
    
	@Column(name = "FDistance")
	private Double fdistance;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "FRemark")
	private String fremark;
	
	@Column(name = "FReadCount")
	private Integer freadCount;
	
	//围栏编号
	private Integer fareanumber;
	public Integer getFareanumber() {
		return fareanumber;
	}

	public void setFareanumber(Integer fareanumber) {
		this.fareanumber = fareanumber;
	}
	
	//围栏名称
	private String fareaname;
    

	public String getFareaname() {
		return fareaname;
	}

	public void setFareaname(String fareaname) {
		this.fareaname = fareaname;
	}

	public String getFlocfenid() {
		return flocfenid;
	}
    
	public void setFlocfenid(String flocfenid) {		     
         this.flocfenid = flocfenid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public Integer getFeltfenceid() {
		return feltfenceid;
	}
    
	public void setFeltfenceid(Integer feltfenceid) {		     
         this.feltfenceid = feltfenceid;
	}
	public String getFserialnumber() {
		return fserialnumber;
	}
    
	public void setFserialnumber(String fserialnumber) {		     
         this.fserialnumber = fserialnumber;
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
	public String getFeltlongitude() {
		return feltlongitude;
	}
    
	public void setFeltlongitude(String feltlongitude) {		     
         this.feltlongitude = feltlongitude;
	}
	public String getFeltlatitude() {
		return feltlatitude;
	}
    
	public void setFeltlatitude(String feltlatitude) {		     
         this.feltlatitude = feltlatitude;
	}
	public Double getFeltscope() {
		return feltscope;
	}
    
	public void setFeltscope(Double feltscope) {		     
         this.feltscope = feltscope;
	}
	public String getFeltaddress() {
		return feltaddress;
	}
    
	public void setFeltaddress(String feltaddress) {		     
         this.feltaddress = feltaddress;
	}
	public String getFlongitude() {
		return flongitude;
	}
    
	public void setFlongitude(String flongitude) {		     
         this.flongitude = flongitude;
	}
	public String getFlatitude() {
		return flatitude;
	}
    
	public void setFlatitude(String flatitude) {		     
         this.flatitude = flatitude;
	}
	public String getFaddress() {
		return faddress;
	}
    
	public void setFaddress(String faddress) {		     
         this.faddress = faddress;
	}
	public Double getFdistance() {
		return fdistance;
	}
    
	public void setFdistance(Double fdistance) {		     
         this.fdistance = fdistance;
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

	public Integer getFreadCount() {
		return freadCount;
	}

	public void setFreadCount(Integer freadCount) {
		this.freadCount = freadCount;
	}
}