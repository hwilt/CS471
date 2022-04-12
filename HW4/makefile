JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	driver/Driver.java \
	metrics/Metrics.java \
	metrics/Outcome.java \
	metrics/Loser.java \
	metrics/Time.java \
	metrics/Place.java \
	metrics/Seed.java \
	metrics/Score.java \
	metrics/Winner.java \
	builder/OutcomeBuilder.java \
	builder/MatchBuilder.java \
	builder/ContestBuilder.java \
	builder/TournamentBuilder.java \
	builder/SpeedRaceBuilder.java \
	builder/OutcomeDirector.java

default: classes 

classes: $(CLASSES:.java=.class)
	@echo "Compiling..."

run:
	@echo "Running..."
	java driver/Driver

clean: 
	@echo "Cleaning..."
	rm -f builder/*.class
	rm -f metrics/*.class
	rm -f driver/*.class