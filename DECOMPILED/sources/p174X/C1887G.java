package p174X;

import com.google.android.gms.common.api.C3553a;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6701y0;
import p336q6.AbstractC6854j;
import p336q6.C6855k;
import p336q6.C6862r;
import p336q6.InterfaceC6851g;

/* JADX INFO: renamed from: X.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1887G {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6624N f6068a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5371p f6069b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6851g f6070c;

    /* JADX INFO: renamed from: d */
    private final C1898b f6071d;

    /* JADX INFO: renamed from: X.G$a */
    static final class a extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5367l f6072a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1887G f6073b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5371p f6074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5367l interfaceC5367l, C1887G c1887g, InterfaceC5371p interfaceC5371p) {
            super(1);
            this.f6072a = interfaceC5367l;
            this.f6073b = c1887g;
            this.f6074c = interfaceC5371p;
        }

        /* JADX INFO: renamed from: a */
        public final void m7815a(Throwable th) {
            C1444v c1444v;
            this.f6072a.invoke(th);
            this.f6073b.f6070c.mo29979g(th);
            do {
                Object objM30036f = C6855k.m30036f(this.f6073b.f6070c.mo29974b());
                if (objM30036f != null) {
                    this.f6074c.invoke(objM30036f, th);
                    c1444v = C1444v.f4971a;
                } else {
                    c1444v = null;
                }
            } while (c1444v != null);
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7815a((Throwable) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: X.G$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f6075a;

        /* JADX INFO: renamed from: b */
        int f6076b;

        b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C1887G.this.new b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 e6.p) = (r1v2 e6.p), (r1v4 e6.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5371p interfaceC5371p;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6076b;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                if (C1887G.this.f6071d.m7835b() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                AbstractC6626O.m28103f(C1887G.this.f6068a);
                interfaceC5371p = C1887G.this.f6069b;
                InterfaceC6851g interfaceC6851g = C1887G.this.f6070c;
                this.f6075a = interfaceC5371p;
                this.f6076b = 1;
                obj = interfaceC6851g.mo29976d(this);
                if (obj != objE) {
                    this.f6075a = null;
                    this.f6076b = 2;
                }
                return objE;
            }
            if (i7 == 1) {
                interfaceC5371p = (InterfaceC5371p) this.f6075a;
                AbstractC1437o.m6082b(obj);
                this.f6075a = null;
                this.f6076b = 2;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            if (C1887G.this.f6071d.m7834a() == 0) {
                return C1444v.f4971a;
            }
            AbstractC6626O.m28103f(C1887G.this.f6068a);
            interfaceC5371p = C1887G.this.f6069b;
            InterfaceC6851g interfaceC6851g2 = C1887G.this.f6070c;
            this.f6075a = interfaceC5371p;
            this.f6076b = 1;
            obj = interfaceC6851g2.mo29976d(this);
            if (obj != objE) {
                this.f6075a = null;
                this.f6076b = 2;
            }
            return objE;
        }
    }

    public C1887G(InterfaceC6624N scope, InterfaceC5367l onComplete, InterfaceC5371p onUndeliveredElement, InterfaceC5371p consumeMessage) {
        AbstractC6118n.m27187e(scope, "scope");
        AbstractC6118n.m27187e(onComplete, "onComplete");
        AbstractC6118n.m27187e(onUndeliveredElement, "onUndeliveredElement");
        AbstractC6118n.m27187e(consumeMessage, "consumeMessage");
        this.f6068a = scope;
        this.f6069b = consumeMessage;
        this.f6070c = AbstractC6854j.m30030b(C3553a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f6071d = new C1898b(0);
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) scope.mo12635Q().get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 != null) {
            interfaceC6701y0.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7814e(Object obj) {
        Object objMo29982k = this.f6070c.mo29982k(obj);
        if (objMo29982k instanceof C6855k.a) {
            Throwable thM30035e = C6855k.m30035e(objMo29982k);
            if (thM30035e != null) {
                throw thM30035e;
            }
            throw new C6862r("Channel was closed normally");
        }
        if (!C6855k.m30039i(objMo29982k)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f6071d.m7836c() == 0) {
            AbstractC6672k.m28227d(this.f6068a, null, null, new b(null), 3, null);
        }
    }
}
