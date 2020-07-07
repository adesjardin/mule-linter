package org.apache.groovy.json.internal;

import java.util.ArrayList;

public class JsonArray<T> extends ArrayList {

    @Override
    public int indexOf(Object o) {
        Object a = o;
        if(o instanceof String) {
            return super.indexOf(new JsonString((String)o, 0));
        } else if(o instanceof Boolean) {
            return super.indexOf(new JsonBoolean((Boolean)o, 0));
        } else if(o == null) {
            int idx = super.indexOf(new JsonNull(0));
            return idx;
        } else if(o instanceof Number) {
            return super.indexOf(new JsonNumber((Number)o, 0));
        }

        return super.indexOf(o);
    }
}
