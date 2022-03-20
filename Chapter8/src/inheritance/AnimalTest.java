package inheritance;


class Animal{										// 여러개의 클래스가 같이 있어도 상관없다.
	public void move()	{
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal
{
	public void move()	{
		System.out.println("사람이 두발로 걷습니다.");
	}		
}


class Tiger extends Animal
{
	public void move()	{
		System.out.println("호랑이가 네발로 뜁니다.");
	}		
}

class Eagle extends Animal
{
	public void move()	{
		System.out.println("독수리가 하늘을 납니다.");
	}		
}



public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());      // Animal animal = new Human(); 	과 동일하다.
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
