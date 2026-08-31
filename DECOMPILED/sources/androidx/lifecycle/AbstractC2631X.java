package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6128x;
import kotlin.jvm.internal.InterfaceC6113i;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: androidx.lifecycle.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2631X {

    /* JADX INFO: renamed from: androidx.lifecycle.X$a */
    static final class a implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f10440a;

        a(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f10440a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f10440a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f10440a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2612D) && (obj instanceof InterfaceC6113i)) {
                return AbstractC6118n.m27183a(mo12586a(), ((InterfaceC6113i) obj).mo12586a());
            }
            return false;
        }

        public final int hashCode() {
            return mo12586a().hashCode();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2664z m12584b(AbstractC2664z abstractC2664z) {
        final C2609A c2609a;
        AbstractC6118n.m27187e(abstractC2664z, "<this>");
        final C6128x c6128x = new C6128x();
        c6128x.f23885a = true;
        if (abstractC2664z.m12673j()) {
            c6128x.f23885a = false;
            c2609a = new C2609A(abstractC2664z.m12669f());
        } else {
            c2609a = new C2609A();
        }
        c2609a.m12522r(abstractC2664z, new a(new InterfaceC5367l() { // from class: androidx.lifecycle.W
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractC2631X.m12585c(c2609a, c6128x, obj);
            }
        }));
        return c2609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C1444v m12585c(C2609A c2609a, C6128x c6128x, Object obj) {
        Object objM12669f = c2609a.m12669f();
        if (c6128x.f23885a || ((objM12669f == null && obj != null) || (objM12669f != null && !AbstractC6118n.m27183a(objM12669f, obj)))) {
            c6128x.f23885a = false;
            c2609a.mo12526q(obj);
        }
        return C1444v.f4971a;
    }
}
