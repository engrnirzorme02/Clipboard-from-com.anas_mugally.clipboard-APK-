package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p164V3.C1762g;
import p171W3.InterfaceC1862a;
import p178X3.InterfaceC1950a;
import p178X3.InterfaceC1951b;
import p178X3.InterfaceC1952c;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p219c5.InterfaceC3022e;
import p228d4.C5235g;
import p228d4.InterfaceC5229a;
import p260h4.C5653i;
import p285k5.AbstractC6073h;
import p293l5.InterfaceC6299a;
import p309n5.C6502b;
import p309n5.InterfaceC6503c;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    private final C2206E f18617a = C2206E.m8951a(InterfaceC1950a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b */
    private final C2206E f18618b = C2206E.m8951a(InterfaceC1951b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c */
    private final C2206E f18619c = C2206E.m8951a(InterfaceC1952c.class, ExecutorService.class);

    static {
        C6502b.m27677a(InterfaceC6503c.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public C4903a m22096b(InterfaceC2211d interfaceC2211d) {
        C5653i.m25139f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4903a c4903aM22098b = C4903a.m22098b((C1762g) interfaceC2211d.mo8953a(C1762g.class), (InterfaceC3022e) interfaceC2211d.mo8953a(InterfaceC3022e.class), interfaceC2211d.mo8960i(InterfaceC5229a.class), interfaceC2211d.mo8960i(InterfaceC1862a.class), interfaceC2211d.mo8960i(InterfaceC6299a.class), (ExecutorService) interfaceC2211d.mo8954b(this.f18617a), (ExecutorService) interfaceC2211d.mo8954b(this.f18618b), (ExecutorService) interfaceC2211d.mo8954b(this.f18619c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            C5235g.m24179f().m24180b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return c4903aM22098b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C2210c.m8965e(C4903a.class).m8988h("fire-cls").m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9033l(InterfaceC3022e.class)).m8983b(C2224q.m9032k(this.f18617a)).m8983b(C2224q.m9032k(this.f18618b)).m8983b(C2224q.m9032k(this.f18619c)).m8983b(C2224q.m9027a(InterfaceC5229a.class)).m8983b(C2224q.m9027a(InterfaceC1862a.class)).m8983b(C2224q.m9027a(InterfaceC6299a.class)).m8987f(new InterfaceC2214g() { // from class: c4.f
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return this.f12444a.m22096b(interfaceC2211d);
            }
        }).m8986e().m8985d(), AbstractC6073h.m27112b("fire-cls", "20.0.2"));
    }
}
