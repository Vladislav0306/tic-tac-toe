import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("запускаем игру...");
        JFrame window = new JFrame("TicTacToe"); // наше главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // добавляем кнопку X, закрывающую окно
        window.setSize(400, 400); // размер окна
        window.setLayout(new BorderLayout()); // менеджер компоновки
        window.setLocationRelativeTo(null); // чтобы окно было по центру экрана
        window.setVisible(true); // включаем видимость окна
        TicTacToe game = new TicTacToe(); // создаём объект нашего класса
        window.add(game); // добавляем его в окно
        System.out.println("конец...");
    }
}