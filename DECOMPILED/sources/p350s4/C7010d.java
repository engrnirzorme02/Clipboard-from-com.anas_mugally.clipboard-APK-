package p350s4;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: s4.d */
/* JADX INFO: loaded from: classes.dex */
public class C7010d implements Iterator {

    /* JADX INFO: renamed from: a */
    private final ArrayDeque f28023a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    private final boolean f28024b;

    C7010d(InterfaceC7014h interfaceC7014h, Object obj, Comparator comparator, boolean z7) {
        this.f28024b = z7;
        while (!interfaceC7014h.isEmpty()) {
            int iCompare = obj != null ? z7 ? comparator.compare(obj, interfaceC7014h.getKey()) : comparator.compare(interfaceC7014h.getKey(), obj) : 1;
            if (iCompare < 0) {
                interfaceC7014h = z7 ? interfaceC7014h.mo30629a() : interfaceC7014h.mo30634g();
            } else if (iCompare == 0) {
                this.f28023a.push((AbstractC7016j) interfaceC7014h);
                return;
            } else {
                this.f28023a.push((AbstractC7016j) interfaceC7014h);
                interfaceC7014h = z7 ? interfaceC7014h.mo30634g() : interfaceC7014h.mo30629a();
            }
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        try {
            AbstractC7016j abstractC7016j = (AbstractC7016j) this.f28023a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(abstractC7016j.getKey(), abstractC7016j.getValue());
            if (this.f28024b) {
                for (InterfaceC7014h interfaceC7014hMo30629a = abstractC7016j.mo30629a(); !interfaceC7014hMo30629a.isEmpty(); interfaceC7014hMo30629a = interfaceC7014hMo30629a.mo30634g()) {
                    this.f28023a.push((AbstractC7016j) interfaceC7014hMo30629a);
                }
            } else {
                for (InterfaceC7014h interfaceC7014hMo30634g = abstractC7016j.mo30634g(); !interfaceC7014hMo30634g.isEmpty(); interfaceC7014hMo30634g = interfaceC7014hMo30634g.mo30629a()) {
                    this.f28023a.push((AbstractC7016j) interfaceC7014hMo30634g);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f28023a.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
