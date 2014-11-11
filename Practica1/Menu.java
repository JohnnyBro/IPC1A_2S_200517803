
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;





public class Menu {
	ArrayList<Nodo> baraja= new ArrayList<Nodo>();

	Menu(){
		Scanner s=new Scanner(System.in);
		int opcion=0;
		int tokens=1;




		do{
			System.out.println(" -= Bienvenido a Love Letter=- ");
			System.out.println("(1) Jugar una partida");
			System.out.println("(2) Seleccionar el numero de tokens a jugar");
			System.out.println("(3) Mostrar las reglas del juego");
			System.out.println("(4) Salir");
	
			opcion= s.nextInt();
			
			if(opcion!=1 && opcion!=2 && opcion!=3){
				System.out.println("Opcion invalida");
				System.out.println("");
			}

			switch(opcion){
			case 1:
				Random rn=new Random();
				int maso=0;
				String nomcartajugador="";
				String nomcartarival="";
				String jugador=""; 
				String rival="";
				int cartajugador=0;
				int cartarival=0;
				int ncartas=0;
				int turno=0;

				System.out.println("Ingrese su nombre");
				jugador=s.next();
				System.out.println("Ingrese nombre del rival");
				rival=s.next();

				do{
					
					baraja.add(0,new Nodo(1,"GUARD"));
					baraja.add(1, new Nodo(1,"GUARD"));
					baraja.add(2, new Nodo(1,"GUARD"));
					baraja.add(3, new Nodo(1,"GUARD"));
					baraja.add(4, new Nodo(1,"GUARD"));
					baraja.add(5, new Nodo(2,"PRIEST"));
					baraja.add(6, new Nodo(2,"PRIEST"));
					baraja.add(7, new Nodo(3,"BARON"));
					baraja.add(8, new Nodo(3,"BARON"));
					baraja.add(9, new Nodo(4,"HANDMAID"));
					baraja.add(10, new Nodo(4,"HANDMAID"));
					baraja.add(11, new Nodo(5,"PRINCE"));
					baraja.add(12, new Nodo(5,"PRINCE"));
					baraja.add(13, new Nodo(6,"KING"));
					baraja.add(14, new Nodo(7,"COUNTESS"));
					baraja.add(15, new Nodo(8,"PRINCESS"));

					ArrayList<CartasExtra> cxtra= new ArrayList<CartasExtra>();

					ncartas=baraja.size();

					for(int i=0; i<3; i++){
						maso=(int)(rn.nextDouble()*(baraja.size()-1));
						cxtra.add(i, new CartasExtra(baraja.get(maso).getNum1(), baraja.get(maso).getNom()));
						baraja.remove(maso);
					}

				    ArrayList<CartasJugador> cJugador= new ArrayList<CartasJugador>();
					maso=(int)(rn.nextDouble()*(baraja.size()-1));
					cJugador.add(0, new CartasJugador(baraja.get(maso).getNum1(), baraja.get(maso).getNom()));
					cartajugador=baraja.get(maso).getNum1();
					nomcartajugador=baraja.get(maso).getNom();
					baraja.remove(maso);

					ArrayList<CartasRival> cRival= new ArrayList<CartasRival>();
					maso=(int)(rn.nextDouble()*(baraja.size()-1));
					cRival.add(0, new CartasRival(baraja.get(maso).getNum1(), baraja.get(maso).getNom()));
					cartarival=baraja.get(maso).getNum1();
					nomcartarival=baraja.get(maso).getNom();
					baraja.remove(maso);


					System.out.println("numero de cartas"+baraja.size());

					turno=(int)(rn.nextDouble()*2);
					System.out.println("turno"+turno);

					if(turno==0){
						System.out.println("Juega.."+ jugador);

					}else{
						System.out.println("Juega.."+ rival);
					}



					System.out.println(jugador+" Carta en tu poder: "+cJugador.get(0).getNum1()+" "+cJugador.get(0).getNom()+"         "+rival+" Carta en tu poder: "+cRival.get(0).getNum1()+" "+cRival.get(0).getNom());
					System.out.println("numero de cartas"+baraja.size());
					
					for(int i=baraja.size()-1; i>0; i--){
						System.out.println(baraja.get(i).getNum1()+" "+baraja.get(i).getNom());
					}

					do{
						switch(turno){
						case 0:
							maso=(int)(rn.nextDouble()*(baraja.size()-1));
							cJugador.add(1, new CartasJugador(baraja.get(maso).getNum1(), baraja.get(maso).getNom()));

							System.out.println("(1) Usar Carta # 1");
							System.out.println("(2) Usar Carta # 2");
							System.out.println("(3) Terminar Juego");
							System.out.println(jugador+" :");
							System.out.println("carta 1 :"+ cJugador.get(0).getNom());
							System.out.println("carta 2 :"+ cJugador.get(1).getNom());
							opcion=s.nextInt();
							if(opcion==1){
							
							}


							baraja.clear();
							cxtra.clear();
							break;



						case 2:

							break;




						}
					}while(ncartas==0);







					break;
				}while(ncartas!=0);
				System.out.println("");
				break;

			case 2:

				do{
					System.out.println("Selecciones el numero de Tokens... 1 o 3");
					opcion= s.nextInt();

					if(opcion==1 || opcion==3){
						tokens=opcion+1;	
					}else{
						System.out.println("Numero no valido..");
					}

				}while(opcion!=1 && opcion!=3);
				System.out.println("Numero de Tokens = "+(tokens-1));

				break;

			case 3:
				System.out.println("--------Reglas del Juego---------");
				reglas();
				break;

			}
			tokens--;

		}while(opcion!=4 || tokens!=0);
		System.out.println("Ha salido del juego");
		System.exit(0); 
		s.close();

	}

