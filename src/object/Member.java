package object;

public class Member {
	public static void main(String[] args) {
		
		public String id;
		
		public Member(String id) {
			this.id = id;
			
		}
		
		
		
		public boolean equals(Object obj) {
			
			if(obj instanceof Member) {
				Member member = (Member)obj;
				
				if(id.contentEquals(member.id)) {
					return true;
				}
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
