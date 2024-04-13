fichJar = distancia.jar
P=Principal
MAIN_CLASS=aplicacion.$(P)
SRC_DIR=./src
OUT_DIR=bin
LIB_DIR=./lib
DOC_DIR=html
JAR_FILE = $(P).jar
limpiar:
	rm -f *.jar
	rm -rf bin	

compilar: limpiar
	mkdir bin
	find . -name *.java | xargs javac -cp bin -d bin

jar: compilar
	jar cvfm $(fichJar) Manifest.txt -C bin .

javadoc:compilar
	find . -type f -name "*.java" | xargs javadoc -d $(DOC_DIR) -encoding utf-8 -docencoding utf-8 -charset utf-8
debug: compilar

	find $(SRC_DIR) -name *.java | xargs javac -g -cp $(OUT_DIR):$(LIB_DIR) -d $(OUT_DIR)
	cd bin; jdb -sourcepath ../src
runjar: jar
	@echo "Manifest-Version: 1.0" > manifest.txt
	@echo "Main-Class:" $(MAIN_CLASS) >> manifest.txt
	@echo "Class-Path: . ">> manifest.txt
	@echo "" >> manifest.txt
	java -jar $(JAR_FILE)

