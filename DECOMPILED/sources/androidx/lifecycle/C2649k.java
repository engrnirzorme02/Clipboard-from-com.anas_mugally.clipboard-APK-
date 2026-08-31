package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.C0047f;
import p010B0.InterfaceC0050i;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2649k {

    /* JADX INFO: renamed from: a */
    public static final C2649k f10468a = new C2649k();

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    public static final class a implements C0047f.a {
        @Override // p010B0.C0047f.a
        /* JADX INFO: renamed from: a */
        public void mo189a(InterfaceC0050i owner) {
            AbstractC6118n.m27187e(owner, "owner");
            if (!(owner instanceof InterfaceC2639c0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            C2637b0 c2637b0Mo11963v = ((InterfaceC2639c0) owner).mo11963v();
            C0047f c0047fMo198A = owner.mo198A();
            Iterator it = c2637b0Mo11963v.m12606c().iterator();
            while (it.hasNext()) {
                AbstractC2632Y abstractC2632YM12605b = c2637b0Mo11963v.m12605b((String) it.next());
                if (abstractC2632YM12605b != null) {
                    C2649k.m12622a(abstractC2632YM12605b, c0047fMo198A, owner.mo419P());
                }
            }
            if (c2637b0Mo11963v.m12606c().isEmpty()) {
                return;
            }
            c0047fMo198A.m188d(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    public static final class b implements InterfaceC2654p {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2650l f10469a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C0047f f10470b;

        b(AbstractC2650l abstractC2650l, C0047f c0047f) {
            this.f10469a = abstractC2650l;
            this.f10470b = c0047f;
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
            AbstractC6118n.m27187e(source, "source");
            AbstractC6118n.m27187e(event, "event");
            if (event == AbstractC2650l.a.ON_START) {
                this.f10469a.mo12628d(this);
                this.f10470b.m188d(a.class);
            }
        }
    }

    private C2649k() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m12622a(AbstractC2632Y viewModel, C0047f registry, AbstractC2650l lifecycle) {
        AbstractC6118n.m27187e(viewModel, "viewModel");
        AbstractC6118n.m27187e(registry, "registry");
        AbstractC6118n.m27187e(lifecycle, "lifecycle");
        C2621M c2621m = (C2621M) viewModel.m12589c("androidx.lifecycle.savedstate.vm.tag");
        if (c2621m == null || c2621m.m12556d0()) {
            return;
        }
        c2621m.m12554J(registry, lifecycle);
        f10468a.m12624c(registry, lifecycle);
    }

    /* JADX INFO: renamed from: b */
    public static final C2621M m12623b(C0047f registry, AbstractC2650l lifecycle, String str, Bundle bundle) {
        AbstractC6118n.m27187e(registry, "registry");
        AbstractC6118n.m27187e(lifecycle, "lifecycle");
        AbstractC6118n.m27184b(str);
        C2621M c2621m = new C2621M(str, C2619K.f10409c.m12553a(registry.m185a(str), bundle));
        c2621m.m12554J(registry, lifecycle);
        f10468a.m12624c(registry, lifecycle);
        return c2621m;
    }

    /* JADX INFO: renamed from: c */
    private final void m12624c(C0047f c0047f, AbstractC2650l abstractC2650l) {
        AbstractC2650l.b bVarMo12626b = abstractC2650l.mo12626b();
        if (bVarMo12626b == AbstractC2650l.b.INITIALIZED || bVarMo12626b.m12634d(AbstractC2650l.b.STARTED)) {
            c0047f.m188d(a.class);
        } else {
            abstractC2650l.mo12625a(new b(abstractC2650l, c0047f));
        }
    }
}
