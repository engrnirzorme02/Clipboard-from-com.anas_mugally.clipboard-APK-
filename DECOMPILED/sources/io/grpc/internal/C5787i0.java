package io.grpc.internal;

import androidx.appcompat.app.AbstractC2263x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0514I;
import p063H5.AbstractC0526V;
import p063H5.AbstractC0527W;
import p063H5.AbstractC0533b;
import p063H5.AbstractC0539e;
import p063H5.C0510E;
import p063H5.C0540e0;
import p063H5.C0559o;
import p063H5.C0570v;
import p063H5.InterfaceC0546h0;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5787i0 extends AbstractC0527W {

    /* JADX INFO: renamed from: H */
    private static final Logger f22661H = Logger.getLogger(C5787i0.class.getName());

    /* JADX INFO: renamed from: I */
    static final long f22662I = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: J */
    static final long f22663J = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: K */
    private static final InterfaceC5803q0 f22664K = C5747M0.m25642c(AbstractC5757S.f22245u);

    /* JADX INFO: renamed from: L */
    private static final C0570v f22665L = C0570v.m2527c();

    /* JADX INFO: renamed from: M */
    private static final C0559o f22666M = C0559o.m2477a();

    /* JADX INFO: renamed from: N */
    private static final Method f22667N;

    /* JADX INFO: renamed from: A */
    private boolean f22668A;

    /* JADX INFO: renamed from: B */
    private boolean f22669B;

    /* JADX INFO: renamed from: C */
    private boolean f22670C;

    /* JADX INFO: renamed from: D */
    private boolean f22671D;

    /* JADX INFO: renamed from: E */
    private boolean f22672E;

    /* JADX INFO: renamed from: F */
    private final c f22673F;

    /* JADX INFO: renamed from: G */
    private final b f22674G;

    /* JADX INFO: renamed from: a */
    InterfaceC5803q0 f22675a;

    /* JADX INFO: renamed from: b */
    InterfaceC5803q0 f22676b;

    /* JADX INFO: renamed from: c */
    private final List f22677c;

    /* JADX INFO: renamed from: d */
    C0540e0 f22678d;

    /* JADX INFO: renamed from: e */
    final List f22679e;

    /* JADX INFO: renamed from: f */
    final String f22680f;

    /* JADX INFO: renamed from: g */
    final AbstractC0533b f22681g;

    /* JADX INFO: renamed from: h */
    private final SocketAddress f22682h;

    /* JADX INFO: renamed from: i */
    String f22683i;

    /* JADX INFO: renamed from: j */
    String f22684j;

    /* JADX INFO: renamed from: k */
    String f22685k;

    /* JADX INFO: renamed from: l */
    boolean f22686l;

    /* JADX INFO: renamed from: m */
    C0570v f22687m;

    /* JADX INFO: renamed from: n */
    C0559o f22688n;

    /* JADX INFO: renamed from: o */
    long f22689o;

    /* JADX INFO: renamed from: p */
    int f22690p;

    /* JADX INFO: renamed from: q */
    int f22691q;

    /* JADX INFO: renamed from: r */
    long f22692r;

    /* JADX INFO: renamed from: s */
    long f22693s;

    /* JADX INFO: renamed from: t */
    boolean f22694t;

    /* JADX INFO: renamed from: u */
    C0510E f22695u;

    /* JADX INFO: renamed from: v */
    int f22696v;

    /* JADX INFO: renamed from: w */
    Map f22697w;

    /* JADX INFO: renamed from: x */
    boolean f22698x;

    /* JADX INFO: renamed from: y */
    InterfaceC0546h0 f22699y;

    /* JADX INFO: renamed from: z */
    private boolean f22700z;

    /* JADX INFO: renamed from: io.grpc.internal.i0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo3242a();
    }

    /* JADX INFO: renamed from: io.grpc.internal.i0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC5810u mo3243a();
    }

    /* JADX INFO: renamed from: io.grpc.internal.i0$d */
    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.C5787i0.b
        /* JADX INFO: renamed from: a */
        public int mo3242a() {
            return 443;
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e7) {
            f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            declaredMethod = null;
        } catch (NoSuchMethodException e8) {
            f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            declaredMethod = null;
        }
        f22667N = declaredMethod;
    }

    public C5787i0(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // p063H5.AbstractC0527W
    /* JADX INFO: renamed from: a */
    public AbstractC0526V mo2250a() {
        return new C5789j0(new C5785h0(this, this.f22673F.mo3243a(), new C5732F.a(), C5747M0.m25642c(AbstractC5757S.f22245u), AbstractC5757S.f22247w, m26040f(), InterfaceC5756R0.f22224a));
    }

    /* JADX INFO: renamed from: e */
    int m26039e() {
        return this.f22674G.mo3242a();
    }

    /* JADX INFO: renamed from: f */
    List m26040f() {
        boolean z7;
        Method method;
        ArrayList arrayList = new ArrayList(this.f22677c);
        List listM2159a = AbstractC0514I.m2159a();
        if (listM2159a != null) {
            arrayList.addAll(listM2159a);
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && this.f22700z && (method = f22667N) != null) {
            try {
                AbstractC2263x.m9328a(method.invoke(null, Boolean.valueOf(this.f22668A), Boolean.valueOf(this.f22669B), Boolean.valueOf(this.f22670C), Boolean.valueOf(this.f22671D)));
            } catch (IllegalAccessException e7) {
                f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            } catch (InvocationTargetException e8) {
                f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e8);
            }
        }
        if (!z7 && this.f22672E) {
            try {
                AbstractC2263x.m9328a(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]));
            } catch (ClassNotFoundException e9) {
                f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e9);
            } catch (IllegalAccessException e10) {
                f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
            } catch (NoSuchMethodException e11) {
                f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
            } catch (InvocationTargetException e12) {
                f22661H.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            }
        }
        return arrayList;
    }

    public C5787i0(String str, AbstractC0539e abstractC0539e, AbstractC0533b abstractC0533b, c cVar, b bVar) {
        InterfaceC5803q0 interfaceC5803q0 = f22664K;
        this.f22675a = interfaceC5803q0;
        this.f22676b = interfaceC5803q0;
        this.f22677c = new ArrayList();
        this.f22678d = C0540e0.m2411b();
        this.f22679e = new ArrayList();
        this.f22685k = "pick_first";
        this.f22687m = f22665L;
        this.f22688n = f22666M;
        this.f22689o = f22662I;
        this.f22690p = 5;
        this.f22691q = 5;
        this.f22692r = 16777216L;
        this.f22693s = 1048576L;
        this.f22694t = true;
        this.f22695u = C0510E.m2138g();
        this.f22698x = true;
        this.f22700z = true;
        this.f22668A = true;
        this.f22669B = true;
        this.f22670C = false;
        this.f22671D = true;
        this.f22672E = true;
        this.f22680f = (String) AbstractC1209m.m5303o(str, "target");
        this.f22681g = abstractC0533b;
        this.f22673F = (c) AbstractC1209m.m5303o(cVar, "clientTransportFactoryBuilder");
        this.f22682h = null;
        if (bVar != null) {
            this.f22674G = bVar;
        } else {
            this.f22674G = new d();
        }
    }
}
