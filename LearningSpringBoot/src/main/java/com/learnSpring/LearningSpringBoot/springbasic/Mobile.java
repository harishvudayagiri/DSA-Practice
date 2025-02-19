package com.learnSpring.LearningSpringBoot.springbasic;

public class Mobile {
    Sim sim=null;
    public Mobile() {
    }

    public Mobile(Sim sim) {
        this.sim = sim;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }


}
