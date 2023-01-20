import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Welcome extends JFrame implements ActionListener {
	Container c1;
	JLabel l1, l2, limage;
	JButton b1;

	Welcome() {
		c1 = getContentPane();
		l1 = new JLabel("Welcome to Indigo Nation ");
		l2 = new JLabel("   THE ONLY THING WE LOVE MORE THAN FOOD IS YOU");
		b1 = new JButton("Order Now");
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\Background.jpg");
		limage = new JLabel(i);
		Font f1 = new Font("Verdana", Font.BOLD, 33);
		Font f2 = new Font("Verdana", Font.ITALIC | Font.BOLD, 22);
		l1.setFont(f1);
		l2.setFont(f2);
		l1.setBounds(300, 10, 500, 200);
		l2.setBounds(150, 120, 750, 200);
		b1.setBounds(600, 400, 150, 50);
		c1.add(limage);
		limage.add(l1);
		limage.add(l2);
		limage.add(b1);
		b1.addActionListener(this);
	}

	public static void main(String args[]) {
		Welcome w = new Welcome();
		w.setSize(1000, 1000);
		w.setTitle("Food Ordering System");
		w.setVisible(true);
		w.setLayout(null);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		Option o = new Option();
		o.setVisible(true);
		o.setSize(1000, 1000);
		o.setTitle("Choose Option");

		o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Option extends JFrame implements ActionListener {
	Container c2;
	JLabel l1, limage;
	JButton b1, b2, b3, b4;

	Option() {

		c2 = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m5.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("What would you like to have?");
		b1 = new JButton("Chinese");
		b2 = new JButton("Continental");
		b3 = new JButton("S.Indian");
		b4 = new JButton("N.Indian");
		limage.setBounds(0, 0, 1000, 1000);
		l1.setBounds(100, 50, 300, 30);
		b1.setBounds(200, 200, 270, 30);
		b2.setBounds(200, 300, 270, 30);
		b3.setBounds(500, 200, 270, 30);
		b4.setBounds(500, 300, 270, 30);
		Font f1 = new Font("Verdana", Font.BOLD, 18);
		Font f2 = new Font("Verdana", Font.ITALIC | Font.BOLD, 13);
		l1.setFont(f1);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		limage.add(l1);
		limage.add(b1);
		limage.add(b2);
		limage.add(b3);
		limage.add(b4);
		c2.add(limage);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Chinese")) {
			this.setVisible(false);
			ChineseMenu m1 = new ChineseMenu(this);
			m1.setVisible(true);
			m1.setSize(1000, 1000);
			m1.setTitle("Chinese Menu");

			m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		if (e.getActionCommand().equals("S.Indian")) {
			this.setVisible(false);
			SIMenu si = new SIMenu(this);
			si.setVisible(true);
			si.setSize(1000, 1000);
			si.setTitle("S.I Menu");

			si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if (e.getActionCommand().equals("Continental")) {
			this.setVisible(false);
			ConMenu con = new ConMenu(this);
			con.setVisible(true);
			con.setSize(1000, 1000);
			con.setTitle("Continental Menu");

			con.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		if (e.getActionCommand().equals("N.Indian")) {
			this.setVisible(false);
			NIMenu ni = new NIMenu(this);
			ni.setVisible(true);
			ni.setSize(1000, 1000);
			ni.setTitle("N.I Menu");

			ni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}

class ChineseMenu extends JFrame implements ActionListener {
	Container c3;
	Option opt;
	int total;
	JLabel l1, limage, l2, l3, l4, l5;
	JButton ok, prev;
	JCheckBox cb1, cb2, cb3, cb4;
	JComboBox comb1, comb2, comb3, comb4;

	ChineseMenu(Option u) {
		opt = u;
		c3 = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m5.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("Chef Specials! Taste them all :)");
		cb1 = new JCheckBox("Dim Sums");
		l2 = new JLabel("270/-");
		cb2 = new JCheckBox("Mooncake");
		l3 = new JLabel("230/-");
		cb3 = new JCheckBox("Peri");
		l4 = new JLabel("269/-");
		cb4 = new JCheckBox("Chicken Satay");
		l5 = new JLabel("299/-");
		ok = new JButton("OK");
		prev = new JButton("Back");
		Font f1 = new Font("Verdana", Font.BOLD, 23);
		Font f2 = new Font("Verdana", Font.ITALIC | Font.BOLD, 20);
		Font f3 = new Font("Verdana", Font.BOLD, 16);
		String qty[] = { " ", "1", "2", "3", "4" };
		comb1 = new JComboBox(qty);
		comb2 = new JComboBox(qty);
		comb3 = new JComboBox(qty);
		comb4 = new JComboBox(qty);
		ok.setFont(f3);
		prev.setFont(f3);
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		cb1.setFont(f2);
		cb2.setFont(f2);
		cb3.setFont(f2);
		cb4.setFont(f2);
		limage.setBounds(0, 0, 1000, 1000);
		l1.setBounds(100, 150, 700, 30);

		cb1.setBounds(200, 300, 300, 20);
		comb1.setBounds(700, 300, 40, 20);
		l2.setBounds(500, 300, 100, 25);

		cb2.setBounds(200, 370, 300, 20);
		comb2.setBounds(700, 370, 40, 20);
		l3.setBounds(500, 370, 100, 25);

		cb3.setBounds(200, 440, 300, 20);
		comb3.setBounds(700, 440, 40, 20);
		l4.setBounds(500, 440, 100, 25);

		cb4.setBounds(200, 510, 300, 20);
		comb4.setBounds(700, 510, 40, 20);
		l5.setBounds(500, 510, 100, 25);

		ok.setBounds(700, 700, 200, 50);
		prev.setBounds(20, 10, 100, 30);

		limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(l4);
		limage.add(l5);
		limage.add(comb1);
		limage.add(comb2);
		limage.add(comb3);
		limage.add(comb4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(ok);
		limage.add(prev);
		c3.add(limage);

		ok.addActionListener(this);
		prev.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		total = 0;
		String s;
		int x;
		if (e.getActionCommand().equals("Back")) {
			this.setVisible(false);
			opt.setVisible(true);
		}
		if (e.getActionCommand().equals("OK")) {
			if (cb1.isSelected()) {
				s = comb1.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 270 * x;
			}
			if (cb2.isSelected()) {
				s = comb2.getSelectedItem().toString();
				if (s.equals(" "))

				{
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 230 * x;
			}
			if (cb3.isSelected()) {
				s = comb3.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 269 * x;
			}
			if (cb4.isSelected()) {
				s = comb4.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 299 * x;
			}
			System.out.println(" " + total);

			this.setVisible(false);
			Bill b = new Bill(this);
			b.setVisible(true);
			b.setSize(1000, 1000);
			b.setTitle("Bill Page");
			b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}

}

class SIMenu extends JFrame implements ActionListener {
	Container c4;
	Option opt;
	int total;
	JLabel l1, limage, l2, l3, l4, l5;
	JButton ok, prev;
	JCheckBox cb1, cb2, cb3, cb4;
	JComboBox comb1, comb2, comb3, comb4;

	SIMenu(Option u) {
		opt = u;
		c4 = getContentPane();

		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m5.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("Chef Specials! Taste them all :)");
		cb1 = new JCheckBox("Plain Idli");
		l2 = new JLabel("109/-");
		cb2 = new JCheckBox("Masala Dosa");
		l3 = new JLabel("159/-");
		cb3 = new JCheckBox("Uttapam");
		l4 = new JLabel("129/-");
		cb4 = new JCheckBox("Sambar Vada");
		l5 = new JLabel("99/-");
		ok = new JButton("OK");
		prev = new JButton("Back");
		Font f1 = new Font("Verdana", Font.BOLD, 23);
		Font f2 = new Font("Verdana", Font.ITALIC | Font.BOLD, 20);
		Font f3 = new Font("Verdana", Font.BOLD, 16);
		String qty[] = { " ", "1", "2", "3", "4" };
		comb1 = new JComboBox(qty);
		comb2 = new JComboBox(qty);
		comb3 = new JComboBox(qty);
		comb4 = new JComboBox(qty);
		ok.setFont(f3);
		prev.setFont(f3);
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		cb1.setFont(f2);
		cb2.setFont(f2);
		cb3.setFont(f2);
		cb4.setFont(f2);
		limage.setBounds(0, 0, 1000, 1000);
		l1.setBounds(100, 150, 700, 30);

		cb1.setBounds(200, 300, 300, 20);
		comb1.setBounds(700, 300, 40, 20);
		l2.setBounds(500, 300, 100, 25);

		cb2.setBounds(200, 370, 300, 20);
		comb2.setBounds(700, 370, 40, 20);
		l3.setBounds(500, 370, 100, 25);

		cb3.setBounds(200, 440, 300, 20);
		comb3.setBounds(700, 440, 40, 20);
		l4.setBounds(500, 440, 100, 25);

		cb4.setBounds(200, 510, 300, 20);
		comb4.setBounds(700, 510, 40, 20);
		l5.setBounds(500, 510, 100, 25);

		ok.setBounds(700, 700, 200, 50);
		prev.setBounds(20, 10, 100, 30);

		limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(l4);
		limage.add(l5);
		limage.add(comb1);
		limage.add(comb2);
		limage.add(comb3);
		limage.add(comb4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(ok);
		limage.add(prev);
		c4.add(limage);

		ok.addActionListener(this);
		prev.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		total = 0;
		String s;
		int x;
		if (e.getActionCommand().equals("Back")) {
			this.setVisible(false);
			opt.setVisible(true);
		}
		if (e.getActionCommand().equals("OK")) {
			if (cb1.isSelected()) {

				s = comb1.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 109 * x;
			}
			if (cb2.isSelected()) {
				s = comb2.getSelectedItem().toString();
				if (s.equals(" "))

				{
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 159 * x;
			}
			if (cb3.isSelected()) {
				s = comb3.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 129 * x;
			}
			if (cb4.isSelected()) {
				s = comb4.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 99 * x;
			}
			this.setVisible(false);
			Bill b = new Bill(this);
			b.setVisible(true);
			b.setSize(1000, 1000);
			b.setTitle("Bill Page");
			b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}

class ConMenu extends JFrame implements ActionListener {
	Container c;
	Option opt;
	int total;
	JLabel l1, limage, l2, l3, l4, l5;
	JButton ok, prev;
	JCheckBox cb1, cb2, cb3, cb4;
	JComboBox comb1, comb2, comb3, comb4;

	ConMenu(Option u) {
		opt = u;
		c = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m5.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("Chef Specials! Taste them all :)");
		cb1 = new JCheckBox("Tandoor chicken");
		l2 = new JLabel("349/-");
		cb2 = new JCheckBox("Chicken Biryani");
		l3 = new JLabel("289/-");
		cb3 = new JCheckBox("Paneer Steak");
		l4 = new JLabel("259/-");
		cb4 = new JCheckBox("Batter Fish");
		l5 = new JLabel("359/-");
		ok = new JButton("OK");
		prev = new JButton("Back");
		Font f1 = new Font("Verdana", Font.BOLD, 23);
		Font f2 = new Font("Verdana", Font.ITALIC | Font.BOLD, 20);
		Font f3 = new Font("Verdana", Font.BOLD, 16);
		String qty[] = { " ", "1", "2", "3", "4" };
		comb1 = new JComboBox(qty);
		comb2 = new JComboBox(qty);
		comb3 = new JComboBox(qty);
		comb4 = new JComboBox(qty);
		ok.setFont(f3);
		prev.setFont(f3);
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		cb1.setFont(f2);
		cb2.setFont(f2);
		cb3.setFont(f2);
		cb4.setFont(f2);
		limage.setBounds(0, 0, 1000, 1000);
		l1.setBounds(100, 150, 700, 30);

		cb1.setBounds(200, 300, 300, 20);
		comb1.setBounds(700, 300, 40, 20);
		l2.setBounds(500, 300, 100, 25);

		cb2.setBounds(200, 370, 300, 20);
		comb2.setBounds(700, 370, 40, 20);
		l3.setBounds(500, 370, 100, 25);

		cb3.setBounds(200, 440, 300, 20);
		comb3.setBounds(700, 440, 40, 20);
		l4.setBounds(500, 440, 100, 25);

		cb4.setBounds(200, 510, 300, 20);
		comb4.setBounds(700, 510, 40, 20);
		l5.setBounds(500, 510, 100, 25);

		ok.setBounds(700, 700, 200, 50);
		prev.setBounds(20, 10, 100, 30);

		limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(l4);
		limage.add(l5);
		limage.add(comb1);
		limage.add(comb2);
		limage.add(comb3);
		limage.add(comb4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(ok);
		limage.add(prev);

		c.add(limage);

		ok.addActionListener(this);
		prev.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		total = 0;
		String s;
		int x;
		if (e.getActionCommand().equals("Back")) {
			this.setVisible(false);
			opt.setVisible(true);
		}
		if (e.getActionCommand().equals("OK")) {
			if (cb1.isSelected()) {

				s = comb1.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 249 * x;
			}
			if (cb2.isSelected()) {
				s = comb2.getSelectedItem().toString();
				if (s.equals(" "))

				{
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 289 * x;
			}
			if (cb3.isSelected()) {
				s = comb3.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 259 * x;
			}
			if (cb4.isSelected()) {
				s = comb4.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 359 * x;
			}
			this.setVisible(false);
			Bill b = new Bill(this);
			b.setVisible(true);
			b.setSize(1000, 1000);
			b.setTitle("Bill Page");
			b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

}

class NIMenu extends JFrame implements ActionListener {
	Container c;
	Option opt;
	int total;
	JLabel l1, limage, l2, l3, l4, l5;
	JButton ok, prev;
	JCheckBox cb1, cb2, cb3, cb4;
	JComboBox comb1, comb2, comb3, comb4;

	NIMenu(Option u) {
		opt = u;
		c = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m5.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("Chef Specials! Taste them all :)");
		cb1 = new JCheckBox("Dal Samosa");
		l2 = new JLabel("170/-");
		cb2 = new JCheckBox("Aloo Kebab");
		l3 = new JLabel("189/-");
		cb3 = new JCheckBox("Vegetable Cutlet");
		l4 = new JLabel("209/-");
		cb4 = new JCheckBox("Paneer Tikka");
		l5 = new JLabel("259/-");
		ok = new JButton("OK");
		prev = new JButton("Back");
		Font f1 = new Font("Verdana", Font.BOLD, 23);
		Font f2 = new Font("Verdana", Font.ITALIC | Font.BOLD, 20);
		Font f3 = new Font("Verdana", Font.BOLD, 16);
		String qty[] = { " ", "1", "2", "3", "4" };
		comb1 = new JComboBox(qty);
		comb2 = new JComboBox(qty);
		comb3 = new JComboBox(qty);
		comb4 = new JComboBox(qty);
		ok.setFont(f3);
		prev.setFont(f3);
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		cb1.setFont(f2);
		cb2.setFont(f2);
		cb3.setFont(f2);
		cb4.setFont(f2);
		limage.setBounds(0, 0, 1000, 1000);
		l1.setBounds(100, 150, 700, 30);

		cb1.setBounds(200, 300, 300, 20);
		comb1.setBounds(700, 300, 40, 20);
		l2.setBounds(500, 300, 100, 25);

		cb2.setBounds(200, 370, 300, 20);
		comb2.setBounds(700, 370, 40, 20);
		l3.setBounds(500, 370, 100, 25);

		cb3.setBounds(200, 440, 300, 20);
		comb3.setBounds(700, 440, 40, 20);
		l4.setBounds(500, 440, 100, 25);

		cb4.setBounds(200, 510, 300, 20);
		comb4.setBounds(700, 510, 40, 20);
		l5.setBounds(500, 510, 100, 25);

		ok.setBounds(700, 700, 200, 50);
		prev.setBounds(20, 10, 100, 30);

		limage.add(l1);
		limage.add(l2);
		limage.add(l3);
		limage.add(l4);
		limage.add(l5);
		limage.add(comb1);
		limage.add(comb2);
		limage.add(comb3);
		limage.add(comb4);
		limage.add(cb1);
		limage.add(cb2);
		limage.add(cb3);
		limage.add(cb4);
		limage.add(ok);
		limage.add(prev);

		c.add(limage);

		ok.addActionListener(this);
		prev.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		total = 0;
		String s;
		int x;
		if (e.getActionCommand().equals("Back")) {
			this.setVisible(false);
			opt.setVisible(true);
		}
		if (e.getActionCommand().equals("OK")) {
			if (cb1.isSelected()) {

				s = comb1.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 170 * x;
			}
			if (cb2.isSelected()) {
				s = comb2.getSelectedItem().toString();
				if (s.equals(" "))

				{
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 189 * x;
			}
			if (cb3.isSelected()) {
				s = comb3.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 209 * x;
			}
			if (cb4.isSelected()) {
				s = comb4.getSelectedItem().toString();
				if (s.equals(" ")) {
					x = 0;
				} else {
					x = Integer.parseInt(s);

				}
				total = total + 259 * x;
			}
			this.setVisible(false);
			Bill b = new Bill(this);
			b.setVisible(true);
			b.setSize(1000, 1000);
			b.setTitle("Bill Page");
			b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}

class Bill extends JFrame implements ActionListener {
	Container c;
	JLabel l1, l2, limage;
	String s;
	int x;
	ChineseMenu h1;
	SIMenu h2;
	NIMenu h4;
	ConMenu h3;

	JLabel f1, f11, f12;
	JLabel f2, f21, f22;
	JLabel f3, f31, f32;
	JLabel f4, f41, f42;
	JLabel f5, f6, f7;

	JButton b1;
	JOptionPane p1;

	Bill(ChineseMenu u) {
		h1 = u;
		c = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m8.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("YOUR BILL");
		l2 = new JLabel("Total " + h1.total);
		f1 = new JLabel();
		f12 = new JLabel();
		f11 = new JLabel();
		f2 = new JLabel();
		f21 = new JLabel();
		f22 = new JLabel();
		f3 = new JLabel();
		f31 = new JLabel();
		f32 = new JLabel();
		f4 = new JLabel();
		f41 = new JLabel();
		f42 = new JLabel();
		f5 = new JLabel();
		f6 = new JLabel();
		f7 = new JLabel();
		Font f = new Font("Verdana", Font.BOLD, 23);
		b1 = new JButton("Checkout");
		l1.setFont(f);

		Font fs = new Font("Verdana", Font.BOLD, 18);
		l2.setFont(fs);

		Font ff = new Font("Verdana", Font.BOLD, 16);
		f5.setFont(ff);
		f6.setFont(ff);
		f7.setFont(ff);

		limage.setBounds(0, 0, 1000, 1000);
		b1.setBounds(700, 700, 200, 40);
		l2.setBounds(600, 500, 200, 50);
		l1.setBounds(420, 20, 700, 30);

		f5.setBounds(200, 150, 200, 20);
		f6.setBounds(400, 150, 100, 20);
		f7.setBounds(600, 150, 100, 20);

		f1.setBounds(200, 200, 200, 20);
		f11.setBounds(400, 200, 100, 20);
		f12.setBounds(600, 200, 100, 20);

		f2.setBounds(200, 270, 300, 20);
		f21.setBounds(400, 270, 100, 20);
		f22.setBounds(600, 270, 100, 20);

		f3.setBounds(200, 340, 300, 20);
		f31.setBounds(400, 340, 100, 20);
		f32.setBounds(600, 340, 100, 20);

		f4.setBounds(200, 410, 300, 20);
		f41.setBounds(400, 410, 100, 20);
		f42.setBounds(600, 410, 100, 20);

		if (h1.cb1.isSelected()) {
			s = h1.comb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				f1.setVisible(false);
				f11.setVisible(false);
				f12.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f1.setText("DIM SUMS");
				f11.setText(" " + x);
				f12.setText(" " + 270 * x);
			}
		}
		if (h1.cb2.isSelected()) {
			s = h1.comb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				f2.setVisible(false);
				f21.setVisible(false);
				f22.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f2.setText("MOONCAKE");
				f21.setText(" " + x);
				f22.setText(" " + 230 * x);
			}
		}
		if (h1.cb3.isSelected()) {
			s = h1.comb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				f3.setVisible(false);
				f31.setVisible(false);
				f32.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f3.setText("PERI");
				f31.setText(" " + x);
				f32.setText(" " + 269 * x);
			}
		}
		if (h1.cb4.isSelected()) {
			s = h1.comb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				f4.setVisible(false);
				f41.setVisible(false);
				f42.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f4.setText("CHICKEN SATAY");
				f41.setText(" " + x);
				f42.setText(" " + 299 * x);
			}
		}

		f5.setText("Dishes");
		f6.setText("Quantity");
		f7.setText("Amount");
		limage.add(l1);
		limage.add(f5);
		limage.add(f6);
		limage.add(f7);
		limage.add(f1);
		limage.add(f11);
		limage.add(f12);
		limage.add(f2);
		limage.add(f21);
		limage.add(f22);
		limage.add(f3);
		limage.add(f31);
		limage.add(f32);
		limage.add(f4);
		limage.add(f41);
		limage.add(f42);
		limage.add(l2);
		limage.add(b1);
		c.add(limage);

		b1.addActionListener(this);
	}

	Bill(SIMenu u) {
		h2 = u;
		c = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m8.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("YOUR BILL");
		l2 = new JLabel("Total " + h2.total);
		f1 = new JLabel();
		f12 = new JLabel();
		f11 = new JLabel();
		f2 = new JLabel();
		f21 = new JLabel();
		f22 = new JLabel();
		f3 = new JLabel();
		f31 = new JLabel();
		f32 = new JLabel();
		f4 = new JLabel();
		f41 = new JLabel();
		f42 = new JLabel();
		f5 = new JLabel();
		f6 = new JLabel();
		f7 = new JLabel();
		Font f = new Font("Verdana", Font.BOLD, 23);
		b1 = new JButton("Checkout");
		l1.setFont(f);

		Font fs = new Font("Verdana", Font.BOLD, 18);
		l2.setFont(fs);

		Font ff = new Font("Verdana", Font.BOLD, 16);
		f5.setFont(ff);
		f6.setFont(ff);
		f7.setFont(ff);

		limage.setBounds(0, 0, 1000, 1000);
		b1.setBounds(700, 700, 200, 40);
		l2.setBounds(600, 500, 200, 50);
		l1.setBounds(420, 20, 700, 30);

		f5.setBounds(200, 150, 200, 20);
		f6.setBounds(400, 150, 100, 20);
		f7.setBounds(600, 150, 100, 20);

		f1.setBounds(200, 200, 200, 20);
		f11.setBounds(400, 200, 100, 20);
		f12.setBounds(600, 200, 100, 20);

		f2.setBounds(200, 270, 300, 20);
		f21.setBounds(400, 270, 100, 20);
		f22.setBounds(600, 270, 100, 20);

		f3.setBounds(200, 340, 300, 20);
		f31.setBounds(400, 340, 100, 20);
		f32.setBounds(600, 340, 100, 20);

		f4.setBounds(200, 410, 300, 20);
		f41.setBounds(400, 410, 100, 20);
		f42.setBounds(600, 410, 100, 20);

		if (h2.cb1.isSelected()) {
			s = h2.comb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				f1.setVisible(false);
				f11.setVisible(false);
				f12.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f1.setText("PLAIN IDLI");
				f11.setText(" " + x);
				f12.setText(" " + 109 * x);
			}
		}
		if (h2.cb2.isSelected()) {
			s = h2.comb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				f2.setVisible(false);
				f21.setVisible(false);
				f22.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f2.setText("MASALA DOSA");
				f21.setText(" " + x);
				f22.setText(" " + 159 * x);
			}
		}
		if (h2.cb3.isSelected()) {
			s = h2.comb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				f3.setVisible(false);
				f31.setVisible(false);
				f32.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f3.setText("UTTAPAM");
				f31.setText(" " + x);
				f32.setText(" " + 129 * x);
			}
		}
		if (h2.cb4.isSelected()) {
			s = h2.comb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				f4.setVisible(false);
				f41.setVisible(false);
				f42.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f4.setText("SAMBAR VADA");
				f41.setText(" " + x);
				f42.setText(" " + 99 * x);
			}
		}

		f5.setText("Dishes");
		f6.setText("Quantity");
		f7.setText("Amount");
		limage.add(l1);
		limage.add(f5);
		limage.add(f6);
		limage.add(f7);
		limage.add(f1);
		limage.add(f11);
		limage.add(f12);
		limage.add(f2);
		limage.add(f21);
		limage.add(f22);
		limage.add(f3);
		limage.add(f31);
		limage.add(f32);
		limage.add(f4);
		limage.add(f41);
		limage.add(f42);
		limage.add(l2);
		limage.add(b1);
		c.add(limage);

		b1.addActionListener(this);
	}

	Bill(ConMenu u) {
		h3 = u;
		c = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m8.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("YOUR BILL");
		l2 = new JLabel("Total " + h3.total);
		f1 = new JLabel();
		f12 = new JLabel();
		f11 = new JLabel();
		f2 = new JLabel();
		f21 = new JLabel();
		f22 = new JLabel();
		f3 = new JLabel();
		f31 = new JLabel();
		f32 = new JLabel();
		f4 = new JLabel();
		f41 = new JLabel();
		f42 = new JLabel();
		f5 = new JLabel();
		f6 = new JLabel();
		f7 = new JLabel();
		Font f = new Font("Verdana", Font.BOLD, 23);
		b1 = new JButton("Checkout");
		l1.setFont(f);

		Font fs = new Font("Verdana", Font.BOLD, 18);
		l2.setFont(fs);

		Font ff = new Font("Verdana", Font.BOLD, 16);
		f5.setFont(ff);
		f6.setFont(ff);
		f7.setFont(ff);

		limage.setBounds(0, 0, 1000, 1000);
		b1.setBounds(700, 700, 200, 40);
		l2.setBounds(600, 500, 200, 50);
		l1.setBounds(420, 20, 700, 30);

		f5.setBounds(200, 150, 200, 20);
		f6.setBounds(400, 150, 100, 20);
		f7.setBounds(600, 150, 100, 20);

		f1.setBounds(200, 200, 200, 20);
		f11.setBounds(400, 200, 100, 20);
		f12.setBounds(600, 200, 100, 20);

		f2.setBounds(200, 270, 300, 20);
		f21.setBounds(400, 270, 100, 20);
		f22.setBounds(600, 270, 100, 20);

		f3.setBounds(200, 340, 300, 20);
		f31.setBounds(400, 340, 100, 20);
		f32.setBounds(600, 340, 100, 20);

		f4.setBounds(200, 410, 300, 20);
		f41.setBounds(400, 410, 100, 20);
		f42.setBounds(600, 410, 100, 20);

		if (h3.cb1.isSelected()) {
			s = h3.comb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				f1.setVisible(false);
				f11.setVisible(false);
				f12.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f1.setText("TANDOOR CHICKEN");
				f11.setText(" " + x);
				f12.setText(" " + 349 * x);
			}
		}
		if (h3.cb2.isSelected()) {
			s = h3.comb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				f2.setVisible(false);
				f21.setVisible(false);
				f22.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f2.setText("CHICKEN BIRYANI");
				f21.setText(" " + x);
				f22.setText(" " + 289 * x);
			}
		}
		if (h3.cb3.isSelected()) {
			s = h3.comb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				f3.setVisible(false);
				f31.setVisible(false);
				f32.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f3.setText("PANEER STREAK");
				f31.setText(" " + x);
				f32.setText(" " + 259 * x);
			}
		}
		if (h3.cb4.isSelected()) {
			s = h3.comb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				f4.setVisible(false);
				f41.setVisible(false);
				f42.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f4.setText("BATTER FISH");
				f41.setText(" " + x);
				f42.setText(" " + 359 * x);
			}
		}

		f5.setText("Dishes");
		f6.setText("Quantity");
		f7.setText("Amount");
		limage.add(l1);
		limage.add(f5);
		limage.add(f6);
		limage.add(f7);
		limage.add(f1);
		limage.add(f11);
		limage.add(f12);
		limage.add(f2);
		limage.add(f21);
		limage.add(f22);
		limage.add(f3);
		limage.add(f31);
		limage.add(f32);
		limage.add(f4);
		limage.add(f41);
		limage.add(f42);
		limage.add(l2);
		limage.add(b1);
		c.add(limage);

		b1.addActionListener(this);
	}

	Bill(NIMenu u) {
		h4 = u;
		c = getContentPane();
		setLayout(null);
		ImageIcon i = new ImageIcon("F:\\Java Programs\\p2\\m8.jpg");
		limage = new JLabel(i);
		l1 = new JLabel("YOUR BILL");
		l2 = new JLabel("Total " + h4.total);
		f1 = new JLabel();
		f12 = new JLabel();
		f11 = new JLabel();
		f2 = new JLabel();
		f21 = new JLabel();
		f22 = new JLabel();
		f3 = new JLabel();
		f31 = new JLabel();
		f32 = new JLabel();
		f4 = new JLabel();
		f41 = new JLabel();
		f42 = new JLabel();
		f5 = new JLabel();
		f6 = new JLabel();
		f7 = new JLabel();
		Font f = new Font("Verdana", Font.BOLD, 23);
		b1 = new JButton("Checkout");
		l1.setFont(f);

		Font fs = new Font("Verdana", Font.BOLD, 18);
		l2.setFont(fs);

		Font ff = new Font("Verdana", Font.BOLD, 16);
		f5.setFont(ff);
		f6.setFont(ff);
		f7.setFont(ff);

		limage.setBounds(0, 0, 1000, 1000);
		b1.setBounds(700, 700, 200, 40);
		l2.setBounds(600, 500, 200, 50);
		l1.setBounds(420, 20, 700, 30);

		f5.setBounds(200, 150, 200, 20);
		f6.setBounds(400, 150, 100, 20);
		f7.setBounds(600, 150, 100, 20);

		f1.setBounds(200, 200, 200, 20);
		f11.setBounds(400, 200, 100, 20);
		f12.setBounds(600, 200, 100, 20);

		f2.setBounds(200, 270, 300, 20);
		f21.setBounds(400, 270, 100, 20);
		f22.setBounds(600, 270, 100, 20);

		f3.setBounds(200, 340, 300, 20);
		f31.setBounds(400, 340, 100, 20);
		f32.setBounds(600, 340, 100, 20);

		f4.setBounds(200, 410, 300, 20);
		f41.setBounds(400, 410, 100, 20);
		f42.setBounds(600, 410, 100, 20);

		if (h4.cb1.isSelected()) {
			s = h4.comb1.getSelectedItem().toString();
			if (s.equals(" ")) {
				f1.setVisible(false);
				f11.setVisible(false);
				f12.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f1.setText("DAL SAMOSA");
				f11.setText(" " + x);
				f12.setText(" " + 170 * x);
			}
		}
		if (h4.cb2.isSelected()) {
			s = h4.comb2.getSelectedItem().toString();
			if (s.equals(" ")) {
				f2.setVisible(false);
				f21.setVisible(false);
				f22.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f2.setText("ALOO KEBAB");
				f21.setText(" " + x);
				f22.setText(" " + 189 * x);
			}
		}
		if (h4.cb3.isSelected()) {
			s = h4.comb3.getSelectedItem().toString();
			if (s.equals(" ")) {
				f3.setVisible(false);
				f31.setVisible(false);
				f32.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f3.setText("VEGETABLE CUTLET");
				f31.setText(" " + x);
				f32.setText(" " + 209 * x);
			}
		}
		if (h4.cb4.isSelected()) {
			s = h4.comb4.getSelectedItem().toString();
			if (s.equals(" ")) {
				f4.setVisible(false);
				f41.setVisible(false);
				f42.setVisible(false);
			} else {
				x = Integer.parseInt(s);
				f4.setText("PANNER TIKKA");
				f41.setText(" " + x);
				f42.setText(" " + 259 * x);
			}
		}

		f5.setText("Dishes");
		f6.setText("Quantity");
		f7.setText("Amount");
		limage.add(l1);
		limage.add(f5);
		limage.add(f6);
		limage.add(f7);
		limage.add(f1);
		limage.add(f11);
		limage.add(f12);
		limage.add(f2);
		limage.add(f21);
		limage.add(f22);
		limage.add(f3);
		limage.add(f31);
		limage.add(f32);
		limage.add(f4);
		limage.add(f41);
		limage.add(f42);
		limage.add(l2);
		limage.add(b1);
		c.add(limage);

		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		JOptionPane.showMessageDialog(limage, "Your order will be delivered in 30 min!");

	}

}
