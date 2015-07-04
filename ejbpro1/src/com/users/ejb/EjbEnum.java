package com.users.ejb;
// 1|2 = 3 ; 1&3 =1
public class EjbEnum {
	
	//参数分类
	public enum ParaCategory {
        Distributor("分销商", 1), Supplier("绿色", 2);
		
     // 成员变量
        private String name;
        private int value;
        // 构造方法
        private ParaCategory(String name, int val) {
            this.name = name;
            this.value = val;
        }
        //覆盖方法
        @Override
        public String toString() {
            return this.value+"_"+this.name;
        } 
        
        public int value() {
            return this.value;
        }
    }
	
	//控件字段控制范畴——字段的可删，可看，可改的控制
	public enum FieldState {
        IsFixed("锁定，不可删除",1),IsCodeLock("编码锁定", 2);
		
     // 成员变量
        private String name;
        private int value;
        // 构造方法
        private FieldState(String name, int val) {
            this.name = name;
            this.value = val;
        }
        //覆盖方法
        @Override
        public String toString() {
            return this.value+"_"+this.name;
        } 
        
        public int value() {
            return this.value;
        }
    }
	
	//数据控制范畴——参数状态
	public enum ParaState {
        IsFixed("锁定，不可删除",1),IsChecked("已审核", 2), IsPause("暂停使用", 4), IsDelete("已删除", 8);
		
     // 成员变量
        private String name;
        private int value;
        // 构造方法
        private ParaState(String name, int val) {
            this.name = name;
            this.value = val;
        }
        //覆盖方法
        @Override
        public String toString() {
            return this.value+"_"+this.name;
        } 
        
        public int value() {
            return this.value;
        }
    }	
}
