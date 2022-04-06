JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Driver/Driver.java \
	Metrics/Metrics.java \
	Metrics/Outcome.java \
	Metrics/Loser.java \
	Metrics/Time.java \
	Metrics/Place.java \
	Metrics/Seed.java \
	Metrics/Score.java \
	Metrics/Winner.java \
	Builder/OutcomeBuilder.java \
	Builder/MatchBuilder.java \
	Builder/ContestBuilder.java \
	Builder/TournamentBuilder.java \
	Builder/SpeedRaceBuilder.java \
	Builder/OutcomeDirector.java

default: classes 

classes: $(CLASSES:.java=.class)
	@echo "Compiling..."

run:
	@echo "Running..."
	java Client

clean: 
	@echo "Cleaning..."
	rm -f *.class