import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;


import javax.swing.JScrollPane;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Main extends JFrame {

    /**
     *
     */
    JLayeredPane layeredPane = new JLayeredPane();

    private JTextField txtSearch;

    private int filterRow;

    String current = new File("Main.java").getAbsolutePath();
    String path = current.substring(0,current.length()-9);

    private JTextField textField;
    private JTextField variantNameField;
    private JTextField fieldGsaidClade;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    /**
     * Create the frame.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Main() {
        setBounds(new Rectangle(0, 0, 1920, 1080));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        layeredPane.setBounds(0, 215, screenSize.width, (int)(screenSize.height*0.8));
        getContentPane().add(layeredPane);
        
                JPanel analysisPanel = new JPanel();
                analysisPanel.setBounds(0, 0, 1920, 864);
                layeredPane.add(analysisPanel);
                analysisPanel.setLayout(null);
                
                JLabel analysisTitle = new JLabel("Analysis");
                analysisTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
                analysisTitle.setBounds(50, 50, 161, 44);
                analysisPanel.add(analysisTitle);
        
        JPanel worksCitedPanel = new JPanel();
        worksCitedPanel.setBounds(0, 0, 1920, 864);
        layeredPane.add(worksCitedPanel);
        worksCitedPanel.setLayout(null);
        
        JLabel worksCitedTitle = new JLabel("Works Cited");
        worksCitedTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
        worksCitedTitle.setBounds(50, 50, 227, 38);
        worksCitedPanel.add(worksCitedTitle);
        
        JLabel citation1 = new JLabel("CDC COVID-19 Data Tracker. (2020). Center for Disease Control and Prevention. Retrieved November 5, 2020, from https://covid.cdc.gov/covid-data-tracker/#cases_casesper100klast37days.\r\n");
        citation1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        citation1.setBounds(50, 99, 1700, 22);
        worksCitedPanel.add(citation1);
        
        JLabel citation2 = new JLabel("Chen, C. F., Tsai, T. Y., Yu, C. H., Cheng, H. L., & Yeh, T. Y. (2020). Prolonged viral shedding and new mutations of COVID-19 could complicate the control of the pandemic. Access microbiology, 2(7).");
        citation2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        citation2.setBounds(50, 132, 1596, 22);
        worksCitedPanel.add(citation2);
        
        JLabel citation3 = new JLabel("Hamzah, F. B., Lau, C., Nazri, H., Ligot, D. V., Lee, G., Tan, C. L., ... & Chung, M. H. (2020). CoronaTracker: worldwide COVID-19 outbreak data analysis and prediction. Bulletin of the World Health Organization, 1(32), 1-32.");
        citation3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        citation3.setBounds(50, 165, 1776, 22);
        worksCitedPanel.add(citation3);

        JPanel variantDetailsPanel = new JPanel();
        variantDetailsPanel.setBounds(0, 0, 1920, 864);
        layeredPane.add(variantDetailsPanel);
        variantDetailsPanel.setLayout(null);

        JLabel variantDetailsTitle = new JLabel("COVInsight Variant Engine");
        variantDetailsTitle.setBounds(50, 50, 485, 44);
        variantDetailsTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
        variantDetailsPanel.add(variantDetailsTitle);

        JLabel variantName = new JLabel("Detailed Information for Variant");
        variantName.setFont(new Font("Tahoma", Font.BOLD, 20));
        variantName.setBounds(50, 105, 332, 25);
        variantDetailsPanel.add(variantName);

        JLabel variantGsaid = new JLabel("GSAID Clade");
        variantGsaid.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantGsaid.setBounds(50, 160, 115, 22);
        variantDetailsPanel.add(variantGsaid);

        JLabel variantS1 = new JLabel("Number of S1 Mutations");
        variantS1.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantS1.setBounds(350, 160, 220, 22);
        variantDetailsPanel.add(variantS1);

        JLabel variantClade = new JLabel("Clade");
        variantClade.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantClade.setBounds(755, 160, 55, 22);
        variantDetailsPanel.add(variantClade);

        JLabel variantCountry = new JLabel("Country");
        variantCountry.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantCountry.setBounds(995, 160, 75, 22);
        variantDetailsPanel.add(variantCountry);

        JLabel variantDivision = new JLabel("Division");
        variantDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantDivision.setBounds(1255, 160, 77, 22);
        variantDetailsPanel.add(variantDivision);

        JLabel variantGsaidEpiIsl = new JLabel("GSAID_EPI_ISL");
        variantGsaidEpiIsl.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantGsaidEpiIsl.setBounds(50, 360, 143, 22);
        variantDetailsPanel.add(variantGsaidEpiIsl);

        JLabel variantHost = new JLabel("Host");
        variantHost.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantHost.setBounds(350, 360, 77, 22);
        variantDetailsPanel.add(variantHost);

        JLabel variantPangoLineage = new JLabel("PANGO Lineage");
        variantPangoLineage.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantPangoLineage.setBounds(755, 360, 143, 22);
        variantDetailsPanel.add(variantPangoLineage);

        JLabel variantRegion = new JLabel("Region");
        variantRegion.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantRegion.setBounds(995, 360, 77, 22);
        variantDetailsPanel.add(variantRegion);

        JLabel variantEmergingClade = new JLabel("Emerging Clade");
        variantEmergingClade.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantEmergingClade.setBounds(1255, 360, 143, 22);
        variantDetailsPanel.add(variantEmergingClade);

        JLabel variantDate = new JLabel("Date");
        variantDate.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantDate.setBounds(50, 560, 43, 22);
        variantDetailsPanel.add(variantDate);

        ButtonGroup filterButtons = new ButtonGroup();
        String[] monthNames = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        JPanel databasePanel = new JPanel();
        databasePanel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        databasePanel.setBounds(0, 0, screenSize.width, (int)(screenSize.height*0.8));
        layeredPane.add(databasePanel);
        databasePanel.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportBorder(null);
        scrollPane.setBounds(50, 207, 1799, 465);
        databasePanel.add(scrollPane);

        JList results = new JList();
        results.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        results.setFont(new Font("Tahoma", Font.PLAIN, 18));
        scrollPane.setViewportView(results);

        JLabel engineTitle = new JLabel("COVInsight Variant Engine");
        engineTitle.setBounds(50, 50, 492, 44);
        engineTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
        databasePanel.add(engineTitle);

        txtSearch = new JTextField();
        txtSearch.setBounds(179, 105, 938, 31);
        txtSearch.setFont(new Font("Tahoma", Font.PLAIN, 20));
        databasePanel.add(txtSearch);

        JButton search_1 = new JButton("Search");
        search_1.setBounds(50, 105, 119, 31);
        search_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        databasePanel.add(search_1);

        JLabel searchBy = new JLabel("Search By:");
        searchBy.setBounds(50, 147, 84, 22);
        searchBy.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(searchBy);

        JRadioButton strainName = new JRadioButton("Strain Name");
        strainName.setSelected(true);
        strainName.setBounds(140, 147, 115, 23);
        strainName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(strainName);

        JRadioButton gsaidClade = new JRadioButton("GSAID Clade");
        gsaidClade.setBounds(280, 147, 120, 23);
        gsaidClade.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(gsaidClade);

        JRadioButton s1Mutations = new JRadioButton("S1 Mutations");
        s1Mutations.setBounds(425, 147, 120, 23);
        s1Mutations.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(s1Mutations);

        JRadioButton clade = new JRadioButton("Clade");
        clade.setBounds(570, 147, 65, 23);
        clade.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(clade);

        JRadioButton country = new JRadioButton("Country");
        country.setBounds(660, 147, 85, 23);
        country.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(country);

        JRadioButton date = new JRadioButton("Date");
        date.setBounds(770, 147, 85, 23);
        date.setFont(new Font("Tahoma", Font.PLAIN, 16));
        databasePanel.add(date);

        filterButtons.add(strainName);
        filterButtons.add(gsaidClade);
        filterButtons.add(s1Mutations);
        filterButtons.add(clade);
        filterButtons.add(country);
        filterButtons.add(date);

        JComboBox month = new JComboBox();
        month.setBounds(1127, 105, 134, 30);
        month.setModel(new DefaultComboBoxModel(monthNames));
        month.setFont(new Font("Tahoma", Font.PLAIN, 20));
        databasePanel.add(month);
        month.setVisible(false);

        JComboBox year = new JComboBox();
        year.setBounds(1271, 105, 84, 30);
        year.setModel(new DefaultComboBoxModel(new String[] {"2019", "2020", "2021"}));
        year.setFont(new Font("Tahoma", Font.PLAIN, 20));
        databasePanel.add(year);
        year.setVisible(false);

        JLabel flex = new JLabel();
        flex.setFont(new Font("Tahoma", Font.PLAIN, 14));
        flex.setBounds(50, 180, 520, 16);
        databasePanel.add(flex);

        JLabel noVariantError = new JLabel("No variant selected, please select a variant and try again!");
        noVariantError.setVisible(false);
        noVariantError.setForeground(Color.RED);
        noVariantError.setFont(new Font("Tahoma", Font.BOLD, 14));
        noVariantError.setBounds(50, 753, 395, 22);
        databasePanel.add(noVariantError);

        strainName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month.setVisible(false);
                year.setVisible(false);
                txtSearch.setEditable(true);
                filterRow = 0;
            }
        });

        gsaidClade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month.setVisible(false);
                year.setVisible(false);
                txtSearch.setEditable(true);
                filterRow = 1;
            }
        });

        s1Mutations.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month.setVisible(false);
                year.setVisible(false);
                txtSearch.setEditable(true);
                filterRow = 2;
            }
        });

        clade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month.setVisible(false);
                year.setVisible(false);
                txtSearch.setEditable(true);
                filterRow = 3;
            }
        });

        country.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month.setVisible(false);
                year.setVisible(false);
                txtSearch.setEditable(true);
                filterRow = 4;
            }
        });

        date.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                month.setVisible(true);
                year.setVisible(true);
                txtSearch.setEditable(false);
                filterRow = 11;
            }
        });

        search_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long startTime = System.currentTimeMillis();
                if (filterRow == 11)
                {
                    ArrayList<String> listOfMonths = new ArrayList<String>();
                    for (String value : monthNames)
                        listOfMonths.add(value);
                    int monthNum = listOfMonths.indexOf(month.getSelectedItem().toString()) + 1;
                    String yearNum = (String) year.getSelectedItem();
                    String dateString = monthNum+""+yearNum;
                    Search search = new Search(filterRow, dateString);
                    search.findResults();
                    Strain[] myString = search.findResults();
                    results.setVisibleRowCount(search.numElements());
                    results.setListData(myString);
                    long endTime = System.currentTimeMillis();
                    flex.setText(search.numElements() + " variants found out of " + search.totalNumElements() + " variants (" + (endTime - startTime) + " milliseconds)");
                }
                //
                else
                {
                    Search search = new Search(filterRow, txtSearch.getText());
                    Strain[] myString = search.findResults();
                    results.setVisibleRowCount(search.numElements());
                    results.setListData(myString);
                    long endTime = System.currentTimeMillis();
                    flex.setText(search.numElements() + " variants found out of " + search.totalNumElements() + " variants (" + (endTime - startTime) + " milliseconds)");
                }
            }});

        variantNameField = new JTextField();
        variantNameField.setEditable(false);
        variantNameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        variantNameField.setBounds(392, 105, 444, 25);
        variantDetailsPanel.add(variantNameField);

        fieldGsaidClade = new JTextField();
        fieldGsaidClade.setEditable(false);
        fieldGsaidClade.setFont(new Font("Tahoma", Font.PLAIN, 18));
        fieldGsaidClade.setBounds(50, 193, 103, 25);
        variantDetailsPanel.add(fieldGsaidClade);

        textField_1 = new JTextField();
        textField_1.setEditable(false);
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_1.setColumns(10);
        textField_1.setBounds(350, 193, 63, 25);
        variantDetailsPanel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setEditable(false);
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_2.setColumns(10);
        textField_2.setBounds(755, 193, 103, 25);
        variantDetailsPanel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_3.setColumns(10);
        textField_3.setBounds(995, 193, 220, 25);
        variantDetailsPanel.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setEditable(false);
        textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_4.setColumns(10);
        textField_4.setBounds(1255, 193, 220, 25);
        variantDetailsPanel.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setEditable(false);
        textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_5.setColumns(10);
        textField_5.setBounds(50, 393, 148, 25);
        variantDetailsPanel.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setEditable(false);
        textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_6.setColumns(10);
        textField_6.setBounds(350, 393, 220, 25);
        variantDetailsPanel.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setEditable(false);
        textField_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_7.setColumns(10);
        textField_7.setBounds(755, 393, 108, 25);
        variantDetailsPanel.add(textField_7);

        textField_8 = new JTextField();
        textField_8.setEditable(false);
        textField_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_8.setColumns(10);
        textField_8.setBounds(995, 393, 220, 25);
        variantDetailsPanel.add(textField_8);

        textField_9 = new JTextField();
        textField_9.setEditable(false);
        textField_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_9.setColumns(10);
        textField_9.setBounds(1255, 393, 103, 25);
        variantDetailsPanel.add(textField_9);

        textField_10 = new JTextField();
        textField_10.setEditable(false);
        textField_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_10.setColumns(10);
        textField_10.setBounds(50, 593, 143, 25);
        variantDetailsPanel.add(textField_10);

        JButton variantDetails = new JButton("View Variant Details");
        variantDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Strain currentStrain = (Strain) results.getSelectedValue();

                variantNameField.setText(currentStrain.getStrainName());
                fieldGsaidClade.setText(currentStrain.getGsaidClade());
                textField_1.setText(currentStrain.getNumS1Muations());
                textField_2.setText(currentStrain.getClade());
                textField_3.setText(currentStrain.getCountry());
                textField_4.setText(currentStrain.getDivision());
                textField_5.setText(currentStrain.gsaidEpiIsl());
                textField_6.setText(currentStrain.getHost());
                textField_7.setText(currentStrain.getPangoLineage());
                textField_8.setText(currentStrain.getRegion());
                textField_9.setText(currentStrain.getEmergingClade());
                textField_10.setText(currentStrain.getDate());
                switchPanels(variantDetailsPanel);
            }
        });
        variantDetails.setForeground(Color.WHITE);
        variantDetails.setBackground(Color.DARK_GRAY);
        variantDetails.setFocusPainted(false);
        variantDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
        variantDetails.setBounds(50, 693, 275, 49);
        databasePanel.add(variantDetails);

        JPanel welcomePanel = new JPanel();
        welcomePanel.setBounds(0, 0, screenSize.width, (int)(screenSize.height*0.8));
        layeredPane.add(welcomePanel);
        welcomePanel.setLayout(null);

        JLabel welcomeTitle = new JLabel("Welcome to COVInsight Systems");
        welcomeTitle.setBounds(300, 88, 600, 44);
        welcomeTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
        welcomePanel.add(welcomeTitle);

        JLabel welcomeMessage = new JLabel("<html>COVInsight Systems is a comprehensive database developed as a part of a high school research project by Robin Hwang and Justin Davitashvili during the COVID-19 pandemic. The primary purpose of COVInsight Systems is to provide fellow researchers insight into our phylogenetic study behind SARS-CoV-2. With over 3000 mutations of the SARS-CoV-2 virus, it was important to analyze what results from these mutations. In this study, symptom variance was analyzed based on mutations/clades.<html>");
        welcomeMessage.setBounds(300, 143, 1320, 145);
        welcomeMessage.setVerticalAlignment(SwingConstants.TOP);
        welcomeMessage.setFont(new Font("Tahoma", Font.PLAIN, 24));
        welcomePanel.add(welcomeMessage);

        JLabel abstractTitle = new JLabel("Abstract");
        abstractTitle.setBounds(300, 350, 600, 44);
        abstractTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
        welcomePanel.add(abstractTitle);

        JLabel abstractText = new JLabel("<html>The SARS-CoV-2 has caused a public health crisis since December 2019 and has gone through thousands of mutations. Some of these mutations have sparked concern due to higher rates of transmission. Additionally, some mutations may cause less recognition by antibodies of variants prominent earlier in the health crisis, which may lead to hindered vaccine processes. The purpose of this project was to analyze different mutations of SARS-CoV-2 and find common mutations. Using the Nextstrain database, which documents new variants of viruses, multiple analyses on the SARS-CoV-2 were done based on their clade, mutation, and source of origin. Then, a script (coded in the Python programming language) was used to determine the most frequent mutations within the virus. The most frequent mutations were then analyzed and compared to where the mutations occurred in the world and the hospitalization/death rate. This was done since the hospitalization and death rate were representative of severe disease. Finally, to display the findings of this research, a desktop application was coded in the Java programming language and featured a \u201Csearch\u201D feature to efficiently find a certain mutation and information of the mutation. This was done since the Nextstrain database seemed to have a sharp learning curve in terms of its usage.<html>");
        abstractText.setBounds(300, 405, 1320, 348);
        abstractText.setVerticalAlignment(SwingConstants.TOP);
        abstractText.setFont(new Font("Tahoma", Font.PLAIN, 24));
        welcomePanel.add(abstractText);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0,0,screenSize.width, screenSize.height/5);
        getContentPane().add(panel);

        JLabel logo = new JLabel("");
        logo.setIcon(new ImageIcon(path + "logo_header.png"));

        JButton databaseB = new JButton("Database");
        databaseB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                switchPanels(databasePanel);
            }
        });
        databaseB.setForeground(Color.WHITE);
        databaseB.setFont(new Font("Tahoma", Font.BOLD, 22));
        databaseB.setFocusPainted(false);
        databaseB.setBorderPainted(false);
        databaseB.setBackground(new Color(0, 0, 102));

        JButton welcomeB = new JButton("Welcome");
        welcomeB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                switchPanels(welcomePanel);
            }
        });
        welcomeB.setForeground(Color.WHITE);
        welcomeB.setFont(new Font("Tahoma", Font.BOLD, 22));
        welcomeB.setFocusPainted(false);
        welcomeB.setBorderPainted(false);
        welcomeB.setBackground(new Color(0, 0, 102));

  

        JButton worksCitedB = new JButton("Works Cited");
        worksCitedB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                switchPanels(worksCitedPanel);
            }
        });
        worksCitedB.setForeground(Color.WHITE);
        worksCitedB.setFont(new Font("Tahoma", Font.BOLD, 22));
        worksCitedB.setFocusPainted(false);
        worksCitedB.setBorderPainted(false);
        worksCitedB.setBackground(new Color(0, 0, 102));


        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(37)
        			.addComponent(logo, GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        			.addGap(193)
        			.addComponent(welcomeB, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        			.addGap(55)
        			.addComponent(databaseB, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        			.addGap(53)
        			.addComponent(worksCitedB, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        			.addGap(122))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(91)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(welcomeB, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        				.addComponent(databaseB, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        			.addGap(81))
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(90)
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(worksCitedB, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        			.addGap(82))
        		.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
        			.addGap(34)
        			.addComponent(logo, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        			.addGap(35))
        );
        panel.setLayout(gl_panel);

        switchPanels(welcomePanel);
    }

    public void switchPanels(JPanel inPanel)
    {
        layeredPane.removeAll();
        layeredPane.add(inPanel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }


    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
