package app_udp_monitor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UdpControl extends Thread {

    public String host = "";
    public int port = 0;
    public JPanel infoPanel;
    public JLabel buff;
    public boolean stop = false;

    public JLabel seq0;
    public JLabel pes0;
    public JLabel seq1;
    public JLabel pes1;
    public JLabel seq2;
    public JLabel pes2;
    public JLabel seq3;
    public JLabel pes3;
    public JLabel seq4;
    public JLabel pes4;
    public JLabel seq5;
    public JLabel pes5;
    public JLabel seq6;
    public JLabel pes6;
    public JLabel seq7;
    public JLabel pes7;
    public JLabel seq8;
    public JLabel pes8;
    public JLabel seq9;
    public JLabel pes9;

    @Override
    public void run() {
        String quote = "";
        byte[] buffer = new byte[64];
        while (true) {
            if(stop) break;
            try {
                infoPanel.setBackground(new java.awt.Color(255, 0, 0));
                DatagramSocket socket = new DatagramSocket();
                socket.setSoTimeout(50);

                DatagramPacket request = new DatagramPacket("0".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                DatagramPacket response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq0.setText(quote.split("_")[0]);
                pes0.setText(quote.split("_")[1]);   
                buff.setText("ULTIMO PESO: " + quote.split("_")[1]);
                
                request = new DatagramPacket("1".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq1.setText(quote.split("_")[0]);
                pes1.setText(quote.split("_")[1]);  
                
                request = new DatagramPacket("2".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq2.setText(quote.split("_")[0]);
                pes2.setText(quote.split("_")[1]);

                request = new DatagramPacket("3".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq3.setText(quote.split("_")[0]);
                pes3.setText(quote.split("_")[1]);
                                
                request = new DatagramPacket("4".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq4.setText(quote.split("_")[0]);
                pes4.setText(quote.split("_")[1]);
                                
                request = new DatagramPacket("5".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq5.setText(quote.split("_")[0]);
                pes5.setText(quote.split("_")[1]);
                           
                request = new DatagramPacket("6".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq6.setText(quote.split("_")[0]);
                pes6.setText(quote.split("_")[1]);
                    
                request = new DatagramPacket("7".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq7.setText(quote.split("_")[0]);
                pes7.setText(quote.split("_")[1]);
                    
                request = new DatagramPacket("8".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq8.setText(quote.split("_")[0]);
                pes8.setText(quote.split("_")[1]);
                    
                request = new DatagramPacket("9".getBytes(), 1, InetAddress.getByName(host), port);
                socket.send(request);                
                response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);                
                quote = new String(buffer, 0, response.getLength());
                seq9.setText(quote.split("_")[0]);
                pes9.setText(quote.split("_")[1]);
                                                                         
                infoPanel.setBackground(new java.awt.Color(50, 255, 50));
                Thread.sleep(200);
            } catch (SocketTimeoutException ex) {
                System.out.println("Timeout error: " + ex.getMessage());
                ex.printStackTrace();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex1) {
                }
            } catch (IOException ex) {
                System.out.println("Client error: " + ex.getMessage());
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
