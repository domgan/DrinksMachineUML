echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.3.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist MainEXE.class del MainEXE.class
if exist com\telelogic\drinksmachine\Display.class del com\telelogic\drinksmachine\Display.class
if exist com\telelogic\drinksmachine\drinksmachine_pkgClass.class del com\telelogic\drinksmachine\drinksmachine_pkgClass.class
if exist com\telelogic\drinksmachine\User.class del com\telelogic\drinksmachine\User.class
if exist com\telelogic\drinksmachine\KeyReader.class del com\telelogic\drinksmachine\KeyReader.class
if exist com\telelogic\drinksmachine\Heater.class del com\telelogic\drinksmachine\Heater.class
if exist com\telelogic\drinksmachine\evKeyPress.class del com\telelogic\drinksmachine\evKeyPress.class
if exist com\telelogic\drinksmachine\evCoffee.class del com\telelogic\drinksmachine\evCoffee.class
if exist com\telelogic\drinksmachine\ServicePerson.class del com\telelogic\drinksmachine\ServicePerson.class
if exist com\telelogic\drinksmachine\evTea.class del com\telelogic\drinksmachine\evTea.class
if exist com\telelogic\drinksmachine\evCocoa.class del com\telelogic\drinksmachine\evCocoa.class
if exist com\telelogic\drinksmachine\evStop.class del com\telelogic\drinksmachine\evStop.class
if exist com\telelogic\drinksmachine\MaintenancePerson.class del com\telelogic\drinksmachine\MaintenancePerson.class
if exist com\telelogic\drinksmachine\DrinksMachineBuilder.class del com\telelogic\drinksmachine\DrinksMachineBuilder.class
if exist com\telelogic\drinksmachine\DrinksMachine.class del com\telelogic\drinksmachine\DrinksMachine.class
if exist com\telelogic\drinksmachine\evStart.class del com\telelogic\drinksmachine\evStart.class
if exist com\telelogic\drinksmachine\Nozzle.class del com\telelogic\drinksmachine\Nozzle.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


