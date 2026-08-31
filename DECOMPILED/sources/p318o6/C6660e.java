package p318o6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: renamed from: o6.e */
/* JADX INFO: loaded from: classes.dex */
final class C6660e {

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f24943b = AtomicIntegerFieldUpdater.newUpdater(C6660e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    private final InterfaceC6639V[] f24944a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: o6.e$a */
    private final class a extends AbstractC6605D0 {

        /* JADX INFO: renamed from: s */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f24945s = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e */
        private final InterfaceC6678n f24946e;

        /* JADX INFO: renamed from: f */
        public InterfaceC6661e0 f24947f;

        public a(InterfaceC6678n interfaceC6678n) {
            this.f24946e = interfaceC6678n;
        }

        /* JADX INFO: renamed from: B */
        public final void m28170B(b bVar) {
            f24945s.set(this, bVar);
        }

        /* JADX INFO: renamed from: C */
        public final void m28171C(InterfaceC6661e0 interfaceC6661e0) {
            this.f24947f = interfaceC6661e0;
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: v */
        public boolean mo27974v() {
            return false;
        }

        @Override // p318o6.AbstractC6605D0
        /* JADX INFO: renamed from: w */
        public void mo27975w(Throwable th) {
            if (th != null) {
                Object objMo28237f = this.f24946e.mo28237f(th);
                if (objMo28237f != null) {
                    this.f24946e.mo28239l(objMo28237f);
                    b bVarM28172y = m28172y();
                    if (bVarM28172y != null) {
                        bVarM28172y.m28175b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C6660e.m28167d().decrementAndGet(C6660e.this) == 0) {
                InterfaceC6678n interfaceC6678n = this.f24946e;
                InterfaceC6639V[] interfaceC6639VArr = C6660e.this.f24944a;
                ArrayList arrayList = new ArrayList(interfaceC6639VArr.length);
                for (InterfaceC6639V interfaceC6639V : interfaceC6639VArr) {
                    arrayList.add(interfaceC6639V.getCompleted());
                }
                interfaceC6678n.resumeWith(C1436n.m6073b(arrayList));
            }
        }

        /* JADX INFO: renamed from: y */
        public final b m28172y() {
            return (b) f24945s.get(this);
        }

        /* JADX INFO: renamed from: z */
        public final InterfaceC6661e0 m28173z() {
            InterfaceC6661e0 interfaceC6661e0 = this.f24947f;
            if (interfaceC6661e0 != null) {
                return interfaceC6661e0;
            }
            AbstractC6118n.m27197o("handle");
            return null;
        }
    }

    /* JADX INFO: renamed from: o6.e$b */
    private final class b implements InterfaceC6676m {

        /* JADX INFO: renamed from: a */
        private final a[] f24949a;

        public b(a[] aVarArr) {
            this.f24949a = aVarArr;
        }

        @Override // p318o6.InterfaceC6676m
        /* JADX INFO: renamed from: a */
        public void mo28174a(Throwable th) {
            m28175b();
        }

        /* JADX INFO: renamed from: b */
        public final void m28175b() {
            for (a aVar : this.f24949a) {
                aVar.m28173z().mo7954k();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f24949a + ']';
        }
    }

    public C6660e(InterfaceC6639V[] interfaceC6639VArr) {
        this.f24944a = interfaceC6639VArr;
        this.notCompletedCount$volatile = interfaceC6639VArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m28167d() {
        return f24943b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m28168c(InterfaceC1875e interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        int length = this.f24944a.length;
        a[] aVarArr = new a[length];
        for (int i7 = 0; i7 < length; i7++) {
            InterfaceC6639V interfaceC6639V = this.f24944a[i7];
            interfaceC6639V.start();
            a aVar = new a(c6682p);
            aVar.m28171C(AbstractC6603C0.m27970l(interfaceC6639V, false, aVar, 1, null));
            C1444v c1444v = C1444v.f4971a;
            aVarArr[i7] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i8 = 0; i8 < length; i8++) {
            aVarArr[i8].m28170B(bVar);
        }
        if (c6682p.isCompleted()) {
            bVar.m28175b();
        } else {
            AbstractC6686r.m28282c(c6682p, bVar);
        }
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y;
    }
}
