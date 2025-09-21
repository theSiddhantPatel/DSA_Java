@REM cd /d "C:\Java"
@REM git add .
@REM git commit -m "Daily auto-update: %date%"
@REM git push origin main
@echo off
:: Daily Git Push Script

:: Go to your project directory
cd /d C:\Java

:: Stage all changes
git add .

:: Commit with date and time
for /f "tokens=1-4 delims=/ " %%a in ("%date%") do (
    for /f "tokens=1-2 delims=: " %%i in ("%time%") do (
        set commitMsg=Daily update %%d-%%b-%%c %%i:%%j
    )
)
git commit -m "%commitMsg%"

:: Pull remote changes safely before pushing
git pull origin main --rebase

:: Push to GitHub
git push origin main

echo.
echo ================================
echo   ✅ Code pushed successfully!
echo ================================
pause
