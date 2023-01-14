package Entities;

public class Pokemon implements BaseData {
	
	private String name;
	private Type type;
	private Double HP; 
	private Double defense;
	private Double attack;
	private Double attackPower;
	private Double speed;
	
	public Pokemon(String name, Type type, Double HP, Double defense, Double attack, Double attackPower, Double speed) {
		this.name = name;
		this.type = type;
		this.HP = HP;
		this.defense = defense;
		this.attack = attack;
		this.attackPower = attackPower;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getHP() {
		return HP;
	}

	public void setHP(Double hP) {
		HP = hP;
	}

	public Double getDefense() {
		return defense;
	}

	public void setDefense(Double defense) {
		this.defense = defense;
	}

	public Double getAttack() {
		return attack;
	}

	public void setAttack(Double attack) {
		this.attack = attack;
	}

	public Double getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(Double attackPower) {
		this.attackPower = attackPower;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@Override
	public Double getDamage() {
		return attack + attackPower;
	}
	
}
