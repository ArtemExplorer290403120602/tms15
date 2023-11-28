package TaskFour;

public class What {
    public class CustomCollection<T> {
        private T[] array;
        private int size;

        public CustomCollection() {
            array = (T[]) new Object[10]; // default size
            size = 0;
        }

        public CustomCollection(int initialCapacity) {
            array = (T[]) new Object[initialCapacity];
            size = 0;
        }

        public void add(T element) {
            if (size == array.length) {
                // extend the array
                T[] newArray = (T[]) new Object[array.length * 2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
            array[size] = element;
            size++;
        }

        public boolean remove(T element) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(element)) {
                    // shift elements to the left
                    for (int j = i; j < size - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    array[size - 1] = null;
                    size--;
                    return true;
                }
            }
            return false;
        }

        public T get(int index) {
            if (index >= 0 && index < size) {
                return array[index];
            }
            return null;
        }

        public boolean contains(T element) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(element)) {
                    return true;
                }
            }
            return false;
        }

        public void clear() {
            array = (T[]) new Object[array.length];
            size = 0;
        }
    }
}
