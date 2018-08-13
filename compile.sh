javac.exe -d "bin/" $(find . -type f -name "*.java")

cd bin/
java dev/pacito/computerblocks/Launcher

printf "\n\n"
read -p "Press [Enter] key to begin cleanup... "

rm $(find . -type f -name "*.class")
