#ifndef NODECAB_H
#define NODECAB_H
#include "ListaAct.h"



class NodeCab
{
    public:
        ListaAct day = new ListaAct();

        NodeCab *siguiente;
        std::string dia;
        std::string actividad
        NodeCab(std::string dia, std::string actividad);




    protected:

    private:
};

#endif // NODECAB_H
