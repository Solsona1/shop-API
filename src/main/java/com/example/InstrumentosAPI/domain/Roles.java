package com.example.InstrumentosAPI.domain;

//Roles Validos {Admin, Operador, Visor (solo lectura)}

import jakarta.persistence.Entity;

public enum Roles {
    ADMIN,
    OPERADOR,
    CLIENTE,
    VISOR
}
