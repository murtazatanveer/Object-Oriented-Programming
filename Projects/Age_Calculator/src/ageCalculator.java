
import java.time.LocalDate;
import javax.swing.*;
public class ageCalculator extends javax.swing.JFrame {

    
    public ageCalculator() {
        initComponents();
        getContentPane().setBackground(java.awt.Color.gray);
        
    }

  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date = new javax.swing.JComboBox<>();
        Month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        t = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setText("Year");
        

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel2.setText("Month");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel3.setText("Date");

        Date.setFont(new java.awt.Font("Tahoma", 1, 16)); 
        Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Month.setFont(new java.awt.Font("Tahoma", 1, 16)); 
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        Year.setFont(new java.awt.Font("Tahoma", 1, 16)); 
        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1920","1921","1922","1923","1924","1925","1926","1927","1928","1929","1930","1931","1932","1933","1934","1935","1936","1937","1938","1939","1940","1941","1942","1943","1944","1945","1946","1947","1948","1949","1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); 
        jButton1.setText("Calculate Age");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Tahoma", 1, 15)); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       

        int birth_year = Integer.parseInt((String)Year.getSelectedItem());

        int birth_month = Month.getSelectedIndex()+1;

        int birth_date = Integer.parseInt((String)Date.getSelectedItem());

        LocalDate currentDate = LocalDate.now();       
        
        int date = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        if( ((birth_date == 31) && (birth_month == 2 || birth_month == 4 || birth_month == 6 || birth_month == 9 ||birth_month == 11)) || ((birth_date>=29 && birth_date<=31) && (birth_month==1)) || ((birth_year==2024) &&(birth_month>month) || ((birth_year==2024)&&(birth_month==month && date<birth_date))) ){   
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
            return;
        }

 
int age_month = 0, age_year = 0, age_Date = 0;

if(month==birth_month && date==birth_date){

    age_year = year - birth_year;

}

else if(birth_month > month || ((birth_month==month)&&(birth_date>date))){

    age_year = (year - birth_year)-1;
  
    age_month = birth_month>month && date>=birth_date ? (12-birth_month) + month : ((12-birth_month) + month) - 1;
    age_Date =  birth_date>date ? 30 - (birth_date-date) : (int)((float)(30.42-birth_date) - (float)(30.42-date));
}

else{

    age_year = (year - birth_year);

    if(month==birth_month){

    age_month = 0;
    age_Date = date - birth_date;

}

else{

    age_month =  (month-birth_month);

    if(date>birth_date){

        age_Date = date - birth_date;
        
    }

    else{

        age_month--;
        age_Date = (int)(30.42-(birth_date-date));

    }
}
    
}

age_Date = Math.abs(age_Date);

t.setText(age_year+" Years , "+age_month+" Months , "+age_Date+" Days");
        
        
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                ageCalculator ob = new ageCalculator();
                ob.setTitle("Calculate Your Age");
                ob.setVisible(true);
                
                
            }
        });
    }

   
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t;
    
}
