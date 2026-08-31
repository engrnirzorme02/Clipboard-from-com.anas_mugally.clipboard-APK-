package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C2401l;
import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.C2611C;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.C2637b0;
import androidx.lifecycle.InterfaceC2612D;
import androidx.lifecycle.InterfaceC2657s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p322p0.AbstractC6716b;

/* JADX INFO: renamed from: androidx.loader.app.b */
/* JADX INFO: loaded from: classes.dex */
class C2666b extends AbstractC2665a {

    /* JADX INFO: renamed from: c */
    static boolean f10523c = false;

    /* JADX INFO: renamed from: a */
    private final InterfaceC2657s f10524a;

    /* JADX INFO: renamed from: b */
    private final c f10525b;

    /* JADX INFO: renamed from: androidx.loader.app.b$a */
    public static class a extends C2611C implements AbstractC6716b.a {

        /* JADX INFO: renamed from: l */
        private final int f10526l;

        /* JADX INFO: renamed from: m */
        private final Bundle f10527m;

        /* JADX INFO: renamed from: n */
        private final AbstractC6716b f10528n;

        /* JADX INFO: renamed from: o */
        private InterfaceC2657s f10529o;

        /* JADX INFO: renamed from: p */
        private b f10530p;

        /* JADX INFO: renamed from: q */
        private AbstractC6716b f10531q;

        a(int i7, Bundle bundle, AbstractC6716b abstractC6716b, AbstractC6716b abstractC6716b2) {
            this.f10526l = i7;
            this.f10527m = bundle;
            this.f10528n = abstractC6716b;
            this.f10531q = abstractC6716b2;
            abstractC6716b.m29522r(i7, this);
        }

