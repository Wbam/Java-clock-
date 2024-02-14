import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dateLabel;
    JLabel dayLabel;
    String time;
    String day;
    String date;


    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        timeFormat= new SimpleDateFormat("hh:mm:ss a");
        dayFormat= new SimpleDateFormat("EEEE");
        dateFormat= new SimpleDateFormat("dd MMMMM,yy");

        timeLabel=new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel=new JLabel();
        dayLabel.setFont(new Font("Ink free",Font.PLAIN,35));

        dateLabel=new JLabel();
        dateLabel.setFont(new Font("Ink free",Font.PLAIN,40));


        time=timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);

        this.setVisible(true);

        setTime();
    }
    public void setTime(){
        while (true){
        time=timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        day=dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
        date=dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
