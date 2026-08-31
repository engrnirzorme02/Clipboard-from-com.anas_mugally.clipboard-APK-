package com.google.firebase.database;

import java.util.HashMap;
import java.util.Map;
import p164V3.C1762g;
import p211b5.InterfaceC2971a;
import p342r4.C6904d;
import p342r4.C6911k;
import p374v4.C7242g;
import p374v4.C7250o;
import p374v4.InterfaceC7261z;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.google.firebase.database.d */
/* JADX INFO: loaded from: classes.dex */
public class C4907d {

    /* JADX INFO: renamed from: a */
    private final Map f18630a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C1762g f18631b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC7261z f18632c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7261z f18633d;

    C4907d(C1762g c1762g, InterfaceC2971a interfaceC2971a, InterfaceC2971a interfaceC2971a2) {
        this.f18631b = c1762g;
        this.f18632c = new C6911k(interfaceC2971a);
        this.f18633d = new C6904d(interfaceC2971a2);
    }

    /* JADX INFO: renamed from: a */
    synchronized C4906c m22118a(C7250o c7250o) {
        C4906c c4906c;
        try {
            c4906c = (C4906c) this.f18630a.get(c7250o);
            if (c4906c == null) {
                C7242g c7242g = new C7242g();
                if (!this.f18631b.m7410w()) {
                    c7242g.m31987K(this.f18631b.m7406o());
                }
                c7242g.m31986J(this.f18631b);
                c7242g.m31985I(this.f18632c);
                c7242g.m31984H(this.f18633d);
                C4906c c4906c2 = new C4906c(this.f18631b, c7250o, c7242g);
                this.f18630a.put(c7250o, c4906c2);
                c4906c = c4906c2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4906c;
    }
}
