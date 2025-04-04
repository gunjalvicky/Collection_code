package HashMap;

public record Student(int id, String name,int age )implements Comparable<Tester>
{


	@Override
	public int hashCode() {
		
		return Integer.hashCode(id);
	}

	@Override
	public int compareTo(Tester o) {
		
		return this.compareTo(o);
	}
	

}
