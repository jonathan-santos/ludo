import javax.swing.*;
import java.awt.*;
public class Ludo_2 extends JPanel {
	public void paint(Graphics g) {
		int i=0;				
		//Quadrados Azuis
		g.setColor(Color.BLUE);
		//Grandes fileiras 
		for(i=320; i<=440; i+=40) {
			g.fillRect(0,i,770,10);//horizontais
			g.fillRect(i, 0, 10, 770);//Verticais
}
		//Pequenas fileiras
		for(i=0;i<770;i+=40){
			g.fillRect(320,i,120,10);//Horizontais
			g.fillRect(i,320,10,120);//Verticais
		}
		//Grande quadrado
		//Bordas
		for(i=280;i<=480;i+=200) {
			g.fillRect(280,i,210,10);//Horizontais
			g.fillRect(i,280,10,210);//Verticais
		}				
		//Quadrado Branco
		g.setColor(Color.WHITE);
		g.fillRect(330, 330, 110, 110);
		//X
		g.setColor(Color.BLUE);
		g.drawLine(330, 330, 440, 440);
		g.drawLine(440, 330, 330, 440);
		//Quadrados de diferentes cores
		for(i=50; i<=690; i+=40) {
			if(i<=290){ g.setColor(Color.RED); }
			else if(i>=410){ g.setColor(Color.DARK_GRAY); }
			g.fillRect(i, 370, 30, 30);// Quadrados vermelhos(i=50) ou cinza_escuros(i=450)
			if(i<=290){ g.setColor(Color.YELLOW); }
			else if(i>=410){ g.setColor(Color.GREEN); }
			g.fillRect(370, i, 30, 30);//Quadrados amarelos(i=50) ou verdes(i=450)
			if(i==290){ i= 410; }				
		} 
		
		//Círculos
		//Grandes círculos pretos
		g.setColor(Color.BLACK);
		g.fillOval(50, 50, 220, 220);
		g.fillOval(50,500, 220, 220);
		g.fillOval(500, 50, 220, 220);
		g.fillOval(500, 500, 220, 220);
			
		//Grandes círculos coloridos
		g.setColor(Color.RED);
		g.fillOval(60, 60, 200, 200);//Vermelho
		g.setColor(Color.YELLOW);
		g.fillOval(510, 60, 200, 200);//Amarelo
		g.setColor(Color.GREEN);
		g.fillOval(60, 510, 200, 200);//Verde
		g.setColor(Color.DARK_GRAY);
		g.fillOval(510, 510, 200, 200);	
		
		//Pequenos pretos
		g.setColor(Color.BLACK);
		//Superior Esquerdo - Vermelho
		g.fillOval(90, 90, 60, 60);
		g.fillOval(170, 90, 60, 60);
		g.fillOval(90, 170, 60, 60);
		g.fillOval(170, 170, 60, 60);
		//Superior Direito - Amarelo
		g.fillOval(540, 90, 60, 60);
		g.fillOval(620, 90, 60, 60);
		g.fillOval(540, 170, 60, 60);
		g.fillOval(620, 170, 60, 60);
		//Inferior Esquerdo - Verde
		g.fillOval(90, 540, 60, 60);
		g.fillOval(170, 540, 60, 60);
		g.fillOval(90, 620, 60, 60);
		g.fillOval(170, 620, 60, 60);
		//Inferior Direito - Cinza-escuro
		g.fillOval(540, 540, 60, 60);
		g.fillOval(620, 540, 60, 60);
		g.fillOval(540, 620, 60, 60);
		g.fillOval(620, 620, 60, 60);
			
		
	
		//Pequenos brancos
		g.setColor(Color.WHITE);
		//Superior Esquerdo - Vermelho
		g.fillOval(100, 100, 40, 40);
		g.fillOval(180, 100, 40, 40);
		g.fillOval(100, 180, 40, 40);
		g.fillOval(180, 180, 40, 40);
		//Superior Direito - Amarelo
		g.fillOval(550, 100, 40, 40);
		g.fillOval(630, 100, 40, 40);
		g.fillOval(550, 180, 40, 40);
		g.fillOval(630, 180, 40, 40);
		//Inferior esquerdo - Verde
		g.fillOval(100, 550, 40, 40);
		g.fillOval(180, 550, 40, 40);
		g.fillOval(100, 630, 40, 40);
		g.fillOval(180, 630, 40, 40);
		//Inferior direito - Cinza-escuro
		g.fillOval(550, 550, 40, 40);
		g.fillOval(630, 550, 40, 40);
		g.fillOval(550, 630, 40, 40);
		g.fillOval(630, 630, 40, 40);
			
		//Pequenos círculos
		//Superior Esquerdo - Vermelho
		g.setColor(Color.RED);
		g.fillOval(330, 360, 20, 20);//cima
		g.fillOval(330, 380, 20, 20);//meio
		g.fillOval(330, 400, 20, 20);//baixo
		g.fillOval(350, 380, 20, 20);//meio_frente		
		//Superior Direito - Amarelo
		g.setColor(Color.YELLOW);
		g.fillOval(350, 330, 20, 20);//cima
		g.fillOval(370, 330, 20, 20);//meio
		g.fillOval(390, 330, 20, 20);//baixo
		g.fillOval(370, 350, 20, 20);//meio_frente
		//Inferior esquerdo - Verde
		g.setColor(Color.GREEN);
		g.fillOval(360, 420, 20, 20);//cima
		g.fillOval(380, 420, 20, 20);//meio
		g.fillOval(400, 420, 20, 20);//baixo
		g.fillOval(380, 400, 20, 20);//meio_frente
		//Inferior direito - Cinza-escuro
		g.setColor(Color.DARK_GRAY);
		g.fillOval(420, 350, 20, 20);//cima
		g.fillOval(420, 370, 20, 20);//meio
		g.fillOval(420, 390, 20, 20);//baixo
		g.fillOval(400, 370, 20, 20);//meio_frente
		
		//Setas	
		 for(i=0; i<4; i++) {
			int A[]={335,345,355};
			int B[]={30,40,30};
			int C[]={415,425,435};
			int D[]={740,730,740};
			int X[]={10,420,420,740};
			int Y[]={340,10,760,420};
			if(i==0){//Seta vermelha
				g.setColor(Color.RED);
				g.fillPolygon(B, A,3);
				g.fillRect(X[i], Y[i], 20, 10);
				}
				else if(i==1){//seta amarela
					g.setColor(Color.YELLOW);
					g.fillPolygon(C, B,3);
					g.fillRect(X[i], Y[i], 10, 20);
				}
				else if(i==2){//seta verde
					g.setColor(Color.GREEN);
					g.fillPolygon(A, D,3);
					g.fillRect(X[i], Y[i], 10, 20);
				}
				else if(i==3){//seta cinza-escuro
					g.setColor(Color.DARK_GRAY);
				 	g.fillPolygon(D, C,3);
					g.fillRect(X[i], Y[i], 20, 10);
}
			}	
	}		
	public static void main (String args[]){
		JFrame objeto = new JFrame("Ludo");
		objeto.add(new Ludo_2());
		objeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objeto.setBounds(0,0,770,770);
		objeto.setBackground(Color.white);
		objeto.setVisible(true);
	}
}