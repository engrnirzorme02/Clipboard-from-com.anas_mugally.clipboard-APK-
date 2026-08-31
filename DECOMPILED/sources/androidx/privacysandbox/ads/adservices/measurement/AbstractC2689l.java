package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p081K.AbstractC0722n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.C6682p;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2689l extends AbstractC2679b {

    /* JADX INFO: renamed from: b */
    private final MeasurementManager f10633b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.l$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f10634a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f10635b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC2689l f10636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2690m abstractC2690m, AbstractC2689l abstractC2689l, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f10636c = abstractC2689l;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(null, this.f10636c, interfaceC1875e);
            aVar.f10635b = obj;
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
            if (this.f10634a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            throw null;
        }
    }

    public AbstractC2689l(MeasurementManager mMeasurementManager) {
        AbstractC6118n.m27187e(mMeasurementManager, "mMeasurementManager");
        this.f10633b = mMeasurementManager;
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Object m12791h(AbstractC2689l abstractC2689l, AbstractC2678a abstractC2678a, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1).m28263E();
        abstractC2689l.m12798i();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ Object m12792j(AbstractC2689l abstractC2689l, InterfaceC1875e<? super Integer> interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        abstractC2689l.m12798i().getMeasurementApiStatus(new ExecutorC2688k(), AbstractC0722n.m3485a(c6682p));
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y;
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ Object m12793k(AbstractC2689l abstractC2689l, Uri uri, InputEvent inputEvent, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        abstractC2689l.m12798i().registerSource(uri, inputEvent, new ExecutorC2688k(), AbstractC0722n.m3485a(c6682p));
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ Object m12794l(AbstractC2689l abstractC2689l, AbstractC2690m abstractC2690m, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        Object objM28102e = AbstractC6626O.m28102e(new a(abstractC2690m, abstractC2689l, null), interfaceC1875e);
        return objM28102e == AbstractC2005b.m8369e() ? objM28102e : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ Object m12795m(AbstractC2689l abstractC2689l, Uri uri, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        abstractC2689l.m12798i().registerTrigger(uri, new ExecutorC2688k(), AbstractC0722n.m3485a(c6682p));
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Object m12796n(AbstractC2689l abstractC2689l, AbstractC2691n abstractC2691n, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1).m28263E();
        abstractC2689l.m12798i();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ Object m12797o(AbstractC2689l abstractC2689l, AbstractC2692o abstractC2692o, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1).m28263E();
        abstractC2689l.m12798i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: a */
    public Object mo12776a(AbstractC2678a abstractC2678a, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        return m12791h(this, abstractC2678a, interfaceC1875e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: b */
    public Object mo12777b(InterfaceC1875e<? super Integer> interfaceC1875e) {
        return m12792j(this, interfaceC1875e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: c */
    public Object mo12778c(Uri uri, InputEvent inputEvent, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        return m12793k(this, uri, inputEvent, interfaceC1875e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: d */
    public Object mo12779d(AbstractC2690m abstractC2690m, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        return m12794l(this, abstractC2690m, interfaceC1875e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: e */
    public Object mo12780e(Uri uri, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        return m12795m(this, uri, interfaceC1875e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: f */
    public Object mo12781f(AbstractC2691n abstractC2691n, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        return m12796n(this, abstractC2691n, interfaceC1875e);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.AbstractC2679b
    /* JADX INFO: renamed from: g */
    public Object mo12782g(AbstractC2692o abstractC2692o, InterfaceC1875e<? super C1444v> interfaceC1875e) {
        return m12797o(this, abstractC2692o, interfaceC1875e);
    }

    /* JADX INFO: renamed from: i */
    protected final MeasurementManager m12798i() {
        return this.f10633b;
    }
}
