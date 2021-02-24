package com.pattern;

import java.util.Vector;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgrLogic {
   SalaryMgrView smView = null;
   public SalaryMgrLogic(SalaryMgrView salaryMgrView) {
      this.smView = salaryMgrView;
   }

   public void getEmpDetail(int pempno) {
      EmpVO  eVO  = new EmpVO();
      eVO.setEname("김유신");
      DeptVO dVO  = new DeptVO();
      dVO.setDname("형상관리팀");
      eVO.setDVO(dVO);//issue
      Vector oneRow = new Vector();
      oneRow.addElement(eVO.getEname());
      oneRow.addElement(eVO.getDVO().getDname());///////////////////확인
      smView.dtm_sal.addRow(oneRow);   
   }///////////////////end of getEmpDetail
}