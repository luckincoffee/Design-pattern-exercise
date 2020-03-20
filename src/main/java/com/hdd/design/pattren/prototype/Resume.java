package com.hdd.design.pattren.prototype;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private WorkExperience work;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = name;
        obj.sex = sex;
        obj.age = age;
        return obj;
    }

    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience)work.clone();
    }

    // 设置个人信息
    public void SetPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void SetWorkExperience(String timeArea, String company) {
        work.setCompany(company);
        work.setWorkDate(timeArea);
    }

    public void Display() {
        System.out.println(name + "," + sex + "," + age);
        System.out.println(work.toString());
        System.out.println("工作经历:" + work.getCompany() + work.getWorkDate());
    }
}
