package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
class C2537x implements Iterator {

    /* JADX INFO: renamed from: a */
    private Iterator f9745a;

    public C2537x(Iterator it) {
        this.f9745a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f9745a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9745a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f9745a.remove();
    }
}
