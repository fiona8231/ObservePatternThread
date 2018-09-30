public interface Function {

    void register(Observer ob);
    void unRegister(Observer ob);

    void notification();
}
