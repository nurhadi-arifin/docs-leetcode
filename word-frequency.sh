#!/bin/bash

if [ ! -f words.txt ]; then
    echo "File words.txt tidak ditemukan!"
    exit 1
fi

cat words.txt | tr -s ' ' '\n' | sort | uniq -c | sort -nr | awk '{print $2 " " $1}'