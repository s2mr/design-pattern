/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3ii.iterator;

/**
 *
 * @author kaz
 */
public class NameRepository implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

//    NameRepository() {
//    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
