import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados {
    private List<Integer> lst;
    private List<Observer> observers;

    public FonteDeDados() {
        lst = new LinkedList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void add(Integer value) {
        if (value < 0) throw new IllegalArgumentException("Valor inválido");
        lst.add(value);
        notificarObservadores();
    }

    public int quantidade() {
        return lst.size();
    }

    public List<Integer> getValores() {
        return new ArrayList<>(lst);
    }

    private void notificarObservadores() {
        for (Observer o : observers) {
            o.atualizar(getValores());
        }
    }
}
