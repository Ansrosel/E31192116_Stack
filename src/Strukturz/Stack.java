package Strukturz;

/**
 *
 * @author Anisha
 */
public class Stack {

    private boolean empty, full;
    private int pos;
    private int max_data = 3;
    private int item[] = new int[max_data];

    public void Stack() {
        full = false;
        empty = true;
        pos = 0;
    }

    public boolean isFull() {
        return (full);
    }

    public boolean isEmpty() {
        return (empty);
    }

    public void push(int data) {
        if (!isFull()) {
            item[pos++] = data;
            empty = false;
            if (pos == max_data) {
                full = true;
            }
            System.out.println("Data Sudah Ditambahkan");
        } else {
            System.out.println("Stack Sudah Penuh");
        }
        return;
    }

    public int pop() {
        int x = 0;
        if (!isEmpty()) {
            x = item[--pos];
            full = false;
            System.out.println("Data yang di POP adalah  " + item[pos]);
            System.out.println("");
            item[pos] = 0;
            if (pos == 0) {
                empty = true;
                System.out.println("Stack Kosong");
            } else {
                System.out.println("Data sudah di ambil");
            }
        } else {
            System.out.println("Stack Masih Kosong : \n");
        }
        return (x);
    }

    public void display() {
        System.out.println("Isi Stack Adalah ");
        for (int i = 0; i < pos; i++) {
            System.out.println(item[i] + "");
        }
        System.out.println("\n");
    }
}
