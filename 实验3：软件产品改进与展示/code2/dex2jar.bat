@echo off
cd G:\huaweiPro\dex2jar-2.x\dex-tools\build\distributions\dex-tools-2.1-SNAPSHOT
G:
set sourceDir=%1%
set outputDir=%2%
set fileName=%3%

echo %sourceDir%
echo %outputDir%
echo %fileName%
echo %cd%

set filename=%filename:~0,-4%
set apkname=%filename%.apk
set zipname=%filename%.zip

rd /s /q %outputDir%\%filename%

call apktool d -f %sourceDir% -o %outputDir%\%filename%\ResourceFile

copy %sourceDir% %zipname%
D:\WinRar\winrar x -ad -ibck %zipname%
copy %filename%\*.dex 

call d2j-dex2jar.bat classes*.dex

md %outputDir%\%filename%\SourceJar
copy classes*.jar %outputDir%\%filename%\SourceJar
del classes*.jar
del classes*.dex
rd /s /q %filename%
del %zipname%

echo ∑¥±‡“ÎÕÍ≥…
exit