package com.google.firebase.messaging;

import androidx.appcompat.app.AbstractC2263x;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p062H4.InterfaceC0502b;
import p116O4.InterfaceC1148d;
import p164V3.C1762g;
import p193Z4.InterfaceC2158j;
import p198a2.InterfaceC2194j;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p201a5.InterfaceC2234a;
import p219c5.InterfaceC3022e;
import p285k5.AbstractC6073h;
import p285k5.InterfaceC6074i;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FirebaseMessaging m22329a(C2206E c2206e, InterfaceC2211d interfaceC2211d) {
        C1762g c1762g = (C1762g) interfaceC2211d.mo8953a(C1762g.class);
        AbstractC2263x.m9328a(interfaceC2211d.mo8953a(InterfaceC2234a.class));
        return new FirebaseMessaging(c1762g, null, interfaceC2211d.mo8955c(InterfaceC6074i.class), interfaceC2211d.mo8955c(InterfaceC2158j.class), (InterfaceC3022e) interfaceC2211d.mo8953a(InterfaceC3022e.class), interfaceC2211d.mo8957f(c2206e), (InterfaceC1148d) interfaceC2211d.mo8953a(InterfaceC1148d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        final C2206E c2206eM8951a = C2206E.m8951a(InterfaceC0502b.class, InterfaceC2194j.class);
        return Arrays.asList(C2210c.m8965e(FirebaseMessaging.class).m8988h(LIBRARY_NAME).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9029h(InterfaceC2234a.class)).m8983b(C2224q.m9031j(InterfaceC6074i.class)).m8983b(C2224q.m9031j(InterfaceC2158j.class)).m8983b(C2224q.m9033l(InterfaceC3022e.class)).m8983b(C2224q.m9030i(c2206eM8951a)).m8983b(C2224q.m9033l(InterfaceC1148d.class)).m8987f(new InterfaceC2214g() { // from class: com.google.firebase.messaging.z
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return FirebaseMessagingRegistrar.m22329a(c2206eM8951a, interfaceC2211d);
            }
        }).m8984c().m8985d(), AbstractC6073h.m27112b(LIBRARY_NAME, "25.0.1"));
    }
}