        @Override // p322p0.AbstractC6716b.a
        /* JADX INFO: renamed from: a */
        public void mo12689a(AbstractC6716b abstractC6716b, Object obj) {
            if (C2666b.f10523c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo12526q(obj);
                return;
            }
            if (C2666b.f10523c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo12525o(obj);
        }

        @Override // androidx.lifecycle.AbstractC2664z
        /* JADX INFO: renamed from: m */
        protected void mo12520m() {
            if (C2666b.f10523c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f10528n.m29525u();
        }

        @Override // androidx.lifecycle.AbstractC2664z
        /* JADX INFO: renamed from: n */
        protected void mo12521n() {
            if (C2666b.f10523c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f10528n.m29526v();
        }

        @Override // androidx.lifecycle.AbstractC2664z
        /* JADX INFO: renamed from: p */
        public void mo12676p(InterfaceC2612D interfaceC2612D) {
            super.mo12676p(interfaceC2612D);
            this.f10529o = null;
            this.f10530p = null;
        }

        @Override // androidx.lifecycle.C2611C, androidx.lifecycle.AbstractC2664z
        /* JADX INFO: renamed from: q */
        public void mo12526q(Object obj) {
            super.mo12526q(obj);
            AbstractC6716b abstractC6716b = this.f10531q;
            if (abstractC6716b != null) {
                abstractC6716b.m29523s();
                this.f10531q = null;
            }
        }

        /* JADX INFO: renamed from: r */
        AbstractC6716b m12690r(boolean z7) {
            if (C2666b.f10523c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f10528n.m29510b();
            this.f10528n.m29509a();
            b bVar = this.f10530p;
            if (bVar != null) {
                mo12676p(bVar);
                if (z7) {
                    bVar.m12697d();
                }
            }
            this.f10528n.m29527w(this);
            if ((bVar == null || bVar.m12696c()) && !z7) {
                return this.f10528n;
            }
            this.f10528n.m29523s();
            return this.f10531q;
        }

        /* JADX INFO: renamed from: s */
        public void m12691s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10526l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10527m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f10528n);
            this.f10528n.mo29500g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f10530p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f10530p);
                this.f10530p.m12695a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m12692t().m29512d(m12669f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m12671h());
        }

        /* JADX INFO: renamed from: t */
        AbstractC6716b m12692t() {
            return this.f10528n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f10526l);
            sb.append(" : ");
            Class<?> cls = this.f10528n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: u */
        void m12693u() {
            InterfaceC2657s interfaceC2657s = this.f10529o;
            b bVar = this.f10530p;
            if (interfaceC2657s == null || bVar == null) {
                return;
            }
            super.mo12676p(bVar);
            m12674k(interfaceC2657s, bVar);
        }

        /* JADX INFO: renamed from: v */
        AbstractC6716b m12694v(InterfaceC2657s interfaceC2657s, AbstractC2665a.a aVar) {
            b bVar = new b(this.f10528n, aVar);
            m12674k(interfaceC2657s, bVar);
            InterfaceC2612D interfaceC2612D = this.f10530p;
            if (interfaceC2612D != null) {
                mo12676p(interfaceC2612D);
            }
            this.f10529o = interfaceC2657s;
            this.f10530p = bVar;
            return this.f10528n;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b */
    static class b implements InterfaceC2612D {

        /* JADX INFO: renamed from: a */
        private final AbstractC6716b f10532a;

        /* JADX INFO: renamed from: b */
        private final AbstractC2665a.a f10533b;

        /* JADX INFO: renamed from: c */
        private boolean f10534c = false;

        b(AbstractC6716b abstractC6716b, AbstractC2665a.a aVar) {
            this.f10532a = abstractC6716b;
            this.f10533b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m12695a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f10534c);
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public void mo12097b(Object obj) {
            if (C2666b.f10523c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f10532a + ": " + this.f10532a.m29512d(obj));
            }
            this.f10534c = true;
            this.f10533b.mo12687c(this.f10532a, obj);
        }

        /* JADX INFO: renamed from: c */
        boolean m12696c() {
            return this.f10534c;
        }

        /* JADX INFO: renamed from: d */
        void m12697d() {
            if (this.f10534c) {
                if (C2666b.f10523c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f10532a);
                }
                this.f10533b.mo12685a(this.f10532a);
            }
        }

        public String toString() {
            return this.f10533b.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$c */
    static class c extends AbstractC2632Y {

        /* JADX INFO: renamed from: d */
        private static final C2635a0.c f10535d = new a();

        /* JADX INFO: renamed from: b */
        private C2401l f10536b = new C2401l();

        /* JADX INFO: renamed from: c */
        private boolean f10537c = false;

        /* JADX INFO: renamed from: androidx.loader.app.b$c$a */
        static class a implements C2635a0.c {
            a() {
            }

            @Override // androidx.lifecycle.C2635a0.c
            /* JADX INFO: renamed from: a */
            public AbstractC2632Y mo12451a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        /* JADX INFO: renamed from: g */
        static c m12698g(C2637b0 c2637b0) {
            return (c) new C2635a0(c2637b0, f10535d).m12591a(c.class);
        }

        @Override // androidx.lifecycle.AbstractC2632Y
        /* JADX INFO: renamed from: d */
        protected void mo12439d() {
            super.mo12439d();
            int iM10309h = this.f10536b.m10309h();
            for (int i7 = 0; i7 < iM10309h; i7++) {
                ((a) this.f10536b.m10310i(i7)).m12690r(true);
            }
            this.f10536b.m10303b();
        }

        /* JADX INFO: renamed from: e */
        public void m12699e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10536b.m10309h() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i7 = 0; i7 < this.f10536b.m10309h(); i7++) {
                    a aVar = (a) this.f10536b.m10310i(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10536b.m10307f(i7));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.m12691s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        void m12700f() {
            this.f10537c = false;
        }

        /* JADX INFO: renamed from: h */
        a m12701h(int i7) {
            return (a) this.f10536b.m10305d(i7);
        }

        /* JADX INFO: renamed from: i */
        boolean m12702i() {
            return this.f10537c;
        }

        /* JADX INFO: renamed from: j */
        void m12703j() {
            int iM10309h = this.f10536b.m10309h();
            for (int i7 = 0; i7 < iM10309h; i7++) {
                ((a) this.f10536b.m10310i(i7)).m12693u();
            }
        }

        /* JADX INFO: renamed from: k */
        void m12704k(int i7, a aVar) {
            this.f10536b.m10308g(i7, aVar);
        }

        /* JADX INFO: renamed from: l */
        void m12705l() {
            this.f10537c = true;
        }
    }

    C2666b(InterfaceC2657s interfaceC2657s, C2637b0 c2637b0) {
        this.f10524a = interfaceC2657s;
        this.f10525b = c.m12698g(c2637b0);
    }

    /* JADX INFO: renamed from: e */
    private AbstractC6716b m12688e(int i7, Bundle bundle, AbstractC2665a.a aVar, AbstractC6716b abstractC6716b) {
        try {
            this.f10525b.m12705l();
            AbstractC6716b abstractC6716bMo12686b = aVar.mo12686b(i7, bundle);
            if (abstractC6716bMo12686b == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (abstractC6716bMo12686b.getClass().isMemberClass() && !Modifier.isStatic(abstractC6716bMo12686b.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + abstractC6716bMo12686b);
            }
            a aVar2 = new a(i7, bundle, abstractC6716bMo12686b, abstractC6716b);
            if (f10523c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f10525b.m12704k(i7, aVar2);
            this.f10525b.m12700f();
            return aVar2.m12694v(this.f10524a, aVar);
        } catch (Throwable th) {
            this.f10525b.m12700f();
            throw th;
        }
    }

    @Override // androidx.loader.app.AbstractC2665a
    /* JADX INFO: renamed from: a */
    public void mo12682a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10525b.m12699e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC2665a
    /* JADX INFO: renamed from: c */
    public AbstractC6716b mo12683c(int i7, Bundle bundle, AbstractC2665a.a aVar) {
        if (this.f10525b.m12702i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarM12701h = this.f10525b.m12701h(i7);
        if (f10523c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarM12701h == null) {
            return m12688e(i7, bundle, aVar, null);
        }
        if (f10523c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarM12701h);
        }
        return aVarM12701h.m12694v(this.f10524a, aVar);
    }

    @Override // androidx.loader.app.AbstractC2665a
    /* JADX INFO: renamed from: d */
    public void mo12684d() {
        this.f10525b.m12703j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f10524a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
