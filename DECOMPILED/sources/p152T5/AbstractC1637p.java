package p152T5;

import java.util.Iterator;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: T5.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1637p implements Iterator, InterfaceC5442a {
    /* JADX INFO: renamed from: a */
    public abstract char mo6755a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo6755a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
