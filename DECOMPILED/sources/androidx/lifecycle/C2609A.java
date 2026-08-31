package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p311o.C6510b;

/* JADX INFO: renamed from: androidx.lifecycle.A */
/* JADX INFO: loaded from: classes.dex */
public class C2609A extends C2611C {

    /* JADX INFO: renamed from: l */
    private C6510b f10387l;

    /* JADX INFO: renamed from: androidx.lifecycle.A$a */
    private static class a implements InterfaceC2612D {

        /* JADX INFO: renamed from: a */
        final AbstractC2664z f10388a;

        /* JADX INFO: renamed from: b */
        final InterfaceC2612D f10389b;

        /* JADX INFO: renamed from: c */
        int f10390c = -1;

        a(AbstractC2664z abstractC2664z, InterfaceC2612D interfaceC2612D) {
            this.f10388a = abstractC2664z;
            this.f10389b = interfaceC2612D;
        }

        /* JADX INFO: renamed from: a */
        void m12523a() {
            this.f10388a.m12675l(this);
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public void mo12097b(Object obj) {
            if (this.f10390c != this.f10388a.m12670g()) {
                this.f10390c = this.f10388a.m12670g();
                this.f10389b.mo12097b(obj);
            }
        }

        /* JADX INFO: renamed from: c */
        void m12524c() {
            this.f10388a.mo12676p(this);
        }
    }

    public C2609A() {
        this.f10387l = new C6510b();
    }

    @Override // androidx.lifecycle.AbstractC2664z
    /* JADX INFO: renamed from: m */
    protected void mo12520m() {
        Iterator it = this.f10387l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).m12523a();
        }
    }

    @Override // androidx.lifecycle.AbstractC2664z
    /* JADX INFO: renamed from: n */
    protected void mo12521n() {
        Iterator it = this.f10387l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).m12524c();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12522r(AbstractC2664z abstractC2664z, InterfaceC2612D interfaceC2612D) {
        if (abstractC2664z == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC2664z, interfaceC2612D);
        a aVar2 = (a) this.f10387l.mo27730k(abstractC2664z, aVar);
        if (aVar2 != null && aVar2.f10389b != interfaceC2612D) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && m12671h()) {
            aVar.m12523a();
        }
    }

    public C2609A(Object obj) {
        super(obj);
        this.f10387l = new C6510b();
    }
}
