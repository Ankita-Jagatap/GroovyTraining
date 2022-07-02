def casevalue=64
switch(casevalue) {
	case {casevalue%2==0}:
	println "$casevalue is even number"
	break
	
	case{casevalue>50}:
	println "$casevalue is greater than 50r"
	break
	
	case {casevalue<100}:
	println "casevalue is less than 100"
	break
}
