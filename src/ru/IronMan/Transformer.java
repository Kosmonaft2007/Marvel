package ru.IronMan;

public class Transformer {
    private Integer name;

    public Integer getName() {
        return name;
    }

    public Transformer(Integer name) {
        this.name = name;
    }

    public void run() {
        this.name++;
    }
//optimus.run() // приказываем Оптимусу бежать
//    print optimus.x // выведет 1
//optimus.run() // приказывает Оптимусу еще раз бежать
//    print optimus.x // выведет 2
}
