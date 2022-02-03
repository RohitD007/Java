import java.util.*;
public class Main{
	
	
	static int[] variable;
	static int[] A;
	static int[] B;
	static int[] C;
	static int x = 1;
	
	
	
	
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Towers of Hanoi Solver");
	System.out.print("Enter the number of disks(max 6): ");
	int n = scan.nextInt();
	System.out.println("____________________________________________________________________________________________");
	System.out.println("                              Tower A        Tower B         Tower C");
	System.out.println("____________________________________________________________________________________________");
	System.out.println("Initial State: " + "              "
	+ elementlist(n).replaceAll("\\[", "").replaceAll("\\]", "") + "        "
	+ Arrays.toString(B).replaceAll("\\[", "").replaceAll("\\]", "") + "       "
	+ Arrays.toString(C).replaceAll("\\[", "").replaceAll("\\]", ""));
	towerOfhanoi(n, "A", "C", "B");
	}
	
	
	
	
	
	public static void towerOfhanoi(int n, String from_rod, String aux_rod, String to_rod) {
	if (n == 1) {
	updateTower(n, from_rod, to_rod);
	System.out.println(x + "(Move " + n + " from " + from_rod + " to " + to_rod + ")" + "        "
	+ Arrays.toString(A).replaceAll("\\[", "").replaceAll("\\]", "")
	+ "        "
	+ Arrays.toString(B).replaceAll("\\[", "").replaceAll("\\]", "")
	+ "       "
	+ Arrays.toString(C).replaceAll("\\[", "").replaceAll("\\]",
	""));
	} 
	else 
	{
	towerOfhanoi(n - 1, from_rod, to_rod, aux_rod);
	updateTower(x + 1, from_rod, to_rod);
	System.out.println((x + 1) + "(Move " + n + " from " + from_rod + " to " + to_rod + ")" + "        "
	+ Arrays.toString(A).replaceAll("\\[", "").replaceAll("\\]", "")
	+ "        "
	+ Arrays.toString(B).replaceAll("\\[", "").replaceAll("\\]", "")
	+ "       "
	+ Arrays.toString(C).replaceAll("\\[", "").replaceAll("\\]",""));
	x = x + 2;
	towerOfhanoi(n - 1, aux_rod, from_rod, to_rod);
	}
}
	
	
	public static String elementlist(int element) {
	variable = new int[element];
	A = new int[element];
	B = new int[element];
	C = new int[element];
	int i = 0;
	while (element > 0) {
	variable[i] = element;
	A[i] = element;
	i++;
	element--;
	}
	return Arrays.toString(variable);
	}
	
	
	public static void updateTower(int y, String begin, String end) {
	if (begin == "A") {
	if( end == "B"){
	int l1 = A.length;
	int l2 = B.length;
	int r1 = 0;
	for (int i = l1 - 1; i >= 0; i--) {
	if (A[i] != 0) {
	r1 = A[i];
	A[i] = 0;
	break;
	}
	}
	for (int j = 0; j < l2; j++) 
	{
	if (B[j] == 0)
		{
		B[j] = r1;
		break;
		}
	}
	
}
	else
	{
	int l3 = A.length;
	int l4 = C.length;
	int r2 = 0;
	for (int k = l3 - 1; k >= 0; k--) {
	if (A[k] != 0) {
	r2 = A[k];
	A[k] = 0;
	break;
	}
	}
	for (int l = 0; l < l4; l++) {
	if (C[l] == 0) {
	C[l] = r2;
	break;
	}
	}
	}
	}
	if (begin == "B"){
	if(end == "C"){
	int l5 = B.length;
	int l6 = C.length;
	int r3 = 0;
	for (int m = l5 - 1; m >= 0; m--) {
	if (B[m] != 0) {
	r3 = B[m];
	B[m] = 0;
	break;
	}
	}
	for (int n = 0; n < l6; n++) {
	if (C[n] == 0) {
	C[n] = r3;
	break;
	}
	}
	}else{
	int l11 = B.length;
	int l12 = A.length;
	int r4 = 0;
	for (int s = l11 - 1; s >= 0; s--) {
	if (B[s] != 0) {
	r4 = B[s];
	B[s] = 0;
	break;
	}
	}
	for (int t = 0; t < l12; t++) {
	if (A[t] == 0) {
	A[t] = r4;
	break;
	}
	}
	}
	}
	if (begin == "C"){
	if(end == "A"){
	int l7 = C.length;
	int l8 = A.length;
	int r5 = 0;
	for (int o = l7 - 1; o >= 0; o--) {
	if (C[o] != 0) {
	r5 = C[o];
	C[o] = 0;
	break;
	}
	}
	for (int p = 0; p < l8; p++) {
	if (A[p] == 0) {
	A[p] = r5;
	break;
	}
	}
	}else{
	int l9 = C.length;
	int l10 = B.length;
	int r6 = 0;
	for (int q = l9 - 1; q >= 0; q--) {
	if (C[q] != 0) {
	r6 = C[q];
	C[q] = 0;
	break;
	}
	}
	for (int r = 0; r < l10; r++) {
	if (B[r] == 0) {
	B[r] = r6;
	break;
	}
	}
	}
	}
	}
	}
