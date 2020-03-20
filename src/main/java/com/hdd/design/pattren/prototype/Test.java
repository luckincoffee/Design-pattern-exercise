package com.hdd.design.pattren.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.SetPersonalInfo("男", "29");
        a.SetWorkExperience("1998-2000", "XX 公司");
        Resume b = (Resume)a.clone();
        b.SetWorkExperience("1998-2001", "XXx 公司");
        a.Display();
        b.Display();
    }
}
