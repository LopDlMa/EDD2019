#ifndef NODEACT_H
#define NODEACT_H


class NodeAct
{
    public:
        NodeAct *siguiente;
        NodeAct *anterior;
        std::string dia;
        std::string actividad;


        NodeAct(std::string dia, std::string actividad);
        NodeAct *getAnterior();
        NodeAct *getSiguiente();

        void setAnterior(NodeAct *n);
        void setSiguiente(NodeAct *n);

    protected:

    private:
};

#endif // NODEACT_H
