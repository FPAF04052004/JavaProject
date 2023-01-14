package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Pokemon;
import Entities.Type;

public class Program {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Dados do primeiro pokemon");
		
		System.out.println("Nome:");
		String name = sc.nextLine();
		System.out.println("Tipo:");
		Type type = Type.valueOf(sc.next());
		System.out.println("Vida:");
	    Double HP = sc.nextDouble();
		System.out.println("Ataque:");
	    Double attack = sc.nextDouble();
	    System.out.println("Defesa:");
	    Double defense = sc.nextDouble();
	    System.out.println("Poder do golpe:");
	    Double powerAttack = sc.nextDouble();
	    System.out.println("Velocidade:");
	    Double speed = sc.nextDouble();
	    Pokemon pokemon1 = new Pokemon(name, type, HP, attack, defense, powerAttack,speed);
	    
        System.out.println("Dados do segundo pokemon");
		
		System.out.println("Nome:");
		name = sc.nextLine();
		System.out.println("Tipo:");
		type = Type.valueOf(sc.next());
		System.out.println("Vida:");
	    HP = sc.nextDouble();
		System.out.println("Ataque:");
	    attack = sc.nextDouble();
	    System.out.println("Defesa:");
	    defense = sc.nextDouble();
	    System.out.println("Poder do golpe:");
	    powerAttack = sc.nextDouble();
	    System.out.println("Velocidade:");
	    speed = sc.nextDouble();
	    Pokemon pokemon2 = new Pokemon(name, type, HP, attack, defense, powerAttack, speed);
	    
	    while(pokemon1.getHP() > 0 && pokemon2.getHP() > 0) {
	    	if(pokemon1.getSpeed() > pokemon2.getSpeed()) {
	    		
	    		if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("FIRE")){
	    			pokemon2.setHP(2 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("GRASS")) {
	    			pokemon2.setHP(2 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("FIRE")) {
	    			pokemon2.setHP(2 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("WATER")) {
	    			pokemon2.setHP(0.5 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("FIRE") && pokemon1.getType().equals("FIRE")){
	    			pokemon2.setHP(0.5 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("GRASS")) {
	    			pokemon2.setHP(0.5 * pokemon1.getDamage() - pokemon2.getDefense());
	    		}else {
	    			pokemon2.setHP(pokemon1.getDamage() - pokemon2.getDefense());
	    		}
	    		
	    		if(pokemon2.getHP() <= 0) {
	    			System.out.printf("%s venceu\n", pokemon1.getName());
	    		}
	    		
	    		if(pokemon2.getType().equals("WATER") && pokemon2.getType().equals("WATER")) {
	    			pokemon1.setHP(0.5 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("FIRE") && pokemon1.getType().equals("FIRE")){
	    			pokemon1.setHP(0.5 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("GRASS")) {
	    			pokemon1.setHP(0.5 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("FIRE")) {
	    			pokemon1.setHP(2 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("FIRE") && pokemon1.getType().equals("GRASS")) {
	    			pokemon1.setHP(2 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("WATER")) {
	    			pokemon1.setHP(2 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else {
	    			pokemon2.setHP(pokemon1.getDamage() - pokemon2.getDefense());
	    		}
	    		
	    		if(pokemon1.getHP() <= 0) {
	    			System.out.printf("%s venceu\n", pokemon2.getName());
	    		}
	    		
	    	}else {
	    		
	    		if(pokemon2.getType().equals("WATER") && pokemon2.getType().equals("WATER")) {
	    			pokemon1.setHP(0.5 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("FIRE") && pokemon1.getType().equals("FIRE")){
	    			pokemon1.setHP(0.5 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("GRASS")) {
	    			pokemon1.setHP(0.5 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("FIRE")) {
	    			pokemon1.setHP(2 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("FIRE") && pokemon1.getType().equals("GRASS")) {
	    			pokemon1.setHP(2 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("WATER")) {
	    			pokemon1.setHP(2 * pokemon2.getDamage() - pokemon1.getDefense());
	    			
	    		}else {
	    			pokemon2.setHP(pokemon1.getDamage() - pokemon2.getDefense());
	    		}
	    		
	    		if(pokemon1.getHP() <= 0) {
	    			System.out.printf("%s venceu\n", pokemon2.getName());
	    		}
	    		
	    		if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("FIRE")){
	    			pokemon2.setHP(2 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("GRASS")) {
	    			pokemon2.setHP(2 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("FIRE")) {
	    			pokemon2.setHP(2 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("WATER") && pokemon1.getType().equals("WATER")) {
	    			pokemon2.setHP(0.5 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("FIRE") && pokemon1.getType().equals("FIRE")){
	    			pokemon2.setHP(0.5 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else if(pokemon2.getType().equals("GRASS") && pokemon1.getType().equals("GRASS")) {
	    			pokemon2.setHP(0.5 * pokemon1.getDamage() - pokemon2.getDefense());
	    			
	    		}else {
	    			pokemon2.setHP(pokemon1.getDamage() - pokemon2.getDefense());
	    		}
	    		
	    		if(pokemon2.getHP() <= 0) {
	    			System.out.printf("%s venceu\n", pokemon1.getName());
	    		}
	    	}
	    }

		sc.close();
	}

}
