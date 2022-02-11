JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Driver.java \
	FormatReader.java \
	Question.java \
	StringReader.java \
	TestCreator.java

default: classes 

classes: $(CLASSES:.java=.class)
	@echo "Compiling..."

run:
	@echo "Running..."
	java Driver

clean: 
	@echo "Cleaning..."
	rm -f *.class
	