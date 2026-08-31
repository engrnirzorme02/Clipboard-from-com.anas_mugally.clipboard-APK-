package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.gson.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5027f extends AbstractC5028g implements Iterable {

    /* JADX INFO: renamed from: a */
    private final ArrayList f19085a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C5027f) && ((C5027f) obj).f19085a.equals(this.f19085a);
        }
        return true;
    }

    public int hashCode() {
        return this.f19085a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f19085a.iterator();
    }

    /* JADX INFO: renamed from: n */
    public void m22651n(AbstractC5028g abstractC5028g) {
        if (abstractC5028g == null) {
            abstractC5028g = C5030i.f19086a;
        }
        this.f19085a.add(abstractC5028g);
    }
}
