package p129Q3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Q3.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1268g extends AbstractC1269h implements Map {
    protected AbstractC1268g() {
    }

    /* JADX INFO: renamed from: b */
    protected abstract Map mo5423b();

    @Override // java.util.Map
    public void clear() {
        mo5423b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo5423b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo5423b().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return mo5423b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo5423b().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo5423b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo5423b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo5423b().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return mo5423b().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return mo5423b().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        mo5423b().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return mo5423b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo5423b().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return mo5423b().values();
    }
}
