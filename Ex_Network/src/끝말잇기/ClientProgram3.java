package 끝말잇기;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientProgram3 {

    public static void main(String[] args) {
        // 서버의 도메인 이름 또는 IP 주소 설정
        String serverIp = "192.168.50.10"; // 수동으로 IP 주소 설정
        int port = 9990; // ServerProgram에서 지정한 포트번호 그대로 가져옴

        // GUI 초기화
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Chat");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300));

                JLabel label = new JLabel("서버와 통신 상태", SwingConstants.LEFT);
                JTextArea inputArea = new JTextArea(3, 20); // 입력을 위한 JTextArea
                inputArea.setLineWrap(true);
                inputArea.setWrapStyleWord(true);
                JButton button = new JButton("Submit");
                JTextArea textArea = new JTextArea();
                textArea.setEditable(false);

                // JPanel to hold the input area and button
                JPanel panel = new JPanel(new BorderLayout());
                panel.add(new JScrollPane(inputArea), BorderLayout.CENTER);
                panel.add(button, BorderLayout.EAST);

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
                            try (Socket socket = new Socket(serverIp, port);
                                 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                                 PrintWriter pw = new PrintWriter(socket.getOutputStream(), true)) {

                                textArea.append("서버: " + br.readLine() + "\n");

                                // 버튼 클릭 이벤트 리스너 추가
                                button.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        sendMessage(pw, inputArea, textArea);
                                    }
                                });

                                // 입력 필드의 키 이벤트 처리
                                inputArea.addKeyListener(new KeyAdapter() {
                                    @Override
                                    public void keyPressed(KeyEvent e) {
                                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                            if (e.isAltDown()) {
                                                inputArea.append("\n");
                                            } else {
                                                sendMessage(pw, inputArea, textArea);
                                                e.consume(); // 엔터키 이벤트 소비하여 새 줄 생성 방지
                                            }
                                        }
                                    }
                                });

                                // 서버로부터의 메시지 수신 및 처리
                                while (true) {
                                    String serverMsg = br.readLine();
                                    if (serverMsg != null) {
                                        textArea.append("서버: " + serverMsg + "\n");
                                        if (serverMsg.equalsIgnoreCase("exit")) {
                                            break;
                                        }
                                    } else {
                                        break; // 서버로부터 null 메시지를 받으면 연결 종료
                                    }
                                }
                                textArea.append("서버와 연결 해제됨\n"); // 연결 종료 메시지 출력
                            }
                        } catch (UnknownHostException e) {
                            textArea.append("알 수 없는 호스트: " + e.getMessage() + "\n"); // 오류 메시지 출력
                        } catch (IOException e) {
                            textArea.append("I/O 오류: " + e.getMessage() + "\n"); // 오류 메시지 출력
                        }
                    }
                }).start();
            }
        });
    }

    private static void sendMessage(PrintWriter pw, JTextArea inputArea, JTextArea textArea) {
        String sendMsg = inputArea.getText().trim();
        if (!sendMsg.isEmpty()) {
            pw.println(sendMsg);
            textArea.append("나: " + sendMsg + "\n");
            inputArea.setText("");
        }
    }
}


