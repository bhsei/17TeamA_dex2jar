@echo off
set filename=%1%
set apkname=%filename%.apk
set zipname=%filename%.zip

call apktool.bat d -f %apkname% -o result\sourcefile\%filename%

copy %apkname% %zipname%
C:\"Program Files"\WinRar\winrar x -ad CloudMusic.zip
copy %filename%\*.dex 

call d2j-dex2jar.bat classes*.dex

rd /s /q result\jar\%filename%
md result\jar\%filename%
copy classes*.jar result\jar\%filename%
del classes*.jar
del classes*.dex
rd /s /q %filename%
del %zipname%
