package com.luobo.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.luobo.model.UserType;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	public static UserType userType;
	public static Object userObject;
	private JMenu manageMembersMenu;
	private JMenu manageManagerMenu;
	private JMenu manageDepartmentMenu;
	private JMenuItem addDepartmentNewMenuItem;
	private JMenuItem addMemberMenuItem;
	private JMenuItem addManagerMenuItem;
	private JMenuItem addCourseMenuItem;
	private JMenu selectCourseMenu;
	private JMenuItem exportMenuItem;
	private JMenu dataMenu ;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainFrm frame = new MainFrm(null,null);
					frame.setVisible(true);
					frame.setExtendedState(frame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public MainFrm(UserType userType , Object userObject) {
		setFont(new Font("微软雅黑", Font.PLAIN, 14));
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.userType=userType;
		this.userObject=userObject;
		
		
		setTitle("\u8BA1\u7B97\u673A\u793E\u56E2\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 593);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7CFB\u7EDF\u8BBE\u7F6E .png")));
		menu.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u5BC6\u7801\u4FEE\u6539");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				changePassword(ae);
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5BC6\u7801\u4FEE\u6539.png")));
		menuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				exitSystem(ag);
			}
		});
		menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA\u7CFB\u7EDF.png")));
		menuItem_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menu.add(menuItem_1);
		
		manageMembersMenu = new JMenu("\u793E\u5458\u7BA1\u7406");
		manageMembersMenu.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		manageMembersMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u793E\u5458\u8D44\u6599.png")));
		menuBar.add(manageMembersMenu);
		
		addMemberMenuItem = new JMenuItem("\u793E\u5458\u6DFB\u52A0");
		addMemberMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				addMembersAct(ag);
			}
		});
		addMemberMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		addMemberMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u793E\u5458\u6DFB\u52A0.png")));
		manageMembersMenu.add(addMemberMenuItem);
		
		JMenuItem menuItem_3 = new JMenuItem("\u793E\u5458\u5217\u8868");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				manageMembersAct(ag);
			}
		});
		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u4EBA\u5458\u5217\u8868.png")));
		menuItem_3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		manageMembersMenu.add(menuItem_3);
		
		manageManagerMenu = new JMenu("\u5E72\u5458\u7BA1\u7406");
		manageManagerMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u4EBA\u5458\u7BA1\u7406.png")));
		manageManagerMenu.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(manageManagerMenu);
		
		addManagerMenuItem = new JMenuItem("\u5E72\u5458\u6DFB\u52A0");
		addManagerMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				addManagerAct(ae);
			}
		});
		addManagerMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E72\u5458\u6DFB\u52A0.png")));
		addManagerMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		manageManagerMenu.add(addManagerMenuItem);
		
		JMenuItem managerListMenuItem = new JMenuItem("\u5E72\u5458\u5217\u8868");
		managerListMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				manageManagerListAct(ag);
			}
		});
		managerListMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E72\u5458\u5217\u8868.png")));
		managerListMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		manageManagerMenu.add(managerListMenuItem);
		
		manageDepartmentMenu = new JMenu("\u90E8\u95E8\u7BA1\u7406");
		manageDepartmentMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u90E8\u95E8.png")));
		manageDepartmentMenu.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(manageDepartmentMenu);
		
		addDepartmentNewMenuItem = new JMenuItem("\u90E8\u95E8\u6DFB\u52A0");
		addDepartmentNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				addDepartment(ag);
			}
		});
		addDepartmentNewMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u90E8\u95E8\u6DFB\u52A0.png")));
		addDepartmentNewMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		manageDepartmentMenu.add(addDepartmentNewMenuItem);
		
		JMenuItem menuItem_6 = new JMenuItem("\u90E8\u95E8\u5217\u8868");
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				manageDepartment(ag);
			}
		});
		menuItem_6.setIcon(new ImageIcon(MainFrm.class.getResource("/images/77\u90E8\u95E8\u5217\u8868.png")));
		menuItem_6.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		manageDepartmentMenu.add(menuItem_6);
		
		selectCourseMenu = new JMenu("课程管理");
		selectCourseMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/课程.png")));
		selectCourseMenu.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(selectCourseMenu);
		
		addCourseMenuItem = new JMenuItem("添加课程");
		addCourseMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				addCourseAct(ag);
			}
		});
		addCourseMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/添加课程.png")));
		addCourseMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		selectCourseMenu.add(addCourseMenuItem);
		
		JMenuItem ManageCourseMenuItem = new JMenuItem("课程管理");
		ManageCourseMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				manageCourseAct(ag);
			}
		});
		ManageCourseMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/课程管理.png")));
		ManageCourseMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		selectCourseMenu.add(ManageCourseMenuItem);
		
		dataMenu = new JMenu("数据功能");
		dataMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/数据.png")));
		dataMenu.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(dataMenu);
		
		exportMenuItem = new JMenuItem("导出社员");
		exportMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				ImportDataFrm importDataFrm = new ImportDataFrm();
				importDataFrm.setVisible(true);
				desktopPane.add(importDataFrm);
			}
		});
		exportMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/导出.png")));
		exportMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		dataMenu.add(exportMenuItem);
		
		JMenu menu_3 = new JMenu("选课功能");
		menu_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/选课.png")));
		menu_3.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(menu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("选课管理");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ag) {
				ChooseCourseFrm chooseCourseFrm = new ChooseCourseFrm();
				chooseCourseFrm.setVisible(true);
				desktopPane.add(chooseCourseFrm);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/选课管理.png")));
		mntmNewMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menu_3.add(mntmNewMenuItem);
		
		JMenu menu_4 = new JMenu("\u5E2E\u52A9");
		menu_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E2E\u52A9.png")));
		menu_4.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menuBar.add(menu_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				aboutUs(ae);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
		mntmNewMenuItem_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		menu_4.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setAuthority();
	}


	protected void manageCourseAct(ActionEvent ag) {
		// TODO Auto-generated method stub
		ManageCourseFrm manageCourseFrm = new ManageCourseFrm();
		manageCourseFrm.setVisible(true);
		desktopPane.add(manageCourseFrm);
	}

	protected void addCourseAct(ActionEvent ag) {
		// TODO Auto-generated method stub
		AddCourseFrm addCourseFrm = new AddCourseFrm();
		addCourseFrm.setVisible(true);
		desktopPane.add(addCourseFrm);
	}

	protected void manageMembersAct(ActionEvent ag) {
		// TODO Auto-generated method stub
		ManageMembersFrm mmf = new ManageMembersFrm();
		mmf.setVisible(true);
		desktopPane.add(mmf);
	}

	protected void addMembersAct(ActionEvent ag) {
		// TODO Auto-generated method stub
		AddMembersFrm amf = new AddMembersFrm();
		amf.setVisible(true);
		desktopPane.add(amf);
	}

	protected void manageManagerListAct(ActionEvent ag) {
		// TODO Auto-generated method stub
		ManageManagerFrm mmf = new ManageManagerFrm();
		mmf.setVisible(true);
		desktopPane.add(mmf);
	}

	protected void addManagerAct(ActionEvent ae) {
		// TODO Auto-generated method stub
		AddManagerFrm amf = new AddManagerFrm();
		amf.setVisible(true);
		desktopPane.add(amf);
	}

	protected void manageDepartment(ActionEvent ag) {
		// TODO Auto-generated method stub
		ManageDepartmentFrm manageDepartmentFrm = new ManageDepartmentFrm();
		manageDepartmentFrm.setVisible(true);
		desktopPane.add(manageDepartmentFrm);
	}

	protected void addDepartment(ActionEvent ag) {
		// TODO Auto-generated method stub
		AddDepartmentFrm ap = new AddDepartmentFrm();
		ap.setVisible(true);
		desktopPane.add(ap);
	}

	protected void exitSystem(ActionEvent ag) {
		// TODO Auto-generated method stub
		if(JOptionPane.showConfirmDialog(MainFrm.this, "确定退出么？")==JOptionPane.OK_OPTION){
			System.exit(0);
		}
	}

	protected void changePassword(ActionEvent ae) {
		// TODO Auto-generated method stub
		ChangePasswordFrm changePasswordFrm = new ChangePasswordFrm();
		changePasswordFrm.setVisible(true);
		desktopPane.add(changePasswordFrm);
	}

	protected void aboutUs(ActionEvent ae) {
		// TODO Auto-generated method stub
		String info="帮助";
		String[] buttons={"迫不及待去看看!","心情好点再去看"};
		int get=JOptionPane.showOptionDialog(this, info, "关于我们", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, new ImageIcon(LoginFrm.class.getResource("/images/login.png")), buttons, null);
		if(get==0){
			
			try {
				URI url=new URI("http://www.baidu.com");
				Desktop.getDesktop().browse(url);
				Runtime.getRuntime().exec("explorer http://www.baidu.com");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			JOptionPane.showMessageDialog(this, "再见");
		}
	}
	private void setAuthority(){
		if("社团成员".equals(userType.getName())){
			manageManagerMenu.setEnabled(false);
			manageDepartmentMenu.setEnabled(false);
			//manageMembersMenu.setEnabled(false);
			addMemberMenuItem.setEnabled(false);
			selectCourseMenu.setEnabled(false);
			dataMenu.setEnabled(false);
		}
		else if("社团管理员".equals(userType.getName())){
			addManagerMenuItem.setEnabled(false);
			addDepartmentNewMenuItem.setEnabled(false);
		}
	}
}
