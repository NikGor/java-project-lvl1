install:
	./gradlew clean install

run:
	./build/install/app/bin/app

#run:
#	./gradlew clean run

lint:
	./gradlew checkstyleMain

build:
	./gradlew clean build


#./gradlew clean
#Перед компиляцией и сборкой проекта рекомендуется удалять результаты предыдущей сборки, чтобы они никак не повлияли на следующую.
#
#./gradlew compileJava - компиляция
#
#./gradlew install
#В результате выполнения команды появится директория build/install/app, внутри которой находятся две директории: bin (с исполняемым файлом приложения) и lib (содержит упакованные в jar скомпилированные файлы).
#
#./gradlew run
#в результате выполнения которой приложение будет скомпилировано и запущено в консоли