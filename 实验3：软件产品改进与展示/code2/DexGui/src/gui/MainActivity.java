package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class MainActivity {

	private static JPanel topPan = new JPanel();
	private static JPanel midPan = new JPanel();
	private static JPanel bottomPan = new JPanel();
	private static JButton sourceButton = new JButton("选择文件");
	private static JButton outputButton = new JButton("选择输出路径");
	private static JTextField sourceText = new JTextField();
	private static JTextField outputText = new JTextField();
	private static JButton startButton = new JButton("开始转换");
	private static File sourceFile = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame = new JFrame("dex2jar");
		mainFrame.setSize(600, 400);
		mainFrame.setBackground(Color.WHITE);
		mainFrame.setLocation(300, 200);
		mainFrame.setLayout(new GridLayout(3,1,3,3));
		
		topPan.setLayout(new GridLayout(1,3,3,3));
		midPan.setLayout(new GridLayout(1,3,3,3));
		bottomPan.setLayout(new GridLayout(1,3,3,3));
		
		topPan.add(new JLabel("源文件路径:"));
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(3,1));
		pan1.add(new JLabel(""));
		pan1.add(sourceText);
		topPan.add(pan1);
		JPanel pan11 = new JPanel();
		pan11.setLayout(new GridLayout(3,1));
		pan11.add(new JLabel(""));
		pan11.add(sourceButton);
		sourceButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				sourceText.setText("");
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setApproveButtonText("确定");
				fileChooser.setDialogTitle("打开文件");
				int result = fileChooser.showOpenDialog(mainFrame);
				if(result==JFileChooser.APPROVE_OPTION){
					sourceFile = fileChooser.getSelectedFile();
					if(sourceFile!=null){
						sourceText.setText(sourceFile.getAbsolutePath());
					}
				}
			}
			
		});
		topPan.add(pan11);
		
		midPan.add(new JLabel("输出路径:"));
		JPanel pan2 = new JPanel();
		pan2.setLayout(new GridLayout(3,1));
		pan2.add(new JLabel(""));
		pan2.add(outputText);
		midPan.add(pan2);
		JPanel pan22 = new JPanel();
		pan22.setLayout(new GridLayout(3,1));
		pan22.add(new JLabel(""));
		pan22.add(outputButton);
		outputButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				outputText.setText("");
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.setApproveButtonText("确定");
				fileChooser.setDialogTitle("保存文件");
				int result = fileChooser.showSaveDialog(mainFrame);
				if(result==JFileChooser.APPROVE_OPTION){
					outputText.setText(fileChooser.getSelectedFile().getAbsolutePath());
				}
			}
			
		});
		midPan.add(pan22);
		
		bottomPan.add(new JLabel(""));
		JPanel pan3 = new JPanel();
		pan3.setLayout(new GridLayout(3,1));
		pan3.add(new JLabel(""));
		pan3.add(startButton);
		startButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int index = sourceText.getText().lastIndexOf('\\');
				String str = sourceText.getText().substring(index + 1);
				runbat("F:/软件工程实验/dex2jar.bat",sourceText.getText()
						,outputText.getText(),str); 
			}
			
		});
		bottomPan.add(pan3);
		bottomPan.add(new JLabel(""));
		
		mainFrame.add(topPan);
		mainFrame.add(midPan);
		mainFrame.add(bottomPan);
		mainFrame.setVisible(true);
	}
	
	public static void runbat(String batName,String... argStrings) {
//		String cmd = "cmd /c start /b " + batName + " ";
		String cmd = "cmd /c start " + batName + " ";
		if (argStrings != null && argStrings.length > 0) {
			for (String string : argStrings) {
				cmd += string + " ";
			}
		}
		 try {
			Process ps = Runtime.getRuntime().exec(cmd);
			JOptionPane.showConfirmDialog(null, "choose one", "choose one", JOptionPane.YES_NO_OPTION);
			ps.waitFor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
