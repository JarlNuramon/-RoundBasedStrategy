package player;

public abstract class BasePlayer {
	
	private String name;
	
	private double life;
	private double baseLife;
	
	private int baseArmor;
	private int armor;
	
	private int basePhysicalDamage;
	private int physicalDamage;

	private int baseMagicalDamage;
	private int  magicalDamage;
	
	private int baseInitiative;
	private int initiative;
	
	private int specialResource;
	private boolean ready=false;
	
	private String abilityName1;
	private String abilityName2;
	private String abiityName3;
	private String abilityName4;
	
	
	public BasePlayer(String name, double life, double baseLife, int baseArmor, int armor, int basePhysicalDamage,
			int physicalDamage, int baseMagicalDamage, int magicalDamage, int baseInitiative, int initiative) {
		this.name = name;
		this.life = life;
		this.baseLife = baseLife;
		this.baseArmor = baseArmor;
		this.armor = armor;
		this.basePhysicalDamage = basePhysicalDamage;
		this.physicalDamage = physicalDamage;
		this.baseMagicalDamage = baseMagicalDamage;
		this.magicalDamage = magicalDamage;
		this.baseInitiative = baseInitiative;
		this.initiative = initiative;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLife() {
		return life;
	}
	public void setLife(double life) {
		this.life = life;
	}
	public double getBaseLife() {
		return baseLife;
	}
	public void setBaseLife(double baseLife) {
		this.baseLife = baseLife;
	}
	public int getBaseArmor() {
		return baseArmor;
	}
	public void setBaseArmor(int baseArmor) {
		this.baseArmor = baseArmor;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getBasePhysicalDamage() {
		return basePhysicalDamage;
	}
	public void setBasePhysicalDamage(int basePhysicalDamage) {
		this.basePhysicalDamage = basePhysicalDamage;
	}
	public int getPhysicalDamage() {
		return physicalDamage;
	}
	public void setPhysicalDamage(int physicalDamage) {
		this.physicalDamage = physicalDamage;
	}
	public int getBaseMagicalDamage() {
		return baseMagicalDamage;
	}
	public void setBaseMagicalDamage(int baseMagicalDamage) {
		this.baseMagicalDamage = baseMagicalDamage;
	}
	public int getMagicalDamage() {
		return magicalDamage;
	}
	public void setMagicalDamage(int magicalDamage) {
		this.magicalDamage = magicalDamage;
	}
	public int getBaseInitiative() {
		return baseInitiative;
	}
	public void setBaseInitiative(int baseInitiative) {
		this.baseInitiative = baseInitiative;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	public int getSpecialResource() {
		return specialResource;
	}
	public void setSpecialResource(int specialResource) {
		this.specialResource = specialResource;
	}
	public String getAbilityName1() {
		return abilityName1;
	}
	public void setAbilityName1(String abilityName1) {
		this.abilityName1 = abilityName1;
	}
	public String getAbilityName2() {
		return abilityName2;
	}
	public void setAbilityName2(String abilityName2) {
		this.abilityName2 = abilityName2;
	}
	public String getAbiityName3() {
		return abiityName3;
	}
	public void setAbiityName3(String abiityName3) {
		this.abiityName3 = abiityName3;
	}
	public String getAbilityName4() {
		return abilityName4;
	}
	public void setAbilityName4(String abilityName4) {
		this.abilityName4 = abilityName4;
	}
	public abstract void useAbility1();
	public abstract void useAbility2();
	public abstract void useAbility3();
	public abstract void useAbility4();
	public void Reset() {
	magicalDamage = baseMagicalDamage;
	physicalDamage = basePhysicalDamage;
	armor = baseArmor;
	initiative = baseInitiative;
	}
	public boolean isReady() {
		return ready;
	}
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	public void actionMade()
	{
		setReady(true);
		Reset();
	}
}
