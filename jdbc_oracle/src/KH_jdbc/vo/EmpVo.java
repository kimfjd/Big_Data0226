package KH_jdbc.vo;

import java.math.BigDecimal;
import java.sql.Date;

//  Vo는 데이터베이스에서 가져온 레코드를 자바객체로 매핑하는데 사용
public class EmpVo {
    private int empNo; // 사원 번호
    private String name; // 사원 이름
    private String job; // 직책
    private int mgr; // 상관 사원 번호
    private Date date; // 입사 날짜
    private BigDecimal sal; // 급여 정보 (소수점 이하가 존재)
    private BigDecimal comm; // 성과급
    private int deptno; // 부서 번호

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public EmpVo(int empNo, String name, String job, int mgr, Date date, BigDecimal sal, BigDecimal comm, int deptno) {
        this.empNo = empNo;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.date = date;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;


    }
}
