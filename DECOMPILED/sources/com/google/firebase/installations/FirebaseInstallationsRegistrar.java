package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p164V3.C1762g;
import p178X3.InterfaceC1950a;
import p178X3.InterfaceC1951b;
import p193Z4.AbstractC2156h;
import p193Z4.InterfaceC2157i;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p210b4.AbstractC2968i;
import p219c5.InterfaceC3022e;
import p285k5.AbstractC6073h;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC3022e m22196a(InterfaceC2211d interfaceC2211d) {
        return new C4943c((C1762g) interfaceC2211d.mo8953a(C1762g.class), interfaceC2211d.mo8955c(InterfaceC2157i.class), (ExecutorService) interfaceC2211d.mo8954b(C2206E.m8951a(InterfaceC1950a.class, ExecutorService.class)), AbstractC2968i.m14812a((Executor) interfaceC2211d.mo8954b(C2206E.m8951a(InterfaceC1951b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        return Arrays.asList(C2210c.m8965e(InterfaceC3022e.class).m8988h(LIBRARY_NAME).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9031j(InterfaceC2157i.class)).m8983b(C2224q.m9032k(C2206E.m8951a(InterfaceC1950a.class, ExecutorService.class))).m8983b(C2224q.m9032k(C2206E.m8951a(InterfaceC1951b.class, Executor.class))).m8987f(new InterfaceC2214g() { // from class: c5.f
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return FirebaseInstallationsRegistrar.m22196a(interfaceC2211d);
            }
        }).m8985d(), AbstractC2156h.m8764a(), AbstractC6073h.m27112b(LIBRARY_NAME, "18.0.0"));
    }
}
