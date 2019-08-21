#ifndef LISTAACT_H
#define LISTAACT_H
#include "NodeAct.h"
#include <iostream>
#include <fstream>
#include <string>
class ListaAct
{
    public:
        NodeAct *raiz;
        NodeAct *cola

        ListaAct();

        void insertar(std::string dia, std::string actividad);
        void recorrer();


    protected:

    private:
};

#endif // LISTAACT_H
