@echo off

:check
if "%1" == "" goto Ende

del %1

shift

goto check


:Ende
@echo: Loeschen.bat beendet
pause