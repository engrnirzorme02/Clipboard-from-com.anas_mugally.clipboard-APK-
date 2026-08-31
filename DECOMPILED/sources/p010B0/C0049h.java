package p010B0;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p018C0.C0123b;
import p145S5.C1444v;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: B0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0049h {

    /* JADX INFO: renamed from: c */
    public static final a f384c = new a(null);

    /* JADX INFO: renamed from: a */
    private final C0123b f385a;

    /* JADX INFO: renamed from: b */
    private final C0047f f386b;

    /* JADX INFO: renamed from: B0.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final C1444v m196c(InterfaceC0050i interfaceC0050i) {
            interfaceC0050i.mo419P().mo12625a(new C0043b(interfaceC0050i));
            return C1444v.f4971a;
        }

        /* JADX INFO: renamed from: b */
        public final C0049h m197b(final InterfaceC0050i owner) {
            AbstractC6118n.m27187e(owner, "owner");
            return new C0049h(new C0123b(owner, new InterfaceC5356a() { // from class: B0.g
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C0049h.a.m196c(owner);
                }
            }), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C0049h(C0123b c0123b, AbstractC6112h abstractC6112h) {
        this(c0123b);
    }

    /* JADX INFO: renamed from: a */
    public static final C0049h m190a(InterfaceC0050i interfaceC0050i) {
        return f384c.m197b(interfaceC0050i);
    }

    /* JADX INFO: renamed from: b */
    public final C0047f m191b() {
        return this.f386b;
    }

    /* JADX INFO: renamed from: c */
    public final void m192c() {
        this.f385a.m582f();
    }

    /* JADX INFO: renamed from: d */
    public final void m193d(Bundle bundle) {
        this.f385a.m583h(bundle);
    }

    /* JADX INFO: renamed from: e */
    public final void m194e(Bundle outBundle) {
        AbstractC6118n.m27187e(outBundle, "outBundle");
        this.f385a.m584i(outBundle);
    }

    private C0049h(C0123b c0123b) {
        this.f385a = c0123b;
        this.f386b = new C0047f(c0123b);
    }
}
