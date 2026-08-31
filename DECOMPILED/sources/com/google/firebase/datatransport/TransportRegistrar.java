package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.datatransport.cct.C3236a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p062H4.InterfaceC0501a;
import p062H4.InterfaceC0502b;
import p198a2.InterfaceC2194j;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p216c2.C3005u;
import p285k5.AbstractC6073h;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2194j m22131a(InterfaceC2211d interfaceC2211d) {
        C3005u.m14973f((Context) interfaceC2211d.mo8953a(Context.class));
        return C3005u.m14971c().m14975g(C3236a.f13845g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2194j m22132b(InterfaceC2211d interfaceC2211d) {
        C3005u.m14973f((Context) interfaceC2211d.mo8953a(Context.class));
        return C3005u.m14971c().m14975g(C3236a.f13846h);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC2194j m22133c(InterfaceC2211d interfaceC2211d) {
        C3005u.m14973f((Context) interfaceC2211d.mo8953a(Context.class));
        return C3005u.m14971c().m14975g(C3236a.f13846h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        return Arrays.asList(C2210c.m8965e(InterfaceC2194j.class).m8988h(LIBRARY_NAME).m8983b(C2224q.m9033l(Context.class)).m8987f(new InterfaceC2214g() { // from class: H4.c
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return TransportRegistrar.m22133c(interfaceC2211d);
            }
        }).m8985d(), C2210c.m8963c(C2206E.m8951a(InterfaceC0501a.class, InterfaceC2194j.class)).m8983b(C2224q.m9033l(Context.class)).m8987f(new InterfaceC2214g() { // from class: H4.d
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return TransportRegistrar.m22132b(interfaceC2211d);
            }
        }).m8985d(), C2210c.m8963c(C2206E.m8951a(InterfaceC0502b.class, InterfaceC2194j.class)).m8983b(C2224q.m9033l(Context.class)).m8987f(new InterfaceC2214g() { // from class: H4.e
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return TransportRegistrar.m22131a(interfaceC2211d);
            }
        }).m8985d(), AbstractC6073h.m27112b(LIBRARY_NAME, "19.0.0"));
    }
}
