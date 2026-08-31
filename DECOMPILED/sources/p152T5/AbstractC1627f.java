package p152T5;

import java.util.AbstractList;
import java.util.List;
import p246f6.InterfaceC5444c;

/* JADX INFO: renamed from: T5.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1627f extends AbstractList implements List, InterfaceC5444c {
    protected AbstractC1627f() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6671a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo6672b(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return mo6672b(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo6671a();
    }
}
