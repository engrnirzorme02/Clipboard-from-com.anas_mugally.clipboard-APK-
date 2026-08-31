package androidx.lifecycle;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6100C;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.C0047f;
import p010B0.InterfaceC0050i;
import p286k6.InterfaceC6077c;
import p304n0.AbstractC6428a;

/* JADX INFO: renamed from: androidx.lifecycle.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2622N {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6428a.c f10416a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC6428a.c f10417b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC6428a.c f10418c;

    /* JADX INFO: renamed from: androidx.lifecycle.N$a */
    public static final class a implements C2635a0.c {
        a() {
        }

        @Override // androidx.lifecycle.C2635a0.c
        /* JADX INFO: renamed from: b */
        public AbstractC2632Y mo12562b(InterfaceC6077c modelClass, AbstractC6428a extras) {
            AbstractC6118n.m27187e(modelClass, "modelClass");
            AbstractC6118n.m27187e(extras, "extras");
            return new C2625Q();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.N$b */
    public static final class b implements AbstractC6428a.c {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.N$c */
    public static final class c implements AbstractC6428a.c {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.N$d */
    public static final class d implements AbstractC6428a.c {
    }

    static {
        AbstractC6428a.a aVar = AbstractC6428a.f24470b;
        f10416a = new b();
        f10417b = new c();
        f10418c = new d();
    }

    /* JADX INFO: renamed from: a */
    private static final C2619K m12557a(InterfaceC0050i interfaceC0050i, InterfaceC2639c0 interfaceC2639c0, String str, Bundle bundle) {
        C2624P c2624pM12560d = m12560d(interfaceC0050i);
        C2625Q c2625qM12561e = m12561e(interfaceC2639c0);
        C2619K c2619k = (C2619K) c2625qM12561e.m12569e().get(str);
        if (c2619k != null) {
            return c2619k;
        }
        C2619K c2619kM12553a = C2619K.f10409c.m12553a(c2624pM12560d.m12566c(str), bundle);
        c2625qM12561e.m12569e().put(str, c2619kM12553a);
        return c2619kM12553a;
    }

    /* JADX INFO: renamed from: b */
    public static final C2619K m12558b(AbstractC6428a abstractC6428a) {
        AbstractC6118n.m27187e(abstractC6428a, "<this>");
        InterfaceC0050i interfaceC0050i = (InterfaceC0050i) abstractC6428a.mo27640a(f10416a);
        if (interfaceC0050i == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC2639c0 interfaceC2639c0 = (InterfaceC2639c0) abstractC6428a.mo27640a(f10417b);
        if (interfaceC2639c0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC6428a.mo27640a(f10418c);
        String str = (String) abstractC6428a.mo27640a(C2635a0.f10444c);
        if (str != null) {
            return m12557a(interfaceC0050i, interfaceC2639c0, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* JADX INFO: renamed from: c */
    public static final void m12559c(InterfaceC0050i interfaceC0050i) {
        AbstractC6118n.m27187e(interfaceC0050i, "<this>");
        AbstractC2650l.b bVarMo12626b = interfaceC0050i.mo419P().mo12626b();
        if (bVarMo12626b != AbstractC2650l.b.INITIALIZED && bVarMo12626b != AbstractC2650l.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC0050i.mo198A().m186b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C2624P c2624p = new C2624P(interfaceC0050i.mo198A(), (InterfaceC2639c0) interfaceC0050i);
            interfaceC0050i.mo198A().m187c("androidx.lifecycle.internal.SavedStateHandlesProvider", c2624p);
            interfaceC0050i.mo419P().mo12625a(new C2620L(c2624p));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C2624P m12560d(InterfaceC0050i interfaceC0050i) {
        AbstractC6118n.m27187e(interfaceC0050i, "<this>");
        C0047f.b bVarM186b = interfaceC0050i.mo198A().m186b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C2624P c2624p = bVarM186b instanceof C2624P ? (C2624P) bVarM186b : null;
        if (c2624p != null) {
            return c2624p;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* JADX INFO: renamed from: e */
    public static final C2625Q m12561e(InterfaceC2639c0 interfaceC2639c0) {
        AbstractC6118n.m27187e(interfaceC2639c0, "<this>");
        return (C2625Q) C2635a0.b.m12598b(C2635a0.f10443b, interfaceC2639c0, new a(), null, 4, null).m12592b("androidx.lifecycle.internal.SavedStateHandlesVM", AbstractC6100C.m27139b(C2625Q.class));
    }
}
