package com.zimenina.yuliya.work_with_collections;

/**
 * @author Yuliya Zimenina
 */

/*
The class Developer contains a collection of classes Skill
 */

public enum Developer {
    DEVELOPER_1(new Skill[]{Skill.JAVA, Skill.JAVASCRIPT, Skill.ANDROID, Skill.REACT, Skill.DATABASE}),
    DEVELOPER_2(new Skill[]{Skill.PYTHON, Skill.DATABASE, Skill.PHP, Skill.DOCKER}),
    DEVELOPER_3(new Skill[]{Skill.QA, Skill.JAVA, Skill.ANDROID, Skill.SQL}),
    DEVELOPER_4(new Skill[]{Skill.PYTHON, Skill.SQL, Skill.SWIFT, Skill.MYSQL, Skill.DOCKER}),
    DEVELOPER_5(new Skill[]{Skill.JAVA, Skill.REACT, Skill.SPRING, Skill.SQL, Skill.ANDROID}),
    DEVELOPER_6(new Skill[]{Skill.SPRING, Skill.JAVA, Skill.ANDROID, Skill.SWIFT, Skill.DOCKER}),
    DEVELOPER_7(new Skill[]{Skill.PHP, Skill.REACT, Skill.JAVASCRIPT}),
    DEVELOPER_8(new Skill[]{Skill.ANDROID, Skill.JAVASCRIPT, Skill.JAVA, Skill.SPRING, Skill.DOCKER}),
    DEVELOPER_9(new Skill[]{Skill.JAVASCRIPT, Skill.JAVA, Skill.REACT, Skill.SPRING, Skill.SQL});

    //Skill class collection
    Skill [] skill;

    //Class constructor
    Developer(Skill[] skill) {
        this.skill = skill;
    }

    //Getter
    public Skill[] getSkill() {
        return skill;
    }

}
