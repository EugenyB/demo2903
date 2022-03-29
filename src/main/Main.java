package main;

import main.broadcast.Broadcast;
import main.radiostation.RadioStation;
import main.ui.Menu;

import java.util.Scanner;

public class Main {

    private RadioStation rs;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        rs = new RadioStation();
        Menu menu = new Menu();
        while (true) {
            menu.show();
            int selection = menu.getSelection("Select one");
            if (selection == 0) break;
            switch (selection) {
                case 1: showAll(); break;
                case 2: addBroadcast(); break;
                case 3: addSong(); break;
            }
        }
    }

    private void addSong() {

    }

    private void addBroadcast() {
        Broadcast broadcast = getBroadcast();
        rs.addBroadcast(broadcast);
    }

    private Broadcast getBroadcast() {
        System.out.print("New broadcast duration: ");
        int duration = new Scanner(System.in).nextInt();
        return new Broadcast(duration);
    }

    private void showAll() {
        Broadcast[] broadcasts = rs.getAllBroadcasts();
        for (Broadcast broadcast : broadcasts) {
            System.out.println(broadcast);
        }
    }
}

/*
Ми хочемо управляти даними місцевою радіостанцією.

Враховуємо трансляції.

Трансляції

Кожна трансляція має визначену тривалість (у хвилинах) і кожна трансляція складається з різних частин, так що кожна частина представляє собою
пісню,
інтерв'ю чи
рекламу.
Для кожної частини трансляції необхідно враховувати її тривалість.
Для пісень необхідно зберегти як ім'я виконавця, так і назва пісні.
Для реклами необхідно також зберегти назву рекламного продукту. Ціна секунди реклами дорівнює 5 євро.
Для інтерв'ю також слід зберегти ім'я інтерв'юіруемого. Ціна за хвилину інтерв'ю равна 30 євро.
Передбачити, що пізніше можуть бути додані і інші види трансляцій, які приносять прибуток.

Реалізувати облік трансляцій:

1. Зберігайте усі різні частини трансляції (пісні, інтерв'ю і рекламні ролики) згідно з порядком, в якому вони транслювалися.
2. Неприпустимо додавання додаткової частини до трансляцій, якщо загальна кількість хвилин передачі більше, ніж довжина всієї трансляції.
3. Крім того, тривалість платного контенту не може перевищувати 50% від загальної тривалості трансляцій.

Перегляньте можливість перегляду доходів радіостанцій від конкретної трансляції.

Для кожної трансляції передбачити можливість відображення усіх її частин
 */