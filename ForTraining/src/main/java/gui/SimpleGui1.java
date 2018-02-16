package gui;

import javax.swing.*;

public class SimpleGui1 {

    public static void main(String[] args) {

//    Создаем JFrame. JFrame - это объект, который представляет собой окно на экране
        JFrame frame = new JFrame();

//    Создаем виджет (конпку, поле ввода и т. д.)
        JButton button = new JButton("click me");

//        Устанавливаем завершение программы при закрытии окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//    Добавляем виджет во фрейм
        frame.getContentPane().add(button);

//    Выводим фрейм на экран, присваиваем ему размер и делаем видимым
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
