#!/bin/bash

### Create tree hierarchy

mkdir lab0
cd lab0
touch abra2
touch carracosta6
mkdir duosin9
cd duosin9
mkdir whirlpede
mkdir spoink
mkdir golbat
cd ..
mkdir grumpig3
cd grumpig3
mkdir gastrodon
mkdir snorunt
mkdir gible
cd ..
touch magmar5
mkdir reuniclus9
cd reuniclus9
touch vigoroth
touch golett
mkdir lampent
touch sandshrew
touch spoink
mkdir blitzle
cd ../

### Fill content

echo \
"Ходы  Body Slam Counter Double-Edge Drain Punch Dynamicpunch
Iron Tail Fire Punch Focus Punch Foul Play Gravity Ice Punch Iron Tail
Knock Off Magic Coat Magic Room Recycle Role Play Magic Coat Mega Kick
Mega Punch Metronome Seismic Toss Shock Wave Signal Beam Skill Swap
Sleep Talk Snatch Snore Thunderpunch Trick Wonder Room Zen" \
>> abra2

echo \
"satk=8 sdef=7 spd=3" \
>> carracosta6

echo \
"Способности Ember
Smokescreen Faint Attack Fire Spin Clear Smog Flame Burst Confuse Ray
Fire Punch Lava Plume Sunny Day Flamethrower Fire
Blast" \
>> magmar5

echo \
"satk=6 sdef=6 spd=9" \
>> reuniclus9/vigoroth

echo \
"Возможности Overland=6
Sky=6 Jump=1 Power=4 Intelligence=2 Sinker=0" \
>> reuniclus9/golett

echo \
"Возможности 
Overland=6 Burrow=8 Jump=2 Power=1 Intelligence=3
Sinker=0" \
>> reuniclus9/sandshrew

echo \
"satk=7 sdef=s spd=6" \
>> reuniclus9/spoink

### set permissions

find . -name abra2 -exec chmod 444 {} \; 2>/dev/null
find . -name carracosta6 -exec chmod 666 {} \; 2>/dev/null
find . -name magmar5 -exec chmod 066 {} \; 2>/dev/null

find . -name whirlpede -exec chmod 550 {} \; 2>/dev/null
chmod 770 duosin9/spoink
find . -name golbat -exec chmod 513 {} \; 2>/dev/null

find . -name gastrodon -exec chmod 311 {} \; 2>/dev/null
find . -name snorunt -exec chmod 317 {} \; 2>/dev/null
find . -name gible -exec chmod 733 {} \; 2>/dev/null

find . -name vigoroth -exec chmod 444 {} \; 2>/dev/null
find . -name golett -exec chmod 620 {} \; 2>/dev/null
find . -name lampent -exec chmod 513 {} \; 2>/dev/null
find . -name sandshrew -exec chmod 044 {} \; 2>/dev/null
chmod 440 reuniclus9/spoink
find . -name blitzle -exec chmod 513 {} \; 2>/dev/null

find . -name duosin9 -exec chmod 335 {} \; 2>/dev/null
find . -name grumpig3 -exec chmod 375 {} \; 2>/dev/null
find . -name reuniclus9 -exec chmod 736 {} \; 2>/dev/null

### continue to do nonsense stuff

ln -s reuniclus9 Copy_91
ln abra2 reuniclus9/golettabra
cp carracosta6 grumpig3/snorunt
cp abra2 reuniclus9/vigorothabra
ln -s "$(pwd)/magmar5" reuniclus9/vigorothmagmar
cat reuniclus9/golett reuniclus9/golett > abra2_49
chmod u+r grumpig3
chmod u+r grumpig3/gastrodon
chmod u+r grumpig3/snorunt
rsync -Rr grumpig3 grumpig3/snorunt
chmod u-r grumpig3
chmod u-r grumpig3/gastrodon
chmod u-r grumpig3/snorunt

### no comments. waste of time

find grumpig3 -maxdepth 1 -type f -exec wc -l {} + 2>> /tmp/269359.log | sort -rn
find duosion9 -type f -exec ls -Slhr {} + 2>> /tmp/269359.log
find . -type f -name *e | xargs  -I % sh -c 'echo -n %; echo :; cat -n % | sort -k 2' 2>&0
wc -l < carracosta6 >> carracosta6 2>> /tmp/269359.log
find duosion9 -type f -exec ls -l {} \; 2>> /tmp/269359.log | sort -n -k 2
find . -name *t -type f -exec ls -lt {} + 2> /dev/null

### i hate this

chmod u+w abra2
rm abra2
rm reuniclus9/golett
rm reuniclus9/vigorothmagm*
rm reuniclus9/golettab*
rm -rf duosion9
rm -rf grumpig3/gastrodon
