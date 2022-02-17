## How to run the Code:

First Compile in the terminal: Use command ``` make```<br>
Then run: Use command `make run`<br>
Put type in your input file and scheme you want to use<br>
It will then return two file, one with the answer key called "key.txt" and one called "test.txt" with the test


### Supported extensions:
.qa:<br>
format: question?answer,type\n<br>

.tf:<br>
format: question!answer.type\n<br>

Type can be multiplechoice, truefalse, or fillinblank,<br>
If the question is multiple choice please put which answers they can put in the question part of the format<br>
If the question is true/false please do not true or false into your question<br>
If the question is a fill in the blank type please add a "_______" where the answer should go.