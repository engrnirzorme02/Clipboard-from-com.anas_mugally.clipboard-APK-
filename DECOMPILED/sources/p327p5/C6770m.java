package p327p5;

import android.util.Log;
import androidx.lifecycle.AbstractC2636b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6105a;
import kotlin.jvm.internal.InterfaceC6113i;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p174X.InterfaceC1905i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p301m5.InterfaceC6369X;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6670j;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: p5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6770m implements InterfaceC6769l {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i f27193a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6369X f27194b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1905i f27195c;

    /* JADX INFO: renamed from: d */
    private final AtomicReference f27196d;

    /* JADX INFO: renamed from: p5.m$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27197a;

        /* JADX INFO: renamed from: p5.m$a$a, reason: collision with other inner class name */
        /* synthetic */ class C7716a implements InterfaceC6919d, InterfaceC6113i {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AtomicReference f27199a;

            C7716a(AtomicReference atomicReference) {
                this.f27199a = atomicReference;
            }

            @Override // kotlin.jvm.internal.InterfaceC6113i
            /* JADX INFO: renamed from: a */
            public final InterfaceC1425c mo12586a() {
                return new C6105a(2, this.f27199a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // p344r6.InterfaceC6919d
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object mo7892d(C6765h c6765h, InterfaceC1875e interfaceC1875e) {
                Object objM29597k = a.m29597k(this.f27199a, c6765h, interfaceC1875e);
                return objM29597k == AbstractC2005b.m8369e() ? objM29597k : C1444v.f4971a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC6919d) && (obj instanceof InterfaceC6113i)) {
                    return AbstractC6118n.m27183a(mo12586a(), ((InterfaceC6113i) obj).mo12586a());
                }
                return false;
            }

            public final int hashCode() {
                return mo12586a().hashCode();
            }
        }

        a(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ Object m29597k(AtomicReference atomicReference, C6765h c6765h, InterfaceC1875e interfaceC1875e) {
            atomicReference.set(c6765h);
            return C1444v.f4971a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6770m.this.new a(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f27197a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6918c data = C6770m.this.f27195c.getData();
                C7716a c7716a = new C7716a(C6770m.this.f27196d);
                this.f27197a = 1;
                if (data.mo7891a(c7716a, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: p5.m$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27200a;

        b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6770m.this.new b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f27200a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return obj;
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC6918c data = C6770m.this.f27195c.getData();
            this.f27200a = 1;
            Object objM30365k = AbstractC6920e.m30365k(data, this);
            return objM30365k == objE ? objE : objM30365k;
        }
    }

    /* JADX INFO: renamed from: p5.m$c */
    static final class c extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        /* synthetic */ Object f27202a;

        /* JADX INFO: renamed from: c */
        int f27204c;

        c(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27202a = obj;
            this.f27204c |= Integer.MIN_VALUE;
            return C6770m.this.mo29589b(null, this);
        }
    }

    /* JADX INFO: renamed from: p5.m$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27205a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6765h f27206b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C6765h c6765h, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f27206b = c6765h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new d(this.f27206b, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C6765h c6765h, InterfaceC1875e interfaceC1875e) {
            return ((d) create(c6765h, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f27205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return this.f27206b;
        }
    }

    public C6770m(InterfaceC1879i backgroundDispatcher, InterfaceC6369X timeProvider, InterfaceC1905i sessionConfigsDataStore) {
        AbstractC6118n.m27187e(backgroundDispatcher, "backgroundDispatcher");
        AbstractC6118n.m27187e(timeProvider, "timeProvider");
        AbstractC6118n.m27187e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f27193a = backgroundDispatcher;
        this.f27194b = timeProvider;
        this.f27195c = sessionConfigsDataStore;
        this.f27196d = new AtomicReference();
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    private final C6765h m29595h() {
        if (this.f27196d.get() == null) {
            AbstractC2636b.m12603a(this.f27196d, null, AbstractC6670j.m28200b(null, new b(null), 1, null));
        }
        Object obj = this.f27196d.get();
        AbstractC6118n.m27186d(obj, "get(...)");
        return (C6765h) obj;
    }

    @Override // p327p5.InterfaceC6769l
    /* JADX INFO: renamed from: a */
    public Double mo29588a() {
        return m29595h().m29572c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p327p5.InterfaceC6769l
    /* JADX INFO: renamed from: b */
    public Object mo29589b(C6765h c6765h, InterfaceC1875e interfaceC1875e) {
        c cVar;
        if (interfaceC1875e instanceof c) {
            cVar = (c) interfaceC1875e;
            int i7 = cVar.f27204c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar.f27204c = i7 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC1875e);
            }
        } else {
            cVar = new c(interfaceC1875e);
        }
        Object obj = cVar.f27202a;
        Object objE = AbstractC2005b.m8369e();
        int i8 = cVar.f27204c;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC1905i interfaceC1905i = this.f27195c;
                d dVar = new d(c6765h, null);
                cVar.f27204c = 1;
                if (interfaceC1905i.mo7850a(dVar, cVar) == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
        } catch (IOException e7) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e7);
        }
        return C1444v.f4971a;
    }

    @Override // p327p5.InterfaceC6769l
    /* JADX INFO: renamed from: c */
    public Integer mo29590c() {
        return m29595h().m29573d();
    }

    @Override // p327p5.InterfaceC6769l
    /* JADX INFO: renamed from: d */
    public boolean mo29591d() {
        Long lM29571b = m29595h().m29571b();
        Integer numM29570a = m29595h().m29570a();
        return lM29571b == null || numM29570a == null || this.f27194b.mo27470a().m27465a() - lM29571b.longValue() >= ((long) numM29570a.intValue());
    }

    @Override // p327p5.InterfaceC6769l
    /* JADX INFO: renamed from: e */
    public Boolean mo29592e() {
        return m29595h().m29574e();
    }
}
