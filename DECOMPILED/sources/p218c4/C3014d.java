package p218c4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p171W3.InterfaceC1862a;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;
import p228d4.C5235g;
import p236e4.C5346c;
import p236e4.C5347d;
import p236e4.C5348e;
import p236e4.C5349f;
import p236e4.InterfaceC5344a;
import p244f4.C5439c;
import p244f4.InterfaceC5437a;
import p244f4.InterfaceC5438b;

/* JADX INFO: renamed from: c4.d */
/* JADX INFO: loaded from: classes.dex */
public class C3014d {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2971a f12438a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC5344a f12439b;

    /* JADX INFO: renamed from: c */
    private volatile InterfaceC5438b f12440c;

    /* JADX INFO: renamed from: d */
    private final List f12441d;

    public C3014d(InterfaceC2971a interfaceC2971a) {
        this(interfaceC2971a, new C5439c(), new C5349f());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14981a(C3014d c3014d, InterfaceC2972b interfaceC2972b) {
        c3014d.getClass();
        C5235g.m24179f().m24180b("AnalyticsConnector now available.");
        InterfaceC1862a interfaceC1862a = (InterfaceC1862a) interfaceC2972b.get();
        C5348e c5348e = new C5348e(interfaceC1862a);
        C3015e c3015e = new C3015e();
        if (m14985g(interfaceC1862a, c3015e) == null) {
            C5235g.m24179f().m24188k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C5235g.m24179f().m24180b("Registered Firebase Analytics listener.");
        C5347d c5347d = new C5347d();
        C5346c c5346c = new C5346c(c5348e, 500, TimeUnit.MILLISECONDS);
        synchronized (c3014d) {
            try {
                Iterator it = c3014d.f12441d.iterator();
                while (it.hasNext()) {
                    c5347d.mo14979a((InterfaceC5437a) it.next());
                }
                c3015e.m14990d(c5347d);
                c3015e.m14991e(c5346c);
                c3014d.f12440c = c5347d;
                c3014d.f12439b = c5346c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14983c(C3014d c3014d, InterfaceC5437a interfaceC5437a) {
        synchronized (c3014d) {
            try {
                if (c3014d.f12440c instanceof C5439c) {
                    c3014d.f12441d.add(interfaceC5437a);
                }
                c3014d.f12440c.mo14979a(interfaceC5437a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m14984f() {
        this.f12438a.mo8945a(new InterfaceC2971a.a() { // from class: c4.c
            @Override // p211b5.InterfaceC2971a.a
            /* JADX INFO: renamed from: a */
            public final void mo5341a(InterfaceC2972b interfaceC2972b) {
                C3014d.m14981a(this.f12437a, interfaceC2972b);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    private static InterfaceC1862a.a m14985g(InterfaceC1862a interfaceC1862a, C3015e c3015e) {
        InterfaceC1862a.a aVarMo7654a = interfaceC1862a.mo7654a("clx", c3015e);
        if (aVarMo7654a != null) {
            return aVarMo7654a;
        }
        C5235g.m24179f().m24180b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        InterfaceC1862a.a aVarMo7654a2 = interfaceC1862a.mo7654a("crash", c3015e);
        if (aVarMo7654a2 != null) {
            C5235g.m24179f().m24188k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return aVarMo7654a2;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC5344a m14986d() {
        return new InterfaceC5344a() { // from class: c4.b
            @Override // p236e4.InterfaceC5344a
            /* JADX INFO: renamed from: a */
            public final void mo14980a(String str, Bundle bundle) {
                this.f12436a.f12439b.mo14980a(str, bundle);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC5438b m14987e() {
        return new InterfaceC5438b() { // from class: c4.a
            @Override // p244f4.InterfaceC5438b
            /* JADX INFO: renamed from: a */
            public final void mo14979a(InterfaceC5437a interfaceC5437a) {
                C3014d.m14983c(this.f12435a, interfaceC5437a);
            }
        };
    }

    public C3014d(InterfaceC2971a interfaceC2971a, InterfaceC5438b interfaceC5438b, InterfaceC5344a interfaceC5344a) {
        this.f12438a = interfaceC2971a;
        this.f12440c = interfaceC5438b;
        this.f12441d = new ArrayList();
        this.f12439b = interfaceC5344a;
        m14984f();
    }
}
