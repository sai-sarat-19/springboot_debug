# Scientific Debugging Template for Reference
Iteration I:
- Observation:
- Hypothesis:
- Prediction/Experiment:

Iteration II:
- Observation
- Hypothesis:
- Prediction/Experiment:

# Scenario Setup
1. Then start the server
./gradlew bootrun or in the UI

# Debugging Challenge I
Type the following command on the terminal
curl http://localhost:8080/addCourse?name=math&description=nice%20math%20course&status=completed&username=yakshit

# Debugging Challenge II
Type the following command on the terminal
curl -X POST http://localhost:8080/addCourse?name=math&description=nice%20math%20course&status=completed&username=sridher

1. Are you able to get an answer?
2. What do you think is the error?
Follow the scientific debugging template and debug the issue.

**Hint**: Uncomment the following line in application.properties file and see if that helps.
logging.level.org.springframework.web: DEBUG 

## What is the fix?
1. Once you identify the issue, what did you do to fix the issue?
2. Are you sure if it's the right way to fix the issue as there may be more than one way to fix the issue?

# Create your own Cheatsheet
Did you find some useful commands that can be repeatedly used in the future?
- Start noting them down in a text file organized cleanly.
- You will soon find that you are going to repeatedly refer to your cheatsheet.