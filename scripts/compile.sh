find . -name '*.java' > 'scripts/sources.list'
javac -d bin @scripts/sources.list
