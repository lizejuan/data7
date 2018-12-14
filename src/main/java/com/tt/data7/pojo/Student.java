package com.tt.data7.pojo;
/**
 *@作者:lizejuan
 *@时间:2018/12/13 10:55
 *@描述:
 */
public class Student {
    private String studentName;
    private Integer studentNo;
    private String studentPwd;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (studentNo != null ? !studentNo.equals(student.studentNo) : student.studentNo != null) return false;
        return studentPwd != null ? studentPwd.equals(student.studentPwd) : student.studentPwd == null;
    }

    public int hashCode() {
        int result = studentName != null ? studentName.hashCode() : 0;
        result = 31 * result + (studentNo != null ? studentNo.hashCode() : 0);
        result = 31 * result + (studentPwd != null ? studentPwd.hashCode() : 0);
        return result;
    }

    public Student(String studentName, Integer studentNo, String studentPwd) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.studentPwd = studentPwd;
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentPwd() {
        return studentPwd;
    }

    public void setStudentPwd(String studentPwd) {
        this.studentPwd = studentPwd;
    }
}

