package p327p5;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p310n6.AbstractC6506c;
import p310n6.C6504a;
import p310n6.EnumC6507d;

/* JADX INFO: renamed from: p5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6767j {

    /* JADX INFO: renamed from: c */
    public static final a f27184c = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC6772o f27185a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC6772o f27186b;

    /* JADX INFO: renamed from: p5.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: p5.j$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27187a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f27188b;

        /* JADX INFO: renamed from: d */
        int f27190d;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27188b = obj;
            this.f27190d |= Integer.MIN_VALUE;
            return C6767j.this.m29584f(this);
        }
    }

    public C6767j(InterfaceC6772o localOverrideSettings, InterfaceC6772o remoteSettings) {
        AbstractC6118n.m27187e(localOverrideSettings, "localOverrideSettings");
        AbstractC6118n.m27187e(remoteSettings, "remoteSettings");
        this.f27185a = localOverrideSettings;
        this.f27186b = remoteSettings;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m29579d(double d7) {
        return 0.0d <= d7 && d7 <= 1.0d;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m29580e(long j7) {
        return C6504a.m27694K(j7) && C6504a.m27689C(j7);
    }

    /* JADX INFO: renamed from: a */
    public final double m29581a() {
        Double dMo29547c = this.f27185a.mo29547c();
        if (dMo29547c != null) {
            double dDoubleValue = dMo29547c.doubleValue();
            if (m29579d(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dMo29547c2 = this.f27186b.mo29547c();
        if (dMo29547c2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dMo29547c2.doubleValue();
        if (m29579d(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: b */
    public final long m29582b() {
        C6504a c6504aMo29546b = this.f27185a.mo29546b();
        if (c6504aMo29546b != null) {
            long jM27713T = c6504aMo29546b.m27713T();
            if (m29580e(jM27713T)) {
                return jM27713T;
            }
        }
        C6504a c6504aMo29546b2 = this.f27186b.mo29546b();
        if (c6504aMo29546b2 != null) {
            long jM27713T2 = c6504aMo29546b2.m27713T();
            if (m29580e(jM27713T2)) {
                return jM27713T2;
            }
        }
        C6504a.a aVar = C6504a.f24605b;
        return AbstractC6506c.m27723h(30, EnumC6507d.MINUTES);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29583c() {
        Boolean boolMo29545a = this.f27185a.mo29545a();
        if (boolMo29545a != null) {
            return boolMo29545a.booleanValue();
        }
        Boolean boolMo29545a2 = this.f27186b.mo29545a();
        if (boolMo29545a2 != null) {
            return boolMo29545a2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.mo29548d(r0) == r1) goto L22;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29584f(InterfaceC1875e interfaceC1875e) {
        b bVar;
        C6767j c6767j;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f27190d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f27190d = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f27188b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = bVar.f27190d;
        if (i8 != 0) {
            if (i8 == 1) {
                c6767j = (C6767j) bVar.f27187a;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
        AbstractC1437o.m6082b(obj);
        InterfaceC6772o interfaceC6772o = this.f27185a;
        bVar.f27187a = this;
        bVar.f27190d = 1;
        if (interfaceC6772o.mo29548d(bVar) != objE) {
            c6767j = this;
        }
        return objE;
        InterfaceC6772o interfaceC6772o2 = c6767j.f27186b;
        bVar.f27187a = null;
        bVar.f27190d = 2;
    }
}
