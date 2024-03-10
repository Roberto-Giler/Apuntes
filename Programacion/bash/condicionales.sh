#!bin/bash

#sentenicas if 

ping -c 1 8.8.8.8

if [$? ne 0];then # $? es una variable que indica el estado de la ejecucion del comnado anterior
    echo "Se ejecuto correctamente"
else
    echo "No se ejecuto correctamente"
fi