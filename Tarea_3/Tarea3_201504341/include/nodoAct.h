#ifndef NODOACT_H
#define NODOACT_H
#include <string>
using namespace std;

class nodoAct
{
    public:
        string actividad;
        nodoAct *siguiente;
        nodoAct *anterior;
        nodoAct(string actividad);
        virtual ~nodoAct();

    protected:

    private:
};

#endif // NODOACT_H
