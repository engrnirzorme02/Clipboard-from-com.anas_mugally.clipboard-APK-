package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6603C0;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2652n extends AbstractC2651m implements InterfaceC2654p {

    /* JADX INFO: renamed from: a */
    private final AbstractC2650l f10481a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1879i f10482b;

    /* JADX INFO: renamed from: androidx.lifecycle.n$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f10483a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f10484b;

        a(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = C2652n.this.new a(interfaceC1875e);
            aVar.f10484b = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f10483a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC6624N interfaceC6624N = (InterfaceC6624N) this.f10484b;
            if (C2652n.this.m12636a().mo12626b().compareTo(AbstractC2650l.b.INITIALIZED) >= 0) {
                C2652n.this.m12636a().mo12625a(C2652n.this);
            } else {
                AbstractC6603C0.m27962d(interfaceC6624N.mo12635Q(), null, 1, null);
            }
            return C1444v.f4971a;
        }
    }

    public C2652n(AbstractC2650l lifecycle, InterfaceC1879i coroutineContext) {
        AbstractC6118n.m27187e(lifecycle, "lifecycle");
        AbstractC6118n.m27187e(coroutineContext, "coroutineContext");
        this.f10481a = lifecycle;
        this.f10482b = coroutineContext;
        if (m12636a().mo12626b() == AbstractC2650l.b.DESTROYED) {
            AbstractC6603C0.m27962d(mo12635Q(), null, 1, null);
        }
    }

    @Override // p318o6.InterfaceC6624N
    /* JADX INFO: renamed from: Q */
    public InterfaceC1879i mo12635Q() {
        return this.f10482b;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2650l m12636a() {
        return this.f10481a;
    }

    /* JADX INFO: renamed from: b */
    public final void m12637b() {
        AbstractC6672k.m28227d(this, C6656c0.m28164c().mo28087U0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC2654p
    /* JADX INFO: renamed from: n */
    public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(event, "event");
        if (m12636a().mo12626b().compareTo(AbstractC2650l.b.DESTROYED) <= 0) {
            m12636a().mo12628d(this);
            AbstractC6603C0.m27962d(mo12635Q(), null, 1, null);
        }
    }
}
