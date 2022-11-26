package stack.interviewQuestion;

class Main_ThreeInOne {
	public static void main(String[] args) {
		ThreelnOne st = new ThreelnOne(9);
		st.push(2, 13);
		st.push(2, 26);
		st.push(2, 33);
		st.push(1,10 );
		st.push(1, 20);
		st.push(1, 30);
		st.push(1, 40);
		st.push(3, 51);
		st.push(3, 61);
		st.push(3, 71);
		st.pop(2);
		System.out.println(st.isEmpty(2));
		st.displayAll();
	}
}
