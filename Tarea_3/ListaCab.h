#ifndef LISTACAB_H
#define LISTACAB_H
#include"ListaAct.h"
#include "NodeAct.h"
#include "NodeCab.h"

class ListaCab
{
    public:
        NodeCab *raiz;

        ListaCab();
        void insertar_C(std::string dia, std::string actividad);
        void recorrer();


    protected:

    private:
};

#endif // LISTACAB_H
