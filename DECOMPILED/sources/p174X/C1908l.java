package p174X;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1434l;
import p344r6.AbstractC6935t;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6929n;

/* JADX INFO: renamed from: X.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1908l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6929n f6276a;

    public C1908l() {
        C1893M c1893m = C1893M.f6096b;
        AbstractC6118n.m27185c(c1893m, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f6276a = AbstractC6935t.m30402a(c1893m);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1889I m7909a() {
        return (AbstractC1889I) this.f6276a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6918c m7910b() {
        return this.f6276a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX INFO: renamed from: c */
    public final AbstractC1889I m7911c(AbstractC1889I newState) {
        Object value;
        AbstractC1889I abstractC1889I;
        AbstractC6118n.m27187e(newState, "newState");
        InterfaceC6929n interfaceC6929n = this.f6276a;
        do {
            value = interfaceC6929n.getValue();
            abstractC1889I = (AbstractC1889I) value;
            if (abstractC1889I instanceof C1882B ? true : AbstractC6118n.m27183a(abstractC1889I, C1893M.f6096b)) {
                abstractC1889I = newState;
            } else if (abstractC1889I instanceof C1902f) {
                if (newState.m7823a() > abstractC1889I.m7823a()) {
                    abstractC1889I = newState;
                }
            } else if (!(abstractC1889I instanceof C1914r)) {
                throw new C1434l();
            }
        } while (!interfaceC6929n.mo30393b(value, abstractC1889I));
        return abstractC1889I;
    }
}
