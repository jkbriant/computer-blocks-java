javac.exe -d "out/" -cp "src/" $(find . -type f -name "*.java")

cd out/
java dev/pacito/computerblocks/Launcher

printf "\n\n"
read -p "Press [Enter] key to begin cleanup... "

rm $(find . -type f -name "*.class")
