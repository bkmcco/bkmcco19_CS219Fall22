package ZipCodeDB;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel {
    //JPanel is a class, not an interface; extending another class
    //Making a special version of a JPanel by "extending" GUIPanel
    //Inherits all the JPanel code inside GUIPanel

    private JTextField zipcode;
    private JButton submit;

    private JButton northernmost;
    private JTextArea output;

    private Database db;           //the zipcode database

    public GUIPanel() {
        //job of construtor is to initialize instance data
        this.zipcode = new JTextField("zipcode",7);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);

        this.northernmost = new JButton("Northernmost");
        this.add(this.northernmost);

        this.output = new JTextArea(5,20);
        this.add(this.output);

        //create instance of SubmitButtonListener Class on the submit button
        this.submit.addActionListener(new SubmitButtonListener());

        //create instance of our NorthernmostButtonListener on our specified button
        this.northernmost.addActionListener(new NorthernmostButtonListener());

        this.db = new Database(); //load the zipcodes
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //this function will get called when the user presses submit
            output.setText("The button was pressed.");

            //get the zipcode out of the text field
            String code = zipcode.getText();
            output.setText(code);

            Zipcode zc = db.search(code);
            //now we have our zipcode object....

            WeatherObservation wob = zc.getWeatherData();
            //now we have out weather observations for the zipcode....

            output.setText(wob.toString());
        }
    }
    class NorthernmostButtonListener implements ActionListener{
        @Override
                public void actionPerformed(ActionEvent e) {
                    //this gets called when the northernmost button is pressed
                    Zipcode max_north = db.getNorthern();
                    String code = max_north.toString();
                    output.setText(code);

                }

        }

}
