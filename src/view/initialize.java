package view;
import controller.GameController;

import javax.swing.*;
import java.awt.*;


public class initialize extends JFrame{
    public initialize(){

        super("国际象棋");
        panel=new JPanel(new BorderLayout());
//        label=new JLabel("国际象棋",new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\ChessDemo\\images\\aa567cad7820bd6fa4f0ce4cf0ea8f0f.jpeg"), SwingConstants.CENTER);
        label=new JLabel("国际象棋");
        label.setLocation(40,40);
        label.setIcon(new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\ChessDemo\\images\\2f52e4b460fd2300b7fb96313180c98f.jpeg"));
        label.setIconTextGap(-1000);
        label.setLayout(null);
//        label.setIcon(new ImageIcon("C:\\Users\\lenovo\\IdeaProjects\\ChessDemo\\images\\a55a05fbec480292cd751d5b7e4303ad.jpeg"));
        JButton button=new JButton("开始");
        JButton button1=new JButton("记录");
        label.setFont(new Font("宋体",Font.BOLD,90));
        label.setForeground(new Color(255,255,255));
        button1.setFont(new Font("宋体",Font.BOLD,30));
        button.setFont(new Font("宋体",Font.BOLD,30));
        button.addActionListener(e -> {
            ChessGameFrame mainFrame = new ChessGameFrame(1000, 760);
            mainFrame.setVisible(true);
        });
        button.setBounds(700,100,150,65);
        button1.setBounds(700,250,150,65);
        label.setBounds(50,10,100,100);
        panel.add(button);
        panel.add(button1);
        panel.add(label);
        add(panel);
    }
    private  JLabel label;
    private JPanel panel;

    public static void main(String[] args) {
        initialize gui=new initialize();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setSize(1000,760);
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
    }
}
