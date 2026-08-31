package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.G */
/* JADX INFO: loaded from: classes.dex */
class C5069G implements Iterator {

    /* JADX INFO: renamed from: a */
    private Iterator f19327a;

    public C5069G(Iterator it) {
        this.f19327a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f19327a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19327a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f19327a.remove();
    }
}
