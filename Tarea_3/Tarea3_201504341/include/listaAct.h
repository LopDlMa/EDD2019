#ifndef LISTAACT_H
#define LISTAACT_H
#include <string>
#include <iostream>
#include "nodoAct.h"


class listaAct
{
    public:
        nodoAct *cabeza;
        nodoAct *cola;
        listaAct();
        void insertar(string actividad);
        void recorrer();
        virtual ~listaAct();

    protected:

    private:
};

#endif // LISTAACT_H
