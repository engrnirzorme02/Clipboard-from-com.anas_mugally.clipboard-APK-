package com.google.firebase.auth;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p164V3.C1762g;
import p178X3.InterfaceC1950a;
import p178X3.InterfaceC1951b;
import p178X3.InterfaceC1952c;
import p178X3.InterfaceC1953d;
import p185Y3.InterfaceC2030b;
import p192Z3.C2122f;
import p192Z3.InterfaceC2114b;
import p193Z4.AbstractC2156h;
import p193Z4.InterfaceC2157i;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p285k5.AbstractC6073h;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(C2206E c2206e, C2206E c2206e2, C2206E c2206e3, C2206E c2206e4, C2206E c2206e5, InterfaceC2211d interfaceC2211d) {
        return new C2122f((C1762g) interfaceC2211d.mo8953a(C1762g.class), interfaceC2211d.mo8955c(InterfaceC2030b.class), interfaceC2211d.mo8955c(InterfaceC2157i.class), (Executor) interfaceC2211d.mo8954b(c2206e), (Executor) interfaceC2211d.mo8954b(c2206e2), (Executor) interfaceC2211d.mo8954b(c2206e3), (ScheduledExecutorService) interfaceC2211d.mo8954b(c2206e4), (Executor) interfaceC2211d.mo8954b(c2206e5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        final C2206E c2206eM8951a = C2206E.m8951a(InterfaceC1950a.class, Executor.class);
        final C2206E c2206eM8951a2 = C2206E.m8951a(InterfaceC1951b.class, Executor.class);
        final C2206E c2206eM8951a3 = C2206E.m8951a(InterfaceC1952c.class, Executor.class);
        final C2206E c2206eM8951a4 = C2206E.m8951a(InterfaceC1952c.class, ScheduledExecutorService.class);
        final C2206E c2206eM8951a5 = C2206E.m8951a(InterfaceC1953d.class, Executor.class);
        return Arrays.asList(C2210c.m8966f(FirebaseAuth.class, InterfaceC2114b.class).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9035n(InterfaceC2157i.class)).m8983b(C2224q.m9032k(c2206eM8951a)).m8983b(C2224q.m9032k(c2206eM8951a2)).m8983b(C2224q.m9032k(c2206eM8951a3)).m8983b(C2224q.m9032k(c2206eM8951a4)).m8983b(C2224q.m9032k(c2206eM8951a5)).m8983b(C2224q.m9031j(InterfaceC2030b.class)).m8987f(new InterfaceC2214g() { // from class: com.google.firebase.auth.W
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(c2206eM8951a, c2206eM8951a2, c2206eM8951a3, c2206eM8951a4, c2206eM8951a5, interfaceC2211d);
            }
        }).m8985d(), AbstractC2156h.m8764a(), AbstractC6073h.m27112b("fire-auth", "24.0.1"));
    }
}
