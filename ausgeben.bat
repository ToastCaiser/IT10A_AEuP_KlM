echo off
md Temp\temp1
copy Temp\*.bat Temp\temp1
cd Temp
del *.bat 
echo %date% %time%
Pause
