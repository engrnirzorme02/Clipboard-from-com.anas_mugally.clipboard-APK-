package p067I1;

import com.bumptech.glide.EnumC3207g;
import com.bumptech.glide.load.data.InterfaceC3219d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p019C1.C0132h;
import p019C1.EnumC0125a;
import p019C1.InterfaceC0130f;
import p035E1.C0296q;
import p104N.InterfaceC0907d;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: I1.q */
/* JADX INFO: loaded from: classes.dex */
class C0597q implements InterfaceC0594n {

    /* JADX INFO: renamed from: a */
    private final List f2281a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0907d f2282b;

    /* JADX INFO: renamed from: I1.q$a */
    static class a implements InterfaceC3219d, InterfaceC3219d.a {

        /* JADX INFO: renamed from: a */
        private final List f2283a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0907d f2284b;

        /* JADX INFO: renamed from: c */
        private int f2285c;

        /* JADX INFO: renamed from: d */
        private EnumC3207g f2286d;

        /* JADX INFO: renamed from: e */
        private InterfaceC3219d.a f2287e;

        /* JADX INFO: renamed from: f */
        private List f2288f;

        /* JADX INFO: renamed from: r */
        private boolean f2289r;

        a(List list, InterfaceC0907d interfaceC0907d) {
            this.f2284b = interfaceC0907d;
            AbstractC2022k.m8407d(list);
            this.f2283a = list;
            this.f2285c = 0;
        }

        /* JADX INFO: renamed from: g */
        private void m2623g() {
            if (this.f2289r) {
                return;
            }
            if (this.f2285c < this.f2283a.size() - 1) {
                this.f2285c++;
                mo933e(this.f2286d, this.f2287e);
            } else {
                AbstractC2022k.m8408e(this.f2288f);
                this.f2287e.mo1313c(new C0296q("Fetch failed", new ArrayList(this.f2288f)));
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: a */
        public Class mo930a() {
            return ((InterfaceC3219d) this.f2283a.get(0)).mo930a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: b */
        public void mo931b() {
            List list = this.f2288f;
            if (list != null) {
                this.f2284b.mo4130a(list);
            }
            this.f2288f = null;
            Iterator it = this.f2283a.iterator();
            while (it.hasNext()) {
                ((InterfaceC3219d) it.next()).mo931b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
        /* JADX INFO: renamed from: c */
        public void mo1313c(Exception exc) {
            ((List) AbstractC2022k.m8408e(this.f2288f)).add(exc);
            m2623g();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        public void cancel() {
            this.f2289r = true;
            Iterator it = this.f2283a.iterator();
            while (it.hasNext()) {
                ((InterfaceC3219d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: d */
        public EnumC0125a mo932d() {
            return ((InterfaceC3219d) this.f2283a.get(0)).mo932d();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d
        /* JADX INFO: renamed from: e */
        public void mo933e(EnumC3207g enumC3207g, InterfaceC3219d.a aVar) {
            this.f2286d = enumC3207g;
            this.f2287e = aVar;
            this.f2288f = (List) this.f2284b.mo4131b();
            ((InterfaceC3219d) this.f2283a.get(this.f2285c)).mo933e(enumC3207g, this);
            if (this.f2289r) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3219d.a
        /* JADX INFO: renamed from: f */
        public void mo1314f(Object obj) {
            if (obj != null) {
                this.f2287e.mo1314f(obj);
            } else {
                m2623g();
            }
        }
    }

    C0597q(List list, InterfaceC0907d interfaceC0907d) {
        this.f2281a = list;
        this.f2282b = interfaceC0907d;
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: a */
    public InterfaceC0594n.a mo2552a(Object obj, int i7, int i8, C0132h c0132h) {
        InterfaceC0594n.a aVarMo2552a;
        int size = this.f2281a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC0130f interfaceC0130f = null;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC0594n interfaceC0594n = (InterfaceC0594n) this.f2281a.get(i9);
            if (interfaceC0594n.mo2553b(obj) && (aVarMo2552a = interfaceC0594n.mo2552a(obj, i7, i8, c0132h)) != null) {
                interfaceC0130f = aVarMo2552a.f2274a;
                arrayList.add(aVarMo2552a.f2276c);
            }
        }
        if (arrayList.isEmpty() || interfaceC0130f == null) {
            return null;
        }
        return new InterfaceC0594n.a(interfaceC0130f, new a(arrayList, this.f2282b));
    }

    @Override // p067I1.InterfaceC0594n
    /* JADX INFO: renamed from: b */
    public boolean mo2553b(Object obj) {
        Iterator it = this.f2281a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0594n) it.next()).mo2553b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f2281a.toArray()) + '}';
    }
}
