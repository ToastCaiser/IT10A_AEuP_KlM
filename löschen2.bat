@echo off

:check
if exist %1 goto delete

@echo: Loeschen.bat beendet
goto ende

:delete
del %1
shift
goto check

:ende
pause