/*
* File: MainFrame.java
* Author:Megyeri Márk Máté
* Copyright: 2022, Megyeri Márk Máté 
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/megyerimark/
* Licenc: GNU GPL
*/

package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> groupModel;
    public JComboBox<String> groupCombo;

    public DefaultListModel<String> workersModel;
    public JList<String> workersList;
    JScrollPane scrollPane;

    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }

    private void setMainComponent() {
        this.groupModel = new DefaultComboBoxModel<>();
        this.groupCombo = new JComboBox<>(groupModel);

        this.workersModel = new DefaultListModel<>();
        this.workersList = new JList<>(workersModel);
        this.scrollPane = new JScrollPane(this.workersList);
        this.scrollPane.setPreferredSize(new Dimension(500, 400));
    }

    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.groupCombo, BorderLayout.NORTH);
        this.mainPanel.add(this.scrollPane, BorderLayout.CENTER);

    }

    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
    }
}
