JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Client.java \
	Metrics.java \
	Outcome.java \
	Time.java \
	Place.java \
	Win.java \
	Tries.java \
	PointsEarned.java 

default: classes 

classes: $(CLASSES:.java=.class)
	@echo "Compiling..."

run:
	@echo "Running..."
	java Client

clean: 
	@echo "Cleaning..."
	rm -f *.class
	