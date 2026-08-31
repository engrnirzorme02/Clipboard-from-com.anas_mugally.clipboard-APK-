package p152T5;

import java.util.AbstractSet;
import java.util.Set;
import p246f6.InterfaceC5443b;

/* JADX INFO: renamed from: T5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1628g extends AbstractSet implements Set, InterfaceC5443b {
    protected AbstractC1628g() {
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6673a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return mo6673a();
    }
}
