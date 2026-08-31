package p063H5;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Iterator;
import java.util.List;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549j {

    /* JADX INFO: renamed from: a */
    private static final AbstractC0543g f2086a = new a();

    /* JADX INFO: renamed from: H5.j$a */
    class a extends AbstractC0543g {
        a() {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: a */
        public void mo2118a(String str, Throwable th) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: b */
        public void mo2119b() {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: c */
        public void mo2120c(int i7) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: d */
        public void mo2121d(Object obj) {
        }

        @Override // p063H5.AbstractC0543g
        /* JADX INFO: renamed from: e */
        public void mo2122e(AbstractC0543g.a aVar, C0530Z c0530z) {
        }
    }

    /* JADX INFO: renamed from: H5.j$b */
    private static class b extends AbstractC0537d {

        /* JADX INFO: renamed from: a */
        private final AbstractC0537d f2087a;

        /* synthetic */ b(AbstractC0537d abstractC0537d, InterfaceC0545h interfaceC0545h, AbstractC0547i abstractC0547i) {
            this(abstractC0537d, interfaceC0545h);
        }

        @Override // p063H5.AbstractC0537d
        /* JADX INFO: renamed from: a */
        public String mo2404a() {
            return this.f2087a.mo2404a();
        }

        @Override // p063H5.AbstractC0537d
        /* JADX INFO: renamed from: f */
        public AbstractC0543g mo2405f(C0532a0 c0532a0, C0535c c0535c) {
            throw null;
        }

        private b(AbstractC0537d abstractC0537d, InterfaceC0545h interfaceC0545h) {
            this.f2087a = abstractC0537d;
            AbstractC2263x.m9328a(AbstractC1209m.m5303o(interfaceC0545h, "interceptor"));
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0537d m2426a(AbstractC0537d abstractC0537d, List list) {
        AbstractC1209m.m5303o(abstractC0537d, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            AbstractC0547i abstractC0547i = null;
            abstractC0537d = new b(abstractC0537d, abstractC0547i, abstractC0547i);
        }
        return abstractC0537d;
    }
}
