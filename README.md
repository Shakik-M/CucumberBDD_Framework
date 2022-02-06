# CucumberBDD_Framework
 
# FIx Code in MAC
cmd+a to select all the codes 
Option+cmd+L to let orientation

#Fix code in Windoaws
ctrl + A
ctrl + I

#Executing test in command prompt
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@login"
mvn verify -Denv=stage -Dbrowser=chrome -Dcucumber.filter.tags="@login"