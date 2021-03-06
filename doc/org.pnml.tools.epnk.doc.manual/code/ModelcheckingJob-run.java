protected void run() {
	result = "Model checking results:" + LF;
	for (int i = 0; i < formulas.length; i++) {
		ROBDD obdd = formulas[i].toROBDD(transitionsystem);
		result = result + " " + formulas[i] + ": " +
			transitionsystem.isValid(obdd) + LF; 
	} 
}