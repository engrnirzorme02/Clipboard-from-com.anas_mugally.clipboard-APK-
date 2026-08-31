package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p164V3.C1762g;
import p164V3.C1771p;
import p179X4.C1994q;
import p185Y3.InterfaceC2030b;
import p192Z3.InterfaceC2114b;
import p193Z4.InterfaceC2158j;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p285k5.AbstractC6073h;
import p285k5.InterfaceC6074i;

/* JADX INFO: loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C4931q m22149a(InterfaceC2211d interfaceC2211d) {
        return new C4931q((Context) interfaceC2211d.mo8953a(Context.class), (C1762g) interfaceC2211d.mo8953a(C1762g.class), interfaceC2211d.mo8960i(InterfaceC2114b.class), interfaceC2211d.mo8960i(InterfaceC2030b.class), new C1994q(interfaceC2211d.mo8955c(InterfaceC6074i.class), interfaceC2211d.mo8955c(InterfaceC2158j.class), (C1771p) interfaceC2211d.mo8953a(C1771p.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        return Arrays.asList(C2210c.m8965e(C4931q.class).m8988h(LIBRARY_NAME).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9033l(Context.class)).m8983b(C2224q.m9031j(InterfaceC2158j.class)).m8983b(C2224q.m9031j(InterfaceC6074i.class)).m8983b(C2224q.m9027a(InterfaceC2114b.class)).m8983b(C2224q.m9027a(InterfaceC2030b.class)).m8983b(C2224q.m9029h(C1771p.class)).m8987f(new InterfaceC2214g() { // from class: com.google.firebase.firestore.r
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return FirestoreRegistrar.m22149a(interfaceC2211d);
            }
        }).m8985d(), AbstractC6073h.m27112b(LIBRARY_NAME, "26.0.1"));
    }
}
