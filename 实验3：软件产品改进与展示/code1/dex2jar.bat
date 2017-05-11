@echo off
cd dex2jar
set filename=%1%
set filename=%filename:~0,-4%
set apkname=%filename%.apk
set zipname=%filename%.zip

rd /s /q ..\result\%filename%

call apktool.bat d -f ..\%apkname% -o ..\result\%filename%\sourcefile

copy ..\%apkname% %zipname%
C:\"Program Files"\WinRar\winrar x -ad -ibck %zipname%
copy %filename%\*.dex 

call d2j-dex2jar.bat classes*.dex

md ..\result\%filename%\jar
copy classes*.jar ..\result\%filename%\jar
del classes*.jar
del classes*.dex
rd /s /q %filename%
del %zipname%
cd ..

echo ∑¥±‡“ÎÕÍ≥…