	public void jugarJugador(int turno){
		Scanner s= new Scanner(System.in);
		int opcion=0;
		
		if(turno==0){
		    
			System.out.println("(1) Usar Carta # 1\n" +"(2) Usar Carta # 2\n"+"(3) Terminar Juego");
			opcion=s.nextInt();
			
			switch(opcion){
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			
			}
			
		}else{
             
		}


	}
	
	public void reglas(){
		System.out.println("La guardia ech� una mirada de arriba a abajo a Bartolemew Kaiss y frunci� el ce�o. �Lo siento maestre Kaiss, pero la princesa no recibe visitas. Como puede\n"
				+" imaginar se encuentra desconsolada por el arresto de su madre.� �Por supuesto,� dijo el joven compositor asintiendo y con gesto comprensivo. �Pero\n"
				+"no estoy s�lo de visita, ver�: Su alteza ha requerido mis servicios, vamos a practicar canto.�"

				+"�La princesa ya tiene un maestro de canto,� respondi� la mujer bruscamente arqueando una ceja.\n"

				+"�Estoy segura de que �l ya lo sabe, Odette,� dijo una voz gentil que reson� desde la estancia que conectaba la residencia al palacio. Ambos se giraron\n" 
				+"para ver a Susannah, una de las doncellas de la princesa Annete quien caminaba hacia ellos. �Lo que el buen compositor quiere\n" 
				+"decir es que Annete ha solicitado sus obras para ensayar.� La joven mujer sonr�o a la guardia mientras le gui�aba el ojo a\n" 
				+"Bartolemew de una manera c�mplice.\n"

				+"De su cartera, Bartolemew sac� un tubo cerrado. �Si fueras tan amable de entregar estas partituras, mi querida Susannah,� dijo con una sonrisa y asentimiento.\n"

				+"La guardia recogi� el tubo pero mientras cambiaba de manos, algo se desliz� dentro del tubo ��Que m�s hay aqu� dentro?� pregunt� la guardia mientras se lo acercaba\n" 
				+"a la oreja.\n"

				+"Ciertamente no la peque�a estatua de un p�jaro que tanto le gusta a la princesa, pens� para si Bartolemew. �Es� la pluma y tinta que uso para escribir la m�sica, es por\n" 
				+"si acaso el maestro desea hacer alg�n cambio. Siempre las incluyo en las nuevas composiciones.�\n" 

				+"Susannah le cogi� el tubo a la suspicaz guardia cuidadosamente. ��Oh quieres dejarlo ya Odette? Es tan solo m�sica,� reprendi� en tono jocoso.\n"

				+"�Me encargar� de que lleguen a milady,� dijo mientras posaba su mano en el brazo de Batolemew. �Estoy segura de que arde en deseos de ver su contenido.�\n"

				+"objetivo\n" 

				+"Tras el arresto de la Reina Marianna acusada de alta traici�n, nadie result� m�s entristecida por la noticia que su hija la princesa Annete.\n"

				+"Los pretendientes de la ciudad estado de Tempest buscan consolar la pena de Annete cortejandola para traer un poco de alegr�a a su vida.\n"

				+"T� eres uno de esos pretendientes, intentado que tu carta de amor llegue a la princesa. Lamentablemente ella se ha recluido en su palacio por lo que debes\n" 
				+"confiar que los intermediarios lleven tu mensaje.\n"

				+"A lo largo del juego, mantendr�s una carta en secreto en tu mano, que representa a quien llevar� tu mensaje de amor a la princesa.\n"

				+"Deber�s asegurarte de que sea la persona m�s cercana a la princesa la que tenga tu carta al final del d�a, para que pueda entregarla primero.\n"

				+"componentes\n"

				+"Tu ejemplar de Love Letter debe incluir lo siguiente, si no es as� contacta con customerservice@alderac.com para recibir asistencia t�cnica.\n"

				+"� 16 cartas de juego\n"
				+"� 4 ayudas de juego\n"
				+"� fichas de afecto\n");



/*cartas de juego

El juego tiene 16 cartas. Cada carta 
diferente representa a alguien de la 
residencia real.

Cada carta tiene un valor en la esquina 
superior izquierda � cuanto m�s alto sea 
el n�mero, m�s cercana es la persona a 
la princesa. En la parte inferior de cada 
carta un texto describe su efecto cuando es 
descartada.

ayudas de juego

En ellas aparecen las diferentes cartas 
de juego, as� como sus efectos y cu�ntas 
copias de cada una hay en la baraja. No 
se usan en el juego sino que sirven como 
ayuda nemot�cnica.

fichas de afecto

El juego incluye tambi�n fichas rojas usadas 
para llevar la cuenta del creciente afecto de 
la princesa por aquellos pretendientes que 
consiguen entregar sus cartas.

preparaci�n 
de la partida

Baraja las 16 cartas col�calas cara abajo y 
forma un mazo de robo. Elimina la primera 
carta del mazo del juego sin mirarla.

Si est�s jugando una partida de dos 
jugadores, elimina tres cartas m�s del mazo 
y d�jalas aparte cara arriba. Est�s cartas 
no se usar�n esta ronda.

Cada jugador roba una carta del mazo. 
Esta carta es la mano inicial y debe 
mantenerse en secreto 

El jugador que haya tenido la cita m�s 
reciente empieza (en caso de empate el m�s 
joven de ellos comienza) 

como jugar

Love Letter se juega en diferentes rondas. 
Cada ronda representa un d�a. Al final de 
cada ronda, la carta de un jugador llega a 
la Princesa Annete, quien la leer�.

Cuando haya le�do las suficientes cartas 
de uno de los pretendientes, caer� 
perdidamente enamorada, concediendo a 
ese pretendiente el permiso para cortejarla. 
Ese jugador ganar� el coraz�n de la 
princesa y la partida. 

desarrollo 
del juego

Durante tu turno, roba la carta superior 
del mazo y a��dela a tu mano. Entonces 
elige una de las dos cartas y desc�rtala 
cara arriba delante tuya. Deber�s aplicar el 
efecto de la carta descartada, incluso si es 
perjudicial para ti. 

Consulta la p�gina 15 para ver los efectos 
de cada carta. De la misma manera si 
tienes cualquier duda sobre situaciones 
especiales con una carta all� encontrar�s la 
respuesta.

Las cartas descartadas permanecen delante 
del jugador que las descarta. Col�calas 
superpuestas de manera visible para que 
quede claro el orden en que han sido 
descartadas. Esto ayudara a los jugadores 
a averiguar que cartas pueden tener en la 
mano los dem�s.

Una vez es aplicado el efecto de la carta el 
turno pasa al jugador a tu izquierda.



eliminado de la ronda

Si un jugador es eliminado de la ronda, 
ese jugador descarta la carta en su mano 
boca arriba, (sin aplicar su efecto) y deja de 
jugar hasta la siguiente ronda.

honradez

Un jugador podr�a mentir al ser elegido 
por el efecto de la Guardia, o no descartar 
a la Condesa teniendo al rey o el pr�ncipe 
en la mano. Sugerimos por tanto que 
no juegues con rufianes que se diviertan 
haciendo trampas.

final de la ronda

Una ronda termina cuando el mazo de 
robo es agotado al final de un turno, 
la residencia real cierra al atardecer, la 
persona m�s cercana a la princesa entrega 
la carta de amor, y la princesa Annette se 
retira a sus aposentos para leerla.

Aquellos jugadores que permanezcan en la 
ronda revelan sus manos. El jugador con la 
carta con el valor m�s alto gana la ronda. 
En caso de empate el jugador que descart� 
cartas por mayor valor gana.

La ronda termina tambi�n si todos los 
jugadores menos uno son eliminados de la 
ronda, en ese caso, el jugador que siga en 
juego gana. 

El ganador recibe una ficha de afecto. 
Baraja las 16 cartas y comienza una nueva 
ronda siguiendo las normas de preparaci�n.

El ganador de la �ltima ronda comienza, 
pues la princesa hablar� muy bien de �l 
durante el desayuno.

ganando el juego

Un jugador es declarado ganador tras 
conseguir un n�mero determinado de fichas 
de afecto, seg�n el n�mero de jugadores.

� 2 jugadores 7 fichas
� 3 jugadores 5 fichas
� 4 jugadores 4 fichas


personajes

Los sucesos de este juego tienen lugar 
entre �Courtier� y �Dominare�, otros dos 
juegos de la l�nea Tempest. Esta es una 
peque�a descripci�n de los personajes. 

8: princesa annette

Refrenada solo por la biso�ez 
propia de su juventud, la Princesa 
Annete es elegante, encantadora 
y bella. Obviamente querr�s que 
la princesa lleve tu carta. Sin 
embargo le averg�enza hablar de 
sus intereses rom�nticos y ante 
cualquier dificultad arrojar� tu 
carta a la chimenea negando 
su existencia. 

Si descartas a la 
Princesa, no importa 
como o por que, ella ha arrojado tu carta a 
la chimenea. Eres eliminado de la ronda. 

7: condesa wilhelmina

Siempre al acecho de un hombre apuesto 
o de un jugoso cotilleo, la edad y 
el linaje de Wilhemina la convierte 
en una de las amigas de Annete. 
Pese a su gran influencia sobre la 
princesa, tiende a esfumarse cuando 
el Rey o el pr�ncipe andan cerca.

A diferencia de otras cartas, 
que s�lo tienen efecto al ser 
descartadas, el texto de la 
Condesa se aplica mientras 
est� en tu mano y al ser 
descartada no tiene efecto.

Si en alg�n momento tienes a la Condesa 
y al Rey o al Pr�ncipe en tu mano, est�s 
obligado a descartar a la condesa. No 
tienes que revelar la otra carta de tu mano. 
Por supuesto t� puedes descartar a la 
Condesa incluso si no tienes a un miembro 
de la familia real en tu mano. A la condesa 
le encanta provocar intrigas�

6: rey arnaud iv

El indiscutido gobernante de 
Tempest� de momento. Su papel en 
el arresto de la reina Marianna 
ha hecho que la relaci�n con 
su hija se haya enfriado. 
Conf�a en pronto poder 
ganarse su confianza.

Al descartar al rey 
Arnaud IV, intercambia 
la carta en tu mano por 
la que tenga otro jugador 
de tu elecci�n. No puedes 
cambiarla con un jugador 
ya eliminado en la ronda 
ni con uno protegido por la doncella. Si 
todos los jugadores est�n protegidos por la 
doncella la carta no tiene efecto.

5: principe arnaud

Un tanto metomentodo. El 
pr�ncipe Arnaud no ha quedado 
tan entristecido por el arresto 
de su madre como uno 
podr�a suponer. Puesto que 
muchas mujeres se disputan 
su atenci�n, conf�a en que 
haciendo de celestino ayudar� 
a su hermana a encontrar la 
paz de los placeres banales.

Al descartar al pr�ncipe 
Arnaud, escoge un jugador 
que todav�a est� en la ronda 
(incluido t�) Ese jugador descarta su 
mano (sin aplicar el efecto) y roba una 
nueva carta. Si el mazo se termina ese 
jugador robar� la carta que fue eliminada al 
principio de la ronda

Si los dem�s jugadores est�n protegidos 
por la doncella, debes elegirte a ti mismo.

4: la doncella susannah 

Pocos confiar�an a una doncella 
una carta importante. Menos 
a�n comprenden la astucia de 
Susannah, o su habilidad para 
fingir ser una torpe doncella. Que 
�l confidente y fiel siervo de la 
reina no fuera detenido tras su 
arresto es buena prueba de su 
inteligencia.

Al descartar a la doncella, 
te haces inmune a los 
efectos de las cartas de los 
dem�s jugadores hasta que 
comience tu siguiente turno. Si todos los 
jugadores salvo el actual est�n protegidos 
por Susannah, ese jugador deber� elegirse a 
si mismo si le es posible. 

3: baron talus

Heredero de una casa de alta alcurnia 
cercana a la familia real, el 
Bar�n Talus posee un porte 
sereno y calmo que esconde a 
un hombre acostumbrado a ser 
obedecido. Sus sugerencias han 
de ser tratadas como si vinieran 
del mism�simo rey.

Al ser descartado elije a un 
jugador que permanezca en 
la ronda. T� y ese jugador 
compar�is en secreto 
vuestras manos. Aquel con 
una carta m�s baja es eliminado de la 
ronda. En caso de empate no ocurre nada. 
Si los dem�s jugadores est�n protegidos 
por la doncella la carta no tiene efecto.



2: tom�s el cl�rigo

Abierto, honesto e inspirador, 
Tom�s el cl�rigo siempre buscar 
cualquier oportunidad para hacer 
buenas acciones. Tras el arresto 
de la reina, es habitual verlo 
en palacio en papel de 
confesor, consejero y amigo.

Al descartar al cl�rigo 
puedes mirar la mano 
de otro jugador. No la 
muestres a los dem�s 
jugadores.

1: odette la guardia

Encargada de velar por la seguridad 
de la familia real, Odette cumple 
sus ordenes con persistentencia y 
diligentemente.... todo a pesar 
de que se dice que su mentor 
muri� ahogado al huir del 
arresto por su complicidad en la 
traici�n de la reina.

Al descartar a la guardia, 
elige un jugador y nombra una 
carta (que no sea la Guardia) Si 
ese jugador tiene esa carta, es 
eliminado de la ronda. Si los 
dem�s jugadores est�n protegidos por la 
doncella la carta no tiene efecto.*/

	}
}




	


	


