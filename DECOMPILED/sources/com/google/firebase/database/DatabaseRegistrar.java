package com.google.firebase.database;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import java.util.Arrays;
import java.util.List;
import p164V3.C1762g;
import p185Y3.InterfaceC2030b;
import p192Z3.InterfaceC2114b;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p285k5.AbstractC6073h;

/* JADX INFO: loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C4907d m22099a(InterfaceC2211d interfaceC2211d) {
        return new C4907d((C1762g) interfaceC2211d.mo8953a(C1762g.class), interfaceC2211d.mo8960i(InterfaceC2114b.class), interfaceC2211d.mo8960i(InterfaceC2030b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        return Arrays.asList(C2210c.m8965e(C4907d.class).m8988h(LIBRARY_NAME).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9027a(InterfaceC2114b.class)).m8983b(C2224q.m9027a(InterfaceC2030b.class)).m8987f(new InterfaceC2214g() { // from class: q4.c
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return DatabaseRegistrar.m22099a(interfaceC2211d);
            }
        }).m8985d(), AbstractC6073h.m27112b(LIBRARY_NAME, "22.0.1"));
    }
}
