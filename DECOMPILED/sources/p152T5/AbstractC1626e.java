package p152T5;

import java.util.AbstractCollection;
import java.util.Collection;
import p246f6.InterfaceC5443b;

/* JADX INFO: renamed from: T5.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1626e extends AbstractCollection implements Collection, InterfaceC5443b {
    protected AbstractC1626e() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6670a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo6670a();
    }
}
