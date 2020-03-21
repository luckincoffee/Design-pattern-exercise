package com.hdd.design.pattren.observer1;

public class NBAObserver extends Observer {
    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void Update() {
        System.out.println(sub.getAction() + name + "关闭直播NBA，继续工作");
    }
}
