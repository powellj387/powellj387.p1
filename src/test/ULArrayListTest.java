//
//package test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//
//import cards.*;
//
//
//public class ULArrayListTest {
//
//	@Test
//	// tests public void pushBack(E e)
//	public void testPushBack() {
//		// push back onto an empty vector
//		ULArrayList<Integer> intV = new ULArrayList<>();
//		intV.pushBack(5);
//		int answer0[] = {5};
//
//		assertEquals(1, intV.size(), "Add to empty test has wrong size");
//		assertEquals(Integer.valueOf(answer0[0]), intV.get(0), "pushBack to empty test");
//
//		// push back onto an non-empty vector
//		intV.pushBack(6);
//		intV.pushBack(7);
//		intV.pushBack(8);
//
//		intV.pushBack(9);
//		intV.pushBack(10);
//
//		int answer1[] = {5,6,7,8,9,10};
//
//		assertEquals( 6, intV.size(), "pushBack non-emtpy size test");
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer1[i]), intV.get(i), "pushBack non-empty test");
//		}
//
//		// double capacity
//		intV.pushBack(11);
//		intV.pushBack(12);
//
//		intV.pushBack(15);
//		intV.pushBack(16);
//		intV.pushBack(17);
//		intV.pushBack(18);
//
//		intV.pushBack(19);
//		intV.pushBack(20);
//		intV.pushBack(21);
//		intV.pushBack(22);
//
//		intV.pushBack(23);
//
//		int answer2[] = {5,6,7,8,
//						 9,10,11,12,
//						 15,16,17,18,
//						 19,20,21,22,
//						 23};
//
//		assertEquals( 17, intV.size(), "double capacity size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer2[i]), intV.get(i), "double capacity values test");
//		}
//	}
//
//	@Test
//	//public void insertAt(int index, E element) throws LCIndexOutOfBoundsException
//	public void insertAtTest() {
//		// insert into empty
//		ULArrayList<Integer> intV = new ULArrayList<>();
//		intV.insertAt(5, 0);
//		int answer0[] = {5};
//
//		assertEquals(answer0.length, intV.size(), "insert into empty size test");
//		assertEquals(Integer.valueOf(answer0[0]), intV.get(0), "insert into empty value test");
//
//		// insert at back
//		intV.insertAt(6,intV.size());
//		int answer1[] = {5,6};
//
//		assertEquals(answer1.length, intV.size(), "insert at back size test");
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer1[i]), intV.get(i), "insert at back value test");
//		}
//
//		// setup
//		intV.insertAt(7,intV.size());
//		intV.insertAt(8,intV.size());
//		intV.insertAt(9,intV.size());
//
//		intV.insertAt(10,intV.size());
//		intV.insertAt(15,intV.size());
//
//		// insert at front
//		intV.insertAt(1,0);
//		int answer2[] = { 1,5,6,7,
//						  8,9,10,15};
//
//		assertEquals(answer2.length, intV.size(), "insert at front size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer2[i]), intV.get(i), "insert at front value test");
//		}
//
//
//		// insert at middle
//		intV.insertAt(2,1);
//		intV.insertAt(14,intV.size()-1);
//		int answer3[] = { 1,2,5,6,
//						  7,8,9,10,
//						  14,15};
//
//		assertEquals(answer3.length, intV.size(), "insert at middle size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer3[i]), intV.get(i), "insert at middle value test");
//		}
//
//		// double capacity
//		intV.insertAt(16,intV.size());
//		intV.insertAt(17,intV.size());
//		intV.insertAt(18,intV.size());
//
//		intV.insertAt(19,intV.size());
//		intV.insertAt(20,intV.size());
//		intV.insertAt(21,intV.size());
//
//		intV.insertAt(22,intV.size());
//		intV.insertAt(23,intV.size());
//
//		int answer4[] = { 1,2,5,6,
//						  7,8,9,10,
//						  14,15,16,17,
//						  18,19,20,21,
//						  22,23};
//
//		assertEquals(answer4.length, intV.size(), "insert at double capacity size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer4[i]), intV.get(i), "insert at double capacity value test");
//		}
//	}
//
//	@Test
//	//public E popBack() throws LCIndexOutOfBoundsException
//	public void popBackTest() {
//		ULArrayList<Integer> intV = new ULArrayList<>();
//
//		// setup
//		intV.pushBack(1);
//		intV.pushBack(2);
//		intV.pushBack(3);
//		intV.pushBack(5);
//
//		intV.pushBack(6);
//
//		// pop_back on a non-empty list
//		intV.popBack();
//
//		int answer1[] = {1,2,3,5};
//
//		assertEquals(answer1.length, intV.size(), "popBack on a non-empty list size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer1[i]), intV.get(i), "popBack on a non-empty list values test");
//		}
//
//		// pop_back on last item in the list
//		intV.popBack();
//		intV.popBack();
//		intV.popBack();
//		intV.popBack();
//
//		assertEquals(0, intV.size(), "popBack to an empty list size test");
//
//		// push_back after a popped to empty list
//		intV.pushBack(21);
//
//		int answer2[] = {21};
//
//		assertEquals(answer2.length, intV.size(), "pushBack after a popped to empty list size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer2[i]), intV.get(i), "pushBack after a popped to empty list values test");
//		}
//	}
//
//	@Test
//	// public E removeAt(int index) throws LCIndexOutOfBoundsException
//	public void removeAtTest() {
//		ULArrayList<Integer> intV = new ULArrayList<>();
//		intV.pushBack(1);
//		intV.pushBack(2);
//		intV.pushBack(3);
//		intV.pushBack(5);
//
//		intV.pushBack(6);
//
//		// remove at front
//		intV.removeAt(0);
//		int answer0[] = {2,3,5,6};
//
//		assertEquals(answer0.length, intV.size(), "remove at front size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer0[i]), intV.get(i), "remove at front values test");
//		}
//
//		// remove at end
//		intV.removeAt(intV.size()-1);
//		int answer1[] = {2,3,5};
//
//		assertEquals(answer1.length, intV.size(), "remove at end size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer1[i]), intV.get(i), "remove at end values test");
//		}
//
//		// remove in the middle
//		intV.removeAt(1);
//		int answer2[] = {2,5};
//
//		assertEquals(answer2.length, intV.size(), "remove at middle size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer2[i]), intV.get(i), "remove at middle values test");
//		}
//	}
//
//	@Test
//	//public E set(int index, E element) throws LCIndexOutOfBoundsException
//	public void setTest() {
//		ULArrayList<Integer> intV = new ULArrayList<>();
//
//		intV.pushBack(0);
//		intV.pushBack(1);
//		intV.pushBack(2);
//		intV.pushBack(3);
//
//		intV.pushBack(4);
//		intV.pushBack(5);
//
//		// set at the front
//		intV.set(0, -1);
//
//		int answer1[] = { -1,1,2,3,
//					       4, 5};
//
//		assertEquals(answer1.length, intV.size(), "set at the front size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer1[i]), intV.get(i), "set at the front values test");
//		}
//
//		// set at the end
//		intV.set(intV.size() - 1, 6);
//
//		int answer2[] = { -1,1,2,3,
//						   4, 6};
//
//		assertEquals(answer2.length, intV.size(), "set at the end size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer2[i]), intV.get(i), "set at the end value test");
//		}
//
//		// set in the middle
//		intV.set(1,  11);
//
//		int answer3[] = { -1,11,2,3,
//						   4, 6};
//
//		assertEquals(answer3.length, intV.size(), "set in the middle size test");
//
//		for(int i = 0; i < intV.size(); i++){
//			assertEquals(Integer.valueOf(answer3[i]), intV.get(i), "set in the middle values test");
//		}
//	}
//
//	@Test
//	// Testing out of bounds exceptions
//	public void exceptionsTest() {
//		// pop_back from empty vector
//		ULArrayList<Integer> intV = new ULArrayList<>();
//		try{
//			intV.popBack();
//			fail("pop_back empty test");
//		}
//		catch(ULIndexOutOfBoundsException e){
//			// do nothing
//		}
//
//		// removeAt from empty vector
//		try{
//			intV.removeAt(0);
//			fail("remove from empty test");
//		}
//		catch(ULIndexOutOfBoundsException e){
//			// do nothing
//		}
//
//		// remove an index not in the list
//
//		// setup
//		intV.pushBack(1);
//		intV.pushBack(2);
//		intV.pushBack(3);
//		intV.pushBack(5);
//
//		intV.pushBack(6);
//
//		try{
//			intV.removeAt(5);
//			fail("remove index not in list test, too big");
//		}
//		catch(ULIndexOutOfBoundsException e){
//			// do nothing
//		}
//
//		try{
//			intV.removeAt(-1);
//			fail("remove index not in list test, too small");
//		}
//		catch(ULIndexOutOfBoundsException e){
//			// do nothing
//		}
//
//		// invalid index test
//		try{
//			@SuppressWarnings("unused")
//			int b = intV.get(5);
//			fail("invalid [] test");
//		}
//		catch(ULIndexOutOfBoundsException e){
//		}
//
//
//		// insertAt invalid index test
//		try{
//			intV.insertAt(7, intV.size() + 1);
//			fail("insertAt invalid index test, too big");
//		}
//		catch(ULIndexOutOfBoundsException e){
//		}
//
//		try{
//			intV.insertAt(7, -1);
//			fail("insertAt invalid index test, too small");
//		}
//		catch(ULIndexOutOfBoundsException e){
//		}
//
//		// set fail
//		try{
//			intV.set(intV.size(), 7);
//			fail("set invalid index test, too big");
//		}
//		catch(ULIndexOutOfBoundsException e){
//		}
//
//		try{
//			intV.set(-1, 7);
//			fail("set invalid index test, too small");
//		}
//		catch(ULIndexOutOfBoundsException e){
//		}
//	}
//
//	@Test
//	public void cloneTest()  {
//		// setup
//		ULArrayList<Integer> intV = new ULArrayList<>();
//		intV.pushBack(0);
//		intV.pushBack(1);
//		intV.pushBack(2);
//		intV.pushBack(3);
//		intV.pushBack(4);
//		intV.pushBack(5);
//
//		// copy
//		ULArrayList<Integer> intV2 = intV.clone();
//
//		// modify original
//		intV.removeAt(0);
//
//		// check
//		int answer0[] = {0,1,2,3,4,5};
//		assertEquals(answer0.length, intV2.size(), "clone size test");
//
//		for(int i = 0; i < intV2.size(); i++){
//			assertEquals(Integer.valueOf(answer0[i]), intV2.get(i), "clone values test");
//		}
//	}
//}
