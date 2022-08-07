import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GameFace implements ActionListener
{
	//Begin variables
	int n1,n2,c,key,vloc;
	String s1,s2,t;
	String x,y;
	JFrame frm;
	Container con;
	FlowLayout fly;
	JButton[] fbtn;
	BorderLayout bly;
	Panel pnl,pnl2;
	TextField txt1;
	TextField txt2;
	JButton[] btn;
	JLabel lbl;
	//End variables 
	
	//Begin constructor
	void runCal()
	{
		frm=new JFrame();
		con=frm.getContentPane();
		lbl=new JLabel("Test",JLabel.CENTER);
		lbl.setBackground(Color.decode("#b7b8cf"));
		lbl.setOpaque(true);
		lbl.setFont(new Font("Serif", Font.PLAIN, 60));

		
		fly = new FlowLayout();
		con.setLayout(fly);
		
		bly = new BorderLayout();
		con.setLayout(bly);
		
		pnl=new Panel();
		pnl.setLayout(new FlowLayout());
		
		pnl2=new Panel();
		pnl2.setLayout(new GridLayout(3,3));
		btn=new JButton[9];
		int voidd=(int)Math.floor(Math.random()*(7-1+1)+1);
		for(int i=0;i<voidd;i++)
			btn[i]=new JButton(i+1+"");
		btn[voidd]=new JButton(" ");
		for(int i=voidd+1;i<9;i++)
			btn[i]=new JButton(i+"");
		for(int i=0;i<btn.length;i++)
		{
			pnl2.add(btn[i]);
		}
		for(int i=0;i<btn.length;i++)
			btn[i].addActionListener(this);
		con.add(pnl,BorderLayout.NORTH);
		con.add(pnl2,BorderLayout.CENTER);
		con.add(lbl,BorderLayout.SOUTH);
		
		frm.setSize(400,400);
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//End constructor
	public static void main(String args[])
	{
		 GameFace c=new GameFace();
		c.runCal();
	}
	
	//Other Methods
	public void actionPerformed(ActionEvent e)
	{
		x=e.getActionCommand();
		for(int i=0;i<btn.length;i++)
		{
			y=btn[i].getText();
			if(y==" ")
			{
				vloc=i;
			}
		}
		for(int i=0;i<btn.length;i++)
		{
			y=btn[i].getText();
			if(x==y)
			{
				key=i;
			}
		}
		
		if(x==" ")
		{
			lbl.setText("Invalid Move");
			lbl.setBackground(Color.decode("#ff8484"));
		}
		else
		{
			if(key==0)
			{
				if(vloc==1)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==3)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==1)
			{
				if(vloc==0)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==2)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==4)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==2)
			{
				if(vloc==1)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==5)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==3)
			{
				if(vloc==0)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==4)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==6)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==4)
			{
				if(vloc==1)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==3)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==5)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==7)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==5)
			{
				if(vloc==2)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==4)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==8)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==6)
			{
				if(vloc==3)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==7)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==7)
			{
				if(vloc==6)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==4)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==8)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			if(key==8)
			{
				if(vloc==5)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
				if(vloc==7)
				{
					btn[key].setText(" ");
					btn[vloc].setText(x);
					c=c+1;
				}
			}
			lbl.setBackground(Color.decode("#85eda2"));
			lbl.setText("Moves: "+c);
		}
	}
}