package arrayTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 10;
		ClassDataArray ca = new ClassDataArray(max);
		//test insert
		ca.insert("dan","xu1",20);
		ca.insert("ying","xu2",19);
		ca.insert("wenyue", "xu3", 50);
		ca.insert("guili", "jin", 50);
		ca.insert("aa", "bb", 2);
		ca.insert("cc", "dd", 3);
		ca.insert("ee", "ff", 4);
		ca.insert("gg", "rr", 5);
		ca.insert("ww", "qq", 6);
		ca.insert("oo", "ii", 8);
		
		//test find
		String searchkey = "dd";
		//Person found;
		Person found = ca.find(searchkey);
		
		if(found == null){
			System.out.println("Not found!" + searchkey);
		}
		else{
			
			System.out.print("Found:" );
			found.displayPerson();
		}
		
		//test display
		ca.displayAll();
		//test delete;
		ca.delete("rr");
		//ca.displayAll();
		
		ca.insertionSort();
		ca.displayAll();
		return;
	}

}
