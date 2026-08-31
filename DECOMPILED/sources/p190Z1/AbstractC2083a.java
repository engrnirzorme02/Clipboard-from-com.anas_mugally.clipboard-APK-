package p190Z1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p104N.C0909f;
import p104N.InterfaceC0907d;

/* JADX INFO: renamed from: Z1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2083a {

    /* JADX INFO: renamed from: a */
    private static final g f6869a = new a();

    /* JADX INFO: renamed from: Z1.a$a */
    class a implements g {
        a() {
        }

        @Override // p190Z1.AbstractC2083a.g
        /* JADX INFO: renamed from: a */
        public void mo8601a(Object obj) {
        }
    }

    /* JADX INFO: renamed from: Z1.a$b */
    class b implements d {
        b() {
        }

        @Override // p190Z1.AbstractC2083a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List mo1408a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: Z1.a$c */
    class c implements g {
        c() {
        }

        @Override // p190Z1.AbstractC2083a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo8601a(List list) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: Z1.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        Object mo1408a();
    }

    /* JADX INFO: renamed from: Z1.a$e */
    private static final class e implements InterfaceC0907d {

        /* JADX INFO: renamed from: a */
        private final d f6870a;

        /* JADX INFO: renamed from: b */
        private final g f6871b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0907d f6872c;

        e(InterfaceC0907d interfaceC0907d, d dVar, g gVar) {
            this.f6872c = interfaceC0907d;
            this.f6870a = dVar;
            this.f6871b = gVar;
        }

        @Override // p104N.InterfaceC0907d
        /* JADX INFO: renamed from: a */
        public boolean mo4130a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).mo1368j().mo8611b(true);
            }
            this.f6871b.mo8601a(obj);
            return this.f6872c.mo4130a(obj);
        }

        @Override // p104N.InterfaceC0907d
        /* JADX INFO: renamed from: b */
        public Object mo4131b() {
            Object objMo4131b = this.f6872c.mo4131b();
            if (objMo4131b == null) {
                objMo4131b = this.f6870a.mo1408a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objMo4131b.getClass());
                }
            }
            if (objMo4131b instanceof f) {
                ((f) objMo4131b).mo1368j().mo8611b(false);
            }
            return objMo4131b;
        }
    }

    /* JADX INFO: renamed from: Z1.a$f */
    public interface f {
        /* JADX INFO: renamed from: j */
        AbstractC2085c mo1368j();
    }

    /* JADX INFO: renamed from: Z1.a$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo8601a(Object obj);
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC0907d m8595a(InterfaceC0907d interfaceC0907d, d dVar) {
        return m8596b(interfaceC0907d, dVar, m8597c());
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC0907d m8596b(InterfaceC0907d interfaceC0907d, d dVar, g gVar) {
        return new e(interfaceC0907d, dVar, gVar);
    }

    /* JADX INFO: renamed from: c */
    private static g m8597c() {
        return f6869a;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0907d m8598d(int i7, d dVar) {
        return m8595a(new C0909f(i7), dVar);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC0907d m8599e() {
        return m8600f(20);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0907d m8600f(int i7) {
        return m8596b(new C0909f(i7), new b(), new c());
    }
}
