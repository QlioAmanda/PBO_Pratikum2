@echo off
echo === Compile Java ===
javac -d bin src/id/ac/polban/model/*.java src/id/ac/polban/service/*.java

echo === Buat JAR ===
jar cfm KRSApp.jar manifest.txt -C bin .

echo === Jalankan Program ===
java -jar KRSApp.jar
