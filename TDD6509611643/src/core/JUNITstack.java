package core;

import junit.framework.TestCase;

public class JUNITstack extends TestCase {
	
	public void testEmptyInitialStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop() {
		
		Stack s1 = new Stack();
		s1.push(1);
		Object elm1 = s1.Top();
		
		assertEquals(1, elm1);
	}
	
	public void LastInFirstOut() {
		
		Stack s1 = new Stack();

        for (int i = 1; i <= 3; i++) {
            s1.push(i);
        }

        for (int j = 3; j >= 1; j--) {
            assertEquals(s1.pop(), j);;
        }
	}
	
	public void PushElmToLimitedSizeStack() {
		Stack s1 = new Stack();
		//capacity = 10
		for(int i = 1; i<20; i++) {
			s1.push(i);
		}
		assertEquals(10, s1.getSize());
		assertTrue(s1.isFull());
		
	}
}
	

