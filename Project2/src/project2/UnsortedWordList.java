package project2;

public class UnsortedWordList extends WordList {
	  
	
	public UnsortedWordList() {
		first = intNode;
	    last = intNode;
	}
	
    
    
	
    public void append(String word) {
        WordNode temp = new WordNode(word);
        last.next = temp;  
        last = temp;
        length++;
        }
    
    
    public void printList() {
    	
		WordNode p = first;
		while (p.next != null) {
		    
			System.out.println(p.next.data);
		    p = p.next;
		}
    }
    
    

	public static void main(String[] args) {
		
		UnsortedWordList a = new UnsortedWordList();
		a.append("Now");
		a.append("What");
		
		a.printList();

	}

}
