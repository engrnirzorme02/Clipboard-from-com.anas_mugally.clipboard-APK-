package p187Y5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1625d;
import p152T5.AbstractC1631j;

/* JADX INFO: renamed from: Y5.c */
/* JADX INFO: loaded from: classes.dex */
final class C2061c extends AbstractC1625d implements InterfaceC2059a, Serializable {

    /* JADX INFO: renamed from: b */
    private final Enum[] f6787b;

    public C2061c(Enum[] entries) {
        AbstractC6118n.m27187e(entries, "entries");
        this.f6787b = entries;
    }

    @Override // p152T5.AbstractC1623b
    /* JADX INFO: renamed from: b */
    public int mo3154b() {
        return this.f6787b.length;
    }

    @Override // p152T5.AbstractC1623b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return m8525g((Enum) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m8525g(Enum element) {
        AbstractC6118n.m27187e(element, "element");
        return ((Enum) AbstractC1631j.m6750w(this.f6787b, element.ordinal())) == element;
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return m8527m((Enum) obj);
        }
        return -1;
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Enum get(int i7) {
        AbstractC1625d.f5389a.m6662b(i7, this.f6787b.length);
        return this.f6787b[i7];
    }

    @Override // p152T5.AbstractC1625d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m8528n((Enum) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public int m8527m(Enum element) {
        AbstractC6118n.m27187e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC1631j.m6750w(this.f6787b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public int m8528n(Enum element) {
        AbstractC6118n.m27187e(element, "element");
        return indexOf(element);
    }
}
