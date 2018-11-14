package com.example.accessmodule;

import java.util.ArrayList;
import java.util.List;

//员工业务报表
public class BusinessReport {

    List<Staff> mStaffs = new ArrayList();

    public BusinessReport(){
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("李工"));
        mStaffs.add(new Engineer("黄工"));
        mStaffs.add(new Engineer("谭工"));
    }

    public void showReport(Visitor visitor){
        for (Staff mStaff: mStaffs){
            mStaff.accept(visitor);
        }
    }

}
