package p216c2;

import p198a2.AbstractC2188d;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;
import p198a2.InterfaceC2193i;
import p198a2.InterfaceC2195k;

/* JADX INFO: renamed from: c2.s */
/* JADX INFO: loaded from: classes.dex */
final class C3003s implements InterfaceC2193i {

    /* JADX INFO: renamed from: a */
    private final AbstractC3000p f12416a;

    /* JADX INFO: renamed from: b */
    private final String f12417b;

    /* JADX INFO: renamed from: c */
    private final C2187c f12418c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC2192h f12419d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC3004t f12420e;

    C3003s(AbstractC3000p abstractC3000p, String str, C2187c c2187c, InterfaceC2192h interfaceC2192h, InterfaceC3004t interfaceC3004t) {
        this.f12416a = abstractC3000p;
        this.f12417b = str;
        this.f12418c = c2187c;
        this.f12419d = interfaceC2192h;
        this.f12420e = interfaceC3004t;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14967c(Exception exc) {
    }

    @Override // p198a2.InterfaceC2193i
    /* JADX INFO: renamed from: a */
    public void mo8931a(AbstractC2188d abstractC2188d, InterfaceC2195k interfaceC2195k) {
        this.f12420e.mo14969a(AbstractC2999o.m14962a().mo14927e(this.f12416a).mo14925c(abstractC2188d).mo14928f(this.f12417b).mo14926d(this.f12419d).mo14924b(this.f12418c).mo14923a(), interfaceC2195k);
    }

    @Override // p198a2.InterfaceC2193i
    /* JADX INFO: renamed from: b */
    public void mo8932b(AbstractC2188d abstractC2188d) {
        mo8931a(abstractC2188d, new InterfaceC2195k() { // from class: c2.r
            @Override // p198a2.InterfaceC2195k
            /* JADX INFO: renamed from: a */
            public final void mo8934a(Exception exc) {
                C3003s.m14967c(exc);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    AbstractC3000p m14968d() {
        return this.f12416a;
    }
}
