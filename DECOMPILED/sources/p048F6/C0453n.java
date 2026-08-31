package p048F6;

import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p032D6.C0224e;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: F6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0453n {

    /* JADX INFO: renamed from: a */
    private final C0224e f1724a;

    /* JADX INFO: renamed from: b */
    private boolean f1725b;

    /* JADX INFO: renamed from: F6.n$a */
    /* synthetic */ class a extends AbstractC6116l implements InterfaceC5371p {
        a(Object obj) {
            super(2, obj, C0453n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        /* JADX INFO: renamed from: d */
        public final Boolean m1961d(InterfaceC0096d p7, int i7) {
            AbstractC6118n.m27187e(p7, "p0");
            return Boolean.valueOf(((C0453n) this.receiver).m1957e(p7, i7));
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m1961d((InterfaceC0096d) obj, ((Number) obj2).intValue());
        }
    }

    public C0453n(InterfaceC0096d descriptor) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        this.f1724a = new C0224e(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final boolean m1957e(InterfaceC0096d interfaceC0096d, int i7) {
        boolean z7 = !interfaceC0096d.mo379j(i7) && interfaceC0096d.mo378i(i7).mo372c();
        this.f1725b = z7;
        return z7;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1958b() {
        return this.f1725b;
    }

    /* JADX INFO: renamed from: c */
    public final void m1959c(int i7) {
        this.f1724a.m1130a(i7);
    }

    /* JADX INFO: renamed from: d */
    public final int m1960d() {
        return this.f1724a.m1131d();
    }
}
