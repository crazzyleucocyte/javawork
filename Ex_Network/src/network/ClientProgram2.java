package network;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientProgram2 {

    public static void main(String[] args) {
        // 서버의 도메인 이름
        int port = 9990; // ServerProgram에서 지정한 포트번호 그대로 가져옴
        
        // GUI 초기화
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("끝말잇기 클라이언트");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300));

                JLabel label = new JLabel("서버와 통신 상태", SwingConstants.LEFT);
                JTextField textField = new JTextField(20);
                JButton button = new JButton("Submit");
                JTextArea textArea = new JTextArea();
                textArea.setEditable(false);

                // JPanel to hold the text field and button
                JPanel panel = new JPanel();
                panel.add(textField);
                panel.add(button);

                // Add components to the frame
                frame.getContentPane().add(label, BorderLayout.NORTH);
                frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
                frame.getContentPane().add(panel, BorderLayout.SOUTH);

                // Center the frame on the screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width / 2 - 400 / 2, dim.height / 2 - 300 / 2);

                frame.pack();
                frame.setVisible(true);

                // 서버와의 통신을 별도의 스레드에서 처리
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            String serverIp = "192.168.50.10"; 
                            try (Socket socket = new Socket(serverIp, port);
                                 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                                 PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
                                
                                textArea.append("서버: " + br.readLine() + "\n");
                                button.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String sendMsg = textField.getText();
                                        pw.println(sendMsg);
                                        pw.flush();
                                        textField.setText("");
                                    }
                                });

                                while (true) {
                                    String serverMsg = br.readLine();
                                    textArea.append("서버: " + serverMsg + "\n");
                                    if (serverMsg.equals("exit")) {
                                        break;
                                    }
                                }
                                textArea.append("서버와 연결 해제됨\n");
                            }
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }
}

