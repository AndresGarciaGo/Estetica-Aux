private JPanel quienesomos;

private JMenuItem Rojo;
private JMenuBar menu_doc;
private JMenu ND;
private JMenuItem DocE;
private JMenuItem DocC;
private JMenuBar menuBar;
private JMenu MenuQuienesSomos;
private JMenuItem mntmNewMenuItem_2;
private JMenuItem mntmNewMenuItem_3;
private JMenuBar InicioSes;
private JMenu mnIniciarSesion;
private JMenuItem mntmRegistrarse;
private JPanel panelInicio;
private JPanel panelND;
private JPanel panelC;
private JPanel panelE;
private JPanel panelin;
private JLabel lblinicio;
private JLabel lblND;
private JLabel lblC;
private JLabel lblE;



public Interfaz() {
	setTitle("Home Hospital");
	
	getContentPane().setLayout(null);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 517, 393);
	quienesomos = new JPanel();
	quienesomos.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(quienesomos);
	quienesomos.setLayout(null);
	
	JMenuBar menu = new JMenuBar();
	menu.setBounds(22, 22, 57, 21);
	quienesomos.add(menu);
	
	JMenu Menu1 = new JMenu("Inicio");
	menu.add(Menu1);
	
	Rojo = new JMenuItem("Color rojo");
	//Rojo.setBackground(new Color(250,0,0));
	Rojo.addActionListener(this);
	Menu1.add(Rojo);
	
	menu_doc = new JMenuBar();
	menu_doc.setBounds(89, 22, 117, 21);
	quienesomos.add(menu_doc);
	
	ND = new JMenu("Nuestros Doctores");
	ND.addActionListener(this);
	menu_doc.add(ND);
	
	DocE = new JMenuItem("Doctor Especliasta");
	DocE.addActionListener(this);
	ND.add(DocE);
	
	DocC = new JMenuItem("Doctor Cabecera");
	DocC.addActionListener(this);
	ND.add(DocC);
	
	menuBar = new JMenuBar();
	menuBar.setBounds(216, 22, 97, 21);
	quienesomos.add(menuBar);
	
	MenuQuienesSomos = new JMenu("Quienes somos");
	menuBar.add(MenuQuienesSomos);
	
	mntmNewMenuItem_2 = new JMenuItem("Nuestros Departamentos");
	MenuQuienesSomos.add(mntmNewMenuItem_2);
	
	mntmNewMenuItem_3 = new JMenuItem("Nuestra Historia");
	MenuQuienesSomos.add(mntmNewMenuItem_3);
	
	InicioSes = new JMenuBar();
	InicioSes.setBounds(323, 22, 97, 21);
	quienesomos.add(InicioSes);
	
	mnIniciarSesion = new JMenu("Iniciar Sesion");
	mnIniciarSesion.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Paciente pa = new Paciente();
			pa.setVisible(true);
		}
	});
	InicioSes.add(mnIniciarSesion);
	
	mntmRegistrarse = new JMenuItem("Registrarse");
	mntmRegistrarse.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Paciente pa = new Paciente();
			pa.setVisible(true);
		}
	});
	mnIniciarSesion.add(mntmRegistrarse);
	
	panelInicio = new JPanel();
	panelInicio.setBounds(22, 54, 469, 289);
	quienesomos.add(panelInicio);
	panelInicio.setLayout(new CardLayout(0, 0));
	
	panelin = new JPanel();
	panelInicio.add(panelin, "name_85910976307400");
	panelin.setLayout(null);
	
	lblinicio = new JLabel("GG 3:");
	lblinicio.setBounds(10, 11, 91, 14);
	panelin.add(lblinicio);
	
	panelND = new JPanel();
	panelInicio.add(panelND, "name_82639280542300");
	panelND.setLayout(null);
	
	lblND = new JLabel("Hola de nuevo a todos");
	lblND.setBounds(10, 11, 234, 14);
	panelND.add(lblND);
	
	panelC = new JPanel();
	panelInicio.add(panelC, "name_82734800624700");
	panelC.setLayout(null);
	
	lblC = new JLabel("CREO SE PUDO");
	lblC.setBounds(10, 11, 183, 14);
	panelC.add(lblC);
	
	panelE = new JPanel();
	panelInicio.add(panelE, "name_82754988604000");
	panelE.setLayout(null);
	
	lblE = new JLabel("O NO SE PUDO");
	lblE.setBounds(10, 23, 294, 14);
	panelE.add(lblE);
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==Rojo) {
		panelin.setVisible(true);
		panelND.setVisible(true);
		panelE.setVisible(false);
		panelC.setVisible(false);
	}else
	
	if(e.getSource()==ND) {
		panelND.setVisible(true);
		panelE.setVisible(false);
		panelin.setVisible(false);
		panelC.setVisible(false);
	}else
	
	if(e.getSource()==DocE) {
		panelND.setVisible(false);
		panelE.setVisible(true);
		panelin.setVisible(false);
		panelC.setVisible(false);
		
	}else
	
	if(e.getSource()==DocC) {
		panelND.setVisible(false);
		panelE.setVisible(false);
		panelin.setVisible(false);
		panelC.setVisible(true);
	}
}
