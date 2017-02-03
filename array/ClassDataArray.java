package arrayTest;

public class ClassDataArray {
	private Person[] a;	//create a PersonDataArray
	private int length;
	public ClassDataArray(int n){
		a =  new Person[n];
		length = 0;
	}
	//find a record
	public Person find(String searchName){
		int i ;
		for(i = 0; i < length; i ++){
			if(a[i].getLast().equals(searchName))	//compare
				break;
		}
		if (i == length)
			return null;
		else  
			return a[i];
	}
	
	//insert a record
	public void insert(String first, String last, int age){
		a[length] = new Person(first,last,age);
		length ++ ;
	}
	
	//delete a record
	public boolean delete(String searchName){
		int i;
		for(i = 0; i < length ; i ++ ){
			if(a[i].getLast().equals(searchName))
				break;
		}
		if (i == length)
			return false;
		else{
			for(int j = i; j < length - 1 ; j ++ ){
				a[j] = a[j + 1];
			}
			length -- ;
			return true;
		}
	}
	
	//display all records
	public void displayAll(){
		for(int i = 0 ; i < length ; i ++ )
			a[i].displayPerson();
		System.out.print("\n");
	}	

	//insertion sort
	public void insertionSort(){
		int i,j;
		for(i = 1; i < length ; i ++ ){
			Person temp = a[i];
			for(j = i - 1;j >= 0 && a[j].getLast().compareTo(temp.getLast()) > 0;j -- ){
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
	}
	

}